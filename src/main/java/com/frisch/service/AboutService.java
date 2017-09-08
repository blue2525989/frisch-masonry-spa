package com.frisch.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("aboutService")
public class AboutService {

	public List<String> aboutPageContent() {
		List<String> model = new ArrayList<String>();
		String content = 
				"We are a full service masonry contractor. Our masonry "
				+ "is on the largest to the smallest homes in the St. Louis Metro "
				+ "area. If you can dream it, we can make it happen. Generations "
				+ "of Frisch's have placed the masonry on homes with pride and integrity."
				+ "<br/><br/>"
				+ "<strong>Services Provided</strong> "
				+ "<br/><br/>"
				+ "Bricks, Blocks & Stone "
				+ "....anything made with these, we can install it. "
				+ "<br/><br/>"
				+ "<strong>Areas Served</strong> "
				+ "<br/><br/>"
				+ "The Greater St. Louis Metro area. "
				+ "<br/><br/>"
				+ "<strong>Certifications and Awards</strong>"
				+ "<br/><br/>"
				+ "Recipient of Excellence in Masonry; "
				+ "a prestigious award granted to masonry by peers and architects.";
		model.add(content);
		return model;
	}
}
