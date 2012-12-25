package demo.typesafe.config;

import demo.typesafe.config.ReferenceConfigBase;

/**
 * Created with IntelliJ IDEA.
 * User: wendysa
 * Date: 25/12/12
 * Time: 5:16 PM
 */
public class ParametersConfiguration extends ReferenceConfigBase {
    public static final String DEMO_TYPESAFE_CONFIG_PARAMETERS_TIME_OUT_CONFIG = "demo-typesafe-config.parameters.timeOut";

    @Override
    public boolean testConfig() {
        return testConfig(DEMO_TYPESAFE_CONFIG_PARAMETERS_TIME_OUT_CONFIG);
    }

    public int getTimeOut(){
        return getReferenceConfig() != null ? getReferenceConfig().getInt(DEMO_TYPESAFE_CONFIG_PARAMETERS_TIME_OUT_CONFIG) : Integer.MIN_VALUE;
    }

}
