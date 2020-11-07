
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Draw extends Thread {

    boolean active = true;
    boolean running = true;
    int count = 0;
    JLabel a = null;
    JPanel p = null;
    int ag1 = 90;
    int ag2 = -30;

    public Draw(JLabel a, JPanel p) {
        this.a = a;
        this.p = p;
    }

    public void drawGUI() {
        int x1 = 0;
        int y1 = 0;
        int x2 = x1 + p.getWidth();
        int y2 = y1 + p.getHeight();
        int d = Math.min(p.getWidth(), p.getHeight()) / (3 / 2);
        p.getGraphics().fillArc((x1 + x2) / 2 - d / 2, (y1 + y2) / 2 - d / 2, d, d, ag1, ag2);
        ag2 -= 30;
        if (ag2 < -390) {
            p.getGraphics().clearRect(0, 0, 10000, 10000);
            ag2 = -30;
        }
    }

    public void drawBorder() {
        int x1 = 0;
        int y1 = 0;
        int x2 = x1 + p.getWidth();
        int y2 = y1 + p.getHeight();
        int d = Math.min(p.getWidth(), p.getHeight()) / (3 / 2);
        p.getGraphics().drawOval((x1 + x2) / 2 - d / 2, (y1 + y2) / 2 - d / 2, d, d);
    }

    @Override
    public void run() {
        while (running) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            if (active) {
                count++;
                drawBorder();
                drawGUI();
            }
            if (count > 12) {
                count = 0;
            }
            a.setText("Count: " + count);
        }
    }

}
