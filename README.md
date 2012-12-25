Demo.Typesafe.Config.Spec
=========================

A simple spec/test project to demonstrate how to use Typesafe's Configuration in a Java module.

Things to do before running the sample:
---------------------------------------
Install these following softwares in your machine:
  - JDK 7 with latest updates version.
  - Git client
  - Intellij IDEA 12

HOW TO - Pull the project from github to your local machine:
------------------------------------------------------------
1. Open the git bash console.
2. Change directory to a folder where you are going to put the source code in.
3. Type &amp; run this command: git clone git@github.com:Xtremecode-asia/Demo.Typesafe.Config.Spec.git

HOW TO - Run the unit test in Intellij IDEA:
--------------------------------------------
1. Run your intellij IDEA.
2. Open the project.
3. Click "Run" -> "Edit Configuration" menu.
4. On the "Run/Debug Configurations", click greenish '+' small icon and click "Junit".
5. On the Junit section panel, enter the Name field with any string (e.g. Demo.Typesafe.Config.Spec ), Package: demo.typesafe.config.spec, Search for tests: Across module dependencies, Working directory: the path of Demo.Typesafe.Config.Spec project, Use classpath of module: Demo.Typesafe.Config.Spec.
6. Click [Apply] and then [Ok].
7. Run the unit test through pressing [CTL]+[F5] or click "Run"->"Run '<your Junit run configuration name>'".

HOW TO - Run the console app in Intellij IDEA:
----------------------------------------------
1. Run your intellij IDEA.
2. Open the project.
3. Click "Run" -> "Edit Configuration" menu.
4. On the "Run/Debug Configurations", click greenish '+' small icon and click "Application".
5. On the Application section panel, enter the Name field with any string (e.g. Console ), Main class: demo.typesafe.config.client.Console, Working directory: the path of Demo.Typesafe.Config.Client.Console project, Use classpath of module: Demo.Typesafe.Config.Client.Console.
6. Click [Apply] and then [Ok].
7. Run the unit test through pressing [CTL]+[F5] or click "Run"->"Run '<your Application run configuration name>'".

The anatomy of Demo.Typesafe.Config folder:
-------------------------------------------------
1. Demo.Typesafe.Config.Spec - the JBehave-based unit testing project for this demo.
2. Demo.Typesafe.Config.Params - Library which contains a class exposing its own configuration value.
3. Demo.Typesafe.Config.Messages - Serves same purpose as Demo.Typesafe.Config.Params but exposing configuration value which is belong to this project.
4. Demo.Typesafe.Config.Base - Hold a base class which is subclassed by classes in Demo.Typesafe.Config.Params & Demo.Typesafe.Config.Messages projects.
5. Demo.Typesafe.Config.Client.Console - simple console app which reads the config values from Demo.Typesafe.Config.Messages & Demo.Typesafe.Config.Params.

HOW TO - Confirm that Typesafe's configuration library is working:
------------------------------------------------------------------
1. Run the JBehave test in Intellij IDEA 12, confirm that all scenario tests are PASSED.
2. Run the console app, confirm that the console screen displays the following output: 
	demo-typesafe-config.parameters.timeOut = 10000
	Timeout Error Mesasge= 'Your request is timed out. Our server might be busy or under heavy load. Please re-send your request at next few moments. Thank you.'

References:
-----------
1. Typesafe Configuration's Git Wiki:  https://github.com/typesafehub/config
2. Typesafe Configuration's API doc ref: http://typesafehub.github.com/config/latest/api/
