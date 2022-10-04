# Java-Collections-Framework
A unified architecture for storing and manipulating a group of objects


![Collections-in-Java1](https://user-images.githubusercontent.com/95408545/193871128-054fcd06-75e8-4cd4-b759-10ba2f1a49f3.png)

## List Interface
List interface is the child interface of Collection interface. It inhibits a list type data structure in which we can store the ordered collection of objects. It can have duplicate values.

To instantiate the List interface, we must use :
```
List <data-type> list1= new ArrayList();  
List <data-type> list2 = new LinkedList();  
List <data-type> list3 = new Vector();  
List <data-type> list4 = new Stack();  
```

## ArrayList
The ArrayList class implements the List interface. It uses a dynamic array to store the duplicate element of different data types. The ArrayList class maintains the insertion order and is non-synchronized. The elements stored in the ArrayList class can be randomly accessed.
```
ArrayList<String> list=new ArrayList<String>() 
```

## LinkedList
LinkedList implements the Collection interface. It uses a doubly linked list internally to store the elements. It can store the duplicate elements. It maintains the insertion order and is not synchronized. In LinkedList, the manipulation is fast because no shifting is required.
```
LinkedList<String> al=new LinkedList<String>();
```

## Stack
The stack is the subclass of Vector. It implements the last-in-first-out data structure, i.e., Stack. The stack contains all of the methods of Vector class and also provides its methods like boolean push(), boolean peek(), boolean push(object o), which defines its properties.
```
Stack<String> stack = new Stack<String>();
```

## Queue
Queue interface maintains the first-in-first-out order. It can be defined as an ordered list that is used to hold the elements which are about to be processed. There are various classes like PriorityQueue, Deque, and ArrayDeque which implements the Queue interface.
```
Queue<String> q1 = new PriorityQueue();  
Queue<String> q2 = new ArrayDeque();  
```

## Priority Queue
The PriorityQueue class implements the Queue interface. It holds the elements or objects which are to be processed by their priorities. PriorityQueue doesn't allow null values to be stored in the queue.
```
PriorityQueue<String> queue=new PriorityQueue<String>();
```
## Deque
Deque interface extends the Queue interface. In Deque, we can remove and add the elements from both the side. Deque stands for a double-ended queue which enables us to perform the operations at both the ends.
```
Deque d = new ArrayDeque();
```

## ArrayDeque
ArrayDeque class implements the Deque interface. It facilitates us to use the Deque. Unlike queue, we can add or delete the elements from both the ends.
ArrayDeque is faster than ArrayList and Stack and has no capacity restrictions.
```
Deque<String> deque = new ArrayDeque<String>();
```

## Set
Set Interface in Java is present in java.util package. It extends the Collection interface. It represents the unordered set of elements which doesn't allow us to store the duplicate items. We can store at most one null value in Set. Set is implemented by HashSet, LinkedHashSet, and TreeSet.
```
Set<data-type> s1 = new HashSet<data-type>();  
Set<data-type> s2 = new LinkedHashSet<data-type>();  
Set<data-type> s3 = new TreeSet<data-type>();  
```

