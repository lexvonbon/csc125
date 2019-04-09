package chapter12;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * FrameViewer class to contain a panel
 *
 * @BGronneberg
 * @12-10-2018
 */
public class FrameViewer
{
    public static void main(String[] args)
    {
      JFrame frame = new JFrame();
      
      frame.setSize(300,400);
      frame.setTitle("Container Frame");
      
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      
      frame.add(panelMaker());
    }
    
    public static JPanel panelMaker()
    {
      JPanel panel = new JPanel();
      
      JButton button = new JButton("Click me");
      
      JLabel label = new JLabel("Hello World!");
      
      buttonClicked(button);
      
      panel.add(label);
      panel.add(button);
            
      return panel;
    
    }
    
    public static void buttonClicked(JButton button)
    {
      
        ActionListener listener = new ClickListener();
        
        button.addActionListener(listener);        
    
    }
    
    
}
