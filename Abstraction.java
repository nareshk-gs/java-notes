ABSTRACTION:-
-------------

Process of highlighting set of services and hiding the implementations in child classes is called Abstraction
This is achieved by using abstract classes and interfaces

ABSTRACT METHOD:
----------------
Abstract method contains only declaration, not implementation.
Syntax:
	abstract void m1();

ABSTRACT CLASS:
---------------
Abstract class (also known as helper class) may or maynot contains abstract methods
Objects can NOT be created for abstract classes
Syntax:
	abstract class Test
	{
		void m1() {	}
		void m2() {	}
		abstract void m3();
	}

Abstract class can contain main method
Abstract class is capable of having constructor
