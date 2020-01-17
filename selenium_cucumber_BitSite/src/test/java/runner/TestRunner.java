package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/cucumber.json" }, 
				features = "classpath:features", 
				glue = { "stepDefs" },
                tags = {"@test_home_page"},
                 dryRun = false    ) 

public class TestRunner {

}
