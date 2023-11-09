/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex03_cha_garciacb;

/**
 *
 * @author Christian Brandon
 */
public class Element {
// instance fields
  private final int atomicNumber;
  private final String name, symbol;
  private final boolean isMetal;

  // constructor method
  public Element(String name, String symbol, 
          int atomicNumber, boolean isMetal) {
    this.name = name;
    this.symbol = symbol;
    this.atomicNumber = atomicNumber;
    this.isMetal = isMetal;
  }
  
  // accessor methods
  public int getAtomicNumber() {
      return atomicNumber;
  }
  
  public String getName() {
      return name;
  }
  
  public String getSymbol() {
      return symbol;
  }
  
  public boolean isMetal() {
      return isMetal;
  }
}
