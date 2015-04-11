package com.example.project;

import cn.bmob.v3.BmobObject;
import cn.bmob.v3.BmobUser;

public class Person extends BmobUser{
	private String phone;
	private boolean driver;
	private boolean passenger;
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public boolean isDriver() {
		return driver;
	}
	public void setDriver(boolean driver) {
		this.driver = driver;
	}
	public boolean isPassenger() {
		return passenger;
	}
	public void setPassenger(boolean passenger) {
		this.passenger = passenger;
	}
}