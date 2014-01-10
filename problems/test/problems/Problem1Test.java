package problems;

import org.hamcrest.core.IsEqual;
import org.junit.Test;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;

public class Problem1Test {

    @Test
    public void shouldGiveSumOfGivenBinaryNumbers(){
        Problem1 problem1 = new Problem1();
        problem1.setNum1("110");
        problem1.setNum2("01101");
        assertThat("10011", IsEqual.equalTo(problem1.getSum()));
    }

    @Test
    public void shouldConvertBinaryToDecimal() {
        String binary ="10000001";
        Problem1 problem1 = new Problem1();
        problem1.convertToDecimal(binary);
        assertThat( (byte)-127,IsEqual.equalTo(problem1.convertToDecimal(binary)));
        assertThat( (byte)12,IsEqual.equalTo(problem1.convertToDecimal("1100")));
    }


}



//Java - Integer.parseInt() not returning a negative number when radix=2
//
//        If it's always going to be a byte, then this should do the trick:

//        int i = Integer.parseInt("10000001", 2);
//        byte b = (byte) i;
//The integer value will be 129, but when you cast it to a byte it will change to -127.


//You need to read the result into short.
//short res = (short)Integer.parseInt("1111111111001110", 2);
//System.out.println(res);
//This prints -50.