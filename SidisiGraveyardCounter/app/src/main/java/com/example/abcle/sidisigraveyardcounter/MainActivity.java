package com.example.abcle.sidisigraveyardcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
	GraveyardCounter graveyard;
	TextView creatureCount, landCount, otherCount;
	Button creatureMinusOne, creaturePlusOne, landsPlusOne, landsMinusOne,
	otherPlusOne, otherMinusOne, resetButton;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		graveyard = new GraveyardCounter();

		creatureCount = findViewById(R.id.creatureCount);
		creatureMinusOne = findViewById(R.id.creatureLeftButton);
		creaturePlusOne = findViewById(R.id.creatureRightButton);
		landCount = findViewById(R.id.landsCount);
		landsPlusOne = findViewById(R.id.landsRightButton);
		landsMinusOne = findViewById(R.id.landsLeftButton);
		otherCount = findViewById(R.id.otherCount);
		otherPlusOne = findViewById(R.id.otherRightButton);
		otherMinusOne = findViewById(R.id.otherLeftButton);
		resetButton = findViewById(R.id.resetButton);

		updateCreatureCount();
		updateLandsCount();
		updateOtherCount();

		creatureMinusOne.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				graveyard.minusOneCreature();
				updateCreatureCount();
			}
		});
		creaturePlusOne.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				graveyard.addOneCreature();
				updateCreatureCount();
			}
		});
		landsMinusOne.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				graveyard.minusOneLand();
				updateLandsCount();
			}
		});
		landsPlusOne.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				graveyard.addOneLand();
				updateLandsCount();
			}
		});
		otherMinusOne.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				graveyard.minusOneOther();
				updateOtherCount();
			}
		});
		otherPlusOne.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				graveyard.addOneOther();
				updateOtherCount();
			}
		});
		resetButton.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				graveyard.reset();
				updateOtherCount();
				updateLandsCount();
				updateCreatureCount();
			}
		});
	}

	private void updateOtherCount()
	{
		Integer currentTotal = new Integer(graveyard.getCurrentOtherTotal());
		String displayText = currentTotal.toString();
		otherCount.setText(displayText);
	}

	private void updateLandsCount()
	{
		Integer currentTotal = new Integer(graveyard.getCurrentLandTotal());
		String displayText = currentTotal.toString();
		landCount.setText(displayText);
	}

	public void updateCreatureCount()
	{
		Integer currentTotal = new Integer(graveyard.getCurrentCreatureTotal());
		String displayText = currentTotal.toString();
		creatureCount.setText(displayText);
	}
}
