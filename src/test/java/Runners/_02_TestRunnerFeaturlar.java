package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/_01_Login.feature",
                "src/test/java/FeatureFiles/_02_Country.feature"}, // buraya feature file ın path i
        glue = {"StepDefinitions"} // Step definitions ın klasörü yazılıyor

)
public class _02_TestRunnerFeaturlar extends AbstractTestNGCucumberTests {

}
