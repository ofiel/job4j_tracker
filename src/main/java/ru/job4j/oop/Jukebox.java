package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        String song1 = "Пусть бегут неуклюже";
        String song2 = "Спокойной ночи";
        if (position == 1) {
            System.out.println(song1);
        } else if (position == 2) {
            System.out.println(song2);
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox box = new Jukebox();
        box.music(5);
    }
}
