
// copied from https://cucumber.io/docs/reference/jvm#java
// created cucumber folder in target 
// pretty is a plug in

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber"})

public class RunnerClass {

	
	
}
