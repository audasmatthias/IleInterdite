package mvc.view;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class TilePanel extends JPanel {

    private Image background = null;
    private int w, h;

    public TilePanel(LayoutManager layout) {
        super(layout);
    }

    public void setBackground(Image background) {
        this.background = background;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        w = (int) getSize().getWidth();
        h = (int) getSize().getHeight();
        g.drawImage(background, 0, 0, Math.min(w, h), Math.min(w, h), null);
    }
}
