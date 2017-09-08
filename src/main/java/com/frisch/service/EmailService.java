package com.frisch.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.amazonaws.AmazonClientException;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient;
import com.amazonaws.services.simpleemail.model.Body;
import com.amazonaws.services.simpleemail.model.Content;
import com.amazonaws.services.simpleemail.model.Destination;
import com.amazonaws.services.simpleemail.model.Message;
import com.amazonaws.services.simpleemail.model.SendEmailRequest;

@Service
@Qualifier("emailService")
public class EmailService {
    static final String TO = "jbierbrauer99@gmail.com";
    
    @Autowired
    BasicAWSCredentials creds;
    
    public void sendMail(String name, String subject, String email, 
    	    String phone, String message) {

    	if (phone == null || phone == "") {
    		phone = "no phone #";
    	}
    	SendEmailRequest request = new SendEmailRequest()
 		       .withSource(TO);
 		
 		List<String> toAddresses = new ArrayList<String>();
 		toAddresses.add(TO);
 		Destination dest = new Destination().withToAddresses(toAddresses);
 		
 		// set fromEmail as BCC
 		List<String> toBccAddresses = new ArrayList<String>();
 		toBccAddresses.add(TO);
 		dest.setBccAddresses(toBccAddresses);
 		request.setDestination(dest);
 		
 		Content subjContent = new Content().withData(subject);
 		Message msg = new Message().withSubject(subjContent);
 		
 		// Include a body in HTML formats.
 		Content htmlContent = new Content().withData(phone +"<br/>"+ name +"<br/>"+ subject +"<br/>"+ email
 				+"<br/><br/><br/>"+ message);
 		Body body = new Body().withHtml(htmlContent);
 		msg.setBody(body);
 		
 		request.setMessage(msg);
 		
 		// Set AWS access credentials.
 		@SuppressWarnings("deprecation")
		AmazonSimpleEmailServiceClient client =
 		       new AmazonSimpleEmailServiceClient(creds).withRegion(
 		            				  Regions.US_WEST_2);
 		
 		// Call Amazon SES to send the message. 
 		try {
 		   client.sendEmail(request);
 		
 		} catch (AmazonClientException e) {
 		   e.printStackTrace();
 		} catch (Exception e) {
 		   e.printStackTrace();
 		}
    }
    
    public List<String> emailPageContent() {
    	List<String> model = new ArrayList<String>();
    	String content = "<strong>Contact:</strong> Nick Frisch"
    			+ "<br/>"
    			+ "<strong>Location:</strong> 567 Leffingwell Ave."
    			+ "<br/>"
    			+ "Kirkwood, MO 63122"
    			+ "<br/><br/>"
    			+ "Have a question? Feel free to send me an email and I will get back to you "
    			+ "as soon as possible!";
    	model.add(content);
    	return model;
    }
}
