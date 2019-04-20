import javafx.scene.control.RadioButton;

import java.awt.*;
public class Test
{
    public static void main(String []args)
    {
        Frame f=new Frame("Hello");
        Checkbox ch=new Checkbox();

        f.add(ch);
        f.setBackground(Color.yellow);

        f.setSize(600,400);
        f.setVisible(true);
    }

}
