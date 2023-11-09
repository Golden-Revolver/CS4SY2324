package ex05_cha_garciacb;
import java.util.*;
/**
 *
 * @author Christian Brandon
 */
public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    this.name = name;
    this.earnings = 0;
    this.itemList = new ArrayList<Item>();
    storeList.add(this);
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
    if (index < itemList.size()) {
        Item i = itemList.get(index);
        earnings += i.getCost();
        System.out.printf("%s was sold for %.2f.%n",
                i.getName(), i.getCost());
    }
    else {
        System.out.printf("There are only %d items in the store.\n",
                itemList.size());
    }
    // check if index is within the size of the itemList 
    // (if not, print statement that there are only x items in the store)
    // get Item at index from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void sellItem(String name){
     for (Item i : itemList) {
         if (i.getName().equals(name)) {
             earnings += i.getCost();
             System.out.printf("%s was sold for %.2f.%n",
                     i.getName(), i.getCost());
             return;
         } 
     }
     System.out.printf("The store doesn't sell %s.\n", name);
    /* check if Item with given name is in the itemList (you will need to loop 
     over itemList) (if not, print statement that the store doesn't sell it) */
    // get Item from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void sellItem(Item i){
    int index = itemList.indexOf(i);
    if (index != -1) {
        earnings += itemList.get(index).getCost();
        System.out.printf("%s was sold for %.2f.%n",
                i.getName(), i.getCost());
    }
    else {
        System.out.printf("The store doesn't sell %s.\n", name);
    }
    /* check if Item i exists in the store (there is a method that can help
    with this) (if not, print statement that the store doesn't sell it) */
    // get Item i from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void addItem(Item i){
    itemList.add(i);
    // add Item i to store's itemList
  }
  public void filterType(String type){
    for (Item i : itemList) {
        if (i.getType().equals(type)) {
            System.out.println(i.getName());
        }
    }
    // loop over itemList and print all items with the specified type
  }
  public void filterCheap(double maxCost){
    for (Item i : itemList) {
        if (i.getCost() <= maxCost) {
            System.out.println(i.getName());
        }
    }
    /* loop over itemList and print all items with a cost lower than 
    or equal to the specified value */
  }
  public void filterExpensive(double minCost){
    for (Item i : itemList) {
        if (i.getCost() >= minCost) {
            System.out.println(i.getName());
        }
    }
    /* loop over itemList and print all items with a cost higher than 
    or equal to the specified value */
  }
  public static void printStats(){
    for (Store s : storeList) {
        System.out.printf("Name: %s%nEarnings: %.2f%n",
                s.getName(), s.getEarnings());
    }
    // loop over storeList and print the name and the earnings'Store.java'
  }
}
