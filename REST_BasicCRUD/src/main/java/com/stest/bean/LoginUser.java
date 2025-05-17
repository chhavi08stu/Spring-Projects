package com.stest.bean;


public class LoginUser {

	private int userId;
	private String userName;
	private String userAddress;
	private char[] password;
	
	/** Users Id & Name **/
	public LoginUser(int userId,String userName) {
		userId=this.userId;
		userName=this.userName;
	}
	/** Users Login details **/
	public LoginUser(int userId, String userName, char[] password) {
		userId=this.userId;
		userName=this.userName;
		password=this.password;
	}
	
	/** Users details **/
	public LoginUser(int userId,String userName,String userAddress) {
		userId=this.userId;
		userName=this.userName;
		userAddress=this.userAddress;
	}
	public String toString() {
		return userId+" "+userName+" "+userAddress;
	}
}
