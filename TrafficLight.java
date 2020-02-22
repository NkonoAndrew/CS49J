package edu.sjsu;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class TrafficLight {

        public static void main(String[] args) {
                JFrame frame = new JFrame();
                frame.setSize(400, 400);
                frame.setTitle("Traffic Light");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                TrafficComponent component = new TrafficComponent();
                frame.add(component);
                frame.setVisible(true);
        }
}
