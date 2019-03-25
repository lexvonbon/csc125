package exceptions;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * DataSetReader
 */
public class DataSetReader {

    public static void readFile(String file) throws FileNotFoundException, BadDataException {
        Scanner fileReader = new Scanner(file);
        readData(fileReader);
        fileReader.close();
    }
    public static void readData(Scanner fileReader) throws BadDataException { readValue(); }
    public static void readValue() throws BadDataException {
        throw new BadDataException("Bad Bad Data.");
    }
}