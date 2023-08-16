package Projekt.service;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IOFile {
    public static List<String> getFileContent(String fileName) {
        LinkedList<String> list = new LinkedList<>();
        java.io.FileReader fr = null;
        try {
            fr = new java.io.FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line;
            do {
                line = br.readLine();
                if (line != null) {
                    list.add(line);
                }

            } while (line != null);
        } catch (Exception ex) {
            Logger.getLogger(IOFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(IOFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return list;
    }

    
    public static void writeContent(String[] list, String fileName) {
        FileWriter fr = null;
        try {
            fr = new FileWriter(fileName, false);
            PrintWriter pw = new PrintWriter(fr);
            for (int i = 0; i < list.length; i++) {
                pw.println(list[i]);
            }
            pw.close();
            fr.close();
        } catch (IOException ex) {
            Logger.getLogger(IOFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(IOFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
