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
public class FloatvaluesTest {
  @Parameter(0)
  public float number1;
  @Parameter(1)
  public float number2;
  @Parameter(2)
  public float expected;
  
  @Parameters
  public static Collection<Object[]> values(){
	  Object params[][]=new Object[][]{{2.3f,3.3f,5.6f},{9.1f,8.2f,17.3f},{1.0f,3.0f,4.0f}};
	  return Arrays.asList(params);
  }
  
  @Test
  public void floatvaluesTest(){
	  float actualresult=  Floatvalues.add(number1,number2);
	  Assert.assertEquals(expected, actualresult, 0);
  }
}
