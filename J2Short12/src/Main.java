import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Main extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JLabel lblLevel;
    private JLabel lblMove;
    private JButton btnReset;
    private JPanel panel;
    private int level = 1;
    private int move = 0;
    private CheckPossition c = null;
    private int emptyIndex = 0;

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
    public void resetPanel() {
	panel.removeAll();
	panel.setLayout(new GridLayout(level + 2, level + 2, 0, 0));
	int[] E = getRandomEntities();
	for (int i = 0; i < E.length; i++) {
	    if (E[i] == E.length) {
		emptyIndex = i;
		JLabel temp = new JLabel("");
		temp.setOpaque(true);
		panel.add(temp);
		continue;
	    }
	    JLabel temp = new JLabel(Integer.toString(E[i]));
	    temp.setHorizontalAlignment(SwingConstants.CENTER);
	    temp.setFont(new Font("Tahoma", Font.BOLD, 28));
	    temp.setOpaque(true);
	    temp.setBorder(new LineBorder(Color.RED));
	    panel.add(temp);
	}
	panel.updateUI();
    }

    public int[] getRandomEntities() {
	int[] E = new int[(int) Math.pow(level + 2, 2)];
	int n = E.length;
	// Int
	for (int i = 0; i < n; i++)
	    E[i] = i + 1;
	for (int i = n - 1; i >= 0; i--) {
	    int w = (int) (Math.random() * 10) % (n - 1);
	    // Random swap
	    int t = E[i];
	    E[i] = E[w];
	    E[w] = t;
	}
	return E;
    }

    public Main() {
	setTitle("Game");
	addKeyListener(new KeyAdapter() {
	    @Override
	    public void keyPressed(KeyEvent e) {
		thisKeyPressed(e);
	    }
	});
	initComponents();
	resetPanel();
	c = new CheckPossition(panel);
	Thread t = new Thread(c);
	t.start();
    }

    private void initComponents() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 624, 585);
	this.contentPane = new JPanel();
	this.contentPane.setBackground(Color.LIGHT_GRAY);
	this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(this.contentPane);
	GroupLayout gl_contentPane = new GroupLayout(this.contentPane);
	gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
	                .createSequentialGroup()
	                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
	                                .createSequentialGroup().addContainerGap()
	                                .addComponent(getLblLevel(), GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE).addGap(74)
	                                .addComponent(getBtnReset(), GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE).addGap(65)
	                                .addComponent(getLblMove(), GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
	                                .addComponent(getPanel(), GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE))
	                .addGap(0)));
	gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
	                .createSequentialGroup().addContainerGap()
	                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
	                                .addComponent(getLblMove(), GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
	                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE, false)
	                                                .addComponent(getLblLevel(), GroupLayout.PREFERRED_SIZE, 58,
	                                                                GroupLayout.PREFERRED_SIZE)
	                                                .addGroup(gl_contentPane.createSequentialGroup().addGap(15).addComponent(
	                                                                getBtnReset(), GroupLayout.PREFERRED_SIZE, 43,
	                                                                GroupLayout.PREFERRED_SIZE))))
	                .addPreferredGap(ComponentPlacement.RELATED)
	                .addComponent(getPanel(), GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE).addGap(0)));
	this.contentPane.setLayout(gl_contentPane);
    }

    public JLabel getLblLevel() {
	if (lblLevel == null) {
	    lblLevel = new JLabel("Level: 1");
	    lblLevel.setFont(new Font("Tahoma", Font.BOLD, 18));
	}
	return lblLevel;
    }

    public JLabel getLblMove() {
	if (lblMove == null) {
	    lblMove = new JLabel("Move: 0");
	    lblMove.setHorizontalAlignment(SwingConstants.RIGHT);
	    lblMove.setFont(new Font("Tahoma", Font.BOLD, 18));
	}
	return lblMove;
    }

    public JButton getBtnReset() {
	if (btnReset == null) {
	    btnReset = new JButton("Reset");
	    btnReset.setFocusable(false);
	    btnReset.setFocusTraversalKeysEnabled(false);
	    btnReset.setFocusPainted(false);
	    btnReset.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		    btnResetActionPerformed(e);
		}
	    });
	    btnReset.setFont(new Font("Tahoma", Font.BOLD, 18));
	}
	return btnReset;
    }

    public JPanel getPanel() {
	if (panel == null) {
	    panel = new JPanel();
	    panel.setBackground(Color.WHITE);
	}
	return panel;
    }

    protected void updateLabel(JLabel a, JLabel b) {
	a.setHorizontalAlignment(SwingConstants.CENTER);
	a.setFont(new Font("Tahoma", Font.BOLD, 28));
	a.setBorder(new LineBorder(Color.RED));
	b.setBorder(new LineBorder(Color.RED));
	a.setText(b.getText());
	b.setText("");
	move++;
    }

    protected void btnResetActionPerformed(ActionEvent e) {
	level = 1;
	move = 0;
	c.stop = true;
	resetPanel();
	c = new CheckPossition(panel);
	Thread t = new Thread(c);
	t.start();
    }

    protected void thisKeyPressed(KeyEvent e) {

	char key = e.getKeyChar();
	JLabel a = null;
	JLabel b = null;
	try {
	    switch (key) {

	    case 'a':
		if (emptyIndex % (level + 2) == level + 1) break;
		a = (JLabel) panel.getComponent(emptyIndex);
		b = (JLabel) panel.getComponent(emptyIndex + 1);
		emptyIndex += 1;
		updateLabel(a, b);
		break;
	    case 'w':
		a = (JLabel) panel.getComponent(emptyIndex);
		b = (JLabel) panel.getComponent(emptyIndex + (level + 2));
		emptyIndex += level + 2;
		updateLabel(a, b);
		break;
	    case 's':
		a = (JLabel) panel.getComponent(emptyIndex);
		b = (JLabel) panel.getComponent(emptyIndex - (level + 2));
		emptyIndex -= level + 2;
		updateLabel(a, b);
		break;
	    case 'd':
		if (emptyIndex % (level + 2) == 0) break;
		a = (JLabel) panel.getComponent(emptyIndex);
		b = (JLabel) panel.getComponent(emptyIndex - 1);
		emptyIndex -= 1;
		updateLabel(a, b);
		break;
	    }
	} catch (Exception ex) {
	    // Move out of border
	}

	lblMove.setText("Move: " + Integer.toString(move));
	if (c.levelUp) {
	    level++;
	    c.stop = true;
	    resetPanel();
	    c = new CheckPossition(panel);
	    Thread t = new Thread(c);
	    t.start();
	    c.levelUp = false;
	}
	lblLevel.setText("Level: " + Integer.toString(level));
    }

}
