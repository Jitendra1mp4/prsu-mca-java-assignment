import myPack.Intro;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JComboBoxDemo extends JFrame {
    private JTextArea displayArea;
    private JComboBox<String> comboBox ;
    public JComboBoxDemo() {
        Intro.print("JComboBox");

        setTitle("JComboBox Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());

        String[] comboBoxItems ={"Item 1", "Item 2", "Item 3"};
        comboBox = new JComboBox<> (comboBoxItems);
        inputPanel.add(comboBox);

        add(inputPanel, BorderLayout.NORTH);

        displayArea = new JTextArea();
        displayArea.setEditable(false);
        add(new JScrollPane(displayArea), BorderLayout.CENTER);

        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayArea.append("ComboBox: " + comboBox.getSelectedItem() + "\n");
            }
        });

        setVisible(true);
    }
    public static void main(String[] args) {
        new JComboBoxDemo();
    }
}
