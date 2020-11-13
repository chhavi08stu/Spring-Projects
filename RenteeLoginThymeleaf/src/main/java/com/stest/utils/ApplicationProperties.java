package com.stest.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Optional;
import java.util.Properties;

public class ApplicationProperties {

	public static final String fileName = "D:\\545019\\Eclipse_Workspace\\GIT_Workspace\\RenteeLoginThymeleaf\\src\\main\\resources/select_data.properties";
	public static final String url = "jdbc:postgresql://localhost:5432/Monetise";
	static Properties prop_sql = new Properties();

	static {
		try (FileInputStream fis = new FileInputStream(fileName)) {
			//try (FileInputStream fis =ApplicationProperties.getClass().getClassLoader().getResourceAsStream(fileName)){
		prop_sql.load(fis);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	public static String getPropertyValue(String key) {
		return String.valueOf(Optional.ofNullable(prop_sql.get(key)).orElse(""));
	}
	public static final String SELECT_OWNER_WITH_SHOP_DETAILS=getPropertyValue("SELECT_OWNER_WITH_SHOP_DETAILS");
}
