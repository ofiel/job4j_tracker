package ru.job4j.oop;

public class Error {
    boolean active;
    int status;
    String message;

    public Error() {
        active = false;
        status = 404;
        message = "Еще какое-то сообщение";
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Активна? " + active);
        System.out.println("Статус: " + status);
        System.out.println("Сообщение " + message);
    }

    public static void main(String[] args) {
        Error error1 = new Error(true, 500, "Какое-то сообщение");
        error1.printInfo();
        Error error2 = new Error(true, 503, "Новое сообщение");
        error2.printInfo();
        Error error3 = new Error();
        error3.printInfo();
    }
}
