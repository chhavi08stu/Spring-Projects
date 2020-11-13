package com.stest.login.model;

import java.util.List;

import com.stest.login.bean.Owner;
import com.stest.login.dao.LoginDAO;
import com.stest.utils.ApplicationProperties;

public class OwnerService {
	public static List<Owner> getOwnerWithShopDetails(){
		return  LoginDAO.getOwnerWithShopDetails();
		
	}
}
