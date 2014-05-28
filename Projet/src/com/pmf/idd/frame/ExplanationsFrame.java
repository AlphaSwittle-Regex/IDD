package com.pmf.idd.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.pmf.idd.Launcher;

public class ExplanationsFrame extends JFrame
{
	private JTextArea textArea = new JTextArea();
	private JScrollPane scrollPane = new JScrollPane(textArea);

	private JButton playButton = new JButton("Play !");

	{
		textArea.setEditable(false);
	}

	{
		playButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				dispose();
				Launcher.getLauncher().startGame();
			}
		});
	}

	public ExplanationsFrame()
	{
		super("Before playing...");
		setSize(620, 320);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(new BorderLayout());

		getContentPane().add(scrollPane, BorderLayout.CENTER);
		getContentPane().add(playButton, BorderLayout.SOUTH);
	}
}
