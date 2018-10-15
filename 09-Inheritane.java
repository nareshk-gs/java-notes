Inheritance reduces length of the code and redundancy
Code can be reused using the concept of inheritance
A parent class's' features can be extended to child class by using extends keyword 

Class that provides properties is called parent/super/base class 
Class that acquires properties is called child/sub/derived class 

When a Class is not extending any Class, by default it extends Object Class
Object class is the root class of all classes in JAVA
Every class in JAVA is a child of Object class, either directly or indirectly
Object is the only class in JAVA that don't' have a parent class

There are 5 types of inheritance:
	1. Single inheritance
		One parent, one child
		Class B extends A

	2. Multilevel inheritance
		Child inherits child of a parent class 
		Class B extends A
		Class C extends B

	3. Hierarchical inheritance
		One parent, multiple child
		Class B extends A
		Class C extends A
		Class D extends A

	4. Multiple inheritance ("not supported by JAVA")
		/*
		multiple parents, one child
		Class B extends A, C
		*/

	5. Hybrid inheritance ("not supported by JAVA")
		/*
		Combination of hierarchichal and multiple inheritances
		Class B extends A,C
		Class D extends A,E
		*/

Any class declared with final modifier, it can not be inherited.
In other words, final class can not extend any other class.
Use super keyword to access parent class variables in child class.
Parent class referrence variable can hold object of child class 
Child class referrence varable can NOT hold object of parent class 