package com.digitek.mathclass;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import org.junit.Assert;

@RunWith(Parameterized.class)
public class MathClassExamplesParamTest4 {
  @Parameter(0)
  public double expected;
  @Parameter(1)
  public double number1;
  @Parameter(2)
  public double number2;
  
  @Parameters
  public static Collection<Object[]> values(){
	  Object params[][]=new Object[][]{{8,2,3},{16,4,2},{9,3,2}};
	  return Arrays.asList(params);
  }
	  
  @Test
  public void powTest(){
	  double actualResult= MathClassExamples.pow(number1,number2);
	  Assert.assertEquals(expected, actualResult,0); 
	  }
	  
  }

