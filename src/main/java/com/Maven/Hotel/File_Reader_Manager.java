package com.Maven.Hotel;

public class File_Reader_Manager {

	
	//private Constructor
	private File_Reader_Manager() {

	}

	
	//Static method
	public static File_Reader_Manager getInstanceFrm() {

		File_Reader_Manager frm = new File_Reader_Manager();
		return frm;

	}

	
	//Non-static method
	public Configuration_Reader getInstanceCr() throws Throwable {

		Configuration_Reader cr = new Configuration_Reader();
		return cr;

	}

}
