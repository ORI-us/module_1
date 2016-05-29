/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module_1;

/**
 *
 * @author orius
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class SimpleTable extends JFrame
 {
	// Instance attributes used in this example
	private	JPanel		topPanel;
	private	JTable		table;
	private	JScrollPane scrollPane;

	// Constructor of main frame
	public SimpleTable(String[] columnNames, String[][] dataValues)
	{
		setSize( 1000, 120);
		setBackground( Color.gray );

		// Create a panel to hold all other components
		topPanel = new JPanel();
		topPanel.setLayout( new BorderLayout() );
		getContentPane().add( topPanel );

		// Create a new table instance
		table = new JTable( dataValues, columnNames );

		// Add the table to a scrolling pane
		scrollPane = new JScrollPane( table );
		topPanel.add( scrollPane, BorderLayout.CENTER );
	}
}
