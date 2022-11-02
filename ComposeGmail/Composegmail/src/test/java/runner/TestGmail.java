package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\admin\\eclipse-workspace\\Composegmail\\src\\test\\java\\feature\\Test.feature",
glue = {"TestGmailrunner"} )
//html
//json
//text
//xml
public class TestGmail {

}
