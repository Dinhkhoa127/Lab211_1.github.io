/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Supporter;

import java.util.Scanner;

/**
 *
 * @author MSI VN
 */
public class tl {
    public static Scanner sc = new Scanner(System.in);
    /**
     * get an int between min and max
     * @param msg
     * @param min
     * @param max
     * @return 
     */
    public static int inputInt(String msg) {
        int data;           
        System.out.println(msg);
        data = Integer.parseInt(sc.nextLine());
        return data;
    }
    /**
     * get a String with no condition
     * @param msg
     * @return 
     */
    public static String inputStr(String msg){
        System.out.println(msg);
        String data = sc.nextLine().trim();
        return data;
    }
    /**
     * get a non blank String
     * @param msg
     * @return 
     */
    public static String inputNonBlankStr(String msg){
        String data;
        do {            
            System.out.println(msg);
            data = sc.nextLine().trim();
        } while (data.length()==0);
        return data;
    }
    /**
     * get a String following a pattern
     * @param msg
     * @param pattern
     * @return 
     */
    public static String inputPattern(String msg, String pattern){
        String data;
        do {            
            System.out.println(msg);
            data = sc.nextLine().trim();
        } while (!data.matches(pattern));
        return data;
    }
}
