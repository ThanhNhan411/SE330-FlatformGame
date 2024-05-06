package inputs;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import main.GamePanel;

public class MouseInputs implements MouseListener, MouseMotionListener {

    private GamePanel gamePanel;

    public MouseInputs(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // Implementation code here
        System.out.println("Mouse Dragged");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // Implementation code here
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Implementation code here
        if(e.getButton() == MouseEvent.BUTTON1)
        	gamePanel.getGame().getPlayer().setAttacking(true);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Implementation code here
        System.out.println("Mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Implementation code here
        System.out.println("Mouse Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Implementation code here
        System.out.println("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Implementation code here
        System.out.println("Mouse Exited");
    }
}
