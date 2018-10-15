Interface is an extension of abstract class 
Interface is declared by using keyword interface 
Interface contain only abstract methods
All methods declared in interface are public and abstract by default
a .class file will be generated after compiling the interface 

Syntax:-
/*
interface it1	//abstract
{
	void m1();	// public abstract
	void m2();
	void m3();
}

class Test implements it1
{
	pubic void m1()
	{		//implementation
	}
}
*/

All the implementation methods declared in interface must be public
interface will be able to hold objects of implementation class 
interface can be inherited from another interface using extends keyword
One interface can extend multiple interfaces at a time, comma seperated
One class can implement multiple interfaces at a time, comma seperated

Class A extends B					--->	valid
Class A extends B, c				--->	Invalid
Class A implements It1				--->	valid
Class A implements It1, It2			--->	valid
Class A extends A					--->	Invalid

interface It1 extends It2			--->	valid
interface It1 extends It3, it3		--->	valid
interface It1 extends A				--->	Invalid
interface It1 extends It1			--->	Invalid

Class A extends B implements It1, It2-->	valid
Class A implements It1, It2 extends B-->	Invalid

NESTED INTERFACE:
----------------
An interface can be implemented within an interface, called as nested interface 
Ex:-
/*
interface It1
{
	interface It2
	{
		void m1();
	}
}

Class A implements It1.It2
*/

An interface can be declared within a class as well, also called as nested interface
Ex:-
/*
Class A
{
	interface It2
	{
		void m1();
	}
}

Class B implements A.It2
*/

Variables can be declared in interfaces, which are by default treated as public static final.
When an interface is implemented by a class, all the declared methods in the interface must be overridden in the class 
To overcome this problem, adaptor classses are created.
Adaptor class contains empty implementation of all methods declared in interface
Ex:-
/*
Consider an interface that has 10 method declaration
If Class A implements the above interface, it has to implement all the 10 methods, irrespective of the need
to overcome, create Class B (adaptor class) and override all 10 methods with empty implementation
Now, Class A can extend Class B and only required methods can be overridden
*/

MARKER INTERFACE:-
------------------
An interface without methods, empty interface, and class implementing such interface acquires some king of extra capabilities is called marker interface
Ex:- java.io.Serializable, java.util.RandomAccess, java.lang.Cloneable
