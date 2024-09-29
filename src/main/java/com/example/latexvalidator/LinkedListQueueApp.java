/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.latexvalidator;

/**
 * App class to test LinkedListQueue interface implementation
 */
public class LinkedListQueueApp {
    public static void main(String[] args) {
        LinkedListQueue <String> lqueue = new LinkedListQueue<>();
        
        System.out.println("Creating Linked Queue....");
        //System.out.println("What's at the front? "+lqueue.peek());
        //System.out.println("Queue contents: "+lqueue.toString());
        //System.out.println("Removing something"+lqueue.dequeue());
        
        System.out.println("*************************");
        System.out.println("Adding Greebo");
        lqueue.enqueue("Greebo");
        System.out.println("After adding Greebo:");
        System.out.println("What's at the front? "+lqueue.peek());
        System.out.println("Who's still queuing: "+lqueue.toString());
        
        System.out.println("*************************");
        System.out.println("Adding Ogg");
        lqueue.enqueue("Ogg");
        System.out.println("After adding Greebo:");
        System.out.println("What's at the front? "+lqueue.peek());
        System.out.println("Who's still queuing: "+lqueue.toString());
        
        System.out.println("*************************");
        System.out.println("Adding Weatherwax");
        lqueue.enqueue("Weatherwax");
        System.out.println("After adding Greebo:");
        System.out.println("What's at the front? "+lqueue.peek());
        System.out.println("Who's still queuing: "+lqueue.toString());
        
        System.out.println("*************************");
        System.out.println("Greebo needs to run");
        lqueue.dequeue();
        System.out.println("After dequeue");
        System.out.println("What's at the front? "+lqueue.peek());
        System.out.println("Who's still queuing: "+lqueue.toString());
    }
}
