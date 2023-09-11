/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex02_cha_garciacb;

/**
 *
 * @author Christian Brandon
 */
public class Singer {
    // instance fields
    String name;
    int noOfPerformances;
    double earnings;
    Song favoriteSong;
    
    // constructor method
    public Singer(String name, int noOfPerformances, 
            double earnings, Song favoriteSong) {
        this.name = name;
        this.noOfPerformances = noOfPerformances;
        this.earnings = earnings;
        this.favoriteSong = favoriteSong;
    }
    
    public void performForAudience(int people) {
        noOfPerformances += 1;
        earnings += people * 100;
    }
    
    public void changeFavSong(Song song) {
        favoriteSong = song;
    }
}