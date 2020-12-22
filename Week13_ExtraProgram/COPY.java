import java.awt.*;
import java.awt.event.*;



public class COPY extends Frame implements ActionListener

{

            TextField A,B;
            Button paste;
            public COPY()

            {

                        setLayout(new FlowLayout());
                      
                        A=new TextField(10);
                        B=new TextField(10);
                        
                        paste=new Button("PASTE ");
                        add(new Label("Enter any text of your wish  : "));
                        add(A);
                        add(new Label(" you have enterd : "));
                        add(B);
                        add(paste);
                        paste.addActionListener(this);
                       
                      addWindowListener(new MyWindowAdapter());
}
 public void actionPerformed(ActionEvent ae)

            {
                if(ae.getSource()==paste)

                 {   


                         B.setText(Integer.toString(Integer.parseInt(A.getText())));
                         

                        }
}
            

public static void main(String[] args)
{
COPY t= new COPY();
t.setSize(new Dimension(300,300));
t.setTitle("PASTING");
t.setVisible(true);
}

}
class  MyWindowAdapter extends WindowAdapter{
public void windowClosing(WindowEvent we)
{

System.exit(0);


}
}
