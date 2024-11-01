 Refer : <slides>/PPTDay1

WHY Java ?

1. Platform or architecture independent
(Write once run anywhere!)
2. Simple & robust
3. Secure
4. Automatic memory management.
5. Inherent Multi threaded support
6. Object Oriented support -- Encapsulation,Inheritance & polymorphism , abstraction
7. Excellent I/O support
8. Inherent networking support for TCP/IP , UDP/IP programming & for URLs
9. Supports Functional programming
....

Development & Execution of java application.



JDK , JRE & JVM (refer to diagram)


Objective :  Create a java appln to display welcome message on the console.


Naming conventions in Java 
1. class , interfaces , enum names-  1st letter of 1st word must start with upper case & then follow camel case notation.
eg : HelloWorld
2. data members/methods(functions) --  1st must start with lower case & then follow camel case notation
eg : performanceIndex
calculateSalary

3. constants -- all uppercase.
eg : PI

4. Rules on Identifiers

1. Identifiers must start with a letter, a currency character ($), or a connecting character such as the underscore ( _ ),  cannot start with a number!
2. Can't use a Java keyword as an identifier. 
3. Are Case sensitive 


Legal Access specifiers for data members n methods
private : visible within the same class
default(package private) --no access modifier ---visible within same package
protected : accessible withing the same package & accessible to sub classess via inheritance
public : accessible from anywhere.



Legal class level access specifiers - 
1. default(scope=current package only)
2. public (scope=accessible form any where)


How to compile ?
Change dir to <day1>/src
javac -d ..\bin HelloWorld.java


Objective --- Write Java application , to say hello to user. User name will be supplied as cmd line argument.
(eg : java SayHello Madhra
O/P Hello , Madhura !)


Objective : accept 2 nums as cmd line args , add them & display the result.

Java API -- java docs
java.lang  => pkg name  --default
Integer -- class 
public static int parseInt(String s) throws NumberFormatException
(In case of un parseable integers.)
eg : int num1=Integer.parseInt(args[0]);

Reference for Java documentation 
Java Docs.
Refer to java docs for any explanation of classes/methods..

Basic rules 
1. Java compiler doesn't allow accessing of un initialized data members.
2. Files with no public classes(default scoped) can have a name that does not match with any of the classes in the file .
3. A file can have more than one non public class.
4. There can be only one public class per source code file.
5. If there is a public class in a file, the name of the file must match the name
of the public class. 
For example, a class declared as public class Example {....}
must be in a source code file named Example.java.
6. Javac doesn't allow accessing of un-inited vars.
eg : int n;
sop(n);
Emp e;
sop(e);
 String s="abc";
s++; //javac error -- pointer aritmetic not allowed in java

6.  Package related rules later....
If the class is part of a package, the package statement must be the first line
in the source code file, before any import statements that may be present.
7. If there are import statements, they must go between the package statement
(if there is one) and the class declaration. If there isn't a package statement,
then the import statement(s) must be the first line(s) in the source code file.
If there are no package or import statements, the class declaration must be
the first line in the source code file.
8. import and package statements apply to all classes within a source code file.
In other words, there's no way to declare multiple classes in a file and have
them in different packages, or use different imports.


Java Data Types 
refer to diagram from the slide

1. primitive data types 
boolean,char,byte,short,long,float,double

What is unicode ?
refer to readme

2. reference types
class type , array type , interface type

Pointers vs java references
 Pointer arithmatic is not allowed in java.
reference --- holds internal representation of address (equivalent to object pointer in c++)

Conversions regarding primitive types

Automatic conversions(widening ) ---Automatic promotions
byte--->short--->int---> long--->float--->double
char ---> int

long --->float ---is considered automatic type of conversion(since float data type can hold larger range of values than long data type)


Rules ---
src & destination - must be compatible, typically dest data type must be able to store larger magnitude of values than  that of src data type.

1. Any arithmetic operation involving byte,short  --- automatically promoted to --int

2. int & long ---> long
3. long & float ---> float
4. byte,short......& float & double----> double

Narrowing conversion --- forced conversion(type-casting)
eg --- 
double ---> int 
float --> long
double ---> float 


Revise operators & control structures from : PPTDay1


Steps for attaching scanner , to accept inputs from User.(UI)
 
What is Scanner ?
A class (java.util.Scanner)  that represents text based parser(It has inherent small ~ 1K buffer)
It can parse text data from any source --Console input,Text file , socket, string

Steps

1. import java.util.*; or import java.util.Scanner;
2. create instance of Scanner class
Scanner class constructor
public  Scanner (InputStream in)
System.in --- standard input (stdin)
usage -- Scanner sc=new Scanner(System.in);

3. To check data type 
public boolean hasNextInt(),
public boolean hasNextByte(),
public boolean hasNextLong()
...
4. To actually read n parse data
public int nextInt() throws InputMismatchException
public double nextDouble() throws InputMismatchException
public String next() throws InputMismatchException

public boolean nextBoolean() throws InputMismatchException
public String nextLine() throws InputMismatchException

5. Before terminating application close scanner.
public void close();

Solve : Write java application to accept int(emp id) , double(salary) , emp's first name , is permanent :  boolean from Scanner & display the same using printf



