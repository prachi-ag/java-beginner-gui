import java.awt.*;
import java.awt.event.*;

class notepad extends Frame implements WindowListener,ActionListener{
	String use;
	MenuBar mb;
	TextArea ta1;
	
	Menu m1;
	Menu m2;
	Menu m3;
	Menu m4;
	Menu m5;
	
	MenuItem m11;
	MenuItem m12;
	MenuItem m13;
	MenuItem m14;
	MenuItem m15;
	MenuItem m16;
	MenuItem m17;
	
	MenuItem m21;
	MenuItem m22;
	MenuItem m23;
	MenuItem m24;
	MenuItem m25;
	MenuItem m26;
	MenuItem m27;
	MenuItem m28;
	MenuItem m29;
	MenuItem m210;
	MenuItem m211;
	
	MenuItem m31;
	MenuItem m32;
	
	MenuItem m41;
	
	MenuItem m51;
	MenuItem m52;
	
	
	notepad(){
		mb = new MenuBar();
		ta1=new TextArea();
		
		m1=new Menu("File");
		m2=new Menu("Edit");
		m3=new Menu("Format");
		m4=new Menu("View");
		m5=new Menu("Help");
		
		m11=new MenuItem("New");
		m12=new MenuItem("Open");
		m13=new MenuItem("Save");
		m14=new MenuItem("Save As");
		m15=new MenuItem("Print Setup");
		m16=new MenuItem("Print");
		m17=new MenuItem("Exit");
		
		m21= new MenuItem("Undo");
		m22= new MenuItem("Cut");
		m23= new MenuItem("Copy");
		m24= new MenuItem("Paste");
		m25= new MenuItem("Delete");
		m26= new MenuItem("Find");
		m27= new MenuItem("Find Next");
		m28= new MenuItem("Replace");
		m29= new MenuItem("Go to");
		m210= new MenuItem("Select All");
		m211= new MenuItem("Time/Date");
		
		m31= new MenuItem("Word Wrap");
		m32= new MenuItem("Font");
		
		m41= new MenuItem("Status Bar");
		
		m51= new MenuItem("View Help");
		m52= new MenuItem("About Notepad");
		
		m1.add(m11);
		m1.add(m12);
		m1.add(m13);
		m1.add(m14);
		m1.add(m15);
		m1.add(m16);
		m1.add(m17);
		
		m2.add(m21);
		m2.add(m22);
		m2.add(m23);
		m2.add(m24);
		m2.add(m25);
		m2.add(m26);
		m2.add(m27);
		m2.add(m28);
		m2.add(m29);
		m2.add(m210);
		m2.add(m211);
		
		m3.add(m31);
		m3.add(m32);
		
		m4.add(m41);
		
		m5.add(m51);
		m5.add(m52);
		
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		mb.add(m4);
		mb.add(m5);
		add(ta1, BorderLayout.CENTER);
		
		ta1.setFont(new Font("Century Gothic", Font.BOLD, 12));
		setMenuBar(mb);
		addWindowListener(this);
		m22.addActionListener(this);
		m25.addActionListener(this);
		m23.addActionListener(this);
		m24.addActionListener(this);
		m210.addActionListener(this);
		
		
	}
	
	public static void main(String s[]){
		notepad note = new notepad();
		note.setSize(600,600);
		note.setTitle("Untitled-Notepad");
		note.setVisible(true);
		// note.setLayout(new BorderLayout());
		
		
		
	}
	public void actionPerformed(ActionEvent e) {  
		if(e.getSource()==m25){
			String s=ta1.getSelectedText();
			String s1=ta1.getText().replace(s,"");
			ta1.setText(s1);
			ta1.setCaretPosition(ta1.getText().length());
		}
		if(e.getSource()==m22){
			int x = ta1.getCaretPosition();
			System.out.print(x);
			use = ta1.getSelectedText();
			String s=ta1.getSelectedText();
			String s1=ta1.getText().replace(s,"");
			ta1.setText(s1);
			ta1.setCaretPosition(x);
		}
		if(e.getSource()==m23){
			use = ta1.getSelectedText();
		}
		if(e.getSource()==m24){
			int x = ta1.getCaretPosition();
			String s = ta1.getSelectedText();
			if(!s.equals(""))
			{
				//System.out.print("Empty");
				String salText=ta1.getText();
				String s1=salText.replace(s,use);
				ta1.setText(s1);
				ta1.setCaretPosition(use.length()+x);	
			}
			else
			{
				String st=ta1.getText();
				StringBuffer salText=new StringBuffer(st);
				String s1=salText.insert(x,use).toString();
				ta1.setText(s1);
				ta1.setCaretPosition(use.length()+x);	
			}
		}
	}
	
	
	public void windowActivated(WindowEvent e) {   

	}  
	
	public void windowClosed(WindowEvent e) {  
	
	}  
	
	public void windowClosing(WindowEvent e) {  
			System.exit(0);
	}  
	public void windowDeactivated(WindowEvent e) {  

	}  
	public void windowDeiconified(WindowEvent e) {  

	}  
	public void windowIconified(WindowEvent e) {  

	}  
	public void windowOpened(WindowEvent e) {  

	}  
}  
