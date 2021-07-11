package com.example.Player;

import java.util.*;

public class Player {
    public String playerName;
    public int playerAge;
    public String playerType;
    public int playerStats;

    public Player() {

    }

    public Player(String playerName, int playerAge, String playerType, int playerStats){
        this.playerName = playerName;
        this.playerAge = playerAge;
        this.playerType = playerType;
        this.playerStats = playerStats;
    }
    public static ArrayList team = new ArrayList();

    public float getavg() {
        float average = playerStats / 15;
        return average;
    }
    public static void getbestperf(float[] a){
        Arrays.sort(a);
        System.out.println(a[7]);
    }
    public static void bestbatsmen(float[] a){
        Arrays.sort(a);
        System.out.println(a[2]);
        System.out.println(a[1]);
    }
    public static void bestbowlers(float[] a){
        Arrays.sort(a);
        System.out.println(a[2]);
        System.out.println(a[1]);
    }
    public static void bestKeeper(float[] a){
        Arrays.sort(a);
        System.out.println(a[1]);
    }
    public static void addPlayer(String[] p){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter relevant player title(p1,p2,etc)to add to list: ");
        String newplayer = input.next();

        switch (newplayer) {
            case "p1":
                team.add(p[0]);
                break;
            case "p2":
                team.add(p[1]);
                break;
            case "p3":
                team.add(p[2]);
                break;
            case "p4":
                team.add(p[3]);
                break;
            case "p5":
                team.add(p[4]);
                break;
            case "p6":
                team.add(p[5]);
                break;
            case "p7":
                team.add(p[6]);
                break;
            case "p8":
                team.add(p[7]);
                break;
        }
        System.out.println(team);
    }
}
