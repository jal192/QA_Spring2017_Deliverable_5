package com.laboon;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StepButton extends JButton {

    private MainPanel _m;
    
	/** 
	 * Add step button listener for step button in main panel
	 */
    public StepButton(MainPanel m) {
	super("Step");
	_m = m;
	addActionListener(new StepButtonListener());
    }

    static class StepButtonListener implements ActionListener {

	public void actionPerformed(ActionEvent e) {
	    // _m.step();
	}
    }    
    
}
