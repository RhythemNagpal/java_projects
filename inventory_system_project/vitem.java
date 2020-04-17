import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class vitem extends JFrame
{
String []header=new String []{"Item name","Purchase rate","Sale rate","Opening quantity","Closing quantity"};
Connection con;
public vitem()
{
super("",true,true,true,true);
try
{
setLayout(null);
setSize(800,600);
setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/inventory","root","");
String str1="Select * from mitem";
Statement s1=con.createStatement();
ResultSet rr=s1.executeQuery(str1);
while(rr.next())
{
JTable t=new JTable((rr.getString(1),rr.getString(2),rr.getString(3),rr.getString(4),rr.getString(5)),(header));
}
JScrollPane s=new JScrollPane(t);
s.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
s.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
add(s);
setVisible(true);}
catch(Exception ee)
{System.out.println(ee);}

}
}
