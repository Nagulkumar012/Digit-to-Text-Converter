package projects;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.Timer;
public class Digit_to_text extends Thread{
	
	static Timer t;
	static JProgressBar pb2,pb1;
	static Frame f1,f2,f3;
	static String sp_n,time,day;
	static boolean loopcontrol=true;
	static SimpleDateFormat format;
	static SimpleDateFormat dayformat;
	static JLabel ml2,ml3;
	static Calendar calender;
	static Image icon;

	public static void main(String[] args) {
    f1=new Frame("DIGIT TO TEXT");
    
    icon=Toolkit.getDefaultToolkit().getImage("D:\\NumberTOWordConverter\\images\\logo4.jpg");
    
    ImageIcon image1=new ImageIcon("D:\\NumberTOWordConverter\\images\\b8.jpg");
    JLabel i1=new JLabel(image1);
	 i1.setBounds(0,0,832,550);
	 
	 
	 ImageIcon image2=new ImageIcon("D:\\NumberTOWordConverter\\images\\b15.png");
    JLabel i2=new JLabel(image2);
	 i2.setBounds(20,40,139,90);
	 
	 ImageIcon image3=new ImageIcon("D:\\NumberTOWordConverter\\images\\b13.jpg");
    JLabel i3=new JLabel(image3);
	 i3.setBounds(344,170,250,186);
	 i3.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),3));
	
	JLabel l1=new JLabel("NANDHA ENGINEERING");
	l1.setBounds(180, 15, 560, 100);
	l1.setForeground(new Color(0,0,0));
	l1.setFont(new Font("Lucida Fax",Font.BOLD,33));
	
	
	JLabel l2=new JLabel("COLLEGE");
	l2.setBounds(240, 58, 560, 100);
	l2.setForeground(new Color(0,0,0));
	l2.setFont(new Font("Lucida Fax",Font.BOLD,33));
	
	JLabel l3=new JLabel("(Autonomous)");
	l3.setBounds(402, 65, 160, 100);
	l3.setForeground(new Color(0,0,0));
	l3.setFont(new Font("Lucida Fax",Font.ITALIC,15));
	
	
	JLabel l4=new JLabel("DEPARTMENT OF");
	l4.setBounds(40, 180, 360, 100);
	l4.setForeground(new Color(0,0,0));
	l4.setFont(new Font("Lucida Fax",Font.BOLD,30));
	
	JLabel l5=new JLabel("CSE");
	l5.setBounds(127, 237, 360, 100);
	l5.setForeground(new Color(0,0,0));
	l5.setFont(new Font("Lucida Fax",Font.BOLD,43));
	
	
	JLabel l6=new JLabel("Digit to Text Converter");
	l6.setBounds(160, 350, 600, 100);
	l6.setForeground(new Color(0,0,0));
	l6.setFont(new Font("Lucida Fax",Font.BOLD,25));
	
	JLabel l7=new JLabel("Java Project");
	l7.setBounds(230, 390, 300, 100);
	l7.setForeground(new Color(0,0,0));
	l7.setFont(new Font("Lucida Fax",Font.BOLD,25));
	
	
	pb1=new JProgressBar();
	pb1.setValue(0);
	pb1.setForeground(new Color(0,255,0));
	pb1.setBackground(new Color(60,60,60));
	pb1.setBounds(110, 470, 420, 30);
	pb1.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),3));
	pb1.setFont(new Font("Bahnschrift SemiBold",Font.BOLD,15));
	pb1.setStringPainted(true);
	
	
	f1.add(l1);
	f1.add(l2);
	f1.add(l3);
	f1.add(l4);
	f1.add(l5);
	f1.add(l6);
	f1.add(l7);
	
	f1.add(i2);
	f1.add(i3);
	
	f1.add(pb1);

	f1.add(i1);
	
	
	
	


	f1.setSize(630,550);
	f1.setLayout(null);
	f1.setVisible(true);
   f1.setIconImage(icon);
	f1.setLocationRelativeTo(null);
	f1.setBackground(new Color(255,255,255));
	f1.addWindowListener(new WindowAdapter(){  
       public void windowClosing(WindowEvent e) {  
       	f1.dispose(); 
       }  
   });

	fill1();
}
	static void fill1(){
		int c=0;
		try {
			Thread.sleep(1300);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		while(c<=100) {
			pb1.setValue(c);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			c+=1;
		}
		f1.dispose();
		frame2();
		
		
	}

	static void frame2() {
		f2=new Frame("DIGIT TO TEXT");
        
        ImageIcon image1=new ImageIcon("D:\\NumberTOWordConverter\\images\\b16.jpg");
        JLabel i1=new JLabel(image1);
		 i1.setBounds(0,0,826,550);
		 
		
		JLabel l1=new JLabel("PROJECT:");
		l1.setBounds(30, 15, 150, 100);
		l1.setForeground(new Color(0,0,0));
		l1.setFont(new Font("Lucida Fax",Font.BOLD,20));
		
		
		JLabel l2=new JLabel("Digit to Text Converter");
		l2.setBounds(96, 55, 400, 100);
		l2.setForeground(new Color(0,0,0));
		l2.setFont(new Font("Lucida Fax",Font.BOLD,19));
		
		JLabel l3=new JLabel("PURPOSE:");
		l3.setBounds(30, 105, 160, 100);
		l3.setForeground(new Color(0,0,0));
		l3.setFont(new Font("Lucida Fax",Font.BOLD,20));
		
		
		JLabel l4=new JLabel("Object Oriented Programming Languages does not ");
		l4.setBounds(96, 150, 760, 100);
		l4.setForeground(new Color(0,0,0));
		l4.setFont(new Font("Lucida Fax",Font.BOLD,19));
		
		JLabel l5=new JLabel("have a default library function for convert Digit to Text");
		l5.setBounds(49, 180, 760, 100);
		l5.setForeground(new Color(0,0,0));
		l5.setFont(new Font("Lucida Fax",Font.BOLD,19));
		
		
		JLabel l6=new JLabel("so, this project will be solve this problem and it is also");
		l6.setBounds(49, 210, 760, 100);
		l6.setForeground(new Color(0,0,0));
		l6.setFont(new Font("Lucida Fax",Font.BOLD,19));
		
		JLabel l7=new JLabel("like as a default library function.");
		l7.setBounds(49, 240, 600, 100);
		l7.setForeground(new Color(0,0,0));
		l7.setFont(new Font("Lucida Fax",Font.BOLD,19));
		
		
		pb2=new JProgressBar();
		pb2.setValue(0);
		pb2.setForeground(new Color(0,255,0));
		pb2.setBackground(new Color(60,60,60));
		pb2.setBounds(110, 450, 420, 30);
		pb2.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),3));
		pb2.setFont(new Font("Bahnschrift SemiBold",Font.BOLD,15));
		pb2.setStringPainted(true);
		pb2.setVisible(false);
		t=new Timer(10,new ActionListener() {
			int x=0;

			@Override
			public void actionPerformed(ActionEvent e) {
				pb2.setValue(x+=1);
				try {
					Thread.sleep(50);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				
				if(x==105) {
					t.stop();
					frame3();
					f2.dispose();
					
				}
			}
			
		});
		
         
		 JButton b1 =new JButton("GET START");
	     b1.setBounds(190,350,250,40);
		 b1.setBackground(new Color(0,250,154));
		 b1.setForeground(new Color(0,0,0));
		 b1.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),2));
		 b1.setFont(new Font("Lucida Fax",Font.BOLD,16));
		 b1.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent ae) {
			 
				 pb2.setVisible(true);
     			 t.start();
				 
			 }
				 
			 });
		
		f2.add(l1);
		f2.add(l2);
		f2.add(l3);
		f2.add(l4);
		f2.add(l5);
		f2.add(l6);
		f2.add(l7);
		f2.add(b1);
		f2.add(pb2);
		
		f2.add(i1);
		
		f2.setSize(630,550);
		f2.setLayout(null);
		f2.setVisible(true);
	    f2.setIconImage(icon);
		f2.setLocationRelativeTo(null);
		f2.setBackground(new Color(255,255,255));
		f2.addWindowListener(new WindowAdapter(){  
           public void windowClosing(WindowEvent e) {  
           	f2.dispose();  
           } 
       });
		
	}
