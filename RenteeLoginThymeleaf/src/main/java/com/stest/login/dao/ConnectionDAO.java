package com.stest.login.dao;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.stest.login.bean.Owner;
import com.stest.login.bean.Shop;
import com.stest.utils.ApplicationProperties;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDAO {
	static Properties props = new Properties();
	static {
		// Properties props = new Properties();
		props.setProperty("user", "postgres");
		props.setProperty("password", "password");
	}
	 Connection conn = null;//connect();
	private static List<Owner> list = new ArrayList<Owner>();

	public static Logger logger = Logger.getLogger(ConnectionDAO.class);

	public static List<Owner> getOwnerWithShopDetails() {

		// props.setProperty("ssl", "true");
		try (Connection conn = DriverManager.getConnection(ApplicationProperties.url, props)) {
			logger.info("Connected to the PostgreSQL server successfully.");

			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(ApplicationProperties.SELECT_OWNER_WITH_SHOP_DETAILS);
			System.out.println("result set: " + rs.getStatement());

			// try {
			while (rs.next()) {

				Owner owner = new Owner();
				Shop shop = new Shop();

				owner.setId(rs.getInt(1));
				owner.setName(rs.getString(2));
				shop.setShopTitle(rs.getString(3));
				shop.setLocation(rs.getString(4));
				owner.setPhone(rs.getLong(5));
				owner.setCountryCode(rs.getInt(6));
				owner.setEmail(rs.getString(7));
				owner.setGst(rs.getString(8));
				owner.setPan(rs.getString(9));
				owner.setAadhar(rs.getLong(10));
				owner.setShop(shop);

				list.add(owner);
			}

			/*
			 * } catch (SQLException e) { logger.info("list display Exception " +
			 * e.getMessage()); }
			 */

		} catch (SQLException sqle) {
			logger.info("list display Exception " + sqle.getMessage());
			System.out.println("list display Exception " + sqle.getMessage());
		}

		return list;
		// return conn;
	}

	public  Connection connect() {
		/*
		 * Properties props = new Properties(); props.setProperty("user", "postgres");
		 * props.setProperty("password", "password");
		 */
		// props.setProperty("ssl", "true");
		try {
		conn = DriverManager.getConnection(ApplicationProperties.url, props);
			logger.info("Connected to the PostgreSQL server successfully.");

		} catch (SQLException sqle) {
			System.out.println("sql exception " + sqle.getMessage());
			logger.info("sql exception " + sqle.getMessage());
		}
		return conn;
	}
}
