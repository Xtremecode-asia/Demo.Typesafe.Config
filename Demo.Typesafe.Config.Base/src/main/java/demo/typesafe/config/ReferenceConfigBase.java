package demo.typesafe.config;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

/**
 * Created with IntelliJ IDEA.
 * User: wendysa
 * Date: 25/12/12
 * Time: 10:53 PM
 */
public abstract class ReferenceConfigBase {
    private final Config referenceConfig;

    protected ReferenceConfigBase(){
        referenceConfig = ConfigFactory.defaultReference();
    }

    public abstract boolean testConfig();

    public boolean testConfig(String configNode){
        if (referenceConfig != null){
            try{
                referenceConfig.checkValid(referenceConfig, configNode);
            }
            catch(Exception exception){
                exception.printStackTrace();
                return false;
            }
        }
        return true;
    }

    protected Config getReferenceConfig() {
        return referenceConfig;
    }
}
