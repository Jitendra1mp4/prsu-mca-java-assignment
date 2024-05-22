import myPack.Intro;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class SwingComponentsDemo extends JFrame {
    private LinkedList<String> linkedList = new LinkedList<>();
    private JTextField inputField;
    private JTextArea displayArea;
    private JToggleButton toggleButton;
    private JCheckBox checkBox;
    private JRadioButton radioButton;
    private JComboBox<String> comboBox;
    private JList<String> list;

    public SwingComponentsDemo() {
        Intro.print("Swing Components & LinkedList");

        // Setting up the JFrame
        setTitle("Swing Components Demo with LinkedList");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Input panel
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(2, 1));

        JPanel topPanel = new JPanel(new FlowLayout());
        JLabel inputLabel = new JLabel("Enter element:");
        topPanel.add(inputLabel);

        inputField = new JTextField(15);
        topPanel.add(inputField);

        JButton addButton = new JButton("Add");
        topPanel.add(addButton);

        inputPanel.add(topPanel);

        JPanel middlePanel = new JPanel(new FlowLayout());
        
        toggleButton = new JToggleButton("Toggle");
        middlePanel.add(toggleButton);

        checkBox = new JCheckBox("CheckBox");
        middlePanel.add(checkBox);

        radioButton = new JRadioButton("RadioButton");
        middlePanel.add(radioButton);

        String[] comboBoxItems = {"Item 1", "Item 2", "Item 3"};
        comboBox = new JComboBox<>(comboBoxItems);
        middlePanel.add(comboBox);

        String[] listItems = {"Item A", "Item B", "Item C"};
        list = new JList<>(listItems);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane listScrollPane = new JScrollPane(list);
        listScrollPane.setPreferredSize(new Dimension(100, 60));
        middlePanel.add(listScrollPane);

        inputPanel.add(middlePanel);

        add(inputPanel, BorderLayout.NORTH);

        // Display area
        displayArea = new JTextArea();
        displayArea.setEditable(false);
        add(new JScrollPane(displayArea), BorderLayout.CENTER);

        // Add button action listener
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String element = inputField.getText();
                if (!element.isEmpty()) {
                    linkedList.add(element);
                    inputField.setText("");
                    updateDisplay();
                }
            }
        });

        // Additional components action listeners
        toggleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                linkedList.add("Toggle: " + (toggleButton.isSelected() ? "On" : "Off"));
                updateDisplay();
            }
        });

        checkBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                linkedList.add("CheckBox: " + (checkBox.isSelected() ? "Checked" : "Unchecked"));
                updateDisplay();
            }
        });

        radioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                linkedList.add("RadioButton: " + (radioButton.isSelected() ? "Selected" : "Deselected"));
                updateDisplay();
            }
        });

        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                linkedList.add("ComboBox: " + comboBox.getSelectedItem());
                updateDisplay();
            }
        });

        list.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                linkedList.add("List: " + list.getSelectedValue());
                updateDisplay();
            }
        });

        setVisible(true);
    }

    private void updateDisplay() {
        displayArea.setText("");
        for (String element : linkedList) {
            displayArea.append(element + "\n");
        }
    }

    public static void main(String[] args) {
        new SwingComponentsDemo();
    }
}
