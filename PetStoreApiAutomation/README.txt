

Technology Stack:

Java as programming language
TestNG: For running the test suite. It is used because it provide variety of annotation to Design test scripts. It is also capable to run test suite/test classes in parallel mode
. TestNG also produces Emailable HTML report to showcase the execution to of test result plus it can also ve customized.

Rest-Assured: It is a wrapper around http calls. Community bases is huge. Also i am most familiar with Rest Assured.
Maven: For dependencies management.
Jackson: For serializing and Desirializing the request and reposne of an api.



How To use Test Suite.

1. System should have latest version of Maven whose path should be set in environment Variables.

2. IDE should have testNG plugin to run testNG.xml. For ex: If you are using Eclipse download testNG plugin from eclipse MarketPlace.

3. System shouls have Java 1.8 or above.

4. Import the project as a Maven project.

5. Let the Maven downlaod all the dependencies.

6. If the PetStore application is set up in the local host then no need to change anything. If it is hosted on other domain kindly change  variable BASE_URL from the 
ApiUrlConstants class which present in the PrepareRequest Package.

7. Run testng.xml as testng suite.
8. Test class present in src/test/java folder.


Solution Explanation:

1. Api Request Body and response Body have pojo classes which is mapped to their respective classes. Make it easy, accessble and less error prone for test classes.

2. APi helper is an abstract claas which is inherited by the specific helper classes. Every API should have one helper class. Helper classes are basically
for the operation which specifically done by the api.

3. Startegically setting header as header might be different for different api's.



Improvements which needs to be done:  Test data should not be hardCoded. It should come from either excel or yml file (because data can be saved in a more structured way there)
--> Implementation of factory model for API helper class so that test classes should not instantiate it with new operator.