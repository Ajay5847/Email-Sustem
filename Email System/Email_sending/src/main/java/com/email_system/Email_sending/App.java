package com.email_system.Email_sending;

import java.util.Scanner;
import java.io.File;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import javax.mail.Session;

public class App 
{
    private static Scanner sc;
	public static void main( String[] args )
    {
      String message = "Hello There.";
      String subject = "Here are some BUGS with your Landing Page.";
   //   String to =  "buntyajay53@gmail.com";
      System.out.println("Enter the recipient's mail : ");
      sc = new Scanner(System.in); 
      String to = sc.next();
      String from = "Ajaybunty2812@gmail.com";
      sendattach(message,subject,to,from);
    }
    	//this is responsible to send with attachment
    private static void sendattach(String message, String subject, String to, String from) {
    			//host name...!
    			String host = "smtp.gmail.com";
    			//get the system properties...!
    			Properties properties = System.getProperties();
    			//System.out.println("properties" + properties);
    			
    			//setting important information to properties object...!
    			properties.put("mail.smtp.host", host);
    			properties.put("mail.smtp.port", "465");
    			properties.put("mail.smtp.ssl.enable", "true");
    			properties.put("mail.smtp.auth", "true");
    			
    			//Step 1 : session object
    			
    			Session session=Session.getInstance(properties, new Authenticator() {
    				@Override
    				protected PasswordAuthentication getPasswordAuthentication() {				
    					return new PasswordAuthentication("ajayproject2812@gmail.com", "Ajay@346689");
    				}
    			});
    			
    			session.setDebug(true);
    			
    			//compose the message...!
    			
    			MimeMessage m = new MimeMessage(session);
    			try {
    				
    			//from email
    			m.setFrom(from);
    			
    			//add recipient to message
    			
    			m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
    			
    			//adding subject to message
    			m.setSubject(subject);
    			
    			//adding text to message
    			//m.setText(message);
    			
    			//sent attachment

    			//file path
    			String path = "C:\\Users\\Ajayb\\OneDrive\\Pictures\\GettyImages-185002046-5772f4153df78cb62ce1ad69.jpg";
    			
    			MimeMultipart Multipart = new MimeMultipart();
    			
    			MimeBodyPart textMime = new MimeBodyPart();
    			
    			MimeBodyPart fileMime = new MimeBodyPart();
    			try {
    				textMime.setContent("<!DOCTYPE html>\r\n"
    						+ "<html>\r\n"
    						+ "    <head>\r\n"
    						+ "        <title>My Blog</title>\r\n"
    						+ "       <style>\r\n"
    						+ "           html {\r\n"
    						+ "    margin: 0;\r\n"
    						+ "    padding: 0;\r\n"
    						+ "}\r\n"
    						+ "body {\r\n"
    						+ "    font-family: 'Handlee', cursive;\r\n"
    						+ "    font-size: 13pt;\r\n"
    						+ "    background-color: #efefef;\r\n"
    						+ "    padding: 10px;\r\n"
    						+ "    margin: 0;\r\n"
    						+ "}\r\n"
    						+ "h1 {\r\n"
    						+ "    font-size: 15pt;\r\n"
    						+ "    color: #20bcd5;\r\n"
    						+ "    text-align: center;\r\n"
    						+ "    padding: 18px 0 18px 0;\r\n"
    						+ "    margin: 0 0 10px 0;\r\n"
    						+ "}\r\n"
    						+ "h1 span {\r\n"
    						+ "    border: 4px dashed #20bcd5;\r\n"
    						+ "    padding: 10px;\r\n"
    						+ "}\r\n"
    						+ "p {\r\n"
    						+ "    padding: 0;\r\n"
    						+ "    margin: 0;\r\n"
    						+ "}\r\n"
    						+ ".img-circle {\r\n"
    						+ "    border: 3px solid white;\r\n"
    						+ "    border-radius: 60%;\r\n"
    						+ "}\r\n"
    						+ "x\r\n"
    						+ "\r\n"
    						+ ".section {\r\n"
    						+ "    background-color: #fff;\r\n"
    						+ "    padding: 15px;\r\n"
    						+ "    margin-bottom: 10px;\r\n"
    						+ "    border-radius: 10px;\r\n"
    						+ "}\r\n"
    						+ "#header {\r\n"
    						+ "    background-image: url(\"https://images.pexels.com/photos/952670/pexels-photo-952670.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1\");\r\n"
    						+ "    background-size: cover;\r\n"
    						+ "}\r\n"
    						+ "#header img {\r\n"
    						+ "    display: block;\r\n"
    						+ "    width: 80px;\r\n"
    						+ "    height: 80px;\r\n"
    						+ "    margin: auto;\r\n"
    						+ "}\r\n"
    						+ "#header p {\r\n"
    						+ "    font-size: 25pt;\r\n"
    						+ "    color: rgb(155, 73, 6) ;\r\n"
    						+ "    padding-top: 5px;\r\n"
    						+ "    margin: 0;\r\n"
    						+ "    font-weight: bold;\r\n"
    						+ "    text-align: center;\r\n"
    						+ "}\r\n"
    						+ ".quote {\r\n"
    						+ "    font-size: 12pt;\r\n"
    						+ "    text-align: right;\r\n"
    						+ "    margin-top: 10px;\r\n"
    						+ "}\r\n"
    						+ "table {\r\n"
    						+ "    width: 100%;\r\n"
    						+ "}\r\n"
    						+ "table, th, td {\r\n"
    						+ "    border: 2px solid #cecece;\r\n"
    						+ "    border-collapse: collapse;\r\n"
    						+ "    text-align: center;\r\n"
    						+ "    table-layout: fixed;\r\n"
    						+ "}\r\n"
    						+ ".selected {\r\n"
    						+ "    background-color: #f36f48;\r\n"
    						+ "    font-weight: bold;\r\n"
    						+ "    color: white;\r\n"
    						+ "}\r\n"
    						+ "li {\r\n"
    						+ "    margin-bottom: 15px;\r\n"
    						+ "    font-weight: bold;\r\n"
    						+ "}\r\n"
    						+ "\r\n"
    						+ "\r\n"
    						+ "hr {\r\n"
    						+ "    border: 0;\r\n"
    						+ "    height: 1px;\r\n"
    						+ "    background: #f36f48;\r\n"
    						+ "}\r\n"
    						+ "form {\r\n"
    						+ "    text-align: center;\r\n"
    						+ "    margin-top: 0;\r\n"
    						+ "}\r\n"
    						+ ".submit {\r\n"
    						+ "    background-color: #3fb6b2;\r\n"
    						+ "    padding: 12px 45px;\r\n"
    						+ "    border-radius: 5px;\r\n"
    						+ "    cursor: pointer;\r\n"
    						+ "    color: #ffffff;\r\n"
    						+ "    border: none;\r\n"
    						+ "    outline: none;\r\n"
    						+ "    margin: 0;\r\n"
    						+ "    font-weight: bold;\r\n"
    						+ "}\r\n"
    						+ ".submit:hover {\r\n"
    						+ "    background-color: #43a09d;\r\n"
    						+ "}\r\n"
    						+ "\r\n"
    						+ "\r\n"
    						+ ".face {\r\n"
    						+ "    transform: scale(0.4);\r\n"
    						+ "    margin: 0 auto;\r\n"
    						+ "    display: block;\r\n"
    						+ "    margin-top: -35px;\r\n"
    						+ "    margin-bottom: -25px;\r\n"
    						+ "}\r\n"
    						+ "\r\n"
    						+ ".copyright {\r\n"
    						+ "    font-size: 8pt;\r\n"
    						+ "    text-align: right;\r\n"
    						+ "    padding-bottom: 10px;\r\n"
    						+ "    color: grey;\r\n"
    						+ "}\r\n"
    						+ "       </style>\r\n"
    						+ "    </head>\r\n"
    						+ "    \r\n"
    						+ "    <body>\r\n"
    						+ "        <!-- header start -->\r\n"
    						+ "        <div id=\"header\" class=\"section\">\r\n"
    						+ "            <img alt=\"\" class=\"img-circle\" src=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQKFRuYrp44pt1aBkblE16S7dah6Vmjj6EW7A&usqp=CAU\">\r\n"
    						+ "            <p>M AJAY KUMAR</p>\r\n"
    						+ "        </div>\r\n"
    						+ "        <!-- header end -->\r\n"
    						+ "        \r\n"
    						+ "        <!-- About Me section start -->\r\n"
    						+ "        <div class=\"section\">\r\n"
    						+ "            <h1><span>About Me</span></h1>\r\n"
    						+ "            <p>\r\n"
    						+ "                Hey! I'm <strong>M AJAY KUMAR</strong>. Coding has changed my world. It's not just about apps. Learning to code gave me <i>problem-solving skills</i> and a way to communicate with others on a technical level. I want to use my coding skills to get a better job. Join me in this rewarding journey. You'll have fun, get help, and learn along the way!\r\n"
    						+ "            </p>\r\n"
    						+ "            <p class=\"quote\">\"Declare variables, not war\"</p>\r\n"
    						+ "        </div>\r\n"
    						+ "        <!-- About Me section end -->\r\n"
    						+ "        \r\n"
    						+ "        \r\n"
    						+ "          \r\n"
    						+ "        \r\n"
    						+ "        <!-- My Skills section start -->\r\n"
    						+ "        <div class=\"section\">\r\n"
    						+ "            <h1><span>My Skills</span></h1>\r\n"
    						+ "            <ul>\r\n"
    						+ "                <li>Java <br /> </li>\r\n"
    						+ "                <li>C Programming</br></li>\r\n"
    						+ "                <li>HTML <br /> </li>\r\n"
    						+ "                <li>CSS <br /></li>\r\n"
    						+ "               \r\n"
    						+ "            </ul>\r\n"
    						+ "        </div>\r\n"
    						+ "        <!-- My Skills section end -->\r\n"
    						+ "        \r\n"
    						+ "        \r\n"
    						+ "        \r\n"
    						+ "        <!-- Form section start -->\r\n"
    						+ "       <div class=\"section\">\r\n"
    						+ "            <h1><span>Contact Me</span></h1>\r\n"
    						+ "                <P>\r\n"
    						+ "                    <b>M AJAY KUMAR</b></br>\r\n"
    						+ "                    ajaybunty91@gmail.com</br>\r\n"
    						+ "                    +91 8897830367, </br>\r\n"
    						+ "                    Hyderabad, </br>\r\n"
    						+ "                    Telangana.\r\n"
    						+ "                </P> \r\n"
    						+ "\r\n"
    						+ "        </div>\r\n"
    						+ "        <!-- Form section end -->\r\n"
    						+ "        \r\n"
    						+ "       \r\n"
    						+ "        <div class=\"copyright\">\r\n"
    						+ "            &copy; 2017 My Blog. All rights reserved.\r\n"
    						+ "        </div>\r\n"
    						+ "        \r\n"
    						+ "    </body>\r\n"
    						+ "</html>","text/html");
    				
    				File file = new File(path);
    				fileMime.attachFile(file);
    				Multipart.addBodyPart(fileMime);
    				Multipart.addBodyPart(textMime);
    			}catch(Exception e) {
    				e.printStackTrace();
    			}
    		
    			m.setContent(Multipart);
    			//Step 3 : send the message using transport class
    			Transport.send(m);
    			
    			System.out.println("Message sent successfully.........");
    				
    			} catch(Exception e){
    				e.printStackTrace();
    			}
    			

		
	}		
}

