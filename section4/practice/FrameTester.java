
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * FrameTester
 */
public class FrameTester {
  public static JFrame frame;
  public static JTextField name;
  public static JPanel mainPanel;
  public static JTextField depositAmount;

  public static void main(String[] args) {
    frame = new JFrame();
    frame.setSize(400, 600);

    frame.setTitle("Bank Stuff");
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.add(panelMaker());
    frame.setVisible(true);
  }

  public static JPanel panelMaker() {
    JPanel panel = new JPanel();

    JLabel label1 = new JLabel("Name: ");
    name = new JTextField(16);
    
    JLabel label2 = new JLabel("Deposit Amount: ");
    depositAmount = new JTextField(16);

    panel.add(label1);
    panel.add(name);
    panel.add(label2);
    panel.add(depositAmount);
    
    JButton button = new JButton("Submit");

    button.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e) {
        String value = e.getActionCommand();
        if (value.equalsIgnoreCase("Submit")) {
          System.out.println("Submited");
          System.out.println("Deposited $"+Double.parseDouble(depositAmount.getText()));
        }
      }
    });
    panel.add(button);

    return(panel);
  }
}