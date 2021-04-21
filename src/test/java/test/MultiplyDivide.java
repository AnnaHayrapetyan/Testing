package test;

import org.junit.Test;
import org.testng.Assert;

public class MultiplyDivide {
    @Test

    public void MultiplyMethod(){
        Assert.assertEquals(multiply(7,8),56 );

    }
    @Test
    public void DivideMethod(){
        Assert.assertEquals(divide(100,10),10);
    }
    @Test
    public void Pow(){
        double res = Math.pow(2,3);
        Assert.assertEquals(res,8);
    }
    public int multiply(int i, int j){
        return i*j;
    }
    public int divide (int i, int j){
        return i/j;
    }
    public int pow(int i, int j){
        return (int) Math.pow(i,j);
    }


}

