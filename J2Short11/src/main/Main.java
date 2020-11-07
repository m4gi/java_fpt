package main;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

/**
 * @author ADMIN
 *
 * 
 */

public class Main extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JLabel lblNew;
    private JPanel panel;
    private JButton btnNew;
    private JButton btnNew_1;
    private JButton btnNew_2;
    private JButton btnNew_3;
    private JButton btnNew_4;
    private JButton btnNew_5;
    private JButton btnNew_6;
    private JButton btnNew_7;
    private JButton btnNew_8;
    private JButton btnNew_9;
    private JButton btnNew_10;
    private JButton btnNew_11;
    private JButton btnNew_9_1;
    private JButton btnNew_9_1_1;
    private JButton btnX;
    private JButton btnNew_9_1_2_1;
    private JButton btnClear;
    private JButton btnClear_1;
    CalculatorLogic calculatorLogic = new CalculatorLogic();
    String number = "";

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
    }

    private void initComponents() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 521, 612);
	this.contentPane = new JPanel();
	this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(this.contentPane);
	GroupLayout gl_contentPane = new GroupLayout(this.contentPane);
	gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
	                .addGroup(gl_contentPane.createSequentialGroup()
	                                .addComponent(getLblNew(), GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE).addGap(6))
	                .addGroup(gl_contentPane.createSequentialGroup()
	                                .addComponent(getPanel(), GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
	                                .addContainerGap())
	                .addGroup(gl_contentPane.createSequentialGroup().addGap(20)
	                                .addComponent(getBtnClear(), GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE)
	                                .addGap(18).addComponent(getBtnClear_1(), GroupLayout.PREFERRED_SIZE, 213,
	                                                GroupLayout.PREFERRED_SIZE)
	                                .addContainerGap(33, Short.MAX_VALUE)));
	gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
	                .createSequentialGroup().addComponent(getLblNew(), GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
	                .addGap(8).addComponent(getPanel(), GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE).addGap(18)
	                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
	                                .addComponent(getBtnClear(), GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
	                                .addComponent(getBtnClear_1(), GroupLayout.PREFERRED_SIZE, 51,
	                                                GroupLayout.PREFERRED_SIZE))
	                .addContainerGap()));
	this.contentPane.setLayout(gl_contentPane);
    }

    public JLabel getLblNew() {
	if (lblNew == null) {
	    lblNew = new JLabel("");
	    lblNew.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
	    lblNew.setHorizontalAlignment(SwingConstants.RIGHT);
	    lblNew.setFont(new Font("Tahoma", Font.BOLD, 22));
	}
	return lblNew;
    }

    public JPanel getPanel() {
	if (panel == null) {
	    panel = new JPanel();
	    panel.setBackground(Color.LIGHT_GRAY);
	    GroupLayout gl_panel = new GroupLayout(panel);
	    gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel.createSequentialGroup()
	                    .addGap(20)
	                    .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
	                                    .addComponent(getBtnNew(), GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
	                                    .addComponent(getBtnNew_3_1(), GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
	                                    .addComponent(getBtnNew_6(), GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
	                                    .addComponent(getBtnNew_10(), GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
	                    .addGap(30)
	                    .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
	                                    .addComponent(getBtnNew_1_1(), GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
	                                    .addComponent(getBtnNew_4(), GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
	                                    .addComponent(getBtnNew_7(), GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
	                                    .addComponent(getBtnNew_9(), GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
	                    .addGap(34)
	                    .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
	                                    .addComponent(getBtnNew_2_1(), GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
	                                    .addComponent(getBtnNew_11(), GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
	                                    .addComponent(getBtnNew_8(), GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
	                                    .addComponent(getBtnNew_5(), GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
	                    .addGap(38)
	                    .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
	                                    .addComponent(getBtnNew_9_1(), GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
	                                    .addComponent(getBtnNew_9_1_1(), GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
	                                    .addComponent(getBtnX(), GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
	                                    .addComponent(getBtnNew_9_1_2_1(), GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
	                    .addGap(21)));
	    gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel.createSequentialGroup()
	                    .addGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel.createSequentialGroup()
	                                    .addGap(28)
	                                    .addGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
	                                                    .createParallelGroup(Alignment.BASELINE)
	                                                    .addComponent(getBtnNew_1_1(), GroupLayout.DEFAULT_SIZE, 74,
	                                                                    Short.MAX_VALUE)
	                                                    .addComponent(getBtnNew_2_1(), GroupLayout.DEFAULT_SIZE, 74,
	                                                                    Short.MAX_VALUE))
	                                                    .addComponent(getBtnNew(), GroupLayout.DEFAULT_SIZE, 74,
	                                                                    Short.MAX_VALUE))
	                                    .addGap(18)
	                                    .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
	                                                    .addComponent(getBtnNew_3_1(), GroupLayout.PREFERRED_SIZE, 74,
	                                                                    GroupLayout.PREFERRED_SIZE)
	                                                    .addComponent(getBtnNew_4(), GroupLayout.PREFERRED_SIZE, 74,
	                                                                    GroupLayout.PREFERRED_SIZE)
	                                                    .addComponent(getBtnNew_5(), GroupLayout.DEFAULT_SIZE, 74,
	                                                                    Short.MAX_VALUE))
	                                    .addGap(1))
	                                    .addGroup(gl_panel.createSequentialGroup().addGap(29)
	                                                    .addComponent(getBtnNew_9_1(), GroupLayout.DEFAULT_SIZE, 74,
	                                                                    Short.MAX_VALUE)
	                                                    .addGap(18).addComponent(getBtnNew_9_1_1(), GroupLayout.DEFAULT_SIZE,
	                                                                    74, Short.MAX_VALUE)))
	                    .addGap(18)
	                    .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
	                                    .addComponent(getBtnNew_6(), GroupLayout.PREFERRED_SIZE, 74,
	                                                    GroupLayout.PREFERRED_SIZE)
	                                    .addComponent(getBtnNew_7(), GroupLayout.PREFERRED_SIZE, 74,
	                                                    GroupLayout.PREFERRED_SIZE)
	                                    .addComponent(getBtnNew_8(), GroupLayout.PREFERRED_SIZE, 74,
	                                                    GroupLayout.PREFERRED_SIZE)
	                                    .addComponent(getBtnX(), GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
	                    .addGap(18)
	                    .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
	                                    .addComponent(getBtnNew_9_1_2_1(), GroupLayout.PREFERRED_SIZE, 74,
	                                                    GroupLayout.PREFERRED_SIZE)
	                                    .addComponent(getBtnNew_9(), GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
	                                    .addComponent(getBtnNew_10(), GroupLayout.PREFERRED_SIZE, 74,
	                                                    GroupLayout.PREFERRED_SIZE)
	                                    .addComponent(getBtnNew_11(), GroupLayout.PREFERRED_SIZE, 74,
	                                                    GroupLayout.PREFERRED_SIZE))
	                    .addGap(37)));
	    panel.setLayout(gl_panel);
	}
	return panel;
    }

    public JButton getBtnNew() {
	if (btnNew == null) {
	    btnNew = new JButton("7");
	    btnNew.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		    btnNewActionPerformed(e);
		}
	    });
	    btnNew.setHorizontalTextPosition(SwingConstants.CENTER);
	    btnNew.setBorder(new MatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
	    btnNew.setFont(new Font("Tahoma", Font.BOLD, 18));
	}
	return btnNew;
    }

    public JButton getBtnNew_1_1() {
	if (btnNew_1 == null) {
	    btnNew_1 = new JButton("8");
	    btnNew_1.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		    btnNew_1ActionPerformed(e);
		}
	    });
	    btnNew_1.setHorizontalTextPosition(SwingConstants.CENTER);
	    btnNew_1.setFont(new Font("Tahoma", Font.BOLD, 18));
	    btnNew_1.setBorder(new MatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
	}
	return btnNew_1;
    }

    public JButton getBtnNew_2_1() {
	if (btnNew_2 == null) {
	    btnNew_2 = new JButton("9");
	    btnNew_2.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		    btnNew_2ActionPerformed(e);
		}
	    });
	    btnNew_2.setHorizontalTextPosition(SwingConstants.CENTER);
	    btnNew_2.setFont(new Font("Tahoma", Font.BOLD, 18));
	    btnNew_2.setBorder(new MatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
	}
	return btnNew_2;
    }

    public JButton getBtnNew_3_1() {
	if (btnNew_3 == null) {
	    btnNew_3 = new JButton("4");
	    btnNew_3.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		    btnNew_3ActionPerformed(e);
		}
	    });
	    btnNew_3.setHorizontalTextPosition(SwingConstants.CENTER);
	    btnNew_3.setFont(new Font("Tahoma", Font.BOLD, 18));
	    btnNew_3.setBorder(new MatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
	}
	return btnNew_3;
    }

    public JButton getBtnNew_4() {
	if (btnNew_4 == null) {
	    btnNew_4 = new JButton("5");
	    btnNew_4.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		    btnNew_4ActionPerformed(e);
		}
	    });
	    btnNew_4.setHorizontalTextPosition(SwingConstants.CENTER);
	    btnNew_4.setFont(new Font("Tahoma", Font.BOLD, 18));
	    btnNew_4.setBorder(new MatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
	}
	return btnNew_4;
    }

    public JButton getBtnNew_5() {
	if (btnNew_5 == null) {
	    btnNew_5 = new JButton("6");
	    btnNew_5.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		    btnNew_5ActionPerformed(e);
		}
	    });
	    btnNew_5.setHorizontalTextPosition(SwingConstants.CENTER);
	    btnNew_5.setFont(new Font("Tahoma", Font.BOLD, 18));
	    btnNew_5.setBorder(new MatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
	}
	return btnNew_5;
    }

    public JButton getBtnNew_6() {
	if (btnNew_6 == null) {
	    btnNew_6 = new JButton("1");
	    btnNew_6.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		    btnNew_6ActionPerformed(e);
		}
	    });
	    btnNew_6.setHorizontalTextPosition(SwingConstants.CENTER);
	    btnNew_6.setFont(new Font("Tahoma", Font.BOLD, 18));
	    btnNew_6.setBorder(new MatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
	}
	return btnNew_6;
    }

    public JButton getBtnNew_7() {
	if (btnNew_7 == null) {
	    btnNew_7 = new JButton("2");
	    btnNew_7.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		    btnNew_7ActionPerformed(e);
		}
	    });
	    btnNew_7.setHorizontalTextPosition(SwingConstants.CENTER);
	    btnNew_7.setFont(new Font("Tahoma", Font.BOLD, 18));
	    btnNew_7.setBorder(new MatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
	}
	return btnNew_7;
    }

    public JButton getBtnNew_8() {
	if (btnNew_8 == null) {
	    btnNew_8 = new JButton("3");
	    btnNew_8.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		    btnNew_8ActionPerformed(e);
		}
	    });
	    btnNew_8.setHorizontalTextPosition(SwingConstants.CENTER);
	    btnNew_8.setFont(new Font("Tahoma", Font.BOLD, 18));
	    btnNew_8.setBorder(new MatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
	}
	return btnNew_8;
    }

    public JButton getBtnNew_9() {
	if (btnNew_9 == null) {
	    btnNew_9 = new JButton("0");
	    btnNew_9.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		    btnNew_9ActionPerformed(e);
		}
	    });
	    btnNew_9.setHorizontalTextPosition(SwingConstants.CENTER);
	    btnNew_9.setFont(new Font("Tahoma", Font.BOLD, 18));
	    btnNew_9.setBorder(new MatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
	}
	return btnNew_9;
    }

    public JButton getBtnNew_10() {
	if (btnNew_10 == null) {
	    btnNew_10 = new JButton("");
	    btnNew_10.setEnabled(false);
	    btnNew_10.setHorizontalTextPosition(SwingConstants.CENTER);
	    btnNew_10.setFont(new Font("Tahoma", Font.BOLD, 18));
	    btnNew_10.setBorder(new MatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
	}
	return btnNew_10;
    }

    public JButton getBtnNew_11() {
	if (btnNew_11 == null) {
	    btnNew_11 = new JButton(".");
	    btnNew_11.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		    btnNew_11ActionPerformed(e);
		}
	    });
	    btnNew_11.setHorizontalTextPosition(SwingConstants.CENTER);
	    btnNew_11.setFont(new Font("Tahoma", Font.BOLD, 26));
	    btnNew_11.setBorder(new MatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
	}
	return btnNew_11;
    }

    public JButton getBtnNew_9_1() {
	if (btnNew_9_1 == null) {
	    btnNew_9_1 = new JButton("+");
	    btnNew_9_1.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		    btnNew_9_1ActionPerformed(e);
		}
	    });
	    btnNew_9_1.setHorizontalTextPosition(SwingConstants.CENTER);
