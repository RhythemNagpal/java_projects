import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
class tpayment extends JInternalFrame implements ActionListener,ItemListener
{
JLabel l1,l2,l3,l4,l5,l6,he;
JLabel v1,v2,v3,v4,v5,v6,v7,v8,v9,v10,v11;
JTextField t1,t2,t3,t4,t5,t6;
JComboBox co1,co2;
JButton b1,b2,b3,b4,b5;
Connection con;
int amt=0,count=1;
int ss=1;
int mm=0;
public tpayment()
{
super("",true,true,true,true);
try
{
setLayout(null);
setSize(800,700);
setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/inventory","root","");

l1=new JLabel("Serial no");
l2=new JLabel("Date");
l3=new JLabel("Party name");
l4=new JLabel("Balance");
l5=new JLabel("Amount");
l6=new JLabel("Details");


v1=new JLabel("Please enter value");
v2=new JLabel("Please enter value");
v3=new JLabel("Please enter value");
v4=new JLabel("Please enter value");
v5=new JLabel("Please enter value");
v6=new JLabel("Please enter value");
v7=new JLabel("Please enter value");
v8=new JLabel("Please enter value");
v9=new JLabel("Please enter value");
v10=new JLabel("Please enter value");
v11=new JLabel("Please enter value");
he=new JLabel("Payment");
t1=new JTextField(20);
t3=new JTextField(20);
t4=new JTextField(20);
t5=new JTextField(20);
t6=new JTextField(20);

b1=new JButton("New  Bill");
b2=new JButton("Save");
b3=new JButton("Modify");
b4=new JButton("Delete Item");
b5=new JButton("Find party");

co1=new JComboBox();
co2=new JComboBox();

l1.setBounds(30,60,150,30);
l2.setBounds(30,100,150,30);
l3.setBounds(30,140,150,30);
l4.setBounds(30,180,150,30);
l5.setBounds(30,220,150,30);
l6.setBounds(30,260,150,30);
t1.setBounds(190,60,200,30);
t3.setBounds(190,100,200,30);
co1.setBounds(190,140,200,30);
t4.setBounds(190,180,200,30);
t5.setBounds(190,220,200,30);
t6.setBounds(190,260,200,30);

v1.setBounds(440,60,120,30);
v2.setBounds(440,100,120,30);
v3.setBounds(440,140,120,30);
v4.setBounds(440,180,120,30);
v5.setBounds(440,220,120,30);
v6.setBounds(440,260,120,30);
v7.setBounds(440,300,120,30);
v8.setBounds(440,340,120,30);
v9.setBounds(440,380,120,30);
v10.setBounds(440,420,120,30);
v11.setBounds(440,460,120,30);

he.setBounds(180,4,260,50);
he.setFont(new Font("Serif", Font.PLAIN, 23));
v1.setForeground(Color.red);
v2.setForeground(Color.red);
v3.setForeground(Color.red);
v4.setForeground(Color.red);
v5.setForeground(Color.red);
v6.setForeground(Color.red);
v7.setForeground(Color.red);
v8.setForeground(Color.red);
v9.setForeground(Color.red);
v10.setForeground(Color.red);
v11.setForeground(Color.red);

b1.setBounds(20,520,100,30);
b2.setBounds(120,520,100,30);
b3.setBounds(220,520,100,30);
b4.setBounds(320,520,100,30);
b5.setBounds(70,580,100,30);
co2.setBounds(200,580,100,30);
try
{
String str1="Select * from mpurchase";
Statement s1=con.createStatement();
ResultSet rr1=s1.executeQuery(str1);
co1.addItem("select party");
while(rr1.next())
{
co1.addItem(rr1.getString(1));
}
String str2="Select * from tpayment";
Statement s2=con.createStatement();
ResultSet rr2=s2.executeQuery(str2);
co2.addItem("select party");
while(rr2.next())
{
co2.addItem(rr2.getString(3));
}

DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
LocalDate localDate = LocalDate.now();
t3.setText(dtf.format(localDate));
}
catch(Exception ee)
{}
add(l1);
add(l2);
add(l3);
add(l4);
add(l5);
add(l6);
add(co2);
add(he);

add(b1);
add(b2);
add(b3);
//add(b4);
add(b5);

add(t1);
add(t3);
add(t4);
add(t5);
add(t6);


add(co1);
add(v1);
add(v2);
add(v3);
add(v4);
add(v5);
add(v6);
add(v7);
add(v8);
add(v9);
add(v10);
add(v11);
co2.setSelectedIndex(0);
co1.setSelectedIndex(0);

b1.addActionListener(this);
b2.addActionListener(this);
co1.addItemListener(this);
b3.addActionListener(this);
b5.addActionListener(this);

b2.setEnabled(false);
b3.setEnabled(false);
b4.setEnabled(false);
t1.setEnabled(false);
t3.setEnabled(false);
t4.setEnabled(false);
t5.setEnabled(false);
t6.setEnabled(false);
co1.setEnabled(false);

v1.setVisible(false);
v2.setVisible(false);
v3.setVisible(false);
v4.setVisible(false);
v5.setVisible(false);
v6.setVisible(false);
v7.setVisible(false);
v8.setVisible(false);
v9.setVisible(false);
v10.setVisible(false);
v11.setVisible(false);

setVisible(true);
}
catch(Exception ee)
{System.out.println(ee);}

}


public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
try
{
ss=1;
String str1="Select * from tpayment";
Statement s1=con.createStatement();
ResultSet rr=s1.executeQuery(str1);
while(rr.next())
{
ss++;
}
System.out.println(ss);
}
catch(Exception ee)
{System.out.println(ee);}
t1.setText(String.valueOf(ss));
t1.setEnabled(false);
t4.setText("");
t5.setText("");
t6.setText("");
v1.setVisible(false);
v2.setVisible(false);
v3.setVisible(false);
v4.setVisible(false);
v5.setVisible(false);
v6.setVisible(false);
v7.setVisible(false);
v8.setVisible(false);
v9.setVisible(false);
v10.setVisible(false);
v11.setVisible(false);
co1.setSelectedIndex(0);
t3.requestFocus();
t3.setEnabled(true);
t4.setEnabled(true);
t5.setEnabled(true);
t6.setEnabled(true);
co1.setEnabled(true);
b2.setEnabled(true);
b3.setEnabled(true);
}

