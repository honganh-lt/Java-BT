package BaiTap;

import javax.swing.*;

public class bai1 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Bạn tên gì? ");
        String input = JOptionPane.showInputDialog("Bạn bao nhiêu tuổi?");
        int age = Integer.parseInt(input);

        System.out.println("Hello," + name + ". Next year, you'll be " + (age + 1));
    }
}
