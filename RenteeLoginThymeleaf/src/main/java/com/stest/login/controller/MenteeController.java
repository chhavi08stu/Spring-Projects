package com.stest.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.stest.login.dao.LoginDAO;

@Controller
@RequestMapping("/mentees")
public class MenteeController {

	@GetMapping
	public String getAllRentees(Model model) {
		model.addAttribute("mentees", LoginDAO.getMenteesList());
		return "mentees";
	}
}
