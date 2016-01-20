package com.digitek.exercise1;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
@RunWith(Parameterized.class)
public class PrimeTest {
	@Parameter(0)
	public int number;
	@Parameter(1)
	public boolean expected;

	@Parameters
	public static Collection<Object[]> values(){
	Object params[][]=new Object[][]{{2,true},{6,false},{7,true},{8,false}};
	return Arrays.asList(params);
}
	@Test
	public void primeTest(){
		boolean actualResult= Prime.isPrime(number);
		Assert.assertEquals(actualResult, expected);
	}
}

