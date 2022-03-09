package ex1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Pattern;

public class EmailCounter {

  public static long countEmails(String fileName) throws IOException {
    Path path = Paths.get(fileName);
    String content = Files.readString(path, StandardCharsets.UTF_8);

    return Pattern.compile("([a-z0-9_.-]+)@([a-z0-9_.-]+[a-z])")
            .matcher(content)
            .results()
            .count();
  }

  public static long[] countAllEmails(String[] fileNames) {
    long[] emailCount = new long[fileNames.length];

    for (int i = 0; i < fileNames.length; i++) {
      try {
        emailCount[i] = countEmails(fileNames[i]);
      } catch (IOException e) {
        emailCount[i] = -1;
      }
    }

    return emailCount;
  }

}
