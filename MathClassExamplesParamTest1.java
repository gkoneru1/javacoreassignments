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
public class MathClassExamplesParamTest1 {
	 @Parameter(0)
	 public int expected;
	 @Parameter(1)
	 public int Number1;
	 @Parameter(2)
	 public int Number2;
	 
	 
	 @Parameters
	 public static Collection<Object[]> values(){
		 Object params[][] = new Object[][]{{16,15,16},{5,2,5},{10,10,3}};
		 return Arrays.asList(params);
	 }
	 @Test
		public void findMaxTest(){
			double actualResult = MathClassExamples.findMax(Number1,Number2);
			Assert.assertEquals(expected, actualResult,0);
		}

}
