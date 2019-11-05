
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author uko.karus
 */
public class number {

    public static void main(String[] args) throws IOException {
        int num = readFromCSV();
        nullviis j = new nullviis(num);
    }

    char cOperatorsArray[] = {'0', '5'};

    private void countOperators(String sReadLine, char[] cArrayOperators) {
        char[] cReadline = sReadLine.toCharArray();
        int iReadLineLength = cReadline.length;
        int iNoOfOperators = cArrayOperators.length;

    }

    public static int readFromCSV() throws IOException {
        FileReader fReader = new FileReader("Create-MyCSV.csv");
        BufferedReader bReader = new BufferedReader(fReader);
        String sReadLine = null;
        while ((sReadLine = bReader.readLine()) != null) {

        }
        return 0;
    }
}
