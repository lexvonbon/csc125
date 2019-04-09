package chapter12;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * ClickListener class to perform an button press action
 *
 * @BGronneberg
 * @12-10-2018
 */
public class ClickListener implements ActionListener
{
   public void actionPerformed(ActionEvent event)
   {
      
       System.out.println("I am clicked!");
    }
   
}
