import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Direction {
    private ImagePanel direction;
    private JFrame frame;

    public Direction(ImagePanel direction, JFrame frame) {
        this.direction = direction;
        this.frame = frame;
    }

    public void setupKeybinds() {
        InputMap im = frame.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap am = frame.getRootPane().getActionMap();

        im.put(KeyStroke.getKeyStroke("W"), "moveUp");
        am.put("moveUp", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                direction.setYpos(direction.getYpos() - 10);
                direction.repaint();
            }
        });
        
        im.put(KeyStroke.getKeyStroke("S"), "moveDown");
        am.put("moveDown", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                direction.setYpos(direction.getYpos() + 10);
                direction.repaint();
            }
        });
        
        // im.put(KeyStroke.getKeyStroke("A"), "moveLeft");
        // am.put("moveLeft", new AbstractAction() {
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         direction.setXpos(direction.getXpos() - 10);
        //         direction.repaint();
        //     }
        // });

        // im.put(KeyStroke.getKeyStroke("D"), "moveRight");
        // am.put("moveRight", new AbstractAction() {
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         direction.setXpos(direction.getXpos() + 10);
        //         direction.repaint();
        //     }
        // });
        
    }
}