## Exercise 1: Using the `try-catch` block

Implement the `countAllEmails()` method of the [`EmailCounter`](EmailCounter.java) class such that it returns an array containing the number of occurrences of emails in the files listed in the input `fileNames` array.

If a file does not exist, it should assign a value of -1.

You must use the static method `EmailCounter::countEmails(String)` to retrieve the number of email occurrences in a single file, which throws an `IOException` if the file does not exist.

Your solution should pass all test cases defined in [`EmailCounterTest`](../../../test/java/ex1/EmailCounterTest.java).

Tip: You can easily print an array using `Arrays.toString()`:

```java
Arrays.toString(new int[]{10, 15, 20})
// → [10, 15, 20]
``` 
