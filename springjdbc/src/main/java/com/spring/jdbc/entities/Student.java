package com.spring.jdbc.entities;

import org.springframework.jdbc.core.JdbcTemplate;

public class Student {
	private int id;
	private String name;
	private String city;
	private JdbcTemplate jdbcTemplate;

    // ✅ This setter is required for Spring to inject JdbcTemplate
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // Optional getter if needed
    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public Student(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", jdbcTemplate=" + jdbcTemplate + "]";
	}

	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
