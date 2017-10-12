package com;

import java.util.List;

public interface RabbitEstimator {

	 List<Integer> countByMonth(int months);
	
	 void sortByDesecending(final List<Integer> rabbits);
	
}
