import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swingDiscussion implements ActionListener {
    JFrame frame;
    JButton button;
    swingDiscussion(){
        frame = new JFrame("Session");
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setBackground(Color.blue);
        frame.getContentPane().setBackground(Color.cyan);
        frame.setSize(500, 500);

        button = new JButton("Click me");
        button.setSize(100,50);
        frame.add(button);
    }
    public static void main(String[] args) {

        swingDiscussion obj = new swingDiscussion();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
