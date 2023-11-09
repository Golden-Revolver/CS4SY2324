/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex02_cha_garciacb;

/**
 *
 * @author Christian Brandon
 */
public class Element {
// instance fields
  int atomicNumber;
  String name, symbol;
  boolean isMetal;

  // constructor method
  public Element(String name, String symbol, 
          int atomicNumber, boolean isMetal) {
    this.name = name;
    this.symbol = symbol;
    this.atomicNumber = atomicNumber;
    this.isMetal = isMetal;
  }
}
