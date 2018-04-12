package com.ftf.lecture.seven.javaproperty;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GoogleProperties {
	
	private String link;
	
	public void initialize(Properties properties, String propertyFileName) {
		InputStream input = null;

		try {
			properties = new Properties();
			input = new FileInputStream(propertyFileName);

			// load a properties file
			properties.load(input);

			this.link = properties.getProperty("link");
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public String getLink() {
		return link;
	}
	
	

}
