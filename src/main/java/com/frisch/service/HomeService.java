package com.frisch.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("homePageService")
public class HomeService {

	public List<String> homeContent() {
		List<String> model = new ArrayList<String>();
		String content = "<strong>Services Provided</strong> "
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
