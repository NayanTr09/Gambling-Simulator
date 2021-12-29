/**
 *  Workshop : Gambling Simulator Program
 * @author Nayan Tripathi
 * Date : 29th December, 2021
 */

package com.gamblingsimulator;

import java.util.Random;

public class GamblingSimulator {
    public static void main(String args[]){
        System.out.println("Welcome to Gambling Simulator!");
        int Stake = 100;  // Initialized Stake
        int bet = 1;   // Initialized Bet
        WinorLose();
    }

    public static int WinorLose(){
        Random Ran = new Random();
        int StartBet = Ran.nextInt(2);
        if(StartBet == 1) {
            System.out.println("Gambler wins the bet");
        }
            else {
            System.out.println("Gambler looses the bet");
            }
        return WinorLose();
    }
}
