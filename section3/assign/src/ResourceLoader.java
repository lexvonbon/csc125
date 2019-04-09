/**
 * ResourceLoader
 */
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class ResourceLoader {
  static ResourceLoader rl = new ResourceLoader();

  private static InputStream getStream(String fileName) {
    return(rl.getClass().getResourceAsStream(fileName));
  }

  private static BufferedReader getReader(InputStream stream) {
    return(new BufferedReader(new InputStreamReader(stream)));
  }

  public static String[] parseLine(final String line) {
    return(line.split(", "));
  }
  public static ArrayList<String[]> parseLines(final ArrayList<String> lines) {
    ArrayList<String[]> parsedLines = new ArrayList<>();
    for (String line: lines) {
      parsedLines.add(parseLine(line));
    }
    return(parsedLines);
  }

  public static ArrayList<String> getResource(final String fileName) {
    BufferedReader reader = getReader(getStream(fileName));
    ArrayList<String> lines = new ArrayList<>();
    String line;
    try {
      while ((line = reader.readLine()) != null) {
        lines.add(line);
      }
      reader.close();
    } catch (IOException e) {
      System.out.println("Something");
      System.out.println("Error on Input");
      System.out.println("You done fucked up.");
      return(lines);
    }
    return(lines);
  }
}