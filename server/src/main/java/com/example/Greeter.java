package com.example;


/**
 * A class representing a greeting to someone.
 *
 * @author  Someone
 * @version 1.13, 02/17/18
 */
public class Greeter {

  /**
   * Returns String of greeting
   *
   * @param     someone String name of person.
   * @return    String result after process.
   */
  public String greet(String someone) {
    return String.format("Hello, %s!", someone);
  }
}
