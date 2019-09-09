import java.util.Random;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class IqTest1  extends JFrame implements ActionListener
{
	JButton back;
	JLabel [] alphabets;
	JLabel result;
	JTextField  inputField;
	JButton submitButton;
	JButton playAgain;
	JPanel panel;
	int randomLoc;
	int randmLetter;	
	
	public IqTest1()
	{
		
		
		 super("IQ TEST 1");
		this.setSize(800,650);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setLayout(null);
		
		
		//Lavel
		
		alphabets= new JLabel [4];
		
		result=new JLabel();
		result.setFont(new Font("Footlight MT lIght",Font.BOLD,40));
		result.setBounds(150,100,450,50);
		panel.add(result);
		
		//alphabet objects
		int x=150;
		for(int i=0;i<4;i++)
		{
			alphabets[i]=new JLabel();
			alphabets[i].setBounds(x+(i*80),200,60,60); 	
			panel.add(alphabets[i]);			
		}
		generateRandomAlphabet();
		
		
		//input field setup	
		inputField=new JTextField();
		inputField.setBounds(200,300,200,30);
		panel.add(inputField);
	
		//button
	
		//submit button
		submitButton = new JButton("Submit");
		submitButton.setBounds(200,350,100,45);
		submitButton.addActionListener(this);
		panel.add(submitButton);
	
		//playagain button
		playAgain = new JButton("Play Again");
		playAgain.setBounds(320,350,100,45);
		playAgain.addActionListener(this);
		panel.add(playAgain);
		
		//back button
		back = new JButton("BACK");
		back.setBounds(320,450,100,45);
		back.addActionListener(this);
		panel.add(back);
	
	
        this.add(panel);
}


private void generateRandomAlphabet()
{
		//random numbers generatiog
		Random r = new Random();
		randmLetter = r.nextInt(22);
		randomLoc=r.nextInt(4);
		
		
		for(int i=0;i<4;i++)
		{
			if(randomLoc==i)
			{
				alphabets[i].setIcon(null);
				alphabets[i].setText("______");			
			}
			else
			{	
				char c = (char)(randmLetter + 65+i);
				String imageName="Alphabet/"+String.valueOf(c)+".jpg";
				ImageIcon img=new ImageIcon(((new ImageIcon(imageName)).getImage()).getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH));
				alphabets[i].setIcon(img);
				
			}			
		}
		
}

private void matchAnswer(String answer)
{
	char c = (char)(randomLoc+randmLetter+65);
	String realAnswer=String.valueOf(c);

	if(answer.equals(realAnswer))
	{
		result.setText("CORRECT ANSWER");
	}
	else{
		result.setText("WRONG ANSWER");
	}
}



public void actionPerformed(ActionEvent e)
{
	
	if (e.getSource()==submitButton)
		{
		String text = inputField.getText();
		matchAnswer(text.toUpperCase());
		inputField.setText(text);
	}
	else if(e.getSource()==playAgain)
	{
		result.setText("");
		inputField.setText("");
		generateRandomAlphabet();

	}
	else if(e.getSource()==back)
	{
		GAME d=new GAME();
		d.setVisible(true);
		this.setVisible(false);
	}
}
}