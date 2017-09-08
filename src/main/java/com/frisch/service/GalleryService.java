package com.frisch.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.frisch.model.GalleryImage;

@Service
@Qualifier("galleryService")
public class GalleryService {
    
    public List<String> galleryPageContent() {
    	List<String> model = new ArrayList<String>();
    	String content = "Take a look at some of our completed projects so far.";
    	model.add(content);
    	return model;
    }
    
    public List<GalleryImage> imageList() {
    	List<GalleryImage> imageList = new ArrayList<GalleryImage>();
    	imageList.add(blueStoneStairs);
    	imageList.add(brickPorchEntry);
    	imageList.add(chimneyFlue);
    	imageList.add(stoneTurrent01);
    	imageList.add(stoneTurrent02);
    	return imageList;
    }
    
    private GalleryImage blueStoneStairs = new GalleryImage("Blue Stone staircase",
    		"Blue Stone staircase",
    		"A beautiful curving Blue Stone stair case with a companion waist high "
    		+ "rubble stone retaining wall. Who wouldn't want to walk up these wonderful "
    		+ "steps to their home?",
    		"https://s3-us-west-2.amazonaws.com/frisch-masonry-design/gallery/blue-stone-stairs-01.jpg");
    
    private GalleryImage brickPorchEntry = new GalleryImage("Brick paver entrance way with Brick arches",
    		"Brick paver entrance way with Brick arches",
    		"Curving brick arches enshrine a unique marble fountain on top of a custom brick "
    		+ "paver floor.",
    		"https://s3-us-west-2.amazonaws.com/frisch-masonry-design/gallery/brick-porch-entry-way-01.jpg");
    
    private GalleryImage chimneyFlue = new GalleryImage("Triple Chimney Flues",
    		"Triple Chimney Flues",
    		"Triple chimney flues tower on the horizon, each unique in their own design. Let us design "
    		+ "your custom fireplace and chimney flues.",
    		"https://s3-us-west-2.amazonaws.com/frisch-masonry-design/gallery/chimney-flue-scaffolding-01.jpg");
    
    private GalleryImage stoneTurrent01 = new GalleryImage("Custom mansion",
    		"Custom Mansion",
    		"A custom designed house built with multiple chimney flues and a wonderful interwoven design. Custom "
    		+ "marble work along with stone paver entrance ways make this home a delight to come home too.",
    		"https://s3-us-west-2.amazonaws.com/frisch-masonry-design/gallery/stone-turrent-house-01.jpg");
    
    private GalleryImage stoneTurrent02 = new GalleryImage("Interlocking brick pattern",
    		"Interlocking brick pattern",
    		"Notice the attention to detail on the pattern how it carries through to each section of "
    		+ "the wall, our bricklayers have decades of experience and take great pride in making your home "
    		+ "as beautiful as you imagined.",
    		"https://s3-us-west-2.amazonaws.com/frisch-masonry-design/gallery/stone-turrent-house-02.jpg");
    
    
    
}
