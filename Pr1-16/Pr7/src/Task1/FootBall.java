package Task1;

import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FootBall extends JFrame {
    private JButton milanButton;
    private JButton madridButton;
    private JLabel resultLabel;
    private JLabel scorerLabel;
    private Label winnerLabel;
    private int milanScore;
    private int madridScore;
    private String lastScorer;
    private String winner;
    Font fnt = new Font("Times new roman", Font.BOLD, 20);
    private FootBall(){

        milanScore = 0;
        madridScore =0;
        lastScorer = "N/A";
        winner = "DROW";
        setTitle("Match of the day!!!");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Закрытие окна при нажатии на крестик
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.white);
        mainPanel.setLayout(new GridLayout(5,1));
        JButton milanButton = new JButton("AC Milan");
        milanButton.setBackground(Color.red);
        milanButton.setFont(fnt);

        JButton madridButton = new JButton("Real Madrid");
        madridButton.setBackground(Color.blue);
        madridButton.setForeground(Color.white);
        madridButton.setFont(fnt);
        madridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                lastScorer =  "Real Madrid";
                updateLabels();
            }
        });

        mainPanel.add(madridButton);

        milanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                lastScorer = "AC Milan";
                updateLabels();
            }
        });
        mainPanel.add(milanButton);



        resultLabel = new JLabel("Result: 0 X 0");
        mainPanel.add(resultLabel);
        scorerLabel = new JLabel("Last Scorer: N/A");
        mainPanel.add(scorerLabel);
        winnerLabel = new Label("Winner: DROW");
        mainPanel.add(winnerLabel);
        add(mainPanel);
        setVisible(true);
    }

    private void updateLabels(){
        resultLabel.setText("Result: " + madridScore + " X " + milanScore);
        scorerLabel.setText("Last Scorer: " + lastScorer);

        if (milanScore > madridScore) {
            winner = "AC Milan";
        }
        else if (madridScore > milanScore) {
            winner = "Real Madrid";
        }
        else {
            winner = "DROW";
        }
        winnerLabel.setText("Winner " + winner);

    }

    public static void main(String[] args) {
        new FootBall();
    }

}

