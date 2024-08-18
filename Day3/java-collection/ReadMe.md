# Java Collection

    Java Collections Framework is a unified architecture for representing and manipulating 
    collections, allowing collections to be easily manipulated, stored, and retrieved. 
    Collections are used to group multiple items into a single unit, 
    and the Java Collections Framework provides various interfaces and classes to manage and 
    manipulate these collections efficiently.

## Overview of Java Collections Framework
    The Java Collections Framework consists of:

    Interfaces: Define the abstract data types (ADTs) that represent collections, 
                such as List, Set, Queue, and Map.
    Implementations: Concrete classes that implement the collection interfaces, 
                such as ArrayList, HashSet, LinkedList, and HashMap.
    Algorithms: Methods provided by the Collections class, such as sorting and searching, 
                that operate on collections.
## Key Interfaces
    a) Collection Interface
        The root interface in the collection hierarchy.
        Extends the Iterable interface.
    Contains methods like add(), remove(), size(), clear(), etc.
    Subinterfaces include List, Set, and Queue.
    b) List Interface
        An ordered collection (sequence) that allows duplicate elements.
        Elements can be accessed by their position (index) in the list.
        Implementations: ArrayList, LinkedList, Vector, Stack.
 
       List<String> list = new ArrayList<>();
       list.add("Apple");
       list.add("Banana");
       list.add("Apple"); // Duplicates allowed
       System.out.println(list.get(0)); // Access element by index
    c) Set Interface
       A collection that does not allow duplicate elements.
       Implementations: HashSet, LinkedHashSet, TreeSet.
       
       Set<String> set = new HashSet<>();
       set.add("Apple");
       set.add("Banana");
       set.add("Apple"); // Duplicate not allowed, ignored
       System.out.println(set.size()); // Output: 2
    d) Queue Interface
        A collection used to hold multiple elements prior to processing, 
        typically in a FIFO (First-In-First-Out) manner.
        Implementations: LinkedList, PriorityQueue, ArrayDeque.
   
       Queue<String> queue = new LinkedList<>();
       queue.add("Apple");
       queue.add("Banana");
       System.out.println(queue.poll()); // Retrieves and removes the head of the queue
    e) Map Interface
       A collection that maps keys to values, with no duplicate keys allowed.
       Implementations: HashMap, TreeMap, LinkedHashMap, Hashtable.
           
       Map<String, Integer> map = new HashMap<>();
       map.put("Apple", 1);
       map.put("Banana", 2);
       System.out.println(map.get("Apple")); // Output: 1

## Common Implementations
    a) ArrayList
        A resizable array implementation of the List interface.
        Allows fast random access (get operation) but slow insertion and deletion in the 
        middle of the list.
  
       List<Integer> arrayList = new ArrayList<>();
       arrayList.add(1);
       arrayList.add(2);
       arrayList.add(3);
    b) LinkedList
       A doubly-linked list implementation of both the List and Deque interfaces.
       Allows fast insertion and deletion but slower random access.
   
       List<Integer> linkedList = new LinkedList<>();
       linkedList.add(1);
       linkedList.add(2);
       linkedList.add(3);
     c) HashSet
       Implements the Set interface, backed by a hash table.
       Provides constant time performance for basic operations like add, remove, and contains.
       
       Set<String> hashSet = new HashSet<>();
       hashSet.add("Apple");
       hashSet.add("Banana");
    d) TreeSet
       A Set implementation that uses a tree for storage (a Red-Black tree).
       The elements are sorted according to their natural ordering or by a comparator provided at the set creation time.
       
       Set<String> treeSet = new TreeSet<>();
       treeSet.add("Banana");
       treeSet.add("Apple");
    e) HashMap
       A Map implementation based on a hash table.
       Provides constant time performance for basic operations like get and put.
       
       Map<String, Integer> hashMap = new HashMap<>();
       hashMap.put("Apple", 10);
       hashMap.put("Banana", 20);
    f) LinkedHashMap
       A Map implementation with predictable iteration order.
       Maintains a doubly-linked list running through all its entries.
       
       Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
       linkedHashMap.put("Apple", 10);
       linkedHashMap.put("Banana", 20);
## Sorting and Searching
    The Collections class provides methods like sort() and binarySearch() to sort and search 
    elements in a collection.
    List<Integer> numbers = new ArrayList<>();
    numbers.add(3);
    numbers.add(1);
    numbers.add(2);
    Collections.sort(numbers); // Sorts the list in ascending order
## Thread-Safe Collections
    Java provides several classes in the java.util.concurrent package, 
    like ConcurrentHashMap, CopyOnWriteArrayList, and CopyOnWriteArraySet, 
    which are thread-safe and can be used in concurrent environments.

## Iteration over Collections
    Collections can be iterated using various techniques:

    For-each loop:
    
    for (String fruit : list) {
    System.out.println(fruit);
    }

    Iterator:

    Iterator<String> iterator = list.iterator();
    while (iterator.hasNext()) {
    System.out.println(iterator.next());
    }

    Stream API (Java 8+):
    java
    Copy code
    list.stream().forEach(System.out::println);
## Comparison of ArrayList and LinkedList
       ArrayList is better when frequent access to elements is needed, as it provides O(1) 
                time complexity for accessing elements.
       LinkedList is better when frequent insertions and deletions are needed, 
                as it provides O(1) time complexity for insertions and deletions at the beginning or end.
## Generics in Collections
    Java Collections are generic, meaning they can hold any type of object. 
    Using generics provides type safety and eliminates the need for casting.


    List<String> stringList = new ArrayList<>();
    stringList.add("Hello");
    String str = stringList.get(0); // No casting needed

## Collections vs Arrays
    Arrays have a fixed size and can store only homogeneous data types.
    Collections can grow or shrink dynamically and can store heterogeneous data types 
    (when generics are not used).
##  Important Points to Remember
    Null values: Some collections like HashSet, ArrayList, and HashMap allow null values, 
    while others like TreeSet and TreeMap do not.
    
    Ordering: HashSet and HashMap do not maintain any order, while LinkedHashSet and 
                LinkedHashMap maintain insertion order, and TreeSet and TreeMap maintain sorted order.
    Performance: HashSet and HashMap offer constant-time performance for basic operations, 
                whereas TreeSet and TreeMap offer logarithmic-time performance.
    
    The Java Collections Framework is a powerful tool for working with groups of objects, 
    providing a range of interfaces and classes to suit different needs for storage, retrieval, 
    and manipulation of data.