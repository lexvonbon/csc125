package exceptions;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

/**
 * DataSetReader
 */
public class DataSetReader {
  private double[] data;

  public double[] readFile(String fileName) throws FileNotFoundException,
  BadDataException {
    File openFile = new File(fileName);
    try (Scanner fileReader = new Scanner(openFile)) {
      readData(fileReader);
      return(data);
    }
  }

  public void readData(Scanner fileReader) throws BadDataException {
    if (!fileReader.hasNext()) {
      throw new BadDataException("Length Expection");
    }
    int numOfValues = fileReader.nextInt();
    data = new double[numOfValues];

    for (int i = 0; i < data.length; i += 1) {
      readValue(fileReader, i);
    }
    if (fileReader.hasNext()) {
      throw new BadDataException("End of file expected");
    }
  }
  private void readValue(Scanner fileReader, int i) throws BadDataException {
    if (!fileReader.hasNextDouble()) {
      throw new BadDataException("Bad Bad Data.");
    }
    data[i] = fileReader.nextDouble();
  }
}