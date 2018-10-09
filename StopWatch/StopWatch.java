import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class StopWatch extends JFrame
 {
     JLabel la = new JLabel("00:00:00");
     JButton bt = new JButton("START");
     int h,m,s; 
     boolean start = true;
     public StopWatch()
     {
          setSize(300,300);
          setLocationRelativeTo(null);
          setLayout(new FlowLayout(FlowLayout.CENTER,100,50));
          la.setFont(new Font("Lucida calligraphy" , 1 , 25));
          add(la);
          add(bt);
          setVisible(true); 
          bt.addActionListener(new Listen()); 
      }
      class Listen implements ActionListener
      {
         public void actionPerformed(ActionEvent evt)
         {
            if(bt.getText().equals("START"))
            {
           	start = true;
                new NumberThread().start();
                bt.setText("STOP");
                return;
            }
            start=false;
            bt.setText("START");
       }
   }
   class NumberThread extends Thread
   {
       public void run()
       {
          while(start)
           {
                     la.setText((h<10?"0"+h:h)+":" +(m<10?"0"+m:m) +":"+(s<10?"0"+s:s));
                     try{
                            Thread.sleep(1000);
                         }catch (Exception ex){}
	    s++;
	    if(s==60)
	    {
		s=0;
		m++;
		if(m==60)
		{
		   m=0;
		   h++;
		}
	    }
           }
       }    
    }
    public static void main(String [] args)
    {
           new StopWatch();
    }
 }