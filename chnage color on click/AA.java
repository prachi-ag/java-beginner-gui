import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class AA extends JFrame
  {
        Button b1 = new Button("Red Button");
        Button b2 = new Button("Green Button");

    public AA()
      {
         setSize(300,350);
         setLocationRelativeTo(null);
         setLayout(new FlowLayout());
         add(b1);
         add(b2);
         ColorListener bc = new ColorListener();
         b1.addActionListener(bc);
         b2.addActionListener(bc);
         setVisible(true);
      }

   class ColorListener implements ActionListener
      {
           public void actionPerformed(ActionEvent evt)
             {
                  if(evt.getSource() == b1)
	       getContentPane().setBackground(Color.red);
                 else if(evt.getSource() == b2)
                       getContentPane().setBackground(Color.green);
             }
      }


  public static void main(String args [])
     {
          new AA();
     }

  }