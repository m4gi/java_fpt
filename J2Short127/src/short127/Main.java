package short127;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Main extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JPanel panel;
    private JPanel border;
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    Main frame = new Main();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Main() {
        
        initComponents();
        x1 = border.getX();
        y1 = border.getY();
        x2 = x1 + border.getWidth() - panel.getWidth();
        y2 = y1 + border.getHeight() - panel.getHeight();
        System.out.println(x1 + " " + x2 + " " + y1 + " " + y2);
    }

    private void initComponents() {
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                thisKeyPressed(e);
            }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 840, 498);
        this.contentPane = new JPanel();
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        this.contentPane.add(getPanel());
        this.contentPane.add(getBorder());
    }

    public JPanel getPanel() {
        if (panel == null) {
            panel = new JPanel();
            panel.setBackground(Color.RED);
            panel.setBounds(429, 141, 67, 68);
        }
        return panel;
    }

    protected void checkBorder(int x, int y, int w, int h) {
        if (x < x1) {
            x = x1;
        }
        if (x > x2) {
            x = x2;
        }
        if (y < y1) {
            y = y1;
        }
        if (y > y2) {
            y = y2;
        }
        panel.setBounds(x, y, w, h);
    }

    protected void thisKeyPressed(KeyEvent e) {
        char key = e.getKeyChar();
//        System.out.println(e);

        if (key == 'a') {
            checkBorder(panel.getX() - 8, panel.getY(), panel.getWidth(), panel.getHeight());
        }

        if (key == 'w') {
            checkBorder(panel.getX(), panel.getY() - 8, panel.getWidth(), panel.getHeight());
        }

        if (key == 's') {
            checkBorder(panel.getX(), panel.getY() + 8, panel.getWidth(), panel.getHeight());
        }

        if (key == 'd') {
            checkBorder(panel.getX() + 8, panel.getY(), panel.getWidth(), panel.getHeight());
        }

        contentPane.updateUI();
    }

    public JPanel getBorder() {
        if (border == null) {
            border = new JPanel();
            border.setBackground(Color.WHITE);
            border.setBounds(10, 10, 806, 441);
        }
        return border;
    }
}
