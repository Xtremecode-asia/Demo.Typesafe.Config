package demo.typesafe.config.spec;

import demo.typesafe.config.ParametersConfiguration;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * Created with IntelliJ IDEA.
 * User: wendysa
 * Date: 25/12/12
 * Time: 4:51 PM
 */
public class ParametersConfigSteps {
    private ParametersConfiguration paramsConfiguration;
    private int timeOutParamValue;
    private boolean error;

    @Given("the Parameters Configuration service does exist")
    public void theParametersConfigurationServiceDoesExist(){
        paramsConfiguration = new ParametersConfiguration();
        assertThat(paramsConfiguration.testConfig(), equalTo(true));
    }

    @When("the application reads the timeout parameter from the configuration")
    public void theApplicationReadsTheTimeoutParameterFromTheConfiguration(){
        timeOutParamValue = paramsConfiguration.getTimeOut();
    }

    @When("the application reads the non-existing parameter from the configuration")
    public void theApplicationReadsNonExistingParameterFromTheConfiguration(){
        error = paramsConfiguration.testConfig("12312313123213123123123123123123");
    }

    @Then("error should occur")
    public void errorShouldOccur(){
        assertThat(error, equalTo(false));
    }

    @Then("the timeout value = $param milliseconds")
    public void theTimeoutValueInMilliseconds(int param){
        assertThat(timeOutParamValue, equalTo(param));
    }
}
