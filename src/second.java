import java.awt.*;
public class second
{
    public static void main(String []args)
    {
        Frame f=new Frame("My Frame");
        Label l=new Label("Label");
        Button b=new Button("Click Here");
        TextField tf=new TextField();

        f.setBounds(400,100,800,600);
        l.setBackground(Color.yellow);
        b.setBackground(Color.cyan);


        tf.setBounds(1500,350,22,11);

        f.add(l);
        f.add(tf);
        f.add(b);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }
}
