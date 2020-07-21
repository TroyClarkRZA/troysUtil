/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package troysUtil;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author yolod
 */
public class fileManager {

    public void clear(String Filepath) {
        File FileP = new File(Filepath);
        try {
            try (FileWriter fw = new FileWriter(FileP, false)) {
                fw.write("");
                System.out.println("cleared file");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void WriteToFile(String Filepath, String formattedContent) {
        File FileP = new File(Filepath);
        try {
            try (FileWriter fw = new FileWriter(FileP, true)) {
                fw.write(formattedContent);
                System.out.println("wrote to file");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void JOption_Output_FilePath(String filepath) {
        try {
            String output = "";
            Scanner sc = new Scanner(new File(filepath));
            while (sc.hasNextLine()) {
                output = output + sc.nextLine() + "\n";
            }
            JOptionPane.showMessageDialog(null, output);
            sc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(fileManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String output_FilePath(String filepath) {
        String output = "";
        try {

            Scanner sc = new Scanner(new File(filepath));
            while (sc.hasNextLine()) {
                output = output + sc.nextLine() + "\n";
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(fileManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return output;
    }

    public void JOption_Output_FilePath(String filepath, String delimeter) {
        try {
            String output = "";
            Scanner sc = new Scanner(new File(filepath)).useDelimiter(delimeter);
            while (sc.hasNextLine()) {
                output = output + sc.nextLine() + "\n";
            }
            JOptionPane.showMessageDialog(null, output);
            sc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(fileManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String output_FilePath(String filepath, String delimeter) {
        String output = "";
        try {

            Scanner sc = new Scanner(new File(filepath)).useDelimiter(delimeter);
            while (sc.hasNextLine()) {
                output = output + sc.nextLine() + "\n";
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(fileManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return output;
    }

    public void CreateNewFile(String Filepath) {
        try {
            File newFile = new File(Filepath);
            if (newFile.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
