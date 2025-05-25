package main;

import javax.swing.SwingUtilities;

import visual.Visual;

public class Main {
	public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Visual().setVisible(true);
            }
        });
    }
}
