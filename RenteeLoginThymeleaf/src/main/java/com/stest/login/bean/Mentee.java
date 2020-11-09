package com.stest.login.bean;

public class Mentee {
	private int id;
	private String name;
	private String society;
	private String info;

	public Mentee() {
	}

	public Mentee(int id, String name, String society, String info) {
		super();
		this.id = id;
		this.name = name;
		this.society = society;
		this.info = info;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSociety() {
		return society;
	}

	public void setSociety(String society) {
		this.society = society;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

}
