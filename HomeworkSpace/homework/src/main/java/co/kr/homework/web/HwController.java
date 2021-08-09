package co.kr.homework.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.kr.homework.service.HwService;

@Controller
public class HwController {
	@Autowired
	private HwService service;
	
	@RequestMapping(value = "main.do", method = RequestMethod.GET)
	public String controller() {
		System.out.println(service.cnt());
		System.out.println(service.board());
		return "main";
	}
}