package demo.typesafe.config.spec;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * Created by Xtremecodes.asia @2012
 * User: saintc0d3r@gmail.com
 * Date: 12/23/12
 * Time: 6:50 PM
 */
public class ConfigSteps {
    private Config config;
    private String stringValue;

    @Given("the application config file exists")
    public void theApplciationConfigFileExists(){
        config = ConfigFactory.defaultReference();
        assertThat(config, notNullValue());
    }

    @When("the application reads $configNode config")
    public void theApplicationReadsConfig(String configNode){
        config.checkValid(config, configNode);
        stringValue = config.getString(configNode);
    }

    @Then("the read config's value = $value")
    public void theReadConfigValue(String value){
        assertThat(stringValue, notNullValue());
    }
}
