import myPack.Intro;
import javax.swing.*;
import java.awt.*;

public class JListDemo extends JFrame {
    private JTextArea displayArea;
    private JList<String> list;

    public JListDemo() {
        Intro.print("JList");

        setTitle("JList Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());

        String[] listItems = {"Item A", "Item B", "Item C"};
        list = new JList<>(listItems);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane listScrollPane = new JScrollPane(list);
         listScrollPane.setPreferredSize(new Dimension(100, 60));
        inputPanel.add(listScrollPane);
        add(inputPanel, BorderLayout.NORTH);

        displayArea = new JTextArea();
        displayArea.setEditable(false);
        add(new JScrollPane(displayArea), BorderLayout.CENTER);

        list.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                displayArea.append("List: " + list.getSelectedValue() + "\n");
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new JListDemo();
    }
}
