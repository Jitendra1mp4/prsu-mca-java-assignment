import myPack.Intro;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonDemo extends JFrame {
    private JTextField inputField;
    private JTextArea displayArea;

    public JButtonDemo() {
        Intro.print("JButton demonstration");

        setTitle("JTextField Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());

        JLabel inputLabel = new JLabel("Enter text:");
        inputPanel.add(inputLabel);

        inputField = new JTextField(15);
        inputPanel.add(inputField);

        JButton addButton = new JButton("Add");
        inputPanel.add(addButton);

        add(inputPanel, BorderLayout.NORTH);

        displayArea = new JTextArea();
        displayArea.setEditable(false);
        add(new JScrollPane(displayArea), BorderLayout.CENTER);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = inputField.getText();
                if (!text.isEmpty()) {
                    displayArea.append(text + "\n");
                    inputField.setText("");
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new JButtonDemo();
    }
}
