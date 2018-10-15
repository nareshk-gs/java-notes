There are 4 classes in strings.
	1. String
	2. StringBuffer
	3. StringBuilder
	4. StringTokenizer

String:-
	Final class present in java.lang
	String can be created with new operator(as an object) and without as well(as a variable)
		Ex:- String s1 = "abc"; // stored in SCP (String Constant Pool) Memory
			 String s2 = new String("abc"); // stored in heap memory
	String is immutable in nature (modifications are not allowed)
		Ex:- String s1 = "abc";
			 s1.concat("def");
			 sop(s1); // abc
	Object class toString() method is overridden in String class to return content of the object//variable
	Object class equals() method is overridden in String class to compare content of the object// variable
	String variable can be converted StringBuffer object
		Ex:- String s1 = "abc";
			 StringBuffer sb = StringBuffer(s1);
	

StringBuffer:-
	Final class present in java.lang
	Created as an object with new operator(as an bject)
		Ex:- StringBuffer sb = new StringBuffer("abc"); // stored in heap memory
	String is mutable in nature (modifications are allowed)
		Ex:- StringBuffer sb = new StringBuffer("abc");
			 sb.append("def");
			 sop(sb); // abcdef
	Object class toString() method is NOT overridden in StringBuffer class
	Object class equals() method is NOT overridden in StringBuffer class
	StringBuffer object can be converted to String variable
		Ex:- StringBuffer sb = new StringBuffer("abc");
			 String s = sb.toString();


StringBuilder:-








StringTokenizer:-





