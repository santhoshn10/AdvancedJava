package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FibonacciRabbitEstimator implements RabbitEstimator  {

	public List<Integer> countByMonth(int months) {
		List<Integer> rabbitList=new ArrayList<Integer>();
		int result=2;
		for(int i=0;i<months;i++){
			if(i<2){
			   rabbitList.add(result);
		   }
			else if(i>=2){
				result=(getNextElement(rabbitList,i));
				rabbitList.add(result);

			}
		}
		return rabbitList;
	}
	public void sortByDesecending(List<Integer> rabbitList) {
		Collections.reverse(rabbitList);
	}
	private static Integer getNextElement(List<Integer> list, int k) {
		return list.get(k-2)+list.get(k-1);
	}	
}

