# java-collections
Java collection framework tutorials.


# set
 
 It is better for storing unique elements.
 It is used for searching elements.
 The element is not ordered.
 Set internally use hashcode method.
 When you override hashcode method, you need to override equals methods too.
 

 ```
 Why set takes constant time for search, add and delete items.

 If two object has same hashcode, then we can not they are same. --> Hash collision
 
 --. After this, we should call equals method also. The address and content must be same.
 ***Some time two different object can have same hashcode ***
 ```