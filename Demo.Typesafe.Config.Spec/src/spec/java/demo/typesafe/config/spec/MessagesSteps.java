package demo.typesafe.config.spec;

import demo.typesafe.config.MessagesProvider;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * Created with IntelliJ IDEA.
 * User: wendysa
 * Date: 25/12/12
 * Time: 7:44 PM
 */
public class MessagesSteps {
    private MessagesProvider messagesProvider;
    private String timeoutErrorMessage;

    @Given( "the Messages provider does exist" )
    public void theMessagesProviderDoesExist(){
        messagesProvider = new MessagesProvider();
        assertThat(messagesProvider.testConfig(), equalTo(true));
    }
    @When("the application reads the timeout's error message")
    public void theApplicationReadsTheTimeoutErrorMessage(){
         timeoutErrorMessage = messagesProvider.getTimeOutErrorMessage();
    }

    @Then("the error message = '$errorMessage'")
    public void theErrorMessage(String errorMessage){
        assertThat(timeoutErrorMessage, equalTo(errorMessage));
    }
}
