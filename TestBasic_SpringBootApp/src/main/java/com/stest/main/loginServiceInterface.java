package com.stest.main;

import java.util.List;

import com.stest.main.bean.AdminBean;


public interface loginServiceInterface {
	List<AdminBean> findAll();
}