package com.example;


/**
 * A class representing a greeting to someone.
 *
 * @author  Someone
 * @version 1.13, 02/17/18
 */
public class Greeter {

  /**
   * Returns final String of greeting
   *
   * @param     someone String name of person.
   * @return    String result after process.
   */
  public final String greet(final String someone)
  {
    return String.format("Hello, %s!", someone);
  }
}
