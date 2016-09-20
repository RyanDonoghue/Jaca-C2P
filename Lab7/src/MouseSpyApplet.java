import java.applet.Applet;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.*;

public class MouseSpyApplet extends Applet{
    public MouseSpyApplet(){
        MouseSpy test = new MouseSpy();
        this.addMouseListener(test); 
    }

    
}
