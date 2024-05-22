import myPack.Intro;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class LinkedListGUI extends JFrame {
    private LinkedList<String> linkedList = new LinkedList<>();
    private JTextField inputField;
    private JTextArea displayArea;
    private JButton addButton = new JButton("Add");

    public LinkedListGUI() {
        new Intro("LinkedList Class & JTextField");

        // Setting up the JFrame
        setTitle("LinkedList Demo with JTextField");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inputField = new JTextField(15);
        addButton = new JButton("Add");
        displayArea = new JTextArea("");

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String element = inputField.getText();
                if (!element.isEmpty()) {
                    linkedList.add(element);
                    inputField.setText("");
                    displayArea.append(element + "\n");
                }
            }
        });

        this.add(inputField);
        this.add(addButton);
        this.add(displayArea);
        setLayout(new FlowLayout());

        setVisible(true);
    }

    public static void main(String args[]) {
        new LinkedListGUI();
    }
}
