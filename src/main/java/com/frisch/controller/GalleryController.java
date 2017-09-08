package com.frisch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.frisch.service.GalleryService;

@Controller
public class GalleryController {

	@Autowired
	private GalleryService galleryService;
	
	
	@RequestMapping(value="/gallery", method=RequestMethod.GET)
	public String gallery(Model model){
		model.addAttribute("content", galleryService.galleryPageContent().subList(0, 1).get(0));
		model.addAttribute("imageList", galleryService.imageList());		
		return "pages/gallery";
	}
}
