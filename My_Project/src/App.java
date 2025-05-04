package My_Project.src;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class App extends JFrame {

    App() {

        JFrame frame = new JFrame("My First GUI");

        JLabel label = new JLabel("Hello World!");

        ////////////////////////////////////////////////////////////////////////////

        // Set the frame size
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setBounds(200, 400, 500, 300);
        frame.setBackground(new Color(0, 0, 0));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Set the label size and position
        label.setBounds(200, 100, 100, 50);
        label.setForeground(Color.green);
        label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 15));

        frame.add(label);
    }

    public static void main(String[] args) throws Exception {
        App run = new App();
    }
}