package com.tcs.stest.content;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "courses")
public class Course {

	private int courseId;
	// @Transient
	private int categoryid;
	private String name;
	private int duration;
	private int miles;

	@Column(name = "categoryid", nullable = true)
	public int getCategoryid() {
		return categoryid;
	}
	
	public void setCategoryid(int categoryId) {
		this.categoryid = categoryId;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	@Column(name = "duration", nullable = true)
	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Column(name = "miles", nullable = true)
	public int getMiles() {
		return miles;
	}

	public void setMiles(int miles) {
		this.miles = miles;
	}

	@Column(name = "name", nullable = true)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Course(int courseId, String name, int duration, int miles, int categoryId) {
		super();
		this.courseId = courseId;
		this.categoryid = categoryId;
		this.name = name;
		this.duration = duration;
		this.miles = miles;

	}

	public Course() {
	}

	@Override
	public String toString() {
		return "Category Id=" + categoryid + ", courseId=" + courseId + ", name=" + name + ", duration=" + duration
				+ ", miles=" + miles + "]";
	}
}
