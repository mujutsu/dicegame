package com.mujutsu.dicegame.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mujutsu.dicegame.model.Die;
import com.mujutsu.dicegame.model.User;
import com.mujutsu.dicegame.services.UserService;

@Controller
public class GameController {
	
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/play", method = RequestMethod.GET)
	public ModelAndView play(){
		ModelAndView modelAndView = new ModelAndView();
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		User user = userService.findUserByEmail(auth.getName());		
		int die1 = new Die(6).roll();
		int die2 = new Die(6).roll();
		int die3 = new Die(6).roll();
		int die4 = new Die(6).roll();
		int result1 = die1 + die2;
		int result2 = die3 + die4;
		
		String winOrLose;		
		if(result1 > result2) {
			winOrLose = "You won!";			
		} else if (result1 < result2) {
			winOrLose = "You lost.";
		} else {
			winOrLose = "It's a tie.";
		}
		
		modelAndView.addObject("userName", "Welcome " + user.getName() + " " + user.getLastName() + " (" + user.getEmail() + ")");
		modelAndView.addObject("die1", die1);
		modelAndView.addObject("die2", die2);
		modelAndView.addObject("die3", die3);
		modelAndView.addObject("die4", die4);
		modelAndView.addObject("result1", result1);
		modelAndView.addObject("result2", result2);
		modelAndView.addObject("winorlose", winOrLose);		
		modelAndView.setViewName("play");
		return modelAndView;
	}
	

}
