package com.example.abcle.sidisigraveyardcounter;

class GraveyardCounter
{
	private int currentCreatureTotal;
	private int currentLandTotal;
	private int currentOtherTotal;

	GraveyardCounter(){}

	public void reset()
	{
		currentCreatureTotal = currentLandTotal = currentOtherTotal = 0;
	}

	public int getCurrentCreatureTotal(){return currentCreatureTotal;	}
	public void addOneCreature(){	currentCreatureTotal += 1;	}
	public void minusOneCreature()
	{
		if (currentCreatureTotal > 0)
		{
			currentCreatureTotal -= 1;
		}
	}

	public int getCurrentLandTotal(){return currentLandTotal;	}
	public void addOneLand(){	currentLandTotal += 1;	}
	public void minusOneLand()
	{
		if (currentLandTotal > 0)
		{
			currentLandTotal -= 1;
		}
	}

	public int getCurrentOtherTotal(){return currentOtherTotal;	}
	public void addOneOther(){	currentOtherTotal += 1;	}
	public void minusOneOther()
	{
		if (currentOtherTotal > 0)
		{
			currentOtherTotal -= 1;
		}
	}

}
