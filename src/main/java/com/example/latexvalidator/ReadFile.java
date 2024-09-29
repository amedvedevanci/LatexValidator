/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.latexvalidator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author amedv
 */
public class ReadFile {
    public static void main(String[] args) {
        
        //creating two instances of the linked list: one for begin and end tags, one for brackets
        LinkedListQueue <String> tagsList = new LinkedListQueue <>();
        LinkedListQueue <Character> charList = new LinkedListQueue<>();
        
        System.out.println("*****Start of LListQueue created instance lList*****");
        
        //create validator file if it doesn't exist
        try{
            File myObj = new File("validator.txt");
            
            Scanner sc = new Scanner(myObj);
            while(sc.hasNextLine()){
                String beginTag = "\\begin",endTag = "\\end";
                //System.out.println(beginTag);
                
                String nextLine = sc.nextLine();
                if(nextLine.contains(beginTag)){
                    tagsList.enqueue(beginTag);
                    System.out.println(beginTag+" was added to tags queue");
                }
                else if(nextLine.contains(endTag)){
                    tagsList.enqueue(endTag);
                    System.out.println(endTag+" was added to tags queue");
                }
                
                for (int i = 0; i < nextLine.length(); i++) {
                    if(nextLine.charAt(i)=='{' || nextLine.charAt(i)=='}'){
                        charList.enqueue(nextLine.charAt(i));
                        System.out.println(nextLine.charAt(i)+" added to char queue");
                    }
                }
            }
            
            System.out.println("Listing begin and end tags: "+tagsList.toString());
            System.out.println("Listing brackets: "+charList.toString());
        }
        catch(FileNotFoundException e){
            System.out.println("The file could not be found");
            e.printStackTrace();
        }
        catch(IOException e){
            System.out.println("An IO Exception occurred");
            e.printStackTrace();
        }
    }
}
