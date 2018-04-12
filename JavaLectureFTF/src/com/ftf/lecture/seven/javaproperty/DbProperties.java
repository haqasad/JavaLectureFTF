package com.ftf.lecture.seven.javaproperty;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DbProperties {

	private String driverClass;
	private String driver;
	private String hostName;
	private String portNumber;
	private String sid;
	private String userName;
	private String password;

	public void initialize(Properties properties, String propertyFileName) {
		InputStream input = null;

		try {
			properties = new Properties();
			input = new FileInputStream(propertyFileName);

			// load a properties file
			properties.load(input);

			this.driverClass = properties.getProperty("driver-class");
			this.driver = properties.getProperty("driver");
			this.hostName = properties.getProperty("host-name");
			this.portNumber	 = properties.getProperty("port-number");
			this.sid = properties.getProperty("sid");
			this.userName	= properties.getProperty("user-name");
			this.password = properties.getProperty("password");

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

	public String getDriverClass() {
		return driverClass;
	}

	public String getDriver() {
		return driver;
	}

	public String getHostName() {
		return hostName;
	}

	public String getPortNumber() {
		return portNumber;
	}

	public String getSid() {
		return sid;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}


}





