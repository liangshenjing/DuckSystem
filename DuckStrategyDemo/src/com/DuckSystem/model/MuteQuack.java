package com.DuckSystem.model;

//变化的 quack() 行为实现类之三
public class MuteQuack implements QuackBehavior {
	public void quack() {
		System.out.println("我不会叫");
	}
}
