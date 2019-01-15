package com.demo.stream;
public interface FourWheeler {
   default void print(){
      System.out.println("我是一辆四轮车!");
   }
}