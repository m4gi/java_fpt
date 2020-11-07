import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CheckPossition implements Runnable {

    private JPanel panel = null;
    private int n = 0;
    boolean stop = false;
    boolean levelUp = false;

    public CheckPossition(JPanel panel) {
	this.panel = panel;
	n = panel.getComponentCount();
    }

    public boolean checkLevelUp() {
	for (int i = 0; i < n - 1; i++) {
	    JLabel temp = (JLabel) panel.getComponent(i);
	    if (temp.getText() == "") continue;
	    if (Integer.parseInt(temp.getText()) != i + 1) return false;
	}
	return true;
    }

    @Override
    public void run() {
	while (!stop) {
	    for (int i = 0; i < n; i++) {
		JLabel temp = (JLabel) panel.getComponent(i);
		if (temp.getText() == "") {
		    temp.setBackground(Color.LIGHT_GRAY);
		    continue;
		}
		if (Integer.parseInt(temp.getText()) == i + 1) {
		    temp.setBackground(Color.green);
		} else temp.setBackground(Color.YELLOW);
	    }
	    levelUp = checkLevelUp();
	}
    }

}
