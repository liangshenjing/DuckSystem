package com.DuckSystem.model;

public class RubberDuck extends Duck {
	  public RubberDuck() {
		    flyBehavior=new FlyNoWay();
		    quackBehavior=new Squeak();
		  }
		  
		  public void display() {
		    System.out.println("�������Ѽ�ӣ���");
		  }
		}

