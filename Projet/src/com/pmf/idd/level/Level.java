package com.pmf.idd.level;

public class Level
{
	private String firstNode, secondNode, thirdNode;
	private int id;

	public Level(int id, String f, String s, String t)
	{
		this.id = id;
		this.firstNode = f;
		this.secondNode = s;
		this.thirdNode = t;
	}

	public String getFirstNode()
	{
		return firstNode;
	}

	public void setFirstNode(String firstNode)
	{
		this.firstNode = firstNode;
	}

	public String getSecondNode()
	{
		return secondNode;
	}

	public void setSecondNode(String secondNode)
	{
		this.secondNode = secondNode;
	}

	public String getThirdNode()
	{
		return thirdNode;
	}

	public void setThirdNode(String thirdNode)
	{
		this.thirdNode = thirdNode;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}
}
