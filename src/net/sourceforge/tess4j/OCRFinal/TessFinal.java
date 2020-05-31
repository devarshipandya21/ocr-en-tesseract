/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.sourceforge.tess4j.OCRFinal;

/**
 *
 * @author HP
 */
import java.io.File;
import net.sourceforge.tess4j.*;

public class TessFinal {

    public static void main(String[] args) {
        File imageFile = new File("C:\\Users\\HP\\Desktop\\Input Images\\Hand2.jpg");
        ITesseract instance = new Tesseract();  
         

        try {
            String result = instance.doOCR(imageFile);
            System.out.println(result);
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
    }
}