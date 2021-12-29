/**
 *  Workshop : Gambling Simulator Program
 * @author Nayan Tripathi
 * Date : 29th December, 2021
 */

package com.gamblingsimulator;

import java.util.Random;

/* Initialized Bet and Gambler wins if StartBet equals 1 otherwise loses */
public class GamblingSimulator {
    public static void WinorLose(){
        Random Ran = new Random();
        int StartBet = Ran.nextInt(2);
        if(StartBet == 1) {
            System.out.println("Gambler wins the bet");
        }
            else {
            System.out.println("Gambler looses the bet");
            }

    }


    public static void main(String args[]){
        System.out.println("Welcome to Gambling Simulator!");
        int Stake = 100;  // Initialized Stake
        int bet = 1;   // Initialized Bet
        WinorLose();
    }
}
