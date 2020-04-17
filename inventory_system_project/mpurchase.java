import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

class mpurchase extends JInternalFrame implements ActionListener
{
JLabel l1,l2,l3,l4,l5,l6;
JLabel v1,v2,v3,v4,v5;
JTextField t1,t2,t3,t4,t5,t6;
JComboBox co;
JButton b1,b2,b3,b4,b5;
Connection con;


public mpurchase()
{
super("",true,true,true,true);
try
{
setLayout(null);
setSize(800,600);
setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/inventory","root","");
l1=new JLabel("Party name");
l2=new JLabel("Address");
l3=new JLabel("Phone");
l4=new JLabel("Opening Balnace");
l5=new JLabel("Closing Balance");

v1=new JLabel("Please enter value");
v2=new JLabel("Please enter value");
v3=new JLabel("Please enter value");
v4=new JLabel("Please enter value");
v5=new JLabel("Please enter value");
l6=new JLabel("Purchase Party DETAILS");
t1=new JTextField(20);
t2=new JTextField(20);
t3=new JTextField(20);
t4=new JTextField(20);
t5=new JTextField(20);
t6=new JTextField(20);

b1=new JButton("New");
b2=new JButton("Save");
b3=new JButton("Modify");
b4=new JButton("Delete");
b5=new JButton("Find");
co=new JComboBox();
l1.setBounds(30,60,150,30);
l2.setBounds(30,100,150,30);
l3.setBounds(30,140,150,30);
l4.setBounds(30,180,150,30);
l5.setBounds(30,220,150,30);
t1.setBounds(190,60,200,30);
t2.setBounds(190,100,200,30);
t3.setBounds(190,140,200,30);
t4.setBounds(190,180,200,30);
t5.setBounds(190,220,200,30);
v1.setBounds(440,60,120,30);
v2.setBounds(440,100,120,30);
v3.setBounds(440,140,120,30);
v4.setBounds(440,180,120,30);
v5.setBounds(440,220,120,30);

l6.setBounds(180,4,260,50);
l6.setFont(new Font("Serif", Font.PLAIN, 23));
v1.setForeground(Color.red);
v2.setForeground(Color.red);
v3.setForeground(Color.red);
v4.setForeground(Color.red);
v5.setForeground(Color.red);
b1.setBounds(20,350,80,30);
b2.setBounds(90,350,80,30);
b3.setBounds(160,350,80,30);
b4.setBounds(230,350,80,30);

co.setBounds(90,400,80,30);
b5.setBounds(180,400,80,30);

String str1="Select partyname from mpurchase";
Statement s1=con.createStatement();
ResultSet rr=s1.executeQuery(str1);
while(rr.next())
{
co.addItem(rr.getString(1));
}
add(l1);
add(l2);
add(l3);
add(l4);
add(l5);
add(l6);

add(b1);
add(b2);
add(b3);
add(b4);
add(b5);

add(t1);
add(t2);
add(t3);
add(t4);
add(t5);
add(t6);
add(co);
add(v1);
add(v2);
add(v3);
add(v4);
add(v5);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);

b2.setEnabled(false);
b3.setEnabled(false);
b4.setEnabled(false);
t1.setEnabled(false);
t2.setEnabled(false);
t3.setEnabled(false);
t4.setEnabled(false);
t5.setEnabled(false);
v1.setVisible(false);
v2.setVisible(false);
v3.setVisible(false);
v4.setVisible(false);
v5.setVisible(false);

setVisible(true);
}
catch(Exception ee)
{System.out.println(ee);}

}


public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
t1.setText("");
t2.setText("");
t3.setText("");
t4.setText("");
t5.setText("");

v1.setVisible(false);
v2.setVisible(false);
v3.setVisible(false);
v4.setVisible(false);
v5.setVisible(false);

co.setSelectedIndex(0);
t1.requestFocus();
t1.setEnabled(true);
t2.setEnabled(true);
t3.setEnabled(true);
t4.setEnabled(true);

b2.setEnabled(true);
}


