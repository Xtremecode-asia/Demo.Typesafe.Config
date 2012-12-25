Feature: A client app's message formats are provided by Bravo Library

Narrative:
As a client application
It needs to read an error message
So that It could display meaningfull error message when an exception happens

--------------------------------------------------------------------------------------

Scenario: Client application reads timeout's error message
Given the Messages provider does exist
When the application reads the timeout's error message
Then the error message = 'Your request is timed out. Our server might be busy or under heavy load. Please re-send your request at next few moments. Thank you.'