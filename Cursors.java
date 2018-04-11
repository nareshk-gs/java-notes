The three cursors in JAVA:-
---------------------------

There are three cursors in JAVA to read elements from collections one by one.
	1. Enumeration
	2. Iterator
	3. ListIterator

-------------
Enumeration:-
-------------

Enumeration is used to read objects one by one from legacy collection object.
Creation of enumberation is achieved by elements method of Vector class 
	Eg:	Vector v = new Vector();
		Enumeration e = v.elements();

Methods in Enumeration:-
	1. boolean hasMoreElements() // returns TRUE if more elements exists
	2. Object nextElement() // retrns the next element

Limitations of Enumeration:
	1. Applicable only for legacy classes
	2. Supports reading objects from collection, but not removing.
These limitations are addressed by using Iterator

----------
Iterator:-
----------

Its a universal cursor, applicable to all collection classes.
It can be used to perform both read and remove operations on a collection.

Iterator object can be created by using iterator() of Collection interface.
	Eg:	Collection c= new Collection;
		Iterator itr = c.iterator();

Methods in Iterator:-
	1. boolean hasNext() // returns TRUE if more elements exists
	2. Object next() // returns the next element
	3. void remove() // removes element from collection

Limitatios of Iterator:
	1. Allows only to move in forward direction (next element only, not previous element)
		Unidirectional cursor, not bidirectional cursor
	2. Supports only read and remove operations, but not replace and add operations
These limitations are addressed by using ListIterator

--------------
ListIterator:-
--------------
It is a child interface of Iterator interface. Hence, all methods present in Iterator are available here as well.
Its a bidirectional cursor, applicable to only LIST objects.
It can be used to perform all add, read, remove and replace operations on a collection.

ListIterator object can be created by using listIterator() of List interface.
	Eg: List l = new List();
		ListIterator ltr = l.listIterator();

Methods in ListIterator:-
	1. boolean hasNext() // inherited from parent Iterator
	2. Object next() // inherited from parent Iterator
	3. int nextIndex() // returns index of next element
	4. boolean hasPrevious() // returns TRUE if previous element exists
	5. Object previous() // retruns the previous element
	6. int previousIndex() // returns index of previous element
	7. void remove() // inherited from parent Iterator
	8. void add(Object obj) // adds element to the list
	9. void set(Object obj) // replaces current element with new element
