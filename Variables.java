Variables:-

Variables are of 3 types.
	1. Local
		~ Declared inside a method/constructor/block
		~ Scope limits within the declared method/constructor/block
		~ Memory allocated when execution of method/constructor/block begins
		~ Memory released when execution of method/constructor/block completes
	2. Instance
		~ Declared inside the class, but outside of any method/constructor/block
		~ Scope limits within the class, across all method/constructor/block(s), with reference to class object
		~ Memory allocated when class object is created
		~ Memory released when class object is destroyed
	3. Static
		~ Declared inside the class, but outside of any method with Static prefix
		~ Scope limits with the class
		~ Memory allocated when .class file loaded into JVM
		~ Memory released when JVM completes execution

Instance Vs Static Variables:-
-----------------------------------------------------
Instance variables can be used as is in instance methods and with class objects in static methods
Static variable can be used as is, with class reference and with object reference
----------------
A new copy of instance variable is created with each object. Each copy can contain different values
A new reference of static variable is created with each object. Any update will reflect across all references
----------------


A variable may fit into below classification.
	1. Primitive
		int a = 10;
		float f = 10.0;
	2. class 
		Test t;
		Emp e;
	3. array
		int[] a;
		String[] str;
	4. enum


final variables cannot be modified
For local variables, no modifier is applicable apart from final
Final class methods are not final