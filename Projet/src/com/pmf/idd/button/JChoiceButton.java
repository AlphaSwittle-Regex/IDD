package com.pmf.idd.button;

import javax.swing.JButton;

public class JChoiceButton extends JButton
{
	private boolean success = false;

	public boolean isSuccess()
	{
		return success;
	}

	public void setSuccess(boolean suc)
	{
		this.success = suc;
	}
}
