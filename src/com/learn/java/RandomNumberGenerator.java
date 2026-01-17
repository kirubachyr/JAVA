package com.learn.java;

import java.util.Random;

public class RandomNumberGenerator {
	
	static int random(int digitCount)
	{
		Random random =new Random();
		int randomNumber=0;
		if(digitCount>=1 && digitCount<=9)
		{
		randomNumber =random.nextInt(digitCount) ;
		}
		else if(digitCount>=10 && digitCount<=99)
		{
			randomNumber =random.nextInt(digitCount) ;
		}
		else if (digitCount>=100 && digitCount<=999)
		{
			randomNumber =random.nextInt(digitCount) ;
		}
		
		return randomNumber;
	}

	public static void main(String[] args) {
		Random random =new Random();
		int randomNumber = random(99);
		System.out.println("Random number is :"+randomNumber);
	}

}
