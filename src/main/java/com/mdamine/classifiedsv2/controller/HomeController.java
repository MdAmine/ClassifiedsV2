package com.mdamine.classifiedsv2.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mdamine.classifiedsv2.dao.ClassifiedMapper;
import com.mdamine.classifiedsv2.model.Classified;
import com.mdamine.classifiedsv2.service.ClassifiedService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@Autowired
	private ClassifiedService classifiedService;

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		// for (int i = 1; i <= 10; i++) {
		// classifiedService.save(new Classified("Classifieds " + i,
		// "This is a short description. Lorem ipsum dolor sit amet, consectetur
		// adipiscing elit."));
		// }

		model.addAttribute("serverTime", formattedDate);
		model.addAttribute("classifieds", classifiedService.getAll());

		return "home";
	}

}
