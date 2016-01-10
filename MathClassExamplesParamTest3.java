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
public class MathClassExamplesParamTest3 {
	
	@Parameter(0)
	public double expected;
	@Parameter(1)
	public double number;
	
	@Parameters
	public static Collection<Object[]> values(){
		Object params[][]=new Object[][]{{20.085536923187668,3},{2980.9579870417283,8}};
		return Arrays.asList(params);
		}
	@Test
	public void expTest(){
		double actualResult= MathClassExamples.exp(number);
		Assert.assertEquals(expected, actualResult,0);
	}
	

}
