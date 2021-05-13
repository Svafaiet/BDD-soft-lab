package specification;

import calculator.ExpertCalculator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertTrue;

public class StepDefinitions {
    ExpertCalculator calculator;
    double result;

    @Given("I have a Calculator")
    public void initializeAlgorithm() {
        calculator = new ExpertCalculator();
    }

    @When("I ask value of {int} {} {int}")
    public void getValues(int first, String opt, int second) {
        result = calculator.calculate(
                first,
                second,
                opt
        );
    }

    @Then("I should be told {float}")
    public void iShouldBeTold(double expectedAnswer) {
        assertTrue(Math.abs(result - expectedAnswer) < 0.0001);
    }
}
