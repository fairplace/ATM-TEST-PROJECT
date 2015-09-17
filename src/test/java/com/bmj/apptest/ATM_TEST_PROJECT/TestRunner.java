package com.bmj.apptest.ATM_TEST_PROJECT;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","html:target/cucumber"},
		features={"src/test/resources/cucumberfeature"})

public class TestRunner {

}
