package ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class EmailCounterTest {

   @Test
   void readExistingFileSizes() {
      String[] files = new String[]{"src/test/resources/file1.txt", "src/test/resources/file2.txt"};
      long[] fileSizes = EmailCounter.countAllEmails(files);
      assertArrayEquals(new long[]{2, 9}, fileSizes);
   }

   @Test
   void readOnlyNonExistingFileSizes() {
      String[] files = new String[]{"planets.txt", "dimensions.txt"};

      long[] fileSizes = EmailCounter.countAllEmails(files);
      assertArrayEquals(new long[]{-1, -1}, fileSizes);
   }

   @Test
   void readSomeNonExistingFileSizes() {
      String[] files = new String[]{"src/test/resources/file1.txt", "planets.txt", "src/test/resources/file2.txt", "dimensions.txt"};
      long[] fileSizes = EmailCounter.countAllEmails(files);
      assertArrayEquals(new long[]{2, -1, 9, -1}, fileSizes);
   }
}