9 key interfaces of collection framework:-

	1. Collection
	2. List
	3. Set
	4. SortedSet
	5. NavigableSet
	6. Queue
	7. Map
	8. SortedMap
	9. NavigableMap

Hierarchy of Collections Framework:
------------------------------------

Collection (I)
	List (I) // Duplicates are allowed and insertion order is preserved
		ArrayList (C)
		LinkedList (C)
		Vector (C)
			Stack (C)
	Set (I) // Duplicates are NOT allowed and insertion order is NOT preserved
		HashSet (C)
			LinkedHashSet (C)
		SortedSet (I)
			NavigableSet (I)
				TreeSet (C)
	Queue (I) // Waiting prior to processing, default processing is FIFO
		PriorityQueue (C) // Customized processing, overriding FIFO
		BlockingQueue (C)
			PriorityBlockingQueue (C)
			LinkedBlockingQueue (C)
/*
*	All the above interfaces, part of collection interface are used to represent group of individual 
*	objects as single entity.
*
*	To represent a group of objects and key value pair, we should use Map. Duplicate keys are NOT allowed.
*/

Map (I)
	HashMap (C)
		LinkedHashMap (C)
	WeakHashMap (C)
	IdentityHashMap (C)
	Hashtable (C) // Extends 'Abstract Class' Dictionary (C)
		Properties (C)
	SortedMap (I) // To represent group of key value pairs, according to sorting order of keys
		NavigableMap (I)
			TreeMap (C)

Sorting:-
---------
Default Sorting :	Comparable (I)
Custom Sorting :	Comparator (I)

Cursors (Used to read objects one by one from any Collections):-
----------------------------------------------------------------

Enumeration (I) //Supports only reading data
Iterator (I) //Supports only reading and removing
ListIterator (I) //Supports read, remove, replace and add

Utility Classes:-
-----------------

Collections
Arrays

******************************************************
By default, all collection classes implement Serializable and Cloneable interfaces
ArrayList and Vector classes implement RandomAccess interface (allows to access any element in the collection at same speed)
Thus, ArrayList and Vector are best bets when retrival is the frequent operation on the collection
Heterogeneous objects are NOT allowed in TreeSet and TreeMap
******************************************************
-----------
ArrayList:-
-----------
Features:
	1. Resizable Array or grwoable Array
	2. Duplicates are allowed
	3. Inserrtion order is preserved
	4. Heterogeneos objects are supported
	5. NULL insertion is possible
	6. Best choice, when frequent operation is retrieval
	7. Worst choice, when frequent operation is insertion or deletion

Costructors:-
	ArrayList l1 = new ArrayList();
	ArrayList l2 = new ArrayList(int initialCapacity);
	ArrayList l3 = new ArrayList(Collection c);


Differances:

	ArrayList				|		Vector
----------------------------|----------------------------------
1.	Non-Synchronized		|	Synchronized
2.	Not Thread safe			|	Thread safe
3.	Relatively high			|	Relatively low performance
	performance				|
4.	Introduced in v1.2		|	Introduced in v1.0 (legacy)

Using Collections.synchronizedlist() method, Non-Synchronized objects can be converted to synchronized list objects
Eg:

ArrayList l = new ArrayList();
List l1 = Collections.synchronizedList(l);
/*
Similarly, synchronizedSet() and synchronizedMap() methods can be used for Set and Map objects
*/
Here, l is non-synchronized and l1 is synchronized


------------
LinkedList:-
------------

Features:
	1. Undelying data structure is Double LinkedList
	2. Insertion order is preserved
	3. Duplicate objects are allowed
	4. Heterogeneous objects are allowed
	5. NULL insertion is possible
	6. Best choice, when frequent operation is insertion or deletion
	7. Worst choice, when frequent operation is retrieval

Costructors:-
	LinkedList l1 = new LinkedList();
	LinkedList l3 = new LinkedList(Collection c);

Methods specific to LinkedList:
	1. void addFirst(Object obj)
	2. void addLast(Obect obj)
	3. Object getFirst()
	4. Object getLast()
	5. Object removeFirst()
	6. Object removeLast()


Vector:-
-----------

Features:
	1. Underlying data structure is Resizable Array or Growable Array
	2. Insertion order preserved
	3. Duplicates are allowed
	4. Heterogeneous objects allowed
	5. NULL insertion is supported

Costructors:-
	Vector v1 = new Vector();
	Vector v2 = new Vector(int initialCapacity);
	Vector v3 = new Vector(int initialCapacity, int incrementalCapacity);
	Vector v4 = new Vector(Collection c);

Methods specific to Vector:
	1. addElement(Object obj)
	2. removeElement(Object obj)
	3. removeElementAt(int index)
	4. removeAllElements()


Stack:-
------
It is the child class of Vector. It is specially designed class for last in first out (LIFO) order.

Constructor:-
	Stack s = new Stack();

Methods specific to Stack:-
	1. void push(Object obj) // to insert object at the top of the stack
	2. Object pop() // to remove and return top of the stack
	3. Object peek() // returns top of the stack, without removal
	4. boolean empty() // returns TRUE if the Stack is empty
	5. int search(Object obj) //returns OFFSET of the object if exists, otherwise returns -1


-----
Set:-
-----

It is child interface of Collection.

Features:
	1. Duplicates are not allowed
	2. Insertion order is NOT preserved

