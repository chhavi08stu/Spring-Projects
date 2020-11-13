package com.stest.login.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.stest.login.bean.Owner;
import com.stest.login.bean.Shop;
import com.stest.utils.ApplicationProperties;

public class LoginDAO {
	public static Logger logger = Logger.getLogger(LoginDAO.class);
	// private static List<Mentee> mentees = new ArrayList<>();
	private static List<Owner> list = new ArrayList<Owner>();
	// private static ConnectionDAO connDao = new ConnectionDAO();

	public static void main(String[] s) {
		// System.out.println("value:
		// "+ApplicationProperties.SELECT_OWNER_WITH_SHOP_DETAILS);
		// ConnectionDAO dao = new ConnectionDAO();
		System.out.println("main method");
		list = getOwnerWithShopDetails();

		list.forEach((k) -> System.out.println(k.toString()));
	}

	public static List<Owner> getOwnerWithShopDetails() {
		// ResultSet rs = null;
		try (Connection conn = new ConnectionDAO().connect();
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery(ApplicationProperties.SELECT_OWNER_WITH_SHOP_DETAILS);) {
			// System.out.println("result set: " + rs.getStatement());

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
				owner.setAadhar(rs.getString(10));

				owner.setShop(shop);

				list.add(owner);

			}

		} catch (SQLException e) {
			logger.info("list display Exception " + e.getMessage());
		}

		return list;
	}

	/*
	 * public static List<Owner> getResultFromTableDB(String keyQuery) {
	 * 
	 * // Connection conn = ConnectionDAO.connect(); // ResultSet rs = null; try
	 * (Connection conn = new ConnectionDAO().connect(); Statement st =
	 * conn.createStatement(); ResultSet rs = st.executeQuery(keyQuery)) {
	 * System.out.println("result set: " + rs.getStatement());
	 * 
	 * // try { while (rs.next()) {
	 * 
	 * Owner owner = new Owner(); Shop shop = new Shop();
	 * 
	 * owner.setId(rs.getInt(1)); owner.setName(rs.getString(2));
	 * shop.setShopTitle(rs.getString(3)); shop.setLocation(rs.getString(4));
	 * owner.setPhone(rs.getInt(5)); owner.setCountryCode(rs.getInt(6));
	 * owner.setEmail(rs.getString(7)); owner.setGst(rs.getString(8));
	 * owner.setPan(rs.getString(9)); owner.setAadhar(rs.getLong(10));
	 * owner.setShop(shop);
	 * 
	 * list.add(owner);
	 * 
	 * }
	 * 
	 * 
	 * } catch (SQLException e) { logger.info("list display Exception " +
	 * e.getMessage()); }
	 * 
	 * 
	 * } catch (SQLException sqle) { logger.info("list display Exception " +
	 * sqle.getMessage()); System.out.println("list display Exception " +
	 * sqle.getMessage()); } catch (NullPointerException npe) {
	 * logger.info("Exception " + npe.getMessage()); System.out.println("Exception "
	 * + npe.getMessage()); npe.printStackTrace(); } return list; }
	 */

	public static ResultSet getResultFromTableDB(String keyQuery) {

		// Connection conn = ConnectionDAO.connect();
		ResultSet rs = null;
		try (Connection conn = new ConnectionDAO().connect(); Statement st = conn.createStatement()) {
			rs = st.executeQuery(keyQuery);
			// System.out.println("result set: " + rs.getStatement());

		} catch (SQLException | NullPointerException sqle) {
			logger.info("Exception " + sqle.getMessage());
			System.out.println("Exception " + sqle.getMessage());
		}
		return rs;
	}

}
