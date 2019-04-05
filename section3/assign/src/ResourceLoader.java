/**
 * ResourceLoader
 */
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class ResourceLoader {
  static ResourceLoader rl = new ResourceLoader();

  public static InputStream getStream(String fileName) {
    return(rl.getClass().getResourceAsStream(fileName));
  }

  public static BufferedReader getReader(InputStream stream) {
    return(new BufferedReader(new InputStreamReader(stream)));
  }

  public static String[] parseBuffer(final BufferedReader reader, final String separator) {
    String line;
    while ((line = reader.readLine()) != null) {
      
    }
    return(new String[]{});
  }
}