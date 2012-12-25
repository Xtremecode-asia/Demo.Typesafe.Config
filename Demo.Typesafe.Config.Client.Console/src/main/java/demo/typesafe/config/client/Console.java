package demo.typesafe.config.client;

import demo.typesafe.config.MessagesProvider;
import demo.typesafe.config.ParametersConfiguration;

/**
 * Created with IntelliJ IDEA.
 * User: wendysa
 * Date: 25/12/12
 * Time: 3:13 PM
 */
public class Console {
    public static void main(String[] args){
        ParametersConfiguration paramsConfig = new ParametersConfiguration();
        String timeOutParam =
                String.format("demo-typesafe-config.parameters.timeOut = %s", paramsConfig.getTimeOut());
        System.out.println(timeOutParam);
        MessagesProvider messagesProvider = new MessagesProvider();
        String timeOutErrorMessage = messagesProvider.getTimeOutErrorMessage();
        System.out.println(String.format("Timeout Error Mesasge= '%s'", timeOutErrorMessage) );
    }
}
