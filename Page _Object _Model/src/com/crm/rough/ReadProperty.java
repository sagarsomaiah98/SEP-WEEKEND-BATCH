package com.crm.rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		Properties prop=new Properties();
		
		FileInputStream fis =
		new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\crm\\config\\Config.properties");

		prop.load(fis);
		
		System.out.println(prop.getProperty("url"));
		//System.out.println(System.getProperty("user.dir"));
		
		
	}

}
