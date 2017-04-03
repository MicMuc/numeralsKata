package com.mike.curtis;


public class ArabicToRomanConverter {


    public String convert(int romanNumeral) {
        String numeral = "";

        while (romanNumeral >= 100) {
            numeral += "C";
            romanNumeral -= 100;
        }
        if (romanNumeral >= 90){
            numeral += "XC";
            romanNumeral -= 90;
        }
        if (romanNumeral >= 50) {
            numeral += "L";
            romanNumeral -= 50;
        }
        if (romanNumeral >= 40){
            numeral += "XL";
            romanNumeral -= 40;
        }
        while (romanNumeral >= 10) {
            numeral += "X";
            romanNumeral -= 10;
        }
        if(romanNumeral == 9) {
            numeral += "IX";
            romanNumeral -= 9;
        }
        if (romanNumeral >= 5) {
            numeral += "V";
            romanNumeral -= 5;
        }
        if (romanNumeral == 4){
            numeral += "IV";
            romanNumeral -= 4;
        }
        if (romanNumeral < 4) {
            while(romanNumeral > 0){
                numeral += "I";
                romanNumeral --;
            }
        }
        return numeral;
    }
}
