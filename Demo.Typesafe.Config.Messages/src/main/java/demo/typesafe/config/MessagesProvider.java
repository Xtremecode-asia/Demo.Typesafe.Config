package demo.typesafe.config;

import demo.typesafe.config.ReferenceConfigBase;

/**
 * Created with IntelliJ IDEA.
 * User: wendysa
 * Date: 25/12/12
 * Time: 8:44 PM
 */
public class MessagesProvider extends ReferenceConfigBase {
    private static final String DEMO_TYPESAFE_CONFIG_MESSAGES_CONFIG = "demo-typesafe-config.messages.errors.timeOut";

    @Override
    public boolean testConfig() {
        return testConfig(DEMO_TYPESAFE_CONFIG_MESSAGES_CONFIG);
    }

    public String getTimeOutErrorMessage() {
        return getReferenceConfig() != null ? getReferenceConfig().getString(DEMO_TYPESAFE_CONFIG_MESSAGES_CONFIG) :
                                         "";
    }
}
