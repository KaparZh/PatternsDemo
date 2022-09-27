package com.kaparzh.structural.facade;

public class BattleRunner {

    public static void main(String[] args) {
        SquadManagementService sms = new SquadManagementService();
        sms.rest();
        System.out.println("================================");
        sms.attack();
    }
}
