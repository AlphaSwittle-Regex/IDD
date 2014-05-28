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
		textArea.append("\nHello players, this is our IDD project !\n\nThis little interactive game will make you go through all the revolution stages !\n\nSee if you know well the history of the revolution of your country !\n\nIn the game you'll have to reconstitute the events by their chronogical order !\n\nThe game will ask for how many retries do you want, don't worry !\n\n\n\nIf you're ready, press the \"Play\" button below and let's go !");
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
