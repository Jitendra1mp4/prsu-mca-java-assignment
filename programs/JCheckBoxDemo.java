import myPack.Intro;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JCheckBoxDemo extends JFrame {
    private JTextArea displayArea;
    private JCheckBox checkBox;

    public JCheckBoxDemo() {
        Intro.print("JCheckBox");
        setTitle("JCheckBox Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());

        checkBox = new JCheckBox("Check me");
        inputPanel.add(checkBox);

        add(inputPanel, BorderLayout.NORTH);

        displayArea = new JTextArea();
        displayArea.setEditable(false);
        add(new JScrollPane(displayArea), BorderLayout.CENTER);

        checkBox.addActionListener(new ActionListener(){
            @Override 
            public void actionPerformed(ActionEvent e){
                if (checkBox.isSelected()) displayArea.append("Checkbox : checked\n") ;
                else displayArea.append("checkbox : unchecked\n") ;
            }
        }) ;

        setVisible(true);
    }

    public static void main(String[] args) {
        new JCheckBoxDemo();
    }
}
