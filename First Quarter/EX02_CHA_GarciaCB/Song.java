/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex02_cha_garciacb;

/**
 *
 * @author Christian Brandon
 */
public class Song {
    // instance fields
    String name, author, genre;
    int length;
    
    // constructor method
    public Song(String name, String author, String genre, int length) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.length = length;
    }
    
    public void changeGenre(String genre) {
        this.genre = genre;
    }
    
    public void lengthenSong(int seconds) {
        length += seconds;
    }
}
