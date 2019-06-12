import java.awt.*;
import java.awt.event.*;
import java.time.*;
import javax.swing.*;
import javax.swing.Timer;


public class TimeTester
{
   public static void main (String[] args) {
      JFrame frame = new JFrame();
      
      final int FIELD_WIDTH = 20;
      final JTextField textField = new JTextField(FIELD_WIDTH);
      
      frame.setLayout(new FlowLayout());
      frame.add(textField);
      
      ActionListener listener = event -> textField.setText(Instant.now().toString());
      
      final int DELAY = 1000;
      
      Timer t = new Timer (DELAY, listener);
      
      t.start();
      
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);
      
      
   }
}
