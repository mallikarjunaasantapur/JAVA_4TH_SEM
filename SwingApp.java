package swings;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class A extends JFrame implements ActionListener {
	JLabel l1,l2,l3 ;
	JTextField tf1,tf2,tf3 ;
	JButton b1 ;
	A()
	{
		setLayout(new FlowLayout()) ;
		setSize(500,200) ;
		l1 = new JLabel("Enter the Number1") ;
		add(l1) ;
		tf1 = new JTextField(10) ;
		add(tf1) ;
		l2 = new JLabel("Enter Number2") ;
		add(l2) ;
		tf2 = new JTextField(10) ;
		add(tf2) ;
		l3 = new JLabel("Result") ;
		add(l3) ;
		tf3 = new JTextField(10) ;
		add(tf3) ;
		b1 = new JButton("Divide") ;
		add(b1) ;
		b1.addActionListener(this);
		setVisible(true) ;
		
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
			int a = Integer.parseInt(tf1.getText()) ;
			int b = integer.prseInt(tf2.getText()) ;
			if (b==0)
					throw newArithmeticException("Divide by zero error") ;
			float c= (float)a/b ;
			tf3.setText(String.valueOf(c));
		}
		catch (NumberFormatException ex)
		{
			JoptionPane.showMessageDialog(this,ex.getMessage()) ;
		}	
		
	}
}

public class SwingApp
{
	public static void main(String[] args)
	{
		A a = new A() ;
	}
}
