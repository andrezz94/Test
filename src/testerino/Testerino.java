/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testerino;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Testerino {

    /**
     * @param args the command line arguments
     */
    public static void main(String [] args) throws IOException {
        String fileName = "testFile.txt";
        FileOutputStream fos = new FileOutputStream("C://Test/" + fileName);
        String message = "hello!";
        byte [] data = message.getBytes();
        fos.write(data);
    }
}
    

