package com.pattern.facade;

public class Main {
	
	/**
	 * Facade模式
	 * 外观模式
	 * 为子系统中的一组接口，提供一个统一的接口
	 * 隐藏，封装系统，简化原有系统的使用方式。
	 * @param args
	 */
	public static void main(String[] args) {
		ModuleApi moduleApi = new ModuleImpl();
		moduleApi.doSomething();
	}

}
