package com.csii.minispring.context;

import java.util.HashMap;
import java.util.Map;

import com.csii.minispring.beans.xml.BeanDefinitionParser;
import com.csii.minispring.beans.xml.BeanDefinitionReader;
import com.csii.minispring.exceptions.BeansException;
import com.csii.minispring.io.ClassPathResource;
import com.csii.minispring.io.Resource;

/**
 * ClassPathXmlApplicationContext
 * 
 * @author Rongbo
 * 
 */
public class ClassPathXmlApplicationContext {
	private Resource configResource;
	BeanDefinitionReader reader = null;
	BeanDefinitionParser parser = null;
	Map<String, Object> beanMap = new HashMap<String, Object>();

	public ClassPathXmlApplicationContext(String configLocation) {
		configResource = new ClassPathResource(configLocation);
		loadBeanDefinitions();
		parseBeanDefinitions();
	}

	public Resource getConfigResource() {
		return configResource;
	}

	public void setConfigResource(Resource configResource) {
		this.configResource = configResource;
	}

	private void loadBeanDefinitions() {
		reader = new BeanDefinitionReader(configResource);
		reader.readBeanDefiniton();
	}

	private void parseBeanDefinitions() {
		parser = new BeanDefinitionParser();
		parser.parseBeanDefinitions(beanMap, reader);
	}

	public Object getBean(String beanName) {
		Object bean = beanMap.get(beanName);
		if (bean == null) {
			throw new BeansException("bean not found, please check your config file.");
		}
		return bean;
	}

}
