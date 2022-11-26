package com.company;

import javax.swing.*;

public class Wizytowka {

    public void run() {
        var task = new Task();
        String liczba = JOptionPane.showInputDialog(null, "Podaj liczbe");
        int num = Integer.parseInt(liczba);
        Boolean ans = task.run(num);

        String text = " ";
        if (ans.equals(true)) {
            text = "Liczba jest doskonała";
        } else {
            text = "Liczba nie jest doskonała ";
        }
        JOptionPane.showMessageDialog(null, text);
        System.exit(0);
    }

}
