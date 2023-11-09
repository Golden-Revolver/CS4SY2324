/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs4charmgarcia;

/**
 *
 * @author Christian Brandon
 */
public class Element {
// instance fields
  int id, atomicNumber;
  String name;
  char symbol;
  double meltingPoint;
  boolean isMetal;

  // constructor method
  public Element(int id, String name, char symbol, int atomicNumber, 
  double meltingPoint, boolean isMetal) {
    this.id = id;
    this.name = name;
    this.atomicNumber = atomicNumber;
    this.meltingPoint = meltingPoint;
    this.symbol = symbol;
    this.isMetal = isMetal;
  }
}