if(e.getSource()==b2)
{
try
{
if(t1.getText().equals(""))
v1.setVisible(true);
if(t3.getText().equals(""))
v3.setVisible(true);
if(t4.getText().equals(""))
v5.setVisible(true);
if(t5.getText().equals(""))
v7.setVisible(true);
if(t6.getText().equals(""))
v8.setVisible(true);


int a=Integer.parseInt(t1.getText());
String b=t3.getText();
String c=String.valueOf(co1.getSelectedItem());
int d=Integer.parseInt(t4.getText());
int e1=Integer.parseInt(t5.getText());
String f=t6.getText();

//if(!t1.getText().equals("") && b!="" && c!="" && d!="" && !t5.getText().equals("") &&!t6.getText().equals("") &&!t7.getText().equals(""))
//{
String str2="INSERT INTO tpayment values("+a+",'"+b+"','"+c+"',"+d+","+e1+",'"+f+"')";
Statement s2=con.createStatement();
int r2=s2.executeUpdate(str2);
amt=e1;
String str3="update mpurchase set clbal=clbal-"+e1+" where partyname='"+c+"'";
Statement s3=con.createStatement();
int r3=s3.executeUpdate(str3);
co2.addItem(c);
v1.setVisible(false);
v2.setVisible(false);
v3.setVisible(false);
v4.setVisible(false);
v5.setVisible(false);
}
catch(Exception ee1)
{
System.out.println(ee1);

}
v1.setVisible(false);
v2.setVisible(false);
v3.setVisible(false);
v4.setVisible(false);
v5.setVisible(false);
v6.setVisible(false);
v7.setVisible(false);
v8.setVisible(false);
v9.setVisible(false);
v10.setVisible(false);
v11.setVisible(false);

t1.setEnabled(false);
t3.setEnabled(false);
co1.setEnabled(false);
t4.setEnabled(false);
t5.setEnabled(false);
t6.setEnabled(false);
b2.setEnabled(false);
t4.setText("");
t5.setText("");
t6.setText("");
t3.setText("");
co1.setSelectedIndex(0);

}

