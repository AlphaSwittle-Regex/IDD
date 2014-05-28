package com.pmf.idd;

import javax.swing.JFrame;
import javax.swing.UIManager;

import com.pmf.idd.frame.ExplanationsFrame;
import com.pmf.idd.frame.GameFrame;

public class Launcher
{
	public static Launcher getLauncher()
	{
		return new Launcher();
	}

	public void launch()
	{
		new ExplanationsFrame();
	}
	
	public void startGame()
	{
		new GameFrame();
	}

	public static void main(String[] args)
	{
		try
		{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		Launcher.getLauncher().launch();
	}
}