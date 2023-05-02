package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        tags = "@Regression or @SmokeTest", // hangi senaryolarda bu etiket varsa onlar çalıştırılacak
        // or yerine and yazılırsa hem smoke hem de regression tag i olanları çalıştırıyor
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        plugin= {"html:target/site/cucumber-pretty.html"} // basit rapor oluşturur

)
public class _06_TestRunnerSmokeWithPlugin extends AbstractTestNGCucumberTests {
}
