package com.DuckSystem.test;

import com.DuckSystem.model.Duck;
import com.DuckSystem.model.MallardDuck;

public class DuckTest {
	  public static void main(String[] args) {
	    Duck duck=new MallardDuck();
	    duck.performFly();
	    duck.performQuack();  
	    duck.swim();
	    duck.display();
	  }
	 
}