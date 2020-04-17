import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
public class main1 extends JFrame implements ActionListener
{
JMenu Master,Transaction,View,Report;
JMenuBar top;
JMenuItem mitem,mpurchase,msale,tpurchase,tsale,tpayment,treceive,vitem,vpurchaseparty,vsaleparty,vsale,vpurchase,vpayment,vreceive,ritem,rpurchaseparty,rsaleparty,rsale,rpurchase,rpayment,rreceive; 
JTextArea ta;
JDesktopPane desk1=new JDesktopPane();
public main1()
{
setContentPane(desk1);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLayout(null);
this.setExtendedState(JFrame.MAXIMIZED_BOTH);
top=new JMenuBar();
Master=new JMenu();
Transaction=new JMenu();
Report=new JMenu();
View=new JMenu();
mitem=new JMenuItem();
mpurchase=new JMenuItem();
msale=new JMenuItem();
tpurchase=new JMenuItem();
tsale=new JMenuItem();
tpayment=new JMenuItem();
treceive=new JMenuItem();
vitem=new JMenuItem();
vpurchaseparty=new JMenuItem();
vsaleparty=new JMenuItem();
vsale=new JMenuItem();
vpurchase=new JMenuItem();
vpayment=new JMenuItem();
vreceive=new JMenuItem();
ritem=new JMenuItem();
rpurchaseparty=new JMenuItem();
rsaleparty=new JMenuItem();
rsale=new JMenuItem();
rpurchase=new JMenuItem();
rpayment=new JMenuItem();
rreceive=new JMenuItem();
ta=new JTextArea();
Master.setText("Master");
Transaction.setText("Transaction");
View.setText("View");
Report.setText("Reports");
mitem.setText("Item Master");
mpurchase.setText("Purcahse Party Master");
msale.setText("Sale Party Master");
tpurchase.setText("Purchase");
tsale.setText("Sale");
tpayment.setText("Payment");
treceive.setText("Receive");
vitem.setText("Item Master Details");
vpurchaseparty.setText("Purchase Party Details");
vsaleparty.setText("Sale Party Details");
vpurchase.setText("Purchase Details");
vsale.setText("Sale Details");
vpayment.setText("Payment Details");
vreceive.setText("Receive Details");
ritem.setText("Item Master Details");
rpurchaseparty.setText("Purchase Party Details");
rsaleparty.setText("Sale Party Details");
rpurchase.setText("Purchase Details");
rsale.setText("Sale Details");
rpayment.setText("Payment Details");
rreceive.setText("Receive Details");

top.add(Master);
top.add(Transaction);
top.add(View);
top.add(Report);
Master.add(mitem);
Master.add(mpurchase);
Master.add(msale);
Transaction.add(tpurchase);
Transaction.add(tsale);
Transaction.add(tpayment);
Transaction.add(treceive);
View.add(vitem);
View.add(vpurchaseparty);
View.add(vsaleparty);
View.add(vsale);
View.add(vpurchase);
View.add(vpayment);
View.add(vreceive);
Report.add(ritem);
Report.add(rpurchaseparty);
Report.add(rsaleparty);
Report.add(rsale);
Report.add(rpurchase);
Report.add(rpayment);
Report.add(rreceive);

setJMenuBar(top);
add(ta);
top.setBounds(0,0,800,20);
ta.setBounds(0,0,1500,800);
mitem.addActionListener(this);
mpurchase.addActionListener(this);
msale.addActionListener(this);
tpurchase.addActionListener(this);
tsale.addActionListener(this);
tpayment.addActionListener(this);
treceive.addActionListener(this);

setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==mitem)
{
mitem obj=new mitem();
desk1.add(obj);
try
{
obj.setMaximum(true);
}
catch(Exception e1)
{}
}
else if(e.getSource()==mpurchase)
{
mpurchase obj=new mpurchase();
desk1.add(obj);
try
{
obj.setMaximum(true);
}
catch(Exception e1)
{System.out.println(e1);}
}
else if(e.getSource()==msale)
{
msale obj=new msale();
desk1.add(obj);
try
{
obj.setMaximum(true);
}
catch(Exception e1)
{System.out.println(e1);}
}

else if(e.getSource()==tpurchase)
{
tpurchase obj=new tpurchase();
desk1.add(obj);
try
{
obj.setMaximum(true);
}
catch(Exception e1)
{System.out.println(e1);}
}

else if(e.getSource()==tsale)
{
tsale obj=new tsale();
desk1.add(obj);
try
{
obj.setMaximum(true);
}
catch(Exception e1)
{System.out.println(e1);}
}
else if(e.getSource()==tpayment)
{
tpayment obj=new tpayment();
desk1.add(obj);
try
{
obj.setMaximum(true);
}
catch(Exception e1)
{System.out.println(e1);}
}

else if(e.getSource()==treceive)
{
treceive obj=new treceive();
desk1.add(obj);
try
{
obj.setMaximum(true);
}
catch(Exception e1)
{System.out.println(e1);}
}
else if(e.getSource()==vitem)
{
vitem obj=new vitem();
desk1.add(obj);
try
{
obj.setMaximum(true);
}
catch(Exception e1)
{System.out.println(e1);}
}


}
public static void main(String m[])
{
main1 obj=new main1();
}}