---------
HashSet:-
---------
Features:
	1. Underlying data structure is HashTable
	2. Duplicates are NOT allowed
	3. Insertion order is NOT preserved
	4. All objects will be inserted based on hash code
	5. NULL insertion is possible (only once)
	6. Heterogeneous objects are allowed
	7. Best choice, when the frequent operation is search operation

Constructors:
	1. HashSet h1 = new HashSet();
	2. HashSet h2 = new HashSet(int initialCapacity);
	3. HashSet h3 = new HashSet(int initialCapacity, float fillRatio);
	4. HashSet h4 = new HashSet(Collection c);

	/*
		Return type of add() method in collection class is boolean. If duplicates are sent of addition to Set, there will not be wither compile time or
		run time errors as the method returns 'false' value
	*/

---------------
LinkedHashSet:-
---------------
Its a child class of HashSet. Behaves same as HashSet, including constructors and methods.

Features:
	1. Underlying data structure is HashTable and LinkedList
	2. Duplicates are NOT allowed
	3. Insertion order is preserved
	4. All objects will be inserted based on hash code
	5. NULL insertion is possible (only once)
	6. Heterogeneous objects are allowed

Constructors:
	1. LinkedHashSet h1 = new LinkedHashSet();
	2. LinkedHashSet h2 = new LinkedHashSet(int initialCapacity);
	3. LinkedHashSet h3 = new LinkedHashSet(int initialCapacity, float fillRatio);
	4. LinkedHashSet h4 = new LinkedHashSet(Collection c);

-----------
SortedSet:-
-----------
Its the child interface of Set, used to represent a group of individual objects according to some sorting order without duplicates.

Features:
	1. Underlying data structure is HashTable
	2. Duplicates are NOT allowed
	3. Insertion order is NOT preserved
	4. All objects will be inserted based on defined sorting order
	5. NULL insertion is possible (only once)
	6. Heterogeneous objects are allowed


Methods specific to SortedSet:
	1. Object first()	// returns first element from SortedSet
	2. Object last()	// returns last element from SortedSet
	3. SortedSet headSet(Object obj)	// returns all elements less than obj (<obj)
	4. SortedSet tailSet(Object obj)	// returns all elements greater than or equal to obj (>=obj)
	5. SortedSet subSet(Object obj1, Object obj2)	// returns all elements	greater than or equal to obj1 and less than obj2 (>=obj1 AND <obj2)
	6. Comparator comparator()	//retrns Comparator object that describes the underlying sorting technique (returns NULL in case of default sorting)

Default sorting order:-
	1. Numbers ==> Ascending
	2. Strings ==> Alphabetical

---------
TreeSet:-
---------
Feature:
	1. Underlying data structure is Balanced Tree
	2. Duplicates are NOT allowed
	3. Insertion order is NOT preserved
	4. Heterogeneous objects are NOT allowed
	5. NULL insertions is NOT possible (until v1.6, NULL is allowed as first element to empty TreeSet)
	6. All objects will be inserted based on defined sorting order

Constructors:-
	1. TreeSet t1 = new TreeSet();
	2. TreeSet t2 = new TreeSet(Comparator c); // Comparator object is used for customized sorting order
	3. TreeSet t3 = new TreeSet(Collection c);
	4. TreeSet t4 = new TreeSet(SortedSet s);


---------------
Comparable(I):-
---------------
Its part of java.lang package and contains only one method. It accomodates the default natural sorting order.

Method:
	1. int compareTo(Object obj)
		Eg: obj1.compareTo(obj2);
			/*
			Returns -ve value, if obj1 comes before obj2
			Returns +ve value, if obj1 comes after obj2
			Returns -0-, if obj1 and obj2 are equal
			*/

---------------
Comparator(I):-
---------------
Its part of java.util package and contains two methods. It accomodates customized sorting order.

Methods:
	1. int compare(Object obj1, Object obj2)
		/*
			Returns -ve value, if obj1 comes before obj2
			Returns +ve value, if obj1 comes after obj2
			Returns -0-, if obj1 and obj2 are equal
		*/
	2. boolean equals(Object obj) // implemented from Object class


-----
Map:-
-----

Map
	HashMap
		LinkedHashMap
	IdentityHashMap
	WeakHashMap
	SortedMap(I)
		NavigableMap(I)
			TreeMap
	HashTable
	Properties

Map is NOT a child interface of collection.
Map is used to represent a group of objects as key-value pairs.
Keys can NOT be duplicates, values can be duplicate.
Each key-value pair is referred to as Entry.

Methods in Map(I):-
-------------------
	1. Object put(Object key, Object value);
		/* if key is duplicated, value is updated in existing key and old value is returned
		   if key is NOT duplicated, NULL will be returned
		   Eg: m.put(101,"durga"); -- returns null
			   m.put(102,"shiva"); -- returns null
			   m.put(101,"ravi");  -- returns durga
			   */
	2. void putAll(Map m);
	3. Object get(Object key); // returns value associated with specified key
	4. Object remove(Object key);
	5. boolean containsKey(Object key);
	6. boolean containsValue(Object value);
	7. boolean isEmpty();
	8. int size();
	9. void clear();

Collection Views of Map:-
-------------------------
	1. Set keySet(); // returns all keys in a set
	2. Collection values(); // returns all values
	3. Set entrySet(); // returns entries

----------
Entry(I):-
----------
Entry(I) is an inner interface of MAP(I). Map is group of entry objects.

Methods in Entry(I):-
---------------------
