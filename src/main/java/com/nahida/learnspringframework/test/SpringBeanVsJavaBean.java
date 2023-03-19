package com.nahida.learnspringframework.test;

import java.io.Serializable;

//pojo plain old java object
class Pojo{
	private String text;
	private int number;
	@Override
	public String toString() {
		return text+":"+number;
	}
}
class JavaBean implements Serializable{
	private String text;
	private int number;
	//public no-arg constructor
	public JavaBean() {}
	public String getText() {
		return text;
	}
	//getters and setters
	public void setText(String text) {
		this.text = text;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}

}

public class SpringBeanVsJavaBean {
	public static void main(String[] args) {
		Pojo pojo=new Pojo();
		System.out.println(pojo);
	}

}
