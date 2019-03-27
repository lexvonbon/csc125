package chapter11;
 
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Write a description of class FrameViewer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FrameViewer {
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setSize(300, 400);
    frame.setTitle("A container frame");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.add(panelMaker());
  }
  public static JPanel panelMaker() {
    JPanel panel = new JPanel();
    JButton button = new JButton("Click me!");
    JLabel label = new JLabel("Hello, World!");
    ActionListener listener = new ClickListner();
    button.addActionListener(listener);
    panel.add(button);
    panel.add(label);
    return panel;
  }
}
