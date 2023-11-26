import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MatchResultApp extends JFrame {
    private JButton milanButton;
    private JButton madridButton;
    private JLabel resultLabel;
    private JLabel scorerLabel;
    private JLabel winnerLabel;

    private int milanScore;
    private int madridScore;
    private String lastScorer;
    private String winner;

    public MatchResultApp() {
        milanScore = 0;
        madridScore = 0;
        lastScorer = "N/A";
        winner = "DRAW";

        setTitle("Match Results");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Закрытие окна при нажатии на крестик

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(5, 1));

        milanButton = new JButton("AC Milan");
        milanButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                lastScorer = "AC Milan";
                updateLabels();
            }
        });
        mainPanel.add(milanButton);

        madridButton = new JButton("Real Madrid");
        madridButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                lastScorer = "Real Madrid";
                updateLabels();
            }
        });
        mainPanel.add(madridButton);

        resultLabel = new JLabel("Result: 0 X 0");
        mainPanel.add(resultLabel);

        scorerLabel = new JLabel("Last Scorer: N/A");
        mainPanel.add(scorerLabel);

        winnerLabel = new JLabel("Winner: DRAW");
        mainPanel.add(winnerLabel);

        add(mainPanel);
        setVisible(true);
    }

    private void updateLabels() {
        resultLabel.setText("Result: " + milanScore + " X " + madridScore);
        scorerLabel.setText("Last Scorer: " + lastScorer);

        if (milanScore > madridScore) {
            winner = "AC Milan";
        } else if (milanScore < madridScore) {
            winner = "Real Madrid";
        } else {
            winner = "DRAW";
        }
        winnerLabel.setText("Winner: " + winner);
    }

    public static void main(String[] args) {
        new MatchResultApp();
    }
}