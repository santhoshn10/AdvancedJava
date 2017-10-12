package com;

import java.util.Arrays;
import java.util.List;

import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;

public class RabbitEstimatorTestCase extends JUnitStories{

	@Override
	public Configuration configuration(){

		return new MostUsefulConfiguration()
.useStoryReporterBuilder(new StoryReporterBuilder().withFormats(Format.CONSOLE,Format.TXT,Format.HTML));
		
	}
	@Override
	protected List<String> storyPaths() {
		return Arrays.asList("com/estimate-rabbits.story");
	}
	@Override
	   public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(), new RabbitEstimatorTestSteps());
    }

	
}
