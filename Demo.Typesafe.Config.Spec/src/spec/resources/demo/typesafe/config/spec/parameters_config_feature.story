Feature: A client app's parameters are held by Alpha library

Narrative:
As a client application
It needs to read time out parameter
So that It could decide when the unresponsive call should be stopped and regarded as timed out call

--------------------------------------------------------------------------------------

Scenario: Client application reads time out parameter from configuration
Given the Parameters Configuration service does exist
When the application reads the timeout parameter from the configuration
Then the timeout value = 10000 milliseconds

Scenario: Client application reads non-existing parameter from configuration
Given the Parameters Configuration service does exist
When the application reads the non-existing parameter from the configuration
Then error should occur