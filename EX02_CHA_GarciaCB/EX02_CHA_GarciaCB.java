/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex02_cha_garciacb;

/**
 *
 * @author Christian Brandon
 */
public class EX02_CHA_GarciaCB {

    /**
     * @param args the command line arguments
     */
        
    public static void main(String[] args) {
        // 3 instances of elements
        Element lithium = new Element("Lithium", "Li", 3, true);
        Element nitrogen = new Element("Nitrogen", "N", 7, false);
        Element gold = new Element("Gold", "Au", 79, true);
        
        // Song and singer instances
        Song hello = new Song("Hello","Adele","Soul",296);
        Song shapeOfYou = new Song("Shape of You","Ed Sheeran","Pop",234);
        Singer taylorSwift = new Singer("Taylor Swift", 20, 10000, hello);
        
        // Singer methods
        taylorSwift.performForAudience(12);
        taylorSwift.changeFavSong(shapeOfYou);
    }
}