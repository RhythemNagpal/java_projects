import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class baloongame extends JFrame implements Runnable,MouseListener
{
int x,y;
Dimension size;
JTextField te1,te2;
JLabel l1,l2,l3,l4,l5,l7,l6,l8;
JLabel []la;
ImageIcon i1,i2,i3,i4,i5,i6;
Thread t,t1;
Random rand = new Random();
int m1 = rand.nextInt(1000) + 100;

int c=0,score=0,chances=10;
public baloongame()
{
//setSize(1400,800);
setLayout(null);
getContentPane().setBackground(Color.white);
this.setExtendedState(JFrame.MAXIMIZED_BOTH);
setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
x=100;
y=650;
t1=new Thread();
t1.setName("t1");
i1=new ImageIcon("b+a.png");
l1=new JLabel(i1);	
i2=new ImageIcon("b.png");
l2=new JLabel(i2);
i3=new ImageIcon("a.png");
l3=new JLabel(i3);
i4=new ImageIcon("balloon.png");
l4=new JLabel(i4);
i5=new ImageIcon("balloona.png");
l5=new JLabel(i5);
i6=new ImageIcon("a+.png");
la=new JLabel[10];
for(int in=0;in<10;in++)
la[in]=new JLabel(i6);
l6=new JLabel("Score");
l7=new JLabel("Chances");
te1=new JTextField();
te2=new JTextField();

l1.setBounds(10,20,100,30);
l2.setBounds(10,20,100,30);
l3.setBounds(x,20,40,30);
l6.setBounds(3,70,50,30);
l7.setBounds(3,120,50,30);
te1.setBounds(60,70,50,25);
te2.setBounds(60,120,50,25);

l2.setVisible(false);
l3.setVisible(false);	
l1.addMouseListener(this);

add(l1);
add(l2);
add(l3);
add(l4);
add(l5);
add(l6);
add(l7);
add(te1);
add(te2);
for(int in=0;in<10;in++)
add(la[in]);
t=new Thread(this);
t.start();
setVisible(true);
}
public void run()
{
int am=0;
while(chances>0)
{
size=getSize();
for(int in=0;in<10;in++)
la[in].setBounds(in*8,0,10,10);
if(c==1)
{
x++;
l3.setBounds(x,20,40,30);
if(x>(size.width-300))
{
x=100;
l1.setVisible(true);
l2.setVisible(false);
l3.setVisible(false);
chances--;

c=0;
}
}
if(y<-150)
{
Random rand = new Random();
m1 = rand.nextInt(1100) + 140;
y=650;
}
y--;
l4.setBounds(m1,y,40,150);
if(x>m1-10 && x<m1+50 && y>-40 && y<20)
{
l4.setVisible(false);
l5.setVisible(true);
int m=x;
int n=y;
while(n<650){
try{
Thread.sleep(2);
}
catch(Exception e4)
{}
l3.setVisible(false);
l5.setBounds(m,n-30,40,150);
n++;
Random rand = new Random();
m1 = rand.nextInt(1100) + 140;

}
try{
Thread.sleep(100);
}
catch(Exception e3)
{}

c=0;
x=100;

l1.setVisible(true);
l2.setVisible(false);
l3.setVisible(false);
l4.setVisible(true);
l5.setVisible(false);
chances--;
y=650;
score++;
}
try
{
Thread.sleep(3);
}
catch(Exception e)
{}
te1.setText(String.valueOf(score));
te2.setText(String.valueOf(chances));
for(int in=0;in<(10-chances);in++)
la[in].setVisible(false);
}
if(score>=8)
JOptionPane.showMessageDialog(this,"Level one crossed with score: "+score);
else
JOptionPane.showMessageDialog(this,"**you lose**\n score: "+score);

}
public void mouseExited(MouseEvent e1)
{}
public void mouseEntered(MouseEvent e2)
{}
public void mouseReleased(MouseEvent e3)
{}
public void mousePressed(MouseEvent e4)
{
}
public void mouseClicked(MouseEvent e5)
{
c=1;
l1.setVisible(false);
l2.setVisible(true);
l3.setVisible(true);


}

public static void main(String m[])
{
baloongame obj=new baloongame();
}}
 