package com.mashibing.tank;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        TankFrame tf = new TankFrame();

        while(true){
            Thread.sleep(50);
            tf.repaint();
        }

      /*  f.setSize(800,600);
        f.setResizable(false);
        f.setTitle("tank war");
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });*/
    }
}
