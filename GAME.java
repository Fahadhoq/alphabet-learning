import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GAME extends JFrame implements MouseListener, ActionListener
{
	private JLabel  imgLabel,Title;
	private ImageIcon image;
	private JButton IqTest1, IqTest2, back, exit;
	private JPanel Panel;
	
	public GAME()
	{
		super("GAME");
		this.setSize(800,650);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Panel=new JPanel();
		Panel.setLayout(null);
		
		
		Title=new JLabel("GAME");
		Title.setBounds(290,10,200,50);
		Title.setBackground(Color.yellow);
		Title.setOpaque(true);
		Title.setFont(new Font("Footlight MT lIght",Font.BOLD,55));
		Panel.add(Title);
		
		 IqTest1=new JButton("IQ  TEST 1");
		 IqTest1.setBounds(250,270,300,80);
		 IqTest1.setBackground(Color.yellow);
		 IqTest1.setFont(new Font("Footlight MT lIght",Font.BOLD,40));
		 IqTest1.addMouseListener(this);
		 IqTest1.addActionListener(this);
		 Panel.add(IqTest1);
		 
		 
		 IqTest2=new JButton("IQ  TEST 2");
		 IqTest2.setBounds(250,370,300,80);
		 IqTest2.setBackground(Color.yellow);
		 IqTest2.setFont(new Font("Footlight MT lIght",Font.BOLD,40));
		 IqTest2.addMouseListener(this);
		 IqTest2.addActionListener(this);
		 Panel.add(IqTest2);
		 
		
		  back=new JButton("BACK");
		 back.setBounds(310,480,80,50);
		 back.setBackground(Color.yellow);
		 back.setFont(new Font("Footlight MT lIght",Font.BOLD,16));
		 back.addMouseListener(this);
		 back.addActionListener(this);
		 Panel.add(back);
		 
		  exit=new JButton("EXIT");
		 exit.setBounds(410,480,80,50);
		 exit.setBackground(Color.yellow);
		 exit.setFont(new Font("Footlight MT lIght",Font.BOLD,16));
		 exit.addMouseListener(this);
		 exit.addActionListener(this);
		 Panel.add(exit);
		 
		 
		 image = new ImageIcon("game.PNG");
		imgLabel = new JLabel(image);
		imgLabel.setBounds(0,0,800,650);
		Panel.add(imgLabel);
		 
		
		 
		this.add(Panel);
		
	}
	
	
	
	
	
		public void mouseClicked(MouseEvent m){}
	public void mousePressed(MouseEvent m){}
	public void mouseReleased(MouseEvent m){}
	public void mouseEntered(MouseEvent m)
	{
		JButton b = (JButton) m.getComponent();
		if(b==back)
		{
			back.setBackground(Color.pink);
			
		}
		else if(b== exit)
		{
		
			exit.setBackground(Color.red);
		}
			else if(b== IqTest1)
		{
		
			IqTest1.setBackground(Color.pink);
		}
			else if(b== IqTest2)
		{
		
			IqTest2.setBackground(Color.pink);
		}
		
	}
	
	public void mouseExited(MouseEvent m)
	{
		JButton b = (JButton) m.getComponent();
		if(b==exit)
		{
			exit.setBackground(Color.yellow);
			
		}
		else if(b==back)
		{
			 back.setBackground(Color.yellow);
		
		}
				else if(b== IqTest1)
		{
		
			IqTest1.setBackground(Color.yellow);
		}
			else if(b== IqTest2)
		{
		
			IqTest2.setBackground(Color.yellow);
		}
		
	}
	
	
		
		public void actionPerformed(ActionEvent a)
	{
			String m = a.getActionCommand();
		
		if(m.equals("BACK"))
		{
		     GUI k=new  GUI();
			k.setVisible(true);
			this.setVisible(false);
		}
		else if(m.equals("EXIT"))
		{

			System.exit(0);
		}
		else if(m.equals("IQ  TEST 1"))
		{

			IqTest1 w=new IqTest1();
			w.setVisible(true);
			this.setVisible(false);
		}
			else if(m.equals("IQ  TEST 2"))
		{

			IqTest2 x=new IqTest2();
			x.setVisible(true);
			this.setVisible(false);
		}
		
		else{}
	}
	
	
}
	
	
	