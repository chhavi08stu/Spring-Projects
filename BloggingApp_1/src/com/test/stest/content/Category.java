package com.tcs.stest.content;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "category")

public class Category {

	private int id;
	private String name;
	private String description;

	/*
	 * @OneToMany(cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "categoryid")
	 */
	/*
	 * @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	 * 
	 * @JoinColumn(name = "categoryid") private List<Course> courseList;
	 */
	@OneToMany(cascade = CascadeType. ALL, fetch = FetchType.LAZY)
	//@JoinColumn(name = "categoryid")
	private List<Course> courseList;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	//@JoinColumn(name = "id")
	public int getCategoryId() {
		return id;
	}

	public void setCategoryId(int categoryid) {
		this.id = categoryid;
	}

	@Column(name = "name", nullable = true)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "description", nullable = true)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}

	public Category(int categoryId, String name, String description, List<Course> courseList) {
		super();
		this.id = categoryId;
		this.name = name;
		this.description = description;
	//this.courseList = courseList;
	}

	public Category() {
	}

}
