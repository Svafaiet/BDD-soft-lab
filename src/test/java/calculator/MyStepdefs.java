package calculator;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    private Calculator calculator;
    private int v1;
    private int v2;
    private int result;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Given("^Two input values, (\\d+) & (\\d+)$")
    public void twoInputValues(int arg0, int arg1) {
        v1 = arg0;
        v2 = arg1;
    }

    @Given("^Two input values, -(\\d+) & (\\d+)$")
    public void twoMinusInputValues(int arg0, int arg1) {
        v1 = arg0;
        v2 = arg1;
    }

    @When("^I add the two values$")
    public void iAddTheTwoValues() {
        result = calculator.add(v1, v2);
        System.out.println(result);
    }

    @Then("^I expect the result (\\d+)$")
    public void iExpectTheResult(int arg0) {
        Assert.assertEquals(arg0, result);
    }
}
