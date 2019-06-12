import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class AnimationTester
{
   
   private static final int ICON_WIDTH = 400, ICON_HEIGHT = 100, CAR_WIDTH = 100;
   
   
   
   public static void main (String[] args) {
      JFrame frame = new JFrame();
      
      final MoveableShape shape = new CarShape (0, 0, CAR_WIDTH);
      
      ShapeIcon icon = new ShapeIcon (shape, ICON_WIDTH, ICON_HEIGHT);
      
      final JLabel label = new JLabel (icon);
      frame.setLayout(new FlowLayout());
      frame.add(label);
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);
      
      final int DELAY = 100;
      
      Timer t = new Timer (DELAY, event -> {
                                                shape.move();
                                                label.repaint();
                                            });
      t.start();
   }
}
