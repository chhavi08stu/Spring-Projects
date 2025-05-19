package com.stest.bean;


public class LoginUser {

	private int userId;
	private String userName;
	private String userAddress;
	private char[] password;
	
	/** Users Id & Name **/
	public LoginUser(int userId,String userName) {
		this.userId=userId;
		this.userName=userName;
	}
	/** Users Login details **/
	protected LoginUser(int userId, String userName, char[] password) {
		this.userId=userId;
		this.userName=userName;
		this.password=password;
	}
	
	/** Users details **/
	public LoginUser(int userId,String userName,String userAddress) {
		this.userId=userId;
		this.userName=userName;
		this.userAddress=userAddress;
	}
	public String toString() {
		return userId+" "+userName+" "+userAddress;
	}
}
