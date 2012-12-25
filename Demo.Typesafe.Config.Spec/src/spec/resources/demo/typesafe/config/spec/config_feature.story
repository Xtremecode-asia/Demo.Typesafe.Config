Feature: An application reads several parameters from a configuration file

Narrative:
As an application
It needs to determine the running mode through reading the configuration
So that It could decide whether it should run in production or development mode

Scenario: Read Running Mode Config
Given the application config file exists
When the application reads demo-typesafe-config.application-mode config
Then the read config's value = Development

----------------------------------------------------------------------------------

Narrative:
As an application
It needs to determine the database connection string from configuration
So that It could connect to the correct database server

Scenario: Read database client driver from configuration
Given the application config file exists
When the application reads demo-typesafe-config.db.default.driver config
Then the read config's value = com.mysql.jdbc.Driver

Scenario: Read database connection string from configuration
Given the application config file exists
When the application reads demo-typesafe-config.db.default.url config
Then the read config's value = jdbc:mysql://localhost/sample.extjs.play.mvc?characterEncoding=UTF-8

Scenario: Read database connection's user name from configuration
Given the application config file exists
When the application reads demo-typesafe-config.db.default.user config
Then the read config's value = root

Scenario: Read database connection's password from configuration
Given the application config file exists
When the application reads demo-typesafe-config.db.default.user config
Then the read config's value = test123