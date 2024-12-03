package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String word = eng;
        return word;
    }

    public static void main(String[] args) {
        DummyDic dic = new DummyDic();
        String result = dic.engToRus("kaka");
        System.out.println("Неизвестное слово. " + result);

    }
}