if(e.getSource()==b2)
{
try
{
int ss=0;
String str1="Select partyname from mpurchase";
Statement s1=con.createStatement();
ResultSet rr=s1.executeQuery(str1);
while(rr.next())
{
if(t1.getText().equals(rr.getString(1)))
ss=1;
}
if(ss==1)
{
JOptionPane.showMessageDialog(this,"this party already exists");
t1.setText("");
t2.setText("");
t3.setText("");
t4.setText("");
t5.setText("");
v1.setVisible(false);
v2.setVisible(false);
v3.setVisible(false);
v4.setVisible(false);
v5.setVisible(false);
t1.requestFocus();
t1.setEnabled(true);
t2.setEnabled(true);
t3.setEnabled(true);
t4.setEnabled(true);
b2.setEnabled(true);

}
else
{
if(t1.getText().equals(""))
v1.setVisible(true);
if(t2.getText().equals(""))
v2.setVisible(true);
if(t3.getText().equals(""))
v3.setVisible(true);
if(t4.getText().equals(""))
v4.setVisible(true);
if(t5.getText().equals(""))
v5.setVisible(true);
String a=t1.getText();
String b=t2.getText();
String c=t3.getText();
int d=Integer.parseInt(t4.getText());
if(a!="" && b!="" && c!="" && !t4.getText().equals(""))
{
String str="INSERT INTO mpurchase values('"+a+"','"+b+"','"+c+"',"+d+","+d+")";
Statement s=con.createStatement();
int r=s.executeUpdate(str);
v1.setVisible(false);
v2.setVisible(false);
v3.setVisible(false);
v4.setVisible(false);
v5.setVisible(false);
co.addItem(a);
b2.setEnabled(false);
}
}}
catch(Exception ee1)
{
System.out.println(ee1);

}
t1.setText("");
t2.setText("");
t3.setText("");
t4.setText("");
t5.setText("");
v1.setVisible(false);
v2.setVisible(false);
v3.setVisible(false);
v4.setVisible(false);
v5.setVisible(false);
t1.requestFocus();
t1.setEnabled(true);
t2.setEnabled(true);
t3.setEnabled(true);
t4.setEnabled(true);
t5.setEnabled(true);
b2.setEnabled(true);

}

if(e.getSource()==b5)
{
try
{
int ss=0;
String str1="Select partyname from mpurchase";
Statement s1=con.createStatement();
ResultSet rr=s1.executeQuery(str1);
while(rr.next())
{
if(co.getSelectedItem().equals(rr.getString(1)))
ss=1;
}
if(ss==0)
{
JOptionPane.showMessageDialog(this,"party not found");
}
else
{

t1.setEnabled(false);
t2.setEnabled(true);
t3.setEnabled(true);
t4.setEnabled(true);
t5.setEnabled(true);

String x=String.valueOf(co.getSelectedItem());
String str="SELECT * FROM mpurchase WHERE partyname='"+x+"'";
Statement s=con.createStatement();
ResultSet r=s.executeQuery(str);
if(r.next())
{
t1.setText(r.getString(1));
t2.setText(r.getString(2));
t3.setText(r.getString(3));
t4.setText(r.getString(4));
t5.setText(r.getString(5));
b3.setEnabled(true);
b4.setEnabled(true);
b2.setEnabled(false);
}
else
{
t1.setText("");
t2.setText("");
t3.setText("");
t4.setText("");
t5.setText("");

b3.setEnabled(false);
b4.setEnabled(false);
b2.setEnabled(false);
}

}}
catch(Exception ee2)
{
System.out.println(ee2);
}
}

if(e.getSource()==b3)
{
try
{
if(t2.getText().equals(""))
v2.setVisible(true);
if(t3.getText().trim().equals(""))
v3.setVisible(true);
if(t4.getText().equals(""))
v4.setVisible(true);
if(t5.getText().equals(""))
v5.setVisible(true);
String a=t1.getText();
String b=t2.getText();
String c=t3.getText();
int d=Integer.parseInt(t4.getText());
if(a!="" && b!="" && c!="" && !t4.getText().equals(""))
{
String str="Update mpurchase set addre='" +b+ "',phone='" +c+ "',opbal=" +d+",clbal="+d+" WHERE partyname='"+a+"'";
Statement s=con.createStatement();
int r=s.executeUpdate(str);
b3.setEnabled(false);
b4.setEnabled(false);
v1.setVisible(false);
v2.setVisible(false);
v3.setVisible(false);
v4.setVisible(false);
v5.setVisible(false);

}
}
catch(Exception ee3)
{
System.out.println(ee3);
}
}

if(e.getSource()==b4)
{
try
{
String a=t1.getText();
String str="delete from mpurchase WHERE partyname='"+a+"'";
Statement s=con.createStatement();
int r=s.executeUpdate(str);
co.removeItem(a);

}
catch(Exception ee4)
{
System.out.println(ee4);
}
b4.setEnabled(false);
t1.setText("");
t2.setText("");
t3.setText("");
t4.setText("");
t5.setText("");
}



}
public static void main(String m[])
{
mpurchase obj=new mpurchase();
}}
