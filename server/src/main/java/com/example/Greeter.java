package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   *@param name the location of the image, relative to the url argument
   *@return 'sdbhdj'
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
