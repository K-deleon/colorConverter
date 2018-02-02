package com.company;

public class Converter {

    public String h1, h2, h3;

    public char r1, g1, b1;
    public char r2, g2, b2;
    public int r, g, b;
    public int r1Val, r2Val, g1Val, g2Val, b1Val, b2Val;

    public int hexVal;
    public String revValue;

    public int rToHex1, rToHex2, gToHex1, gToHex2, bToHex1, bToHex2;
    public String rh1, rh2, gh1, gh2, bh1, bh2;


    public Converter(){



    }

    public void getRGB(String h){

        h1  = h.substring(0,2); //divides hex string into 3 parts
        h2  = h.substring(2,4);
        h3  = h.substring(4);

        r1 = h1.charAt(0);
        r2 = h1.charAt(1);
        r1Val = hexValues(r1);
        r2Val = hexValues(r2);

        r = ((16*r1Val)+(r2Val));

        g1 = h2.charAt(0);
        g2 = h2.charAt(1);
        g1Val = hexValues(g1);
        g2Val = hexValues(g2);

        g = ((16*g1Val)+(g2Val));

        b1 = h3.charAt(0);
        b2 = h3.charAt(1);
        b1Val = hexValues(b1);
        b2Val = hexValues(b2);

        b = ((16*b1Val)+(b2Val));

        System.out.println("RGB Triplet: " + r + ", " + g + ", " + b);
    }

    public void getHex(int r, int g, int b){

        rToHex1 = r/16;
        rToHex2 = r - (16 * rToHex1);

        rh1 = revHex(rToHex1);
        rh2 = revHex(rToHex2);

        gToHex1 = g/16;
        gToHex2 = g - (16 * gToHex1);

        gh1 = revHex(gToHex1);
        gh2 = revHex(gToHex2);

        bToHex1 = b/16;
        bToHex2 = b - (16 * bToHex1);

        bh1 = revHex(bToHex1);
        bh2 = revHex(bToHex2);

        System.out.println("#" + rh1 + rh2 + gh1 + gh2 + bh1 + bh2);
    }

    public int hexValues(char c){

        if(c=='0'){
            hexVal = 0;
        } else if(c=='1'){
            hexVal = 1;
        } else if(c=='2'){
            hexVal = 2;
        } else if(c=='3'){
            hexVal = 3;
        } else if(c=='4'){
            hexVal = 4;
        } else if(c=='5'){
            hexVal = 5;
        } else if(c=='6'){
            hexVal = 6;
        } else if(c=='7'){
            hexVal = 7;
        } else if(c=='8'){
            hexVal = 8;
        } else if(c=='9'){
            hexVal = 9;
        } else if(c=='A'||c=='a'){
            hexVal = 10;
        } else if(c=='B'||c=='b'){
            hexVal = 11;
        } else if(c=='C'||c=='c'){
            hexVal = 12;
        } else if(c=='D'||c=='d'){
            hexVal = 13;
        } else if(c=='E'||c=='E'){
            hexVal = 14;
        } else if(c=='F'||c=='f'){
            hexVal = 15;
        }

        return hexVal;
    }

    public String revHex(int i){

        if (i == 0){
            revValue = "0";
        } else if (i == 1){
            revValue = "1";
        } else if (i == 2){
            revValue = "2";
        } else if (i == 3){
            revValue = "3";
        } else if (i == 4){
            revValue = "4";
        } else if (i == 5){
            revValue = "5";
        } else if (i == 6){
            revValue = "6";
        } else if (i == 7){
            revValue = "7";
        } else if (i == 8){
            revValue = "8";
        } else if (i == 9){
            revValue = "9";
        } else if (i == 10){
            revValue = "a";
        } else if (i == 11){
            revValue = "b";
        }else if (i == 12){
            revValue = "c";
        }else if (i == 13){
            revValue = "d";
        }else if (i == 14){
            revValue = "e";
        }else if (i == 15){
            revValue = "f";
        }

        return revValue;
    }

}
