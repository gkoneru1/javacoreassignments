package com.digitek.exercise1;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class EvenOddTest {

	 @Parameter(0)
	 public int input;
	 @Parameter(1)
	 public boolean expected;
	
	 @Parameters
	 public static Collection<Object[]> values(){
		 Object params[][] = new Object[][]{{16,true},{5,false},{11,false},{2,true}};
		 return Arrays.asList(params);
	 }

	 @Test
		public void evenOddTest(){
			boolean actualResult = EvenOdd.evenOdd(input);
			Assert.assertEquals(expected, actualResult);
		}


}


