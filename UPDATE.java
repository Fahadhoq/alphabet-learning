import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class UPDATE extends JFrame implements ActionListener
{
	
	private JLabel Label1, Label2;
	private JButton  SbButton,DeButton;
	private JTextField TF1,TF2;
	private JPanel panel;
	
	
	public UPDATE()
	{
		super("UPDATE LETTER");
		this.setSize(800,650);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setLayout(null);
		
		
		SbButton = new JButton("SUBMIT");
		SbButton.setBounds(300,300,210,50);
		SbButton.setFont(new Font("Footlight MT lIght",Font.BOLD,16));
		SbButton.addActionListener(this);
		panel.add(SbButton);
		
		DeButton = new JButton("BACK");
		DeButton.setBounds(300,400,210,50);
		DeButton.setFont(new Font("Footlight MT lIght",Font.BOLD,16));
		DeButton.addActionListener(this);
		panel.add(DeButton);
		
		Label1 = new JLabel("PREVIOUS WORD");
		Label1.setBounds(80,50,150,50);
		Label1.setFont(new Font("Footlight MT lIght",Font.BOLD,16));
		//SbButton.addActionListener(this);
		panel.add(Label1);
		
		Label2 = new JLabel("NEW WORD");
		Label2.setBounds(150,150,100,50);
		Label2.setFont(new Font("Footlight MT lIght",Font.BOLD,16));
		//SbButton.addActionListener(this);
		panel.add(Label2);
		
		TF1 = new JTextField();
		TF1.setBounds(300,50,210,50);
		TF1.setFont(new Font("Footlight MT lIght",Font.BOLD,16));
		//SbButton.addActionListener(this);
		panel.add(TF1);
		
		TF2 = new JTextField();
		TF2.setBounds(300,150,210,50);
		TF2.setFont(new Font("Footlight MT lIght",Font.BOLD,16));
		//SbButton.addActionListener(this);
		panel.add(TF2);
		
		
		this.add(panel);
	}
	
		public void actionPerformed(ActionEvent ae)
	{
		String buttonClicked = ae.getActionCommand();
		
	    if(buttonClicked.equals(SbButton.getText()))
		{
			updateFromDB();
		}
		else if (ae.getSource()==DeButton) {
		
		DICTIONARY f = new DICTIONARY();
		f.setVisible(true);
		this.setVisible(false);	
	}
	}
		public void updateFromDB()
	{
		String query = "UPDATE `alphabet` SET  word = '"+TF2.getText()+"' WHERE word= '"+TF1.getText()+"';";
		System.out.println(query);
        try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/alphabet_leraning", "root", "");
			Statement stm = con.createStatement();
			stm.execute(query);
			stm.close();
			con.close();
					
		}
        catch(Exception ex)
		{
			System.out.println("Exception : " +ex.getMessage());
        }
    }
	
}