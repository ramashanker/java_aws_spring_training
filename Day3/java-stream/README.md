# Java Stream
       Java Streams, introduced in Java 8, provide a powerful way to perform operations 
       on collections of data. Streams offer a declarative approach to process data by 
       abstracting away the complexities of dealing with the actual iteration, 
       making the code more readable and maintainable. They support functional-style 
       operations and are designed to work with Java collections and arrays.

## Overview of Java Streams
       Stream Definition: A stream is a sequence of elements supporting sequential and parallel 
                            aggregate operations. Streams are not data structures; 
                            they do not store elements. Instead, they convey elements from a 
                            source (like a collection, array, or I/O channel) through a pipeline 
                            of computational operations.

## Key Characteristics of Streams
       No Storage: Streams do not store elements; they provide a view of data in the collection.
       Functional in Nature: Operations on streams produce a result without modifying their source.
       Laziness: Many stream operations are lazy, meaning they are not executed until a terminal operation is invoked.
       Possibility of Infinite Streams: Streams can be finite or potentially infinite, like streams that generate random numbers.
       Parallelism: Streams can be processed sequentially or in parallel.
## Creating Streams
       Streams can be created from various sources, including collections, arrays, and specific 
       classes.

       a) From Collections

       List<String> myList = Arrays.asList("a", "b", "c", "d");
       Stream<String> stream = myList.stream();
       
       b) From Arrays

       String[] myArray = {"a", "b", "c", "d"};
       Stream<String> stream = Arrays.stream(myArray);

       c) From Static Methods (Stream.of)

       Stream<String> stream = Stream.of("a", "b", "c", "d");
       
       d) From a Range (for Primitives)
       
       IntStream intStream = IntStream.range(1, 10); // 1 to 9
       LongStream longStream = LongStream.rangeClosed(1, 10); // 1 to 10
## Stream Operations
       Stream operations are divided into two categories:

       Intermediate Operations: These return a stream and are lazy, meaning they are not executed until a terminal operation is called. Examples include filter, map, and sorted.
       Terminal Operations: These produce a result or a side-effect, such as collect, forEach, or reduce.
       
       a) Intermediate Operations
       
       filter(Predicate<T> predicate): Filters the stream based on a condition.

       List<String> filteredList = myList.stream()
       .filter(s -> s.startsWith("a"))
       .collect(Collectors.toList());
       map(Function<T, R> mapper): Transforms each element using a mapping function.

       List<String> upperCaseList = myList.stream()
       .map(String::toUpperCase)
       .collect(Collectors.toList());
       sorted(Comparator<T> comparator): Sorts the elements of the stream.

       List<String> sortedList = myList.stream()
       .sorted()
       .collect(Collectors.toList());
       distinct(): Removes duplicate elements.

       List<Integer> distinctList = myList.stream()
       .distinct()
       .collect(Collectors.toList());
       limit(long maxSize): Truncates the stream to the first maxSize elements.

       List<String> limitedList = myList.stream()
       .limit(2)
       .collect(Collectors.toList());
       skip(long n): Skips the first n elements.

       List<String> skippedList = myList.stream()
       .skip(2)
       .collect(Collectors.toList());
      
        b) Terminal Operations
              collect(Collector<T, A, R> collector): Converts the stream into a collection or another 
              data structure.

       List<String> list = stream.collect(Collectors.toList());
       Set<String> set = stream.collect(Collectors.toSet());
       forEach(Consumer<T> action): Performs an action for each element of the stream.

       myList.stream().forEach(System.out::println);
       reduce(BinaryOperator<T> accumulator): Combines elements into a single result.

       Optional<String> concatenated = myList.stream()
       .reduce((s1, s2) -> s1 + s2);
       count(): Returns the count of elements in the stream.

       long count = myList.stream().count();
       findFirst(): Returns the first element of the stream.
       
       Optional<String> firstElement = myList.stream().findFirst();
       anyMatch(Predicate<T> predicate): Returns true if any element matches the given predicate.

       boolean anyMatch = myList.stream()
       .anyMatch(s -> s.startsWith("a"));
## Parallel Streams
       Streams can be processed in parallel to leverage multi-core processors.

       List<String> parallelList = myList.parallelStream()
       .filter(s -> s.startsWith("a"))
       .collect(Collectors.toList());
       Parallel streams are useful when you have a large dataset and want to improve performance by splitting the processing across multiple threads.

## Example: Stream Pipeline
       A typical stream pipeline involves creating a stream, applying intermediate operations, and then applying a terminal operation.

       List<String> result = myList.stream()
       .filter(s -> s.startsWith("a"))
       .map(String::toUpperCase)
       .sorted()
       .collect(Collectors.toList());
       In this example:

       filter keeps elements starting with "a".
       map converts each string to uppercase.
       sorted sorts the strings.
       collect gathers the results into a list.
## Streams and Optional
       Streams often work with Optional, a container object that may or may not contain a 
       non-null value.


       Optional<String> optional = myList.stream()
       .filter(s -> s.startsWith("a"))
       .findFirst();

       optional.ifPresent(System.out::println);
## Primitive Streams
       Java provides special stream interfaces for primitive data types: IntStream, 
       LongStream, and DoubleStream. These avoid the overhead of boxing/unboxing.

       IntStream intStream = IntStream.range(1, 5);
       int sum = intStream.sum(); // 1 + 2 + 3 + 4 = 10

## Important Points to Remember
       Streams are lazy: Intermediate operations are not executed until a terminal operation is invoked.
       Streams cannot be reused: Once a terminal operation is applied, the stream is consumed, and you cannot reuse it.
       Avoid modifying the underlying data source: Modifying the collection while it's being processed by a stream can lead to unpredictable behavior.
       Parallel Streams: Use parallel streams when you need to process large datasets in parallel, but be cautious as not all operations may benefit from parallelism.

## Common Use Cases
       Filtering and transforming data: Easily filter, map, and reduce collections or arrays.
       Aggregating data: Compute sums, averages, counts, and more.
       Parallel processing: Speed up operations on large data sets with parallel streams.
       Java Streams provide a concise, readable, and efficient way to perform operations on 
       collections, enabling developers to write functional-style code in Java.