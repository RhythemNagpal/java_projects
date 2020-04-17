import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
public class notepad extends JFrame implements ActionListener
{
JMenu file,edit,format,view,help;
JMenuBar top;
JMenuItem ne,open,save,exit,undo,cut,copy,paste,wordwrap,font,statusbar,help1; 
JTextArea ta;
public notepad()
{

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLayout(null);
this.setExtendedState(JFrame.MAXIMIZED_BOTH);
top=new JMenuBar();
file=new JMenu();
edit=new JMenu();
format=new JMenu();
view=new JMenu();
help=new JMenu();
ne=new JMenuItem();
open=new JMenuItem();
save=new JMenuItem();
exit=new JMenuItem();
undo=new JMenuItem();
cut=new JMenuItem();
copy=new JMenuItem();
paste=new JMenuItem();
wordwrap=new JMenuItem();
font=new JMenuItem();
statusbar=new JMenuItem();
help1=new JMenuItem();
ta=new JTextArea();
file.setText("File");
edit.setText("Edit");
format.setText("Format");
view.setText("View");
help.setText("Help");
ne.setText("New");
open.setText("Open");
save.setText("Save");
exit.setText("Exit");
undo.setText("Undo");
cut.setText("Cut");
copy.setText("Copy");
paste.setText("Paste");
wordwrap.setText("Word Wrap");
font.setText("Font");
statusbar.setText("Status Bar");
help1.setText("Help");
file.add(ne);
file.add(open);
file.add(save);
file.add(exit);
edit.add(undo);
edit.add(cut);
edit.add(copy);
edit.add(paste);
format.add(font);
format.add(wordwrap);
view.add(statusbar);
help.add(help1);
top.add(file);
top.add(edit);
top.add(format);
top.add(view);
top.add(help);
setJMenuBar(top);
add(ta);
top.setBounds(0,0,800,20);
ta.setBounds(0,0,1500,800);
ne.addActionListener(this);
open.addActionListener(this);
save.addActionListener(this);
exit.addActionListener(this);
font.addActionListener(this);

setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==ne)
{
ta.setText("");
}
else if(e.getSource()==exit)
{
System.exit(0);
}
else if(e.getSource()==open)
{
try
{
JFileChooser jf=new JFileChooser();
jf.showOpenDialog(this);
String f=jf.getSelectedFile().getPath();
FileReader r=new FileReader(f);
BufferedReader buf=new BufferedReader(r);
String s1="";
while((s1=buf.readLine())!=null)
{
ta.append(s1+"\n");
}
buf.close();
r.close();
}
catch(Exception e1)
{}
}
else if(e.getSource()==save)
{
try
{
JFileChooser jf=new JFileChooser();
jf.showSaveDialog(this);
String f=jf.getSelectedFile().getPath();
FileWriter w=new FileWriter(f);
BufferedWriter buf=new BufferedWriter(w);
buf.write(ta.getText());
buf.close();
w.close();
}
catch(Exception e1)
{}	
}
else if(e.getSource()==font)
{
try
{
/*JFontChooser fd = new JFontChooser(this,txtDoc.getFont());
fd.show();
if(fd.getReturnStatus() == fd.RET_OK){
       txtDoc.setFont(fd.getFont());
}
fd.dispose();
*/}
catch(Exception e1)
{}

}}
public static void main(String m[])
{
notepad obj=new notepad();
}}