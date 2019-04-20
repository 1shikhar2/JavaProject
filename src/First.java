import java.awt.*;
import java.awt.event.*;

public class First
{
    public static void main(String[] args)
    {
        Frame f=new Frame("MyFrame");
        Label l1=new Label("First");
        Label l2=new Label("Second");
        TextField t1=new TextField(10);
        TextField t2=new TextField(10);
        Button b=new Button("Ok");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String temp=t1.getText();
                t1.setText(t2.getText());
                t2.setText(temp);
            }
        });
        f.add(b);
        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(t2);
        f.setLayout(new FlowLayout());
        f.setSize(400,300);
        f.setVisible(true);
    }
}
