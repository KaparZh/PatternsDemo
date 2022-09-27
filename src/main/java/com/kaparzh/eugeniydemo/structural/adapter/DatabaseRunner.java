package com.kaparzh.eugeniydemo.structural.adapter;

public class DatabaseRunner {

    public static void main(String[] args) {
        Database dataBase = new JavaToDatabase();

        dataBase.insert();
        dataBase.update();
        dataBase.select();
        dataBase.remove();
    }
}
