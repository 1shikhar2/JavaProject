import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstGUI
{
    public static void main(String[] args)
    {
        Abc obj=new Abc();

    }
}

class Abc extends JFrame
{
    public Abc()
    {

        JLabel l1=new JLabel("Enter the Numbers");
        JTextArea tr=new JTextArea();
        JTextField tf1=new JTextField(10);
        JTextField tf2=new JTextField(10);
        JButton b1=new JButton("Click");
        tr.setText("  ");
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                    int num1=Integer.parseInt(tf1.getText());
                    int num2=Integer.parseInt(tf2.getText());
                    int sum=num1+num2;
                    tr.setText(" "+ sum );
            }
        });
        add(l1);
        add(tf1);
        add(tf2);
        add(b1);
        add(tr);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}