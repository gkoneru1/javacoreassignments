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
public class PalindromeTest {
   @Parameter(0)
   public int number;
   @Parameter(1)
   public int expected;
   
   @Parameters
   public static Collection<Object[]> values(){
	   Object params[][]=new Object[][]{{121,121},{235,0},{535,535}};
	   return Arrays.asList(params);
	   
  }
   
   @Test
   public void palindromeTest(){
	   
	   int actualResult= Palindrome.palindrome(number);
	   Assert.assertEquals(expected, actualResult);
   }
	
	
	
}
