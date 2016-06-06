package com.DuckSystem.model;

//变化的 quack() 行为实现类之一
public class Quack implements QuackBehavior {
	public void quack() {
		System.out.println("我会呱呱叫");
	}
}
