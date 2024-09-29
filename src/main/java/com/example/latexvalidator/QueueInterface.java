/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.latexvalidator;

/** An interface that defines the following methods:
•	enqueue
•	dequeue
•	peek
•	toString
 */

public interface QueueInterface<T> {
    
    //add an element to the back of the queue
    public void enqueue(T elem);
    
    //remove an element from the front of the queue
    public T dequeue();
    
    //return the element at the front of the queue without making any modifications
    public T peek();
    
    //toString method - return a String of the elements in the queue
    public String toString();
    
}
