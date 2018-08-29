package com.example.abcle.sidisigraveyardcounter;

public class GraveyardCounter
{
	int startingTotal, currentCreatureTotal, currentLandTotal, currentOtherTotal;

	public GraveyardCounter()
	{
		startingTotal = currentCreatureTotal = currentLandTotal = currentOtherTotal = 0;
	}

	public void reset()
	{
		currentCreatureTotal = currentLandTotal = currentOtherTotal = 0;
	}

	public int getCurrentCreatureTotal(){return currentCreatureTotal;	}
	public void addOneCreature(){	currentCreatureTotal += 1;	}
	public void minusOneCreature()	{ currentCreatureTotal -= 1;	}

	public int getCurrentLandTotal(){return currentLandTotal;	}
	public void addOneLand(){	currentLandTotal += 1;	}
	public void minusOneLand()	{ currentLandTotal -= 1;	}

	public int getCurrentOtherTotal(){return currentOtherTotal;	}
	public void addOneOther(){	currentOtherTotal += 1;	}
	public void minusOneOther()	{ currentOtherTotal -= 1;	}

}
