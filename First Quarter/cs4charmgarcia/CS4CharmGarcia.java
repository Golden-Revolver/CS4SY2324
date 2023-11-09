/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs4charmgarcia;

/**
 *
 * @author CHARM
 */
public class CS4CharmGarcia {
 public static void showElementDetails(Element element) {
    System.out.println("Element " + element.id);
    System.out.println("Name: " + element.name);
    System.out.println("Symbol: " + element.symbol);
    System.out.println("Atomic Number: " + element.atomicNumber);
    System.out.println("Melting Point: " + element.meltingPoint);
    System.out.println("Metal? " + element.isMetal + "\n");
  }

  // accepts any number of elements
  public static int addAtomicNumbers(Element... element) {
    int sum = 0;
    for (Element e : element) {
      sum += e.atomicNumber;
    }
    return sum;
  }
  
  public static void main(String[] args) {
    int atomicNumberSum;
    boolean isPotassiumHigher, areAllElementsMetals;

    Element potassium = new Element(1, "Potassium", 'K', 19, 336.53, true);
    Element oxygen = new Element(2, "Oxygen",'O', 8, 54.36, false);
    Element phosphorous = new Element(3, "Phosphorous", 'P', 15, 317.3, false);

    showElementDetails(potassium);
    showElementDetails(oxygen);
    showElementDetails(phosphorous);

    atomicNumberSum = addAtomicNumbers(potassium, oxygen, phosphorous);
    isPotassiumHigher = potassium.meltingPoint > phosphorous.meltingPoint;
    areAllElementsMetals = (potassium.isMetal && oxygen.isMetal && phosphorous.isMetal);

    System.out.println("Sum of atomic numbers: " + atomicNumberSum);
    System.out.println("Potassium has a higher melting point than Phosphorous: " + isPotassiumHigher);
    System.out.println("All elements are metals: " + areAllElementsMetals);   
  }
}
