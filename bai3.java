package BaiTap;

import javax.swing.*;

public class bai3 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("How many numbers do you need to day");
        int k = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("What is the highest number you can draw?");
        int n = Integer.parseInt(input);

        int lotteryOdds = 1;
        for (int i = 1; i <= k; i++)
            lotteryOdds = lotteryOdds * (n - i + 1) / i;

        System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");
    }
}