//	    btnNew_9_1.setBackground(Color.ORANGE);
	    btnNew_9_1.setFont(new Font("Tahoma", Font.BOLD, 18));
	    btnNew_9_1.setBorder(new MatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
	}
	return btnNew_9_1;
    }

    public JButton getBtnNew_9_1_1() {
	if (btnNew_9_1_1 == null) {
	    btnNew_9_1_1 = new JButton("-");
	    btnNew_9_1_1.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		    btnNew_9_1_1ActionPerformed(e);
		}
	    });
	    btnNew_9_1_1.setHorizontalTextPosition(SwingConstants.CENTER);
//	    btnNew_9_1_1.setBackground(Color.ORANGE);
	    btnNew_9_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
	    btnNew_9_1_1.setBorder(new MatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
	}
	return btnNew_9_1_1;
    }

    public JButton getBtnX() {
	if (btnX == null) {
	    btnX = new JButton("x");
	    btnX.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		    btnXActionPerformed(e);
		}
	    });
	    btnX.setHorizontalTextPosition(SwingConstants.CENTER);
//	    btnX.setBackground(Color.ORANGE);
	    btnX.setFont(new Font("Tahoma", Font.BOLD, 18));
	    btnX.setBorder(new MatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
	}
	return btnX;
    }

    public JButton getBtnNew_9_1_2_1() {
	if (btnNew_9_1_2_1 == null) {
	    btnNew_9_1_2_1 = new JButton("/");
	    btnNew_9_1_2_1.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		    btnNew_9_1_2_1ActionPerformed(e);
		}
	    });
	    btnNew_9_1_2_1.setHorizontalTextPosition(SwingConstants.CENTER);
//	    btnNew_9_1_2_1.setBackground(Color.ORANGE);
	    btnNew_9_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
	    btnNew_9_1_2_1.setBorder(new MatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
	}
	return btnNew_9_1_2_1;
    }

    public JButton getBtnClear() {
	if (btnClear == null) {
	    btnClear = new JButton("Clear");
	    btnClear.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		    btnClearActionPerformed(e);
		}
	    });
	    btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
	}
	return btnClear;
    }

    public JButton getBtnClear_1() {
	if (btnClear_1 == null) {
	    btnClear_1 = new JButton("=");
	    btnClear_1.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		    btnClear_1ActionPerformed(e);
		}
	    });
	    btnClear_1.setForeground(Color.WHITE);
	    btnClear_1.setBackground(Color.RED);
	    btnClear_1.setFont(new Font("Tahoma", Font.BOLD, 18));
	}
	return btnClear_1;
    }

    protected void updateView() {
	lblNew.setText(number);
    }

    protected void btnNew_9ActionPerformed(ActionEvent e) {
	number = number + "0";
	updateView();
    }

    protected void btnNew_6ActionPerformed(ActionEvent e) {
	number = number + "1";
	updateView();
    }

    protected void btnNew_7ActionPerformed(ActionEvent e) {
	number = number + "2";
	updateView();
    }

    protected void btnNew_8ActionPerformed(ActionEvent e) {
	number = number + "3";
	updateView();
    }

    protected void btnNew_3ActionPerformed(ActionEvent e) {
	number = number + "4";
	updateView();
    }

    protected void btnNew_4ActionPerformed(ActionEvent e) {
	number = number + "5";
	updateView();
    }

    protected void btnNew_5ActionPerformed(ActionEvent e) {
	number = number + "6";
	updateView();
    }

    protected void btnNewActionPerformed(ActionEvent e) {
	number = number + "7";
	updateView();
    }

    protected void btnNew_1ActionPerformed(ActionEvent e) {
	number = number + "8";
	updateView();
    }

    protected void btnNew_2ActionPerformed(ActionEvent e) {
	number = number + "9";
	updateView();
    }

    protected void btnNew_9_1ActionPerformed(ActionEvent e) {
	number = number + "+";
	updateView();
    }

    protected void btnNew_9_1_1ActionPerformed(ActionEvent e) {
	number = number + "-";
	updateView();
    }

    protected void btnXActionPerformed(ActionEvent e) {
	number = number + "x";
	updateView();
    }

    protected void btnNew_9_1_2_1ActionPerformed(ActionEvent e) {
	number = number + "/";
	updateView();
    }

    protected void btnNew_11ActionPerformed(ActionEvent e) {
	number = number + ".";
	updateView();
    }

    protected void btnClear_1ActionPerformed(ActionEvent e) {
	try {
	    number = calculatorLogic.cal(number);
	    lblNew.setText(number);
	} catch (Exception ex) {
	    number = "0";
	    lblNew.setText(number);
	    JOptionPane.showMessageDialog(contentPane, "Details: " + ex, "Error while calculate...", JOptionPane.ERROR_MESSAGE);
	}
    }

    protected void btnClearActionPerformed(ActionEvent e) {
	number = "";
	lblNew.setText("");
    }

}
