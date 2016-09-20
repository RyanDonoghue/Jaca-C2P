import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.*;
public class MouseSpy implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent event) {
        System.out.println("Mouse Clicked. x=" + event.getX() + " y=" + event.getY());
    }

    @Override
    public void mousePressed(MouseEvent event) {
       System.out.println("Mouse Pressed. x=" + event.getX() + " y=" + event.getY());
    }

    @Override
    public void mouseReleased(MouseEvent event) {
       System.out.println("Mouse Released. x=" + event.getX() + " y=" + event.getY());
    }

    @Override
    public void mouseEntered(MouseEvent event) {
        System.out.println("Mouse Entered. x=" + event.getX() + " y=" + event.getY());
    }

    @Override
    public void mouseExited(MouseEvent event) {
       System.out.println("Mouse Exited. x=" + event.getX() + " y=" + event.getY());
    }
    
}
