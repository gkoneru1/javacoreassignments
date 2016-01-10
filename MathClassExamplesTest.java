package com.digitek.mathclass;

import org.junit.Assert;
import org.junit.Test;

public class MathClassExamplesTest {
      
	@Test
	public void squareRootTest(){
		double actualResult = MathClassExamples.squareRoot(16);
		Assert.assertEquals(4, actualResult,0);
	}
		
	@Test
	public void findMaxTest(){
		int actualResult= MathClassExamples.findMax(9,5);
		Assert.assertEquals(9,actualResult);
			
	}
	@Test
	public void roundTest(){
		int actualResult= MathClassExamples.round(18.3f);
		Assert.assertEquals(18,actualResult);
	}
	@Test
	public void expTest(){
		double actualResult= MathClassExamples.exp(8.1d);
		Assert.assertEquals(3294.4680752838403,actualResult,0);
	}
	@Test
	public void powTest(){
		double actualResult= MathClassExamples.pow(8.0d,2.0d);
		Assert.assertEquals(64.00,actualResult,0);
	}
		
	}
	

