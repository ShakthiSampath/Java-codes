# **_Inheritance_**

#### _Task_:

You are given two classes, _Person_ and _Student_, where _Person_ is the _base_
class and _Student_ is the _derived_ class.  Observe that _Student_ _inherits_
all the properties of _Person_.

Complete the Student class by writing the following:
- A Student class constructor, which has 4 parameters:
    1. A string, _firstName_ .
    2. A string, _lastName_ .
    3. An integer, _id_ .
    4. An integer array (or vector) of test scores, _scores_ .


- A _char calculate()_ method that calculates a Student object's average and
 returns the grade character representative of their _calculated average_:

 _Grading Scale_:


 _Letter_ | _Average_
 :---: | :---:
 O | 90 <= a <= 100
 E | 80 <= a <= 90
 A | 70 <= a <= 80
 P | 55 <= a <= 70
 D | 40 <= a <= 55
 T |  a <= 40

#### _Input Format_:

The first line contains _firstName_ , _lastName_ and _id_ respectively.
The second line contains the number of test scores. The third line of
space-separated integers describes _scores_ .
