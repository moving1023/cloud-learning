package com.liyl.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Author: 李毅霖.
 * @Description:
 * @Date: 2017/12/27
 * @Modified by .
 */
@Entity
//@Table(name = "T_USER")
public class User implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private int age;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
