# TEST_Assignment4_UnitTesting
#### _by: Cherry Rose Semeña and Emmely Lundberg_

Exam for 1. semester Computer Science ASSIGNMENT

_In this assignment you decide which programming language you use, as long as it is objectoriented. How ever one subtask is to use Junit 5, so you must this small part must be Java.
The assignment is solved in pairs and the solution will be presented (to me) on Monday 5/3-2018 Where we also will upload to Moodel._

- Write an interface with 10 simple methods. For instance a method which accepts a list of elements and sorts the list. Or maybe it returns a subset.
The difficulty level can be inferred from the example on Moodle.
- If your methods  uses your own datatypes or other resources, you will have to provide these.
- Write unit tests, which tests all methods. Remember to test edge values and equivalent classes.
- Solve the assignment you have written – That is  write an implementation of your interface which passes all your tests.
- When you have written 10 methods, translate 2 of these to Java and test them using JUnit 5.

### Solutions:

##### Assignment Description: 
There is a data set for wine servings. An interface with some methods was provided to manage the data given for making inventories and determining how much wine has been served too much/less and by whom(waiter), as well as sorting it by amount of servings. Find the Servings data [here](https://github.com/cph-cs241/TEST_Assignment4_UnitTesting/blob/master/1SemesterEksamen/Servings.csv) .


- [x] Interface with 10 simple methods: [_ServingHandler.java_](https://github.com/cph-cs241/TEST_Assignment4_UnitTesting/blob/master/1SemesterEksamen/src/first_semester_eksamen/ServingHandler.java)
- [x] Object used: [_Serving.java(interface)_](https://github.com/cph-cs241/TEST_Assignment4_UnitTesting/blob/master/1SemesterEksamen/src/first_semester_eksamen/Serving.java) and
[_ServingImpl.java(implementation)_](https://github.com/cph-cs241/TEST_Assignment4_UnitTesting/blob/master/1SemesterEksamen/src/impl/ServingImpl.java)
- [x] JUnit 4 Tests(10 methods): [_TestServingHandler.java_](https://github.com/cph-cs241/TEST_Assignment4_UnitTesting/blob/master/1SemesterEksamen/test/first_semester_eksamen/ServingHandlerTest.java)
- [x] Implementation: [_ServingHandlerImpl.java_](https://github.com/cph-cs241/TEST_Assignment4_UnitTesting/blob/master/1SemesterEksamen/src/impl/ServingHandlerImpl.java)
- [ ] JUnit 5 (2 methods)
