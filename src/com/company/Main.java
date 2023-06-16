package com.company;
public class Main {
    public static void main(String[] args) {

        Pc computer = new Pc("Acer","Aspire");
        Pc computer2 = new Pc("Acer","Aspire",1001);

        String object1 = computer.getDetails();
        System.out.println(object1);

        String object2 = computer2.getDetails2();
        System.out.println(object2);

    }
}