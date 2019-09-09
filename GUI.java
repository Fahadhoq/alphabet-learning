import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame implements MouseListener, ActionListener
{
	
	private JLabel imgLabel;
	private JButton GameButton, DictionaryButton, AlphabetButton;
	private ImageIcon image;
	private JPanel panel;
	
	
	public GUI()
	{
		super("ALPHABET LERANING");
		this.setSize(800,650);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setLayout(null);
		
		
		AlphabetButton = new JButton("ALPHABET  LERANING");
		AlphabetButton.setBounds(300,300,210,50);
		AlphabetButton.setFont(new Font("Footlight MT lIght",Font.BOLD,16));
		AlphabetButton.setBackground(Color.yellow);
		AlphabetButton.addMouseListener(this);
		AlphabetButton.addActionListener(this);
		panel.add(AlphabetButton);
		
		GameButton = new JButton("GAME");
		GameButton.setBounds(300,400,200,50);
		GameButton.setFont(new Font("Footlight MT lIght",Font.BOLD,40));
		GameButton.setBackground(Color.yellow);
		GameButton.addMouseListener(this);
		GameButton.addActionListener(this);
		panel.add(GameButton);
	    
		DictionaryButton = new JButton("DICTIONARY");
		DictionaryButton.setBounds(300,500,200,50);
		DictionaryButton.setFont(new Font("Footlight MT lIght",Font.BOLD,25));
		DictionaryButton.setBackground(Color.yellow);
		DictionaryButton.addMouseListener(this);
		DictionaryButton.addActionListener(this);
		panel.add(DictionaryButton);
		
		image = new ImageIcon("image.PNG");
		imgLabel = new JLabel(image);
		imgLabel.setBounds(0,0,800,650);
		panel.add(imgLabel);
		
		this.add(panel);
	}










	public void mouseClicked(MouseEvent m){}
	public void mousePressed(MouseEvent m){}
	public void mouseReleased(MouseEvent m){}
	public void mouseEntered(MouseEvent m)
	{
		JButton b = (JButton) m.getComponent();
		if(b==GameButton)
		{
			GameButton.setBackground(Color.pink);
			
		}
		else if(b== DictionaryButton)
		{
		
			DictionaryButton.setBackground(Color.pink);
		}
		else if(b== AlphabetButton)
		{
		
			AlphabetButton.setBackground(Color.pink);
		}
	}
	
	public void mouseExited(MouseEvent m)
	{
		JButton b = (JButton) m.getComponent();
		if(b==DictionaryButton)
		{
			DictionaryButton.setBackground(Color.yellow);
			
		}
		else if(b== GameButton)
		{
			 GameButton.setBackground(Color.yellow);
		
		}
		else if(b== AlphabetButton)
		{
			AlphabetButton.setBackground(Color.yellow);
		
		}
	}
	
	
	
	
		public void actionPerformed(ActionEvent a)
	{
			String m = a.getActionCommand();
		
		if(m.equals("GAME"))
		{
		     GAME g=new  GAME();
			g.setVisible(true);
			this.setVisible(false);
		}
		else if(m.equals("ALPHABET  LERANING"))
		{

			ALPHABET q=new  ALPHABET();
			q.setVisible(true);
			this.setVisible(false);
		}
	    else if(m.equals("DICTIONARY"))
		{

			DICTIONARY c=new  DICTIONARY();
			c.setVisible(true);
			this.setVisible(false);
		}
		
		else{}
	}
	
	
}





	
	

	
	
	