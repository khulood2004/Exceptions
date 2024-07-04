package com.example.pojo2;

public class Main {
    public static void main(String[] args) {
        Song song1 = new Song("once in a moon", "Sarah kang", 4.05);

        System.out.println(song1);

        Song song2 = new Song();
        song2.setTitle("scardy cat");
        song2.setArtist("dpr ian");
        song2.setDuration(3.10);
        System.out.println(song2);
    }
}
