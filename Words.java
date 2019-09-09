
import java.lang.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Words extends JFrame implements ActionListener
{
	
	 ALPHABET previous;
	 JButton back;
	 JPanel panel;
	
 	public Words(int recieve,ALPHABET p)
	{
 
		
		super("word");
		this.setSize(800,650);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setLayout(null);
		
			//pointing previous frane
		previous=p;
		
		
			//preparing Image
		char tempa=(char)(65+recieve);
		String imageName="Words/"+String.valueOf(tempa)+".jpg";
		ImageIcon img=new ImageIcon(((new ImageIcon(imageName)).getImage()).getScaledInstance(600,600, java.awt.Image.SCALE_SMOOTH));
		JLabel image=new JLabel(img);
		image.setBounds(0,0,700,650);
		panel.add(image);
		
		
		//back button
		back = new JButton("Back");
		back.addActionListener(this);
		back.setBounds(700,500,100,50);
		panel.add(back);
		

	
		
		
		this.add(panel);
	}
	
public void actionPerformed(ActionEvent e){
	
	if(e.getSource()==back)
	{
		previous.setVisible(true);
		this.dispose();
	}
}

}