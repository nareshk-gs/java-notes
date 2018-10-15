Ways to create Objects
	1. new keyword
	2. instanceFactory method
	3. staticFactory method
	4. patternFactory method
	5. newInstance method
	6. clone method
	7. deserialization process

Rules to declare constructor:
	1. Constructor name must to be same as class name
	2. Constructor is able to take parameters
	3. Constructor does not allow return type

Types of Constructors:-
	1. Default constructor, provided by compiler (0 args, empty implementation)
	2. Userr defined constructor (parameterised constructor)

Advantages of Constructor:
	1. Business logics inside the constructors will be executed at the time of object creation
	2. Used to initialize instance variables during object creation

To call one contructor from another, use this keyword with parameters for invoking contructor.
call should be the first statement in the constructor, if invoking another constructor.
A constructor can invoke only one constructor.

Formats of Obhect Creation:-
	1. Named approach
		Test t = new Test();
	2. Nameless approach
		new Test();
