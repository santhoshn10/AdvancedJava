package com;

import java.util.ArrayList;
import java.util.List;

public class fib {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		
		RabbitEstimator r=new FibonacciRabbitEstimator();
		
		list=r.countByMonth(4);
		for(Integer i:list){
			System.out.println(i);
		}
	}
}
