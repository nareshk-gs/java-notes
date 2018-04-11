An unexpected event that terminates the program execution abnormally is called an exception.

There are 5 key words in exception handling:
	1. try - to maintain risky code
	2. catch - to maintain exception handling code
	3. finally - to maintain clean upp code
	4. throw - to handover user defined exception objects to JVM
	5. throws - to delegate responsibility of exception handling

Runtime Stack Mechanism

	When ever JVM calls main thread, a run time stack is created
	Every method called from main method adds a record to run time stack, also known as stack frame and activation record
	As the execution completes for a method, corresponding record is deleted from stack
	Once the execution of main method completes, JVM checks for empty stack and destroys the stack

Default Exception Handling
	When an exception raised in a method, JVM checks for exception handling down up from called method to main method
	If the exception is not handled, JVM terminates such methods abnormally and deletes the record from stack
	If the exception is not handles, JVM assigns the exception to Default Exception Handler
	Default Exception Handler, is part of JVM, prints exception information in the console and terminates program abnormally
	It is the responsibiility of the method, where exception is raised, to create exception object

Exception has 3 components
	1. Name of the exception
	2. Description of the exception
	3. Location of the exception // known as stack trace of the exception

There are three methods in Throwable class to print the exception
	1. printStackTrace(); // prints all the three components
	2. toString(); //Name and Description of the exception
	3. getMessage(); //Description of the exception

---------------------
EXCEPTION HIERARCHY:-
---------------------

Throwable is the root class for exception

Throwable
	Exception
		Runtime Exception
			ArithmeticException
			NullPointerException
			ClassCastException
			IndexOutOfBoundsException
				ArrayIndexOutOfBoundsException
				StringIndexOutOfBoundsException
			IllegalArgumentException
				NumberFormatException
		IOException
			EndOfFileException
			FileNotFoundException
			InterruptedIOException
		ServletException
		RemoteException
		SQLException
		InterruptedException
	Error
		VirtualMachineError
			StackOverFlowError
			OutOfMemoryError
		AssertionError
		ExceptionInInitializerError
		
		

Most of the times, exceptions are occurred by programs and are recoverable
Most of the times, errors are caused by lack of system resources and are non recoverable


--------------------------------
CHECKED & UNCHECKED EXCEPTIONS:-
--------------------------------

Exceptions that are checked by compiler for smooth execution at runtime are called checked exceptions
Checked Exceptions should be handled in code using try catch block or using throws keyword
All exceptions except unchecked exceptions are checked exceptions

Exceptions that are not checked by compiler till runtime are Unchecked Exceptions
RuntimeException and its child classes, Error and its child classes are unchecked exceptions

--------------------------------------
FULLY & PARTIALLY CHECKED EXCEPTIONS:-
--------------------------------------

When an exception class and all its child classes also checked, its called Fully checked exception
Ex:- IOException
When an exception class ia checked and only if SOME of its child classes are unchecked, its called partially checked exception
Ex:- Throwable
The only partially checked exceptions in JAVA are Throwable and Exception

Try block can be followed by Catch or Finally block
catch or finally can not exist without try block

Finalize is a method executed by Garbage Collector, before disposing an object, to close its properties

THROW:
-------
throw keyword is used to generate exception object. This can be an object of throwable or its child classes.
Using throw keyword is replication of default exception handling manually
A normal class objects can be returned using throw, as long as the class extends Throwable or its child classes
When application is expected to return user defined exception, throw keyword is used
A class has to be created for every exception and a new object should be created everytime when the exception is raised

-------
THROWS:
-------
When compiler ientifies the possibilities of exceptions in the code, a compile time exception is generated.
To address this, such exceptions can be suppressed using throws keyword.
throws keyword used with methods and constructors to delegate exception handling to calling area of the code. 
When an exception arises in a called method, that has exception definition with throws keyword, JVM will consult back to calling method for exeption handling.
throws only facilitates to compile without any exceptions, but doesn't' guarantee the smooth execution.
For smooth execution, exceptions must be handled in the code.
try catch blocks will be the best option for exception handling over using throws keyword

if code in try_ block doesn't' expect any fully checked exception, such exception cannot be handled in catch block

Based on source of the exception, exceptions can be classified into two categories:-
	1. Predefined exceptions (JVM exceptions)
	2. User Defined exceptions (programmatic exceptions)
		a. Programmer defined
		b. API Developer defined

Exceptions raised by JVM automatically, whenever a perticular event occurs are called JVM exceptions
Ex:- ArithmeticException, NullPointerException etc.
Exceptions raised by explicitly either by programmer or by API developer to indicate that something goes wrong are caled User Defined exception
Ex:- TooYoungException, TooOldException, IllegalArgumentException etc.


-------------------------------
TEN POPULAR EXCEPTIONS IN JAVA:
-------------------------------

1. ArrayIndexOutOfBoundsException // raised automatically by JVM
2. NullPointerException // raised automatically by JVM
3. ClassCastException //raised automatically by JVM
4. StackOverflowError //raised automatically by JVM
5. NoClassDefFoundError //raised automatically by JVM
6. ExceptionInInitializerError // raised automatically by JVM
7. IllegalArgumentException // raised explicictly either by Programmer or by API Developer
8. NumberFormatException // raised explicictly either by Programmer or by API Developer
9. IllegalStateException // raised explicictly either by Programmer or by API Developer
10. AssertionError // raised explicictly either by Programmer or by API Developer

There are two new concepts introduced in exception handling from Java7
	1. try with resources
	2. Multi catch block


-------------------
TRY WITH RESOURCES:
-------------------

Any resouces initialized in try block can be passed while creating try block
When used this, all such resources will be automatically closed once control reaches end of try block, normally or abnormally
This mostly eradicates the necessity of finally block

Ex:-

try(BufferedReader br = new BufferedReader(new FileReader("input.txt")))
{
	/*
		Use br as required. br will be closed automatically once control reaches end of try block
	*/
}
catch(IOException e)
{
	//exception handling code
}

In conventional code, we were supposed to maintian finally block to close 'br'.
We can declare multiple resources. All the resources should be seperated by ; operator
Syntax:-
try(r1;r2;r3)
{
	//functional code
}
catch (Exception e)
{
	//exception handling
}

All the resources declared with try block should be	AutoCloseable resources
All resources that implement java.lang.AutoCloseable interface are auto closeable resources 

-------------------
MULTI-CATCH BLOCKS:
-------------------

