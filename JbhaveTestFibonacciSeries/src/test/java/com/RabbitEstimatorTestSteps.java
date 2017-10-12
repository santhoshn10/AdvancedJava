package com;


import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.steps.Steps;


public class RabbitEstimatorTestSteps extends Steps{
	private int months;
	private List<Integer> rabbitList;

	@Given("the number of $months")
	public void givenTheNumberOfmonths(int month) {
		months=month;
	}

	@When("the number of rabbits are estimated")
	public void whenTheNumberOfRabbitsAreEstimated() {
		RabbitEstimator Rabbit=new FibonacciRabbitEstimator();
         rabbitList = Rabbit.countByMonth(months);
		}
	
	
	@Then("the number of rabbits for each month will be $expected")
	public void thenTheNumberOfRabbitsForEachMonthWillBeexpected(List<Integer> expected) {
		assertThat(rabbitList).isEqualTo(expected);
	}	
	
	@When("the list is sorted in descending order")
	
	public void whenTheListIsSortedInDescendingOrder() {
		RabbitEstimator Rabbit=new FibonacciRabbitEstimator();
        Rabbit.sortByDesecending(rabbitList);
	}	
}
