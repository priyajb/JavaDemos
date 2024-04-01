package com.doctorapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.doctorapp.model.Doctor;
import com.doctorapp.service.*;

@Controller
public class DoctorController {

	@Autowired
	private IDoctorService doctorService;
	
	@RequestMapping("/")
	public String home(Model model) {
		List<Doctor> doctors=doctorService.getAll();
		model.addAttribute("doctors", doctors);
		return "home";
	}
	
	@RequestMapping("/addDoctor")
	public String addDoctor(Doctor doctor) {
		System.out.println(doctor);
		doctorService.addDoctor(doctor);
		return "adminDash";
	}
	
		
	}

