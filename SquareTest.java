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
public class SquareTest {

	@Parameter(0)
	public int number;
	@Parameter(1)
	public int expected;
	
	@Parameters
	public static Collection<Object[]> values(){
		Object params[][]=new Object[][]{{2,4},{9,81},{8,64}};
		return Arrays.asList(params);
	}
	
	@Test
	public void squareTest(){
		int actualResult= Square.square(number);
		Assert.assertEquals(expected, actualResult);
	}
}
