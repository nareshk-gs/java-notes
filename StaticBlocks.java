Syntax:
Static {
	// Logics here
}

Static blocks are executed at the time of class loading in JVM
A class with static blocks and without main method will be compiled, but not exxecuted.
Use Class.forName("<Class file name>") to load a class, without main method, into another main method
Static blocks are used to initialize static variables
