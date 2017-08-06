
// copied from https://cucumber.io/docs/reference/jvm#java
// created cucumber folder in target 
// pretty is a plug in
// to run all
// @CucumberOptions(plugin = {"pretty", "html:target/cucumber"})
// if to exclude test cases  
//@CucumberOptions(plugin = {"pretty", "html:target/cucumber"},tags="~@logotest")


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber"},tags="@logotest")

public class RunnerClass {

	
	
}