static void frame3() {
		
        Frame f3=new Frame("DIGIT TO TEXT");
        
        ImageIcon image1=new ImageIcon("D:\\NumberTOWordConverter\\images\\b24.jpg");
        JLabel i1=new JLabel(image1);
		i1.setBounds(0,-11,1037,583);
		
		JLabel ml1=new JLabel("DIGIT TO TEXT CONVERTER");
		ml1.setBounds(205, 15, 650, 100);
		ml1.setForeground(new Color(225,225,225));
		ml1.setFont(new Font("Lucida Fax",Font.BOLD,37));
		
		
		JTextArea mta1=new JTextArea();
		mta1.setBounds(530,160,200,95);
		mta1.setBackground(new Color(153,204,255));
		mta1.setFont(new Font("Lucida Fax",Font.BOLD,25));
		mta1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(0,0,0),5),"DIGIT"));
		mta1.setForeground(new Color(0,0,0));
		mta1.setLineWrap(true);
		mta1.setWrapStyleWord(true);
		mta1.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				sp_n= new String(mta1.getText());
				int l_pn=sp_n.length();
				
				

				char c=e.getKeyChar();
				if(Character.isLetter(c)) {
					mta1.setEditable(false);
					JOptionPane.showMessageDialog(f3,"Enter Number Only...!", "Note",JOptionPane.ERROR_MESSAGE);
				}else {
					mta1.setEditable(true);
					
				}
				
				if(l_pn>14) {
					mta1.setEditable(false);
					JOptionPane.showMessageDialog(f3,"Number Overflow...!", "Note",JOptionPane.ERROR_MESSAGE);
				}
				
			}
			@Override
			public void keyPressed(KeyEvent e) {
				mta1.setEditable(true);
			}
			@Override
			public void keyReleased(KeyEvent e) {
				mta1.setEditable(true);
			}
		});
		
		

		JTextArea mta2=new JTextArea();
		mta2.setBounds(530,318,310,185);
		mta2.setBackground(new Color(153,204,255));
		mta2.setFont(new Font("Lucida Fax",Font.BOLD,18));
		mta2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(0,0,0),5),"TEXT"));
		mta2.setForeground(new Color(0,0,0));
		mta2.setLineWrap(true);
		mta2.setWrapStyleWord(true);
		mta2.setEditable(false);
		
		
		JButton mb1 =new JButton("CONVERT");
		mb1.setBounds(530,270,90,32);
		mb1.setBackground(new Color(32,178,170));
		mb1.setForeground(new Color(0,0,0));
		mb1.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),3));
		mb1.setFont(new Font("Lucida Fax",Font.BOLD,15));
		mb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					 long digit=Long.valueOf(mta1.getText());
					 String text=DigitToText(digit);
					 mta2.setEditable(true);
					 mta2.setText(text);
					 mta2.setEditable(false);
				}catch(Exception en) {
					mta2.setText("Digit Invalid");
				}
			}

			public String DigitToText(long n) {
				long limit=1000000000000l;
				 long cn,t=0;
				 if(n==0) {
					 return("Zero");
				 }
				 String ft[]= {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fiften","Sixteen",
						 "Seventeen","Eighteen","Nineteen"};
				
				 String[] tn= {"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
				 String[] ml= {"","Trillion","Billion","Million","Thousand"};
				 if(n<20) {
					 return (ft[(int)n]);
				 }
				 String answer="";
				 for(long i=n;i>0;i=i%limit,limit=limit/1000) {
					 cn=i/limit;
					 while(cn==0) {
						 i=i%limit;
						 limit=limit/1000;
						 cn=i/limit;
						 t++;
					 }
					 if(cn>99) {
						 int ad=(int)cn/100;
						 answer=answer+(ft[ad]+" Hundred ");
					 
					 }
					 cn=cn%100;
					 if(cn>0&&cn<20) {
						 answer+=(ft[(int)cn]+" ");
					 }else if(cn%10==0&&cn!=0) {
						 answer=answer+(tn[(int)cn/10]+" ");
					 }else if(cn>20&&cn<100) {
						 answer+=(tn[(int)cn/10]+" "+ft[(int)cn%10]+" ");
					 }
					 if(t<4) {
						 answer+=(ml[(int)++t]+" ");
					 }		 
				 }
				return answer;
			}
		});
		
		
		JButton mb2 =new JButton("RESET");
		mb2.setBounds(640,270,90,32);
		mb2.setBackground(new Color(220,20,60));
		mb2.setForeground(new Color(0,0,0));
		mb2.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),3));
		mb2.setFont(new Font("Lucida Fax",Font.BOLD,15));
		mb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 mta1.setText("");
				 mta2.setText("");
			}
		});
		
		
		format=new SimpleDateFormat("hh:mm a");
		
		
		ml2=new JLabel();
		ml2.setBounds(169, 142, 400, 100);
		ml2.setForeground(new Color(0,225,0));
		ml2.setFont(new Font("Times New Roman",Font.BOLD,27));
		
		
		dayformat=new SimpleDateFormat("dd(E)-MM-yyyy");
		
		ml3=new JLabel();
		ml3.setBounds(165, 167, 400, 100);
		ml3.setForeground(new Color(0,0,255));
		ml3.setFont(new Font("Times New Roman",Font.BOLD,15));
		
		
		
		f3.add(ml1);
		f3.add(mta1);
		f3.add(mb1);
		f3.add(mb2);
		f3.add(mta2);
		f3.add(ml2);
		f3.add(ml3);


		f3.add(i1);
		
		
		f3.setSize(900,580);
		f3.setLayout(null);
		f3.setVisible(true);
	    f3.setIconImage(icon);
		f3.setLocationRelativeTo(null);
		f3.setBackground(new Color(255,255,255));
		f3.addWindowListener(new WindowAdapter(){  
           public void windowClosing(WindowEvent e) {  
           	f3.dispose(); 
           	loopcontrol=false;
           } 
       });
		
		Digit_to_text o=new Digit_to_text();
		o.start();
		
	}
public void run() {
	day=dayformat.format(Calendar.getInstance().getTime());
	ml3.setText(day);
	
	while(loopcontrol) {
		time=format.format(Calendar.getInstance().getTime());
		ml2.setText(time);
		
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

}
