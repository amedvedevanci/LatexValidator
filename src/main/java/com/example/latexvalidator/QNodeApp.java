/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.latexvalidator;

/**
 * App class to check if QNode is working as expected
 */
public class QNodeApp {
    public static void main(String[] args) {
        
        //create first node, print
        QNode<String> first = new QNode<>("First");
        System.out.println("Adding first node....");
        System.out.println(first.toString());
        
        //try adding next nodes with constructor, print
        QNode<String> third = new QNode<> ("Third");
        QNode<String> second = new QNode<> ("Second",third);
        System.out.println("********************************");
        System.out.println("Adding second and third....");
        System.out.println(first.toString());
        System.out.println(second.toString());
        System.out.println(third.toString());
        
        //link first and second nodes, print
        first.next = second;
        System.out.println("********************************");
        System.out.println("Linking first and second node....");
        System.out.println(first.toString());
        System.out.println(second.toString());
        System.out.println(third.toString());
        
    }
}
