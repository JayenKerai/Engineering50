package com.sparta.jk.engineering50;

import java.util.ArrayList;
/*
- Shows implementation of Wrapper classes, boxed primitives, autoboxes, numeric promotion, implicit casting and explicit casting
 */
public class Main {
    public static void main(String[] args) {

        int i = 5;
        // Integer Ii = new Integer(i); // Deprecated
        Integer Ii1  = i;
        //System.out.println(Ii);
        System.out.println(Ii1);

        String str = "123";
        int input = Integer.parseInt(str);
        System.out.println(input);

        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(312312222);
        System.out.println(arrayList.get(2));

        //Autoboxing - Automatically convert primitive data-type into corresponding wrapper class
        char c = 'C';
        Character Cc = c; //autoboxing part

        //Unboxing - Opposite of autoboxing. Extracting the primitive data-type from the wrapper class
        int y = 6;
        Integer Ii2 = y; //autoboxing part
        int z = Ii2.intValue(); //unboxing part
        System.out.println(z);

        //numeric promotion or Implicit casting
        int num = 5;
        long num1 = 6;
        System.out.println(num + num1);

        short num2 = 6;
        float num3 = 1.2f;
        System.out.println(num2 + num3);
        double num4 = Math.pow(2, 13);
        double num5 = Math.pow(2, 31) - 1;
        double num6 = num4 + num5;
        System.out.println(num6);

        //implicit casting
        float f = 1.2f;
        double d = 123.0;
        System.out.println(f+d); //double

        short s = 3;
        short s1 = 4;
        int sum = s + s1;
        //short sum = (short) (s + s1); // if you want to keep it as an int
        System.out.println(sum);

        long longVal = 50;
        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVAl = 7;
        short shortVal = 7;

        float resultVal = (long) (shortVal - longVal + floatVal + doubleVal);
        long resultVal1 = (long) (longVal - doubleVal);

    }
}
