import myPack.Intro;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JToggleButtonDemo extends JFrame {
    private JTextArea displayArea;
    private JToggleButton toggleButton;

    public JToggleButtonDemo() {
        Intro.print("JToggleButton");

        setTitle("JToggleButton Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());

        toggleButton = new JToggleButton("Toggle");
        inputPanel.add(toggleButton);

        add(inputPanel, BorderLayout.NORTH);

        displayArea = new JTextArea();
        displayArea.setEditable(false);
        add(new JScrollPane(displayArea), BorderLayout.CENTER);

        toggleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (toggleButton.isSelected()) 
                    displayArea.append("Toggle : on\n");
                else 
                    displayArea.append("Toggle : off\n") ;
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new JToggleButtonDemo();
    }
}
