package com.amz.clone.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "category")
public class Category {

	@Id
	private String id;

	private String ct_name;
	private String priority;

	public Category() {

	}

	public Category(String ct_name, String priority) {
		this.ct_name = ct_name;
		this.priority = priority;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCt_name() {
		return ct_name;
	}

	public void setCt_name(String ct_name) {
		this.ct_name = ct_name;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	@Override
	public String toString() {
		return "category [id=" + id + ", ct_name=" + ct_name + ", priority=" + priority + "]";
	}

}
