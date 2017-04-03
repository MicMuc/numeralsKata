package com.mike.curtis;


import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class ArabicToRomanConverterTest {

    ArabicToRomanConverter converter = new ArabicToRomanConverter();

    @Test
    public void romanNumeralConverterCanConvert1(){
        String romanNumeral = converter.convert(1);
        assertThat(romanNumeral, is(equalTo("I")));
    }

    @Test
    public void romanNumeralConverterCanConvert5(){
        String romanNumeral = converter.convert(5);
        assertThat(romanNumeral, is(equalTo("V")));
    }

    @Test
    public void romanNumeralConverterCanConvert10(){
        String romanNumeral = converter.convert(10);
        assertThat(romanNumeral, is(equalTo("X")));
    }

    @Test
    public void romanNumeralConverterCanConvert2(){
        String romanNumeral = converter.convert(2);
        assertThat(romanNumeral, is(equalTo("II")));
    }

    @Test
    public void romanNumeralConverterCanConvert3(){
        String romanNumeral = converter.convert(3);
        assertThat(romanNumeral, is(equalTo("III")));
    }

    @Test
    public void romanNumeralConverterCanConvert4(){
        String romanNumeral = converter.convert(4);
        assertThat(romanNumeral, is(equalTo("IV")));
    }

    @Test
    public void romanNumeralConverterCanConvert9(){
        String romanNumeral = converter.convert(9);
        assertThat(romanNumeral, is(equalTo("IX")));
    }

    @Test
    public void romanNumeralConverterCanConvert6(){
        String romanNumeral = converter.convert(6);
        assertThat(romanNumeral, is(equalTo("VI")));
    }

    @Test
    public void romanNumeralConverterCanConvert7(){
        String romanNumeral = converter.convert(7);
        assertThat(romanNumeral, is(equalTo("VII")));
    }

    @Test
    public void romanNumeralConverterCanConvert8(){
        String romanNumeral = converter.convert(8);
        assertThat(romanNumeral, is(equalTo("VIII")));
    }

    @Test
    public void romanNumeralConverterCanConvert11(){
        String romanNumeral = converter.convert(11);
        assertThat(romanNumeral, is(equalTo("XI")));
    }

    @Test
    public void romanNumeralConverterCanConvert14(){
        String romanNumeral = converter.convert(14);
        assertThat(romanNumeral, is(equalTo("XIV")));
    }

    @Test
    public void romanNumeralConverterCanConvert19(){
        String romanNumeral = converter.convert(19);
        assertThat(romanNumeral, is(equalTo("XIX")));
    }

    @Test
    public void romanNumeralConverterCanConvert20(){
        String romanNumeral = converter.convert(20);
        assertThat(romanNumeral, is(equalTo("XX")));
    }

    @Test
    public void romanNumeralConverterCanConvert30(){
        String romanNumeral = converter.convert(30);
        assertThat(romanNumeral, is(equalTo("XXX")));
    }

    @Test
    public void romanNumeralConverterCanConvert24(){
        String romanNumeral = converter.convert(24);
        assertThat(romanNumeral, is(equalTo("XXIV")));
    }

    @Test
    public void romanNumeralConverterCanConvert29(){
        String romanNumeral = converter.convert(29);
        assertThat(romanNumeral, is(equalTo("XXIX")));
    }

    @Test
    public void romanNumeralConverterCanConvert28(){
        String romanNumeral = converter.convert(28);
        assertThat(romanNumeral, is(equalTo("XXVIII")));
    }

    @Test
    public void romanNumeralConverterCanConvert50(){
        String romanNumeral = converter.convert(50);
        assertThat(romanNumeral, is(equalTo("L")));
    }

    @Test
    public void romanNumeralConverterCanConvert40(){
        String romanNumeral = converter.convert(40);
        assertThat(romanNumeral, is(equalTo("XL")));
    }

    @Test
    public void romanNumeralConverterCanConvert44(){
        String romanNumeral = converter.convert(44);
        assertThat(romanNumeral, is(equalTo("XLIV")));
    }

    @Test
    public void romanNumeralConverterCanConvert89(){
        String romanNumeral = converter.convert(89);
        assertThat(romanNumeral, is(equalTo("LXXXIX")));
    }

    @Test
    public void romanNumeralConverterCanConvert195(){
        String romanNumeral = converter.convert(194);
        assertThat(romanNumeral, is(equalTo("CXCIV")));
    }

}
