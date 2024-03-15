package questions;

import java.awt.*;
import javax.swing.*;

public class Guessing 
{
	JFrame frame;
	
	Guessing()
	{
		frame = new JFrame("Guessing Game");
		
		frame.setVisible(true);
		frame.setSize(400,400);
		frame.setLayout(new GridLayout(3,3,20,25));
		
		
	}

	public static void main(String[] args)
	{
		new Guessing();

	}

}
