package converter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.console;
import java.util.Scanner;
import sun.net.www.http.HttpClient;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Arnis
 */
public class Converter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter celsius: ");
        String s = br.readLine();
        int celsius = Integer.parseInt(s);
       ConverterApp conv = new ConverterApp();
       System.out.println(conv.getHtml(s));
        
               

    }
}