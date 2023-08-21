package com.skcet.day1_3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
private String yourFavColor="Green";
@GetMapping("anu")
public String getMyFav()
{
	return "My favourite color is "+yourFavColor;
}
}
