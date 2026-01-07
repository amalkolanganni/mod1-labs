package com.qa.lab8;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.Timer;
import javax.swing.*;

public class Game extends Canvas {

    // create an array of 3 balls
    private Ball[] balls = new Ball[3];

    public static void main(String[] args) {
        new Game();
    }

    Game() {
        JFrame frame = new JFrame();
        this.setSize(500, 500);
        frame.add(this);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        balls[0] = new Ball(10, 10, 20, 20);
        balls[1] = new Ball(100, 100, 30, 30, 2, 3);
        balls[2] = new Ball(200, 50, 15, 15, 5, 2);

        Ball.setWorld(500, 500);

        Timer t = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                draw();
            }
        };

        t.schedule(tt, 0, 50);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                t.cancel();
                tt.cancel();
            }
        });
    }

    public void draw() {
        // call the move() method of each balls
        for (Ball b : balls) {
            b.move();
        }
        
        this.repaint();
    }

    public void paint(Graphics g) {
        g.drawRect(0, 0, Ball.worldW, Ball.worldH);
        
        for (Ball b : balls) {
            g.drawOval(b.x, b.y, b.w, b.h);
        }
    }
}
