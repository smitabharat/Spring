package com.hefshine.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hefshine.beans.Student;

@Controller
public class AppController {
	@RequestMapping("/")
	public String welcomePage(ModelMap map) {
		map.addAttribute("message", "good morning");
		return "welcome";
	}

	@RequestMapping("/profile")
	public String profilePage(ModelMap map) {

		map.addAttribute("student", new Student(101, "Smita", "Bharat"));

		return "profile";
	}

	@RequestMapping("/myForm")
	public String myForm() {

		return "myForm";
	}

	@RequestMapping("/submitAction")
	public String submitAction(@RequestParam("username") String username,@RequestParam("RollNo") int RollNo) {

		System.out.println("Hello " + username);
		System.out.println("Hello " + RollNo);

		return "redirect:/myForm";
	}

}
