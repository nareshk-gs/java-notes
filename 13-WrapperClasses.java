WrapperClasses allow us to represent 8 premitive data types as objects.
All wrapper classes are available in java.lang package
All wrapper classes are immutable classes

Datatype	|	WrapperClass	|	Constructor
-------------------------------------------------
byte		|	Byte			|	byte, string
short		|	Short			|	short, string
int			|	Integer			|	int, string
long		|	Long			|	long, string
float		|	Float			|	float, double, string
double		|	Double			|	double, string
char		|	Character		|	char
boolean		|	Boolean			|	boolean, string

There are 4 important methods in wrapper classes
	1. valueOf()
		This method will convert string and primitive values to wrapper objects
	2. toString()
		This method will convert wrapper objects and prmitive values to string
	3. parseXXX()
		This method will convert string to primitive value
	4. xxxValue()
		This method will convert wrapper object to primitive

toString() method in wrapper classes is overridden from object class, to return content of the object

