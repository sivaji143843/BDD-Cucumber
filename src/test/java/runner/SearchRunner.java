package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/Login.feature",
glue="stepdefinition",
plugin= {"pretty",
		"html:target/new.html",
		"json:target/jsonReport.hml",
		"junit:target/xmlReport.xml"})
public class SearchRunner {

}
