import java.awt.*;
import java.awt.event.*;

public class TextFieldDemo extends Frame implements ActionListener{
TextField Name,pass;
public TextFieldDemo(){
setLayout(new FlowLayout());
Label namep=new Label("Name:",Label.RIGHT);
Label passp=new Label("pasword:",Label.RIGHT);
Name=new TextField(12);
pass=new TextField(6);
pass.setEchoChar('?');
add(namep);
add(Name);
add(pass);
add(passp);
Name.addActionListener(this);
pass.addActionListener(this);
addWindowListener(new MyWindowAdapter());
}

public void actionPerformed(ActionEvent ae){

repaint();
}
public void paint(Graphics g){

g.drawString("Name:"+Name.getText(),6,60);
g.drawString("selected text in name is:"+Name.getSelectedText(),6,80);
g.drawString("password:"+pass.getText(),6,100);


}
public static void main(String[] args)
{
TextFieldDemo t= new TextFieldDemo();
t.setSize(new Dimension(300,300));
t.setTitle("MouseEventsDemo");
t.setVisible(true);
}

}
class  MyWindowAdapter extends WindowAdapter{
public void windowClosing(WindowEvent we)
{

System.exit(0);


}
}
