import java.awt.*;
import java.awt.event.*;


public class ButtonDemo extends Frame implements ActionListener{
String msg="";
Button yes,no,maybe;
public ButtonDemo()
{
setLayout(new FlowLayout());
yes=new Button("YES");
no=new Button("NO");
maybe=new Button("UNDEFINED");
add(yes);
add(no);
add(maybe);
yes.addActionListener(this);
no.addActionListener(this);
maybe.addActionListener(this);

addWindowListeners(new WindowAdapter(){
public void windowClosing(WindowEvent we){
System.exit(0);

}
});
}
public void actionPerformed(ActionEvent ae){
String str=ae.getactioncommand();
if(str.equals("YES"))
{
msg="YOU PRESSED 'Yes'";

}
else if(str.equals("NO"))
{
msg="YOU PRESSED 'no'";

}
else if(str.equals("maybe"))
{
msg="YOU PRESSED 'undefined'";

}
repaint();
}
public void paint(Graphics g){
g.drawString(msg,20,20);


}
public static void main(String args[]){

ButtonDemo a=new ButtonDemo();
a.setSize (new Dimension(250,150));
a.setTitle("ButtonDemo");
a.setVisible(true);



}

}
