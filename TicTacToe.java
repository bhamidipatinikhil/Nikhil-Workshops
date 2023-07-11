import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToe {

    public static void main(String[] args) {
        
        JFrame f = new JFrame("challenge 1");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container pane = f.getContentPane();
        pane.setLayout(new BorderLayout());

        JPanel myContainer = new JPanel(new GridLayout(3, 3, 10, 10));

        final JButton[] buttons = new JButton[9];
        for(int i = 0; i < 9; i++) {
            JButton tmpButton = new JButton("");
            buttons[i] = tmpButton;
            myContainer.add(buttons[i]);

            buttons[i].addActionListener((event) -> {
                JButton tmp = (JButton) event.getSource();
                if(tmp.getText().equals("")) {
                    tmp.setText("X");
                    // tmp.setFont(new Font("OpenSans", Font.ITALIC, 18));
                }
                else if(tmp.getText().equals("X")) {
                    tmp.setText("O");
                }
                else if(tmp.getText().equals("O")) {
                    tmp.setText("");
                }
            });
        }
        


        

        pane.add(myContainer);
        f.setBounds(100, 100, 300, 300);
        f.setVisible(true);
    }


    
}
