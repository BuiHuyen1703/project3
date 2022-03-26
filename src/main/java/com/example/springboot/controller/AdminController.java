package com.example.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.springboot.service.AdminService;
@Controller
public class AdminController {
	@Autowired AdminService adminService;

	@GetMapping("/")
	public String viewHomePage(Model model) {
//		List<Admin> listAdmin =adminService.getAllAdmin();
		model.addAttribute("list",adminService.getAllAdmin());
		return"admin/index";
	}


}
