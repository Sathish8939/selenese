package com.Maven.Hotel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties p = new Properties();

	public Configuration_Reader() throws Throwable {
		File f = new File(
				"C:\\Users\\a\\eclipse-workspace\\Maven_Project_project-11Am\\src\\main\\java\\com\\Maven\\Hotel\\Adactin.properties");

		FileInputStream fs = new FileInputStream(f);

		p = new Properties();

		p.load(fs);

	}

	public String getUrl() {
		String url = p.getProperty("url");
		return url;

	}

	public String getUserName() {
		String username = p.getProperty("username");
		return username;

	}
	
	public String getPassword() {
		String password = p.getProperty("password");
		return password;

	}


	public String getFirstName() {
		// TODO Auto-generated method stub

		String firstname = p.getProperty("firstname");
		return firstname;
	}

	public String getLastName() {
		String lastname = p.getProperty("lastname");
		return lastname;
	}

	public String getBillingAdress() {
		String billingaddress = p.getProperty("billingaddress");
		return billingaddress;
	}

	public String getCreditCardNumber() {
		String creditcardnumber = p.getProperty("creditcardnumber");
		return creditcardnumber;
	}

	public String getCvvNumber() {
		String cvvnumber = p.getProperty("cvvnumber");
		return cvvnumber;
	}

}
