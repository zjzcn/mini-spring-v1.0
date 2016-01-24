package com.csii.minispring.beans;
/**
 * used to describe the property config of bean.
 * @author CSII Rongbo
 *
 */
public class Property {
	private String propName;
	private String propValue;
	private String refOrValue;

	public String getPropName() {
		return propName;
	}

	public void setPropName(String propsName) {
		this.propName = propsName;
	}

	public String getPropValue() {
		return propValue;
	}

	public void setPropValue(String propsValue) {
		this.propValue = propsValue;
	}

	public String getRefOrValue() {
		return refOrValue;
	}

	public void setRefOrValue(String refOrValue) {
		this.refOrValue = refOrValue;
	}
	
}