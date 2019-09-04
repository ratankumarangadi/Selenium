package com.automation.pageFactory;

public class PageFactory<T> {

	private Class pageClass;
	
	public PageFactory(Class page){
		this.pageClass = page;
	}
	public T createPage() throws InstantiationException, IllegalAccessException{
		return (T) pageClass.newInstance();
	}
	
	public  static PageFactory get(Class page){
		return new PageFactory(page);
	}
}
