package com.zcit.SolrSearchDemo.model;

import java.io.Serializable;

public class UserVO implements Serializable {

	private static final long serialVersionUID = 7979066518582131977L;

	private String name;
	
	private String age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	
}
