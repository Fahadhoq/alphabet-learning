import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
	
public class ALPHABET extends JFrame implements MouseListener, ActionListener
{
	
	private ImageIcon imga, imgb,imgc,imgd,imge,imgf,imgg,imgh,imgi,imgj,imgk,imgl,imgm,imgn,imgo,imgp,imgq,imgr,imgs,imgt,imgu,imgv,imgw,imgx,imgy,imgz;
	private JButton back, exit, ia, ib, ic, id, ie, iff, ig, ih, ii, ij, ik, il, im, in, io, ip, iq, ir, is, it, iu, iv, iw, ix, iy, iz;
	private JPanel panel;
	private Clip clip ;
	public ALPHABET()
	{
		super("ALPHABETS");
		this.setSize(800,650);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setLayout(null);
		
		
		  back=new JButton("BACK");
		 back.setBounds(650,100,80,50);
		 back.setBackground(Color.yellow);
		 back.setFont(new Font("Footlight MT lIght",Font.BOLD,16));
		 back.addMouseListener(this);
		 back.addActionListener(this);
		 panel.add(back);
		 
		  exit=new JButton("EXIT");
		 exit.setBounds(650,180,80,50);
		 exit.setBackground(Color.yellow);
		 exit.setFont(new Font("Footlight MT lIght",Font.BOLD,16));
		 exit.addMouseListener(this);
		 exit.addActionListener(this);
		 panel.add(exit);
		
		
		
		 imga = new ImageIcon("Alphabet/"+"A.jpg");
		ia = new JButton(imga);
		ia.setBounds(1,1,115,115);
		ia.addActionListener(this);
		panel.add(ia);
		
		 imgb = new ImageIcon("Alphabet/"+"B.jpg");
		ib = new JButton(imgb);
		ib.setBounds(120,1,115,115);
		ib.addActionListener(this);
		panel.add(ib);
		
		 imgc = new ImageIcon("Alphabet/"+"C.jpg");
		ic = new JButton(imgc);
		ic.setBounds(240,1,115,115);
		ic.addActionListener(this);
		panel.add(ic);
		
		 imgd = new ImageIcon("Alphabet/"+"D.jpg");
		id = new JButton(imgd);
		id.setBounds(360,1,115,115);
		id.addActionListener(this);
		panel.add(id);
		
		 imge = new ImageIcon("Alphabet/"+"E.jpg");
		ie = new JButton(imge);
		ie.setBounds(480,1,115,115);
		ie.addActionListener(this);
		panel.add(ie);
		
		 imgf = new ImageIcon("Alphabet/"+"F.jpg");
		iff = new JButton(imgf);
		iff.setBounds(1,120,115,115);
		iff.addActionListener(this);
		panel.add(iff);
		
		 imgg = new ImageIcon("Alphabet/"+"G.jpg");
		ig = new JButton(imgg);
		ig.setBounds(120,120,115,115);
		ig.addActionListener(this);
		panel.add(ig);
		
		 imgh = new ImageIcon("Alphabet/"+"H.jpg");
		ih = new JButton(imgh);
		ih.setBounds(240,120,115,115);
		ih.addActionListener(this);
		panel.add(ih);
		
		 imgi = new ImageIcon("Alphabet/"+"I.jpg");
		ii = new JButton(imgi);
		ii.setBounds(360,120,115,115);
		ii.addActionListener(this);
		panel.add(ii);
		
		 imgj = new ImageIcon("Alphabet/"+"J.jpg");
		ij = new JButton(imgj);
		ij.setBounds(480,120,115,115);
		ij.addActionListener(this);
		panel.add(ij);
		
		 imgk = new ImageIcon("Alphabet/"+"K.jpg");
		ik = new JButton(imgk);
		ik.setBounds(1,240,115,115);
		ik.addActionListener(this);
		panel.add(ik);
		
		 imgl = new ImageIcon("Alphabet/"+"L.jpg");
		il = new JButton(imgl);
		il.setBounds(120,240,115,115);
		il.addActionListener(this);
		panel.add(il);
		
		 imgm = new ImageIcon("Alphabet/"+"M.jpg");
		im = new JButton(imgm);
		im.setBounds(240,240,115,115);
		im.addActionListener(this);
		panel.add(im);
		
		 imgn = new ImageIcon("Alphabet/"+"N.jpg");
		in = new JButton(imgn);
		in.setBounds(360,240,115,115);
		in.addActionListener(this);
		panel.add(in);
		
		 imgo = new ImageIcon("Alphabet/"+"O.jpg");
		io = new JButton(imgo);
		io.setBounds(480,240,115,115);
		io.addActionListener(this);
		panel.add(io);
		
		 imgp = new ImageIcon("Alphabet/"+"P.jpg");
		ip = new JButton(imgp);
		ip.setBounds(1,360,115,115);
		ip.addActionListener(this);
		panel.add(ip);
		
		 imgq = new ImageIcon("Alphabet/"+"Q.jpg");
		iq = new JButton(imgq);
		iq.setBounds(120,360,115,115);
		iq.addActionListener(this);
		panel.add(iq);
		
		 imgr = new ImageIcon("Alphabet/"+"R.jpg");
		ir = new JButton(imgr);
		ir.setBounds(240,360,115,115);
		ir.addActionListener(this);
		panel.add(ir);
		
		 imgs = new ImageIcon("Alphabet/"+"S.jpg");
		is = new JButton(imgs);
		is.setBounds(360,360,115,115);
		is.addActionListener(this);
		panel.add(is);
		
		 imgt = new ImageIcon("Alphabet/"+"T.jpg");
		it = new JButton(imgt);
		it.setBounds(480,360,115,115);
		it.addActionListener(this);
		panel.add(it);
		
		 imgu = new ImageIcon("Alphabet/"+"U.jpg");
		iu = new JButton(imgu);
		iu.setBounds(1,480,115,115);
		iu.addActionListener(this);
		panel.add(iu);
		
		 imgv = new ImageIcon("Alphabet/"+"V.jpg");
		iv = new JButton(imgv);
		iv.setBounds(120,480,115,115);
		iv.addActionListener(this);
		panel.add(iv);
		
		 imgw = new ImageIcon("Alphabet/"+"W.jpg");
		iw = new JButton(imgw);
		iw.setBounds(240,480,115,115);
		iw.addActionListener(this);
		panel.add(iw);
		
		 imgx = new ImageIcon("Alphabet/"+"X.jpg");
		ix = new JButton(imgx);
		ix.setBounds(360,480,115,115);
		ix.addActionListener(this);
		panel.add(ix);
		
		 imgy = new ImageIcon("Alphabet/"+"Y.jpg");
		iy = new JButton(imgy);
		iy.setBounds(480,480,115,115);
		iy.addActionListener(this);
		panel.add(iy);
		
		 imgz = new ImageIcon("Alphabet/"+"Z.jpg");
		iz = new JButton(imgz);
		iz.setBounds(600,480,115,115);
		iz.addActionListener(this);
		panel.add(iz);
		
		this.add(panel);
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
}

void readyClip(String clipName)
{
	try {
         // Open an audio input stream.
         URL url = this.getClass().getClassLoader().getResource(clipName);
         AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
         // Get a sound clip resource.
         clip = AudioSystem.getClip();
         // Open audio clip and load samples from the audio input stream.
         clip.open(audioIn);
         clip.start();
      } catch (UnsupportedAudioFileException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      } catch (LineUnavailableException e) {
         e.printStackTrace();
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
	 
		else{}
		
		if(a.getSource()==ia)
		{
			Words word=new Words(0,this);
			readyClip("Sound/A.wav");
			word.setVisible(true);
			this.setVisible(false);
		}
		else if(a.getSource()==ib)
		{
			Words word=new Words(1,this);
			readyClip("Sound/B.wav");
			word.setVisible(true);
			this.setVisible(false);
		}
			else if(a.getSource()==ic)
		{
			Words word=new Words(2,this);
			readyClip("Sound/C.wav");
			word.setVisible(true);
			this.setVisible(false);
		}
			else if(a.getSource()==id)
		{
			Words word=new Words(3,this);
			readyClip("Sound/D.wav");
			word.setVisible(true);
			this.setVisible(false);
		}
			else if(a.getSource()==ie)
		{
			Words word=new Words(4,this);
			readyClip("Sound/E.wav");
			word.setVisible(true);
			this.setVisible(false);
		}
			else if(a.getSource()==iff)
		{
			Words word=new Words(5,this);
			readyClip("Sound/F.wav");
			word.setVisible(true);
			this.setVisible(false);
		}
			else if(a.getSource()==ig)
		{
			Words word=new Words(6,this);
			readyClip("Sound/G.wav");
			word.setVisible(true);
			this.setVisible(false);
		}
			else if(a.getSource()==ih)
		{
			Words word=new Words(7,this);
			readyClip("Sound/H.wav");
			word.setVisible(true);
			this.setVisible(false);
		}
			else if(a.getSource()==ii)
		{
			Words word=new Words(8,this);
			readyClip("Sound/I.wav");
			word.setVisible(true);
			this.setVisible(false);
		}
			else if(a.getSource()==ij)
		{
			Words word=new Words(9,this);
			readyClip("Sound/J.wav");
			word.setVisible(true);
			this.setVisible(false);
		}
			else if(a.getSource()==ik)
		{
			Words word=new Words(10,this);
			readyClip("Sound/K.wav");
			word.setVisible(true);
			this.setVisible(false);
		}
			else if(a.getSource()==il)
		{
			Words word=new Words(11,this);
			readyClip("Sound/L.wav");
			word.setVisible(true);
			this.setVisible(false);
		}
			else if(a.getSource()==im)
		{
			Words word=new Words(12,this);
			readyClip("Sound/M.wav");
			word.setVisible(true);
			this.setVisible(false);
		}
			else if(a.getSource()==in)
		{
			Words word=new Words(13,this);
			readyClip("Sound/N.wav");
			word.setVisible(true);
			this.setVisible(false);
		}
			else if(a.getSource()==io)
		{
			Words word=new Words(14,this);
			readyClip("Sound/O.wav");
			word.setVisible(true);
			this.setVisible(false);
		}
			else if(a.getSource()==ip)
		{
			Words word=new Words(15,this);
			readyClip("Sound/P.wav");
			word.setVisible(true);
			this.setVisible(false);
		}
			else if(a.getSource()==iq)
		{
			Words word=new Words(16,this);
			readyClip("Sound/Q.wav");
			word.setVisible(true);
			this.setVisible(false);
		}
			else if(a.getSource()==ir)
		{
			Words word=new Words(17,this);
			readyClip("Sound/R.wav");
			word.setVisible(true);
			this.setVisible(false);
		}
			else if(a.getSource()==is)
		{
			Words word=new Words(18,this);
			readyClip("Sound/S.wav");
			word.setVisible(true);
			this.setVisible(false);
		}
			else if(a.getSource()==it)
		{
			Words word=new Words(19,this);
			readyClip("Sound/T.wav");
			word.setVisible(true);
			this.setVisible(false);
		}
			else if(a.getSource()==iu)
		{
			Words word=new Words(20,this);
			readyClip("Sound/U.wav");
			word.setVisible(true);
			this.setVisible(false);
		}
			else if(a.getSource()==iv)
		{
			Words word=new Words(21,this);
			readyClip("Sound/V.wav");
			word.setVisible(true);
			this.setVisible(false);
		}
			else if(a.getSource()==iw)
		{
			Words word=new Words(22,this);
			readyClip("Sound/W.wav");
			word.setVisible(true);
			this.setVisible(false);
		}
			else if(a.getSource()==ix)
		{
			Words word=new Words(23,this);
			readyClip("Sound/X.wav");
			word.setVisible(true);
			this.setVisible(false);
		}
			else if(a.getSource()==iy)
		{
			Words word=new Words(24,this);
			readyClip("Sound/Y.wav");
			word.setVisible(true);
			this.setVisible(false);
		}
			else if(a.getSource()==iz)
		{
			Words word=new Words(25,this);
			readyClip("Sound/z.wav");
			word.setVisible(true);
			this.setVisible(false);
		}
	}

}






