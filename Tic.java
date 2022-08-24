package Tic_tac_toe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Tic implements ActionListener {
    JFrame frame = new JFrame("Tic Tac Toe");
    JPanel panel1 = new JPanel(new GridLayout(3, 3));
    JPanel panel2 = new JPanel(new GridLayout(1, 3));
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();
    JPanel panel5 = new JPanel();
    JButton X = new JButton("X");
    JButton O = new JButton("O");
    JTextField text = new JTextField(10);
    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    JButton b7 = new JButton("7");
    JButton b8 = new JButton("8");
    JButton b9 = new JButton("9");
    public char i = ' ';
    public int count=0;

    public Tic() {
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        X.setBackground(new Color(126, 247, 223));
        O.setBackground(new Color(255, 143, 140));
        panel3.setBackground(Color.LIGHT_GRAY);
        panel4.setBackground(Color.LIGHT_GRAY);
        panel5.setBackground(Color.LIGHT_GRAY);
        text.setBackground(Color.LIGHT_GRAY);

        panel2.add(X);
        panel2.add(text);
        panel2.add(O);

        frame.add(panel1, BorderLayout.CENTER);
        frame.add(panel2, BorderLayout.NORTH);
        frame.add(panel3, BorderLayout.EAST);
        frame.add(panel4, BorderLayout.SOUTH);
        frame.add(panel5, BorderLayout.WEST);

        panel1.add(b1);
        panel1.add(b2);
        panel1.add(b3);
        panel1.add(b4);
        panel1.add(b5);
        panel1.add(b6);
        panel1.add(b7);
        panel1.add(b8);
        panel1.add(b9);

        X.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               if(i!='W') { i = 'X';}
            }
        });

        O.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(i!='W'){i='O';}
            }
        });
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);

        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {

            if (e.getSource() == b1) {

                if (i == 'X') {
                    b1.setText("X");
                    b1.setBackground(new Color(126, 247, 223));
                    i=' ';
                } else if (i == 'O') {
                    b1.setText("O");
                    b1.setBackground(new Color(255, 143, 140));
                    i=' ';
                }
                count++;
            }
            else if (e.getSource() == b2) {
                if (i == 'X') {
                    b2.setText("X");
                    b2.setBackground(new Color(126, 247, 223));
                    i=' ';
                } else if (i == 'O') {
                    b2.setText("O");
                    b2.setBackground(new Color(255, 143, 140));
                    i=' ';
                }
                count++;
            }
            else if (e.getSource() == b3) {
                if (i == 'X') {
                    b3.setText("X");
                    b3.setBackground(new Color(126, 247, 223));
                    i=' ';
                } else if (i == 'O') {
                    b3.setText("O");
                    b3.setBackground(new Color(255, 143, 140));
                    i=' ';
                }
                count++;
            }
            else if (e.getSource() == b4) {
                if (i == 'X') {
                    b4.setText("X");
                    b4.setBackground(new Color(126, 247, 223));
                    i=' ';
                } else if (i == 'O') {
                    b4.setText("O");
                    b4.setBackground(new Color(255, 143, 140));
                    i=' ';
                }
                count++;
            }
            else if (e.getSource() == b5) {
                if (i == 'X') {
                    b5.setText("X");
                    b5.setBackground(new Color(126, 247, 223));
                    i=' ';
                } else if (i == 'O') {
                    b5.setText("O");
                    b5.setBackground(new Color(255, 143, 140));
                    i=' ';
                }
                count++;
            }
            else if (e.getSource() == b6) {
                if (i == 'X') {
                    b6.setText("X");
                    b6.setBackground(new Color(126, 247, 223));
                    i=' ';
                } else if (i == 'O') {
                    b6.setText("O");
                    b6.setBackground(new Color(255, 143, 140));
                    i=' ';
                }
                count++;
            }
            else if (e.getSource() == b7) {
                if (i == 'X') {
                    b7.setText("X");
                    b7.setBackground(new Color(126, 247, 223));
                    i=' ';
                } else if (i == 'O') {
                    b7.setText("O");
                    b7.setBackground(new Color(255, 143, 140));
                    i=' ';
                }
                count++;
            }
            else if (e.getSource() == b8) {
                if (i == 'X') {
                    b8.setText("X");
                    b8.setBackground(new Color(126, 247, 223));
                    i=' ';
                } else if (i == 'O') {
                    b8.setText("O");
                    b8.setBackground(new Color(255, 143, 140));
                    i=' ';
                }
                count++;
            }
            else if (e.getSource() == b9) {
                if (i == 'X') {
                    b9.setText("X");
                    b9.setBackground(new Color(126, 247, 223));
                    i=' ';
                } else if (i == 'O') {
                    b9.setText("O");
                    b9.setBackground(new Color(255, 143, 140));
                    i=' ';
                }
                count++;
            }
             if(b1.getText()==b2.getText() && b1.getText()==b3.getText())
            {
                text.setText("Player "+ b1.getText()+" win");
                i='W';
            }
            else if(b1.getText()==b4.getText() && b1.getText()==b7.getText()){
                text.setText("Player "+ b1.getText()+" win");
                i='W';
            }
            else if(b1.getText()==b5.getText() && b1.getText()==b9.getText()){
                text.setText("Player "+ b1.getText()+" win");
                i='W';
            }
            else if(b2.getText()==b5.getText() && b2.getText()==b8.getText()){
                text.setText("Player "+ b2.getText()+" win");
                i='W';
            }
            else if(b3.getText()==b6.getText() && b3.getText()==b9.getText()){
                text.setText("Player "+ b3.getText()+" win");
                i='W';
            }
            else if(b3.getText()==b5.getText() && b3.getText()==b7.getText()){
                text.setText("Player "+ b3.getText()+" win");
                i='W';
            }
            else if(b4.getText()==b5.getText() && b4.getText()==b6.getText()){
                text.setText("Player "+ b4.getText()+" win");
                i='W';
            }
            else if(b7.getText()==b8.getText() && b7.getText()==b9.getText()){
                text.setText("Player "+ b7.getText()+" win");
                i='W';
            }
            else if(count==9)
             {
                 text.setText("DRAW!");
             }
    }
    public static void main(String[] args) {
        Tic tic = new Tic();
    }
}