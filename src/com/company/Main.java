package com.company;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        System.out.println("Is your input hexadecimal or RGB?");
        Scanner typeInput = new Scanner(System.in);
        String type = typeInput.next();

        if(type.equalsIgnoreCase("hexadecimal")){
            System.out.println("Tell me your hexadecimal code (without the #)");
            Scanner hexInput = new Scanner(System.in);
            String hex = hexInput.next();

            Converter h = new Converter();
            h.getRGB(hex);

        } else if(type.equalsIgnoreCase("RGB")){
            System.out.println("Tell me your RGB values separated by spaces.");
            Scanner rgbInput = new Scanner(System.in);
            int r = rgbInput.nextInt();
            int g = rgbInput.nextInt();
            int b = rgbInput.nextInt();

            Converter rc = new Converter();
            rc.getHex(r,g,b);
        }
    }
}
