package chapter11;

import java.io.*;

/**
 * Write a description of class TestingExceptions2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestingExceptions2 {
  public static void main(String[] args) {
    getFile("./readThis.txt");
  }
  public static void getFile(String filename) {
    try {
      FileInputStream file = new FileInputStream(filename);
    } catch(FileNotFoundException e) {
      System.out.println("Error: file not found");
    } catch(IOException e) {
      System.out.println("Error: unknown IO error");
    } catch (Exception e) {} finally {
      System.out.println("system closes");
    }
  }
}