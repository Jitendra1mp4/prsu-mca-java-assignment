import myPack.Intro;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JRadioButtonDemo extends JFrame {
    private JTextArea displayArea;
    private JRadioButton radioButton;

    public JRadioButtonDemo() {
        Intro.print("JRadioButton");

        setTitle("JRadioButton Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());
        radioButton = new JRadioButton("click to select");
        inputPanel.add(radioButton);

        add(inputPanel, BorderLayout.NORTH);

        displayArea = new JTextArea();
        displayArea.setEditable(false);
        add(new JScrollPane(displayArea), BorderLayout.CENTER);

        radioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (radioButton.isSelected()) {
                    displayArea.append("RadioButton: Selected\n");
                } else {
                    displayArea.append("RadioButton: Deselected\n");
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new JRadioButtonDemo();
    }
}
