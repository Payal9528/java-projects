import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToeGUI extends JFrame implements ActionListener {
    private JButton[] buttons = new JButton[9];
    private String turn = "X";

    public TicTacToeGUI() {
        setTitle("Tic Tac Toe");
        setSize(400, 400);
        setLayout(new GridLayout(3, 3));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create 9 buttons for the board
        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton("");
            buttons[i].setFont(new Font("Arial", Font.BOLD, 60));
            buttons[i].addActionListener(this);
            add(buttons[i]);
        }

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();

        if (clicked.getText().equals("")) {
            clicked.setText(turn);
            if (checkWinner()) {
                JOptionPane.showMessageDialog(this, "Player " + turn + " wins!");
                resetBoard();
            } else if (isDraw()) {
                JOptionPane.showMessageDialog(this, "It's a draw!");
                resetBoard();
            } else {
                turn = turn.equals("X") ? "O" : "X";
            }
        }
    }

    private boolean checkWinner() {
        int[][] winConditions = {
            {0,1,2}, {3,4,5}, {6,7,8}, // rows
            {0,3,6}, {1,4,7}, {2,5,8}, // cols
            {0,4,8}, {2,4,6}           // diagonals
        };

        for (int[] wc : winConditions) {
            if (!buttons[wc[0]].getText().equals("") &&
                buttons[wc[0]].getText().equals(buttons[wc[1]].getText()) &&
                buttons[wc[1]].getText().equals(buttons[wc[2]].getText())) {
                return true;
            }
        }
        return false;
    }

    private boolean isDraw() {
        for (JButton b : buttons) {
            if (b.getText().equals("")) return false;
        }
        return true;
    }

    private void resetBoard() {
        for (JButton b : buttons) {
            b.setText("");
        }
        turn = "X";
    }

    public static void main(String[] args) {
        new TicTacToeGUI();
    
    }
}
