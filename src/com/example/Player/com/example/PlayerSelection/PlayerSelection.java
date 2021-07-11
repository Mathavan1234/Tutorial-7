package com.example.Player.com.example.PlayerSelection;

import com.example.Player.Player;

import java.util.Scanner;

import static com.example.Player.Player.*;

public class PlayerSelection {
    public static void main(String[] args){

        Player player1 = new Player();
        player1.playerName = "Kumar Sangakkara";
        player1.playerAge = 40;
        player1.playerType = "Batsman";
        player1.playerStats = 1100;

        Player player2 = new Player();
        player2.playerName = "Mahela";
        player2.playerAge = 42;
        player2.playerType = "Batsman";
        player2.playerStats = 700;

        Player player3 = new Player();
        player3.playerName = "Sanath";
        player3.playerAge = 47;
        player3.playerType = "Batsman";
        player3.playerStats = 1000;

        Player player4 = new Player();
        player4.playerName = "Malinga";
        player4.playerAge = 44;
        player4.playerType = "Bowler";
        player4.playerStats = 200;

        Player player5 = new Player();
        player5.playerName = "Murali";
        player5.playerAge = 42;
        player5.playerType = "Bowler";
        player5.playerStats = 300;

        Player player6 = new Player();
        player6.playerName = "Chaminda Vaas";
        player6.playerAge = 44;
        player6.playerType = "Bowler";
        player6.playerStats = 500;

        Player player7 = new Player();
        player7.playerName = "Chandimal";
        player7.playerAge = 46;
        player7.playerType = "Keeper";
        player7.playerStats = 20;

        Player player8 = new Player();
        player8.playerName = "Dickwella";
        player8.playerAge = 35;
        player8.playerType = "Keeper";
        player8.playerStats = 30;

        String[] roster = {player1.playerName, player2.playerName, player3.playerName, player4.playerName,
        player5.playerName, player6.playerName, player7.playerName, player8.playerName};

        float player1avg = player1.getavg();
        float player2avg = player2.getavg();
        float player3avg = player3.getavg();
        float player4avg = player4.getavg();
        float player5avg = player5.getavg();
        float player6avg = player6.getavg();
        float player7avg = player7.getavg();
        float player8avg = player8.getavg();

        float[] scores = {player1avg, player2avg, player3avg, player4avg, player5avg, player6avg,
        player7avg, player8avg};

        String userIn;
        do {
            System.out.println("V: View individual player details" +
                    "\nA: Add Players" +
                    "\nB: Display 2 best batsmen" +
                    "\nC: Display 2 best bowlers" +
                    "\nD: Display the best keeper"+
                    "\nE: Display the best performer"+
                    "\nT: View Current Team"+
                    "\nP: Display best performer" +
                    "\nF: Display all player Type" +
                    "\nX: Exit");
            Scanner input = new Scanner(System.in);
            System.out.println("Your Option: ");
            userIn = input.next();
            switch (userIn) {
                case "A":
                    addPlayer(roster);
                    break;
                case "B":
                    float[] array1 = {player1avg, player2avg, player3avg};
                    bestbatsmen(array1); //calling bestbatsmen method
                    break;
                case "C":
                    float[] array2 = {player4avg, player5avg, player6avg};
                    bestbowlers(array2); //calling bestbowlers method
                case "D":
                    float[] array3 = {player7avg, player8avg};
                    bestKeeper(array3);
                    break;
                case "T":
                    System.out.println(team);
                    break;
                case "P":
                    getbestperf(scores);
                    break;
                case "V":
                    System.out.println(player1.playerName+"-"+player1.playerAge+"years");
                    System.out.println(player2.playerName+"-"+player2.playerAge+"years");
                    System.out.println(player3.playerName+"-"+player3.playerAge+"years");
                    System.out.println(player4.playerName+"-"+player4.playerAge+"years");
                    System.out.println(player5.playerName+"-"+player5.playerAge+"years");
                    System.out.println(player6.playerName+"-"+player6.playerAge+"years");
                    System.out.println(player7.playerName+"-"+player7.playerAge+"years");
                    System.out.println(player8.playerName+"-"+player8.playerAge+"years");
                    break;
                case "F":
                    System.out.println(player1.playerName+"-"+player1.playerType+"years\n"+
                            player2.playerName+"-"+player2.playerType+"years\n"+
                            player3.playerName+"-"+player3.playerType+"years\n"+
                            player4.playerName+"-"+player4.playerType+"years\n"+
                            player5.playerName+"-"+player5.playerType+"years\n"+
                            player6.playerName+"-"+player6.playerType+"years\n"+
                            player7.playerName+"-"+player7.playerType+"years\n"+
                            player8.playerName+"-"+player8.playerType+"years\n");

            }
        } while (userIn != "X");
        System.out.println("Your team is: "+team);
    }
}
