package com.mbrepo.migselenium.view;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

public class Main {
	public Main() {
		JFrame frame = new JFrame();
        frame.setLayout(new GridLayout(1,1));

        JPanel panel = new JPanel(new MigLayout());
        
	}

}
