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
5. On the Junit section panel, enter the Name field with any string (e.g. Demo.Typesafe.Config.Spec ), Package: Demo.Typesafe.Config.Spec, Search for tests: In whole project.
6. Click [Apply] and then [Ok].
7. Run the unit test through pressing [CTL]+[F5] or click "Run"->"Run '<your Junit run configuration name>'".

The anatomy of Demo.Typesafe.Config.Spec project:
-------------------------------------------------
1. lib folder - contains all required dependencies to run the samples.
2. resources folder - contains the 'application.conf' file and Jbehave's story files.
3. spec folder - contains java files which built the unit test demo.

HOW TO - Confirm that Typesafe's configuration library is working:
------------------------------------------------------------------
1. Run the JBehave test in Intellij IDEA 12, confirm that all scenario tests are PASSED.

References:
-----------
1. Typesafe Configuration's Git Wiki:  https://github.com/typesafehub/config
2. Typesafe Configuration's API doc ref: http://typesafehub.github.com/config/latest/api/
