package etapas.definidas;

import io.cucumber.java.ParameterType;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
import org.junit.runner.RunWith;

@SelectClasspathResource("pretty")
@IncludeEngines("cucumber")
@RunWith(Cucumber.class)
@CucumberOptions(
		

		plugin = "pretty",
        features = "src/test/resources/Features",
        glue = {"etapas.definidas"}

		)	


public class TestRunner {
	
}
