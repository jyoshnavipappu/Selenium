package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="Features",glue="StepDef",monochrome=true)
public class Run1 extends AbstractTestNGCucumberTests
{
	

}
