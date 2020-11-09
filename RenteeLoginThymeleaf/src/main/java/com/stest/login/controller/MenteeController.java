package com.stest.login.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stest.login.bean.Mentee;

@Controller
@RequestMapping("/mentees")
public class MenteeController {
	private static List<Mentee> mentees = new ArrayList<>();

	static {
		//for (int i = 0; i < 10; i++) {
			mentees.add(new Mentee(12, "Ratan", "Voilet", "Suraksha Vihar, Badaun"));
			mentees.add(new Mentee(7, "Mata", "Purple", "Aligarh"));
			mentees.add(new Mentee(10, "Rani", "Orange", "Delhi"));
			mentees.add(new Mentee(11, "Kajal", "Omaxe Nile", "Kannauj"));
		//}
	}

	@GetMapping
	public String getAllRentees(Model model) {
		model.addAttribute("mentees", mentees);
		return "mentees";
	}
}
