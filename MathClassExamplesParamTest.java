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
public class MathClassExamplesParamTest {
	 @Parameter(0)
	 public double expected;
	 @Parameter(1)
	 public double Number;
	 
	 
	 
	 @Parameters
	 public static Collection<Object[]> values(){
		 Object params[][] = new Object[][]{{4,16},{5,25},{10,100}};
		 return Arrays.asList(params);
	 }
	 @Test
		public void squareRootTest(){
			double actualResult = MathClassExamples.squareRoot(Number);
			Assert.assertEquals(expected, actualResult,0);
		}
	 
	/* @Parameters
	 public static Collection<Object[]> values1(){
		 Object params[][] = new Object[][]{{7.200489933738588E10,25},{8103.083927575384,9}};
		 return Arrays.asList(params);
	 }
	 
	 @Test
	 public void expTest(){
		 double actualResult1= MathClassExamples.exp(Number);
		 Assert.assertEquals(expected, actualResult1,0);
	 }*/

}