if(e.getSource()==b5)
{
try
{
String c1=String.valueOf(co2.getSelectedItem());
ss=0;
String str2="SELECT * FROM tpayment WHERE partyname='"+c1+"'";
Statement s2=con.createStatement();
ResultSet rr=s2.executeQuery(str2);
while(rr.next())
{
if(c1.equals(rr.getString(3)))
ss=1;
}
if(ss==0)
{
JOptionPane.showMessageDialog(this,"party not found");
}
else
{
t1.setEnabled(false);
String c=String.valueOf(co2.getSelectedItem());
int ss=0;
String str1="SELECT * FROM tpayment WHERE partyname='"+c+"'";
Statement s1=con.createStatement();
ResultSet r=s1.executeQuery(str1);
if(r.next())
{
t1.setText(String.valueOf(r.getInt(1)));
t3.setText(r.getString(2));
co1.setSelectedItem(r.getString(3));
t4.setText(String.valueOf(r.getInt(4)));
t5.setText(String.valueOf(r.getInt(5)));
t6.setText(r.getString(6));
mm=r.getInt(5);
}
}}
catch(Exception ee2)
{
System.out.println(ee2);
}
t3.requestFocus();
t3.setEnabled(true);
t4.setEnabled(true);
t5.setEnabled(true);
t6.setEnabled(true);
co1.setEnabled(true);
b2.setEnabled(true);
b3.setEnabled(true);

}

if(e.getSource()==b3)
{
try	
{
t1.setEnabled(false);
int a=Integer.parseInt(t1.getText());
String b=t3.getText();
String c=String.valueOf(co1.getSelectedItem());
int d=Integer.parseInt(t4.getText());
int e1=Integer.parseInt(t5.getText());
String f=t6.getText();
String str="update tpayment set amt="+e1+" where partyname='"+c+"'";
Statement s=con.createStatement();
int r=s.executeUpdate(str);
str="update mpurchase set clbal=clbal-"+e1+"+"+mm+" where partyname='"+c+"'";
s=con.createStatement();
r=s.executeUpdate(str);

t3.setEnabled(false);
t4.setEnabled(false);
co1.setEnabled(false);
t5.setEnabled(true);
t6.setEnabled(true);
t5.setText("");
t5.setText("");
t6.setText("");
co1.requestFocus();
}

catch(Exception ee3)
{
System.out.println(ee3);
}
}
/*
if(e.getSource()==b4)
{
try
{
String b=t2.getText();
String c=t3.getText();
String d=String.valueOf(co1.getSelectedItem());
int a2=Integer.parseInt(t1.getText());
String b2=String.valueOf(co2.getSelectedItem());
int c2=Integer.parseInt(t5.getText());
int e1=c2*d2;
int a=l.getSelectedIndex();
String z=String.valueOf(l.getSelectedValue());
d1.removeElementAt(a);
String str1="Delete from billtrans where itemname='"+b2+"' and billno="+a;
Statement s1=con.createStatement();
int r1=s1.executeUpdate(str1);
String str2="update billmaster set total=total-"+e1+" where billno="+a;
Statement s2=con.createStatement();
int r2=s2.executeUpdate(str2);
String str3="update mpurchase set clbal=clbal-"+e1+" where partyname='"+d+"'";
Statement s3=con.createStatement();
int r3=s3.executeUpdate(str3);
String str4="update mitem set clqty=clqty-"+d2+" where itemname='"+b2+"'";
Statement s4=con.createStatement();
int r4=s4.executeUpdate(str4);
}
catch(Exception ee1)
{
System.out.println(ee1);
}
}*/}

public void itemStateChanged(ItemEvent i)
{
try
{
if(i.getSource()==co1)
{
if(i.getStateChange()==ItemEvent.SELECTED)
{
String c=(String)co1.getSelectedItem();
String str1="Select * from mpurchase where partyname='"+c+"'";
Statement s1=con.createStatement();
ResultSet rr1=s1.executeQuery(str1);
while(rr1.next())
{
t4.setText(rr1.getString(5));
}
}
}}
catch(Exception ee)
{}}
/*public void focusLost(FocusEvent fe)
{
System.out.println("lost");
int c2=Integer.parseInt(t5.getText());
int d2=Integer.parseInt(t7.getText());
int e1=c2*d2;
amt=amt+e1;
t8.setEnabled(true);
t9.setEnabled(true);
t8.setText(String.valueOf(e1));
t9.setText(String.valueOf(amt));
t8.setEnabled(false);
t9.setEnabled(false);

}}
public void focusGained(FocusEvent fe)
{}
public void valueChanged(ListSelectionEvent le)
{
try
{
String s=(String)l.getSelectedValue();
System.out.println(s);
co2.setSelectedItem(s);
String str="SELECT * FROM billtrans WHERE billno="+a+" and itemname='"+s+"'";
Statement s1=con.createStatement();
ResultSet r=s1.executeQuery(str);
if(r.next())
{
t7.setText(String.valueOf(r.getInt(4)));
t8.setText(String.valueOf(r.getInt(5)));
}
}
catch(Exception e)
{}}*/

public static void main(String m[])
{
tpayment obj=new tpayment();
}}
