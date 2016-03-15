package com.pattern.adapter;

/**
 * 讲一个类的接口转换成客户希望的另外一个接口，使原本由于接口不兼容的不能在一工作的类实现相互协作。
 * 
 *
 */
public class Main {

	public static void main(String[] args) {
		Target target = new Adapter();
		target.doSomething();
	}

}
