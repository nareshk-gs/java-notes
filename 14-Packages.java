Package is a physical folder structure
A source file can contain only one package declaration
package declaration should be the first line of the source file


Coding convention for packages:-
	1. package name must reflect org name and should be reverse of the domain name (com.walmart)
	2. package name must reflect the application name (com.walmart.bookkeeping)
	3. package name must reflect the module name (com.walmart.bookkeeping.businessdatecontroller)

To compile the class with package declaration, define the path

Syntax:
	javac -d . Test.java
<javac> to instruct compiler
<-d> to create folder structure
<.> to plce the folders in current working directory
<Test.java> is file name

There are two ways to import a package, either whole package or specific classes
Only public classes can be imported into another package
