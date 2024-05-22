import myPack.Intro;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardEventDemo extends JFrame implements KeyListener {
    private JTextArea textArea;

    public KeyboardEventDemo() {
        Intro.print("Keyboard Event");

        textArea = new JTextArea();
        textArea.addKeyListener(this);

        add(new JScrollPane(textArea));
        setTitle("Keyboard Event Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        textArea.append("Key Typed: " + e.getKeyChar() + "\n");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        textArea.append("Key Pressed: " + e.getKeyChar() + "\n");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        textArea.append("Key Released: " + e.getKeyChar() + "\n");
    }

    public static void main(String[] args) {
        new KeyboardEventDemo();
    }
}
