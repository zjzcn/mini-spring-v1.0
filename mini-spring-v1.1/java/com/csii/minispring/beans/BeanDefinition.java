package com.csii.minispring.beans;

import java.util.List;

/**
 * used to describe the config infomation of bean.
 * 
 * @author CSII Rongbo
 * 
 */
public class BeanDefinition {
	private String id;
	private String className;
	private List<Property> properties;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public List<Property> getProperties() {
		return properties;
	}

	public void setProperties(List<Property> properties) {
		this.properties = properties;
	}

}
