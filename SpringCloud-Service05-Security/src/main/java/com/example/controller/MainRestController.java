package com.example.controller;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/******************************************************************************************
 * @author Miles
 * 
 * 
 * 
 *******************************************************************************************/
@RestController
public class MainRestController {

	@RequestMapping("/test")
	public String test() {
		return "Test...";
	}

}
