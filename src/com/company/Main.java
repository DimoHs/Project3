package com.company;
public class Main {
    public static void main(String[] args) {

        Computer computer = new Computer("Acer","Aspire");
        Computer computer2 = new Computer("Acer","Aspire",1001);

        String object1 = computer.getDetails();
        System.out.println(object1);

        String object2 = computer2.getDetails2();
        System.out.println(object2);

    }
}