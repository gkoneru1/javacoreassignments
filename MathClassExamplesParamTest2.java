package com.digitek.mathclass;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MathClassExamplesParamTest2 {
	 @Parameter(0)
	 public int expected;
	 @Parameter(1)
	 public float Number1;
	 
	 
	 
	 @Parameters
	 public static Collection<Object[]> values(){
		 Object params[][] = new Object[][]{{16,15.9f},{5,5.2f},{11,10.8f}};
		 return Arrays.asList(params);
	 }
	 @Test
		public void roundTest(){
			double actualResult = MathClassExamples.round(Number1);
			Assert.assertEquals(expected, actualResult,0);
		}

}
