package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

        public class TestPanel extends JFrame {
            TestPanel() throws AWTException {
                setSize(500, 300);
                setVisible(true);
                setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                JPanel p = new JPanel();
                p.setBackground(Color.RED);
                //
                Robot robot = new Robot();
                p.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        super.mouseClicked(e);
                        Color c = robot.getPixelColor(e.getX(), e.getY());
                        System.out.printf("x=%d y=%d color argb = %d %d %d %d%n", e.getX(), e.getY(), c.getAlpha(), c.getRed(), c.getGreen(), c.getBlue());

                    }
                });
                getContentPane().add(p);
            }

            public static void main(String[] args) throws AWTException {
                new TestPanel();
            }
        }