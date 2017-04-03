package com.laboon;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RunButton extends JButton {

    private MainPanel _m;
    
	/**
	 * Add run button listener to the run button in main panel
	 */
    public RunButton(MainPanel m) {
	super("Run");
	_m = m;
	addActionListener(new RunButtonListener());
    }

    class RunButtonListener implements ActionListener {

	public void actionPerformed(ActionEvent e) {
	    _m.run();
	}
    }    
    
}
