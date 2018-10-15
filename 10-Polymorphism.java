Ability to appear in more than one form is called Polymorphism.

There are 2 types of polymorphism:
	1. Compile time ploymorphism (also known as static binding/early binding)
		Achieved by Overloading concept 

	2. Run time polymorphisn (also known as dynamic binding/delayed binding)
		Achieved by Overriding concept

Overloading is used to use same method/constructor name within same class
There are 3 types of Overloading:
	1. Method Overloading
		Methods with same name, different signature
	2. Constructor Overloading
		Different number of parameters or different data types of parameters
	3. Operator Overloading (not supported in JAVA)

Overriding is used to use same method name from parent class, with different implementation in child class
Below rules should be followed while overriding.
	1. Signature for both overridden and overriding method must be same
	2. Return type for overriding and overridden methods must be same, at primitive level
	3. Return type for overriding and overridden methods can be different at class level.
		This concept is called covariant return type. 
		In this case, parent class method must return parent and child class method must return child.
		Ex below.
			/*
				Class Animal
				{
					Animal m1()
					{
						//Implementation
					}
				}

				Class Dog extends Animal
				{
					Dog m1()
					{
						//Implementation
					}
				}
			*/

	4. A final method from parent class cannot be overridden
	5. An object of child class, with parent class referrence variable, can access only overriding methods.
		Inorder to access all child class methods, typecast parent referrence variable to child class 
		Ex:-
		/*
		class Parent
		{
			void m1()
				{ //Implementation
				}
		}
		class Child extends Parent
		{
			void m1()
				{ //Implementation
				}
			void m2()
				{ //Implementation
				}
			
			public static void main(String[] args)
			{
				Parent p = new Child();
				p.m1(); //m1() from child class is executed
				p.m2(); //Invalid. m2() is not available with object p

				Child c = (Child)p;
				c.m1(); //m1() from child class is executed
				c.m2(); //m2() from child class is executed

			}
		}
		*/
	6. static methods will be executed according to the object's' referrence class. 
		Parent p = new Parent(); //p will execute overridden method
		Parent p = new Child(); //p will execute overridden method
		Child C = new Child(); //c will execute overriding method
		This is also called Method hiding concept (in other words, static method can NOT be overridden)
	7. private methods can NOT be overridden
	8. Overriding method can maintain or increase permission of the overridden method
		Overriding method can NOT decrease permission of the overridden method


