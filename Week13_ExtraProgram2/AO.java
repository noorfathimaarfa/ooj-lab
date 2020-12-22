import java.awt.*;

import java.awt.event.*;



public class AO extends Frame implements ActionListener

{

            
            TextField a,b,c,d;
            Button Result;
            public AO()

            {

                        setLayout(new FlowLayout());
                        setSize(500,500);
                        a=new TextField(10);
                        b=new TextField(10);
                        c=new TextField(10);
                       d=new TextField(10);
                       
                        Result=new Button("Result");
                        add(new Label("Enter 1st number : "));
                        add(a);
                        add(new Label("Enter 2nd number: "));
                        add(b);
                        add(new Label("Arithematic Operator : "));
                        add(c);
                         add(new Label("your recomendation  : "));
                        add(d);
                        add(Result);
                        Result.addActionListener(this);
                        
                        setVisible(true);
                      addWindowListener(new MyWindowAdapter());
            }
public void actionPerformed(ActionEvent ae)

            {
                if(ae.getSource()==Result)
{
                 int num1 = Integer.parseInt(a.getText());
            int num2 = Integer.parseInt(b.getText());
            int num3 = 0;
            String ap = c.getText();
            switch(ap){
                case "+": num3 = num1+num2;
                break;

                case "-": num3 = num1-num2;
                break;

                case "*": num3 = num1 * num2;
                break;

                case "/": num3 = num1 / num2;
            }
            d.setText(String.valueOf(num3));

        }
    }

public static void main(String[] args)
{
AO t= new AO();
t.setSize(new Dimension(300,300));
t.setTitle("PeSTING");
t.setVisible(true);
}

}
class  MyWindowAdapter extends WindowAdapter{
public void windowClosing(WindowEvent we)
{

System.exit(0);


}
}
