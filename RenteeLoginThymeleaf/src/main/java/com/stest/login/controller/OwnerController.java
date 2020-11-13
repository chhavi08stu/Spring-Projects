package com.stest.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.stest.login.dao.LoginDAO;
import com.stest.login.model.OwnerService;

@Controller
@RequestMapping("/owners")
public class OwnerController {

	@GetMapping
	public String getAllOwnersWithShopDetails(Model model) {
		model.addAttribute("owners", OwnerService.getOwnerWithShopDetails());
		return "owners";
	}
}
