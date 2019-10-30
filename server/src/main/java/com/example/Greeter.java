package com.example;

/**
*@author stagiaire
*/
public class Greeter {  
  public Greeter() {
    /**
    *default constructeur.
    */
  }

    /**
    *@param  someone someone
    *@return String
    */
  public final String greet(final String someone) {

    return String.format("Hello babacar, %s!", someone);
  }
}
