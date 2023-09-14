/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex03_cha_garciacb;

/**
 *
 * @author Christian Brandon
 */
public class Singer {
    // instance fields
    private final String name;
    private int noOfPerformances;
    private static int totalPerformances;
    private double earnings;
    private Song favoriteSong;
    
    // constructor method
    public Singer(String name, int noOfPerformances, 
            double earnings, Song favoriteSong) {
        this.name = name;
        this.noOfPerformances = noOfPerformances;
        this.earnings = earnings;
        this.favoriteSong = favoriteSong;
        totalPerformances += noOfPerformances;
    }
    
    public void performForAudience(int people) {
        noOfPerformances++;
        totalPerformances++;
        earnings += people * 100;
    }
    
    public void performForAudience(Singer singer, int people) {
        noOfPerformances++;
        singer.noOfPerformances++;
        totalPerformances += 2;
        singer.earnings += people * 50;
        earnings += people * 50;
    }
    
    public void changeFavSong(Song song) {
        favoriteSong = song;
    }
    
    // accessor methods
    public String getName() {
        return name;
    }
    
    public int getNoOfPerformances() {
        return noOfPerformances;
    }
    
    public double getEarnings() {
        return earnings;
    }
    
    public Song getFavoriteSong() {
        return favoriteSong;
    }
   
    public static int getTotalPerformances() {
        return totalPerformances;
    }
}