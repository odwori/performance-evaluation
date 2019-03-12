package com.department.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Department {
	
	@Id
	private String title;
    private String record;
	
    
    public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getRecord() {
		return record;
	}
	public void setRecord(String record) {
		this.record = record;
	}
	
	@Override
    public String toString() {
        return "Department{" + "title='" + title + '\'' + ", record='" + record + '\'' + '}';
    }

}
