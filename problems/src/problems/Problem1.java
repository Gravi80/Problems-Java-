package problems;

//Write a program to sum two binary numbers represented as strings.
//        Input: "110", "01101"
//        Output: "10011"

public class Problem1 {
    int num1;
    int num2;

    public void setNum1(String num1) {
        this.num1 = Integer.parseInt(num1, 2);            // 6
    }

    public void setNum2(String num2) {
        this.num2 = Integer.parseInt(num2, 2);           // 13
    }

    public String getSum() {
        int sum=num1+num2;
        return Integer.toBinaryString(sum);
    }

    public byte convertToDecimal(String binary) {
        int integer = Integer.parseInt(binary, 2);
        return  (byte) integer;
    }
}
