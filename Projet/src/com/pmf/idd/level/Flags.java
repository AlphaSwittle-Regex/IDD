package com.pmf.idd.level;

public class Flags
{
	private boolean firstBool = false;
	private boolean secondBool = false;
	private boolean thirdBool = false;

	public Flags(boolean f, boolean s, boolean t)
	{
		this.firstBool = f;
		this.secondBool = s;
		this.thirdBool = t;
	}

	public boolean isFirstBool()
	{
		return firstBool;
	}

	public void setFirstBool(boolean firstBool)
	{
		this.firstBool = firstBool;
	}

	public boolean isSecondBool()
	{
		return secondBool;
	}

	public void setSecondBool(boolean secondBool)
	{
		this.secondBool = secondBool;
	}

	public boolean isThirdBool()
	{
		return thirdBool;
	}

	public void setThirdBool(boolean thirdBool)
	{
		this.thirdBool = thirdBool;
	}
}
