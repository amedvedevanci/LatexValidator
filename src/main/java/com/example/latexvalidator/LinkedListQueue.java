/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.latexvalidator;

/**
 *Implement a data structure that will hold the occurrences of tags, 
 * “\begin” tag and an “\end” tag  and provides an implementation for the actions defined in the above interface.
 * 
 * starting with implementing the interface
 */

public class LinkedListQueue<T> implements QueueInterface<T>{

    //vars
    private QNode <T> first;
    private QNode <T> last;

    //constructor setting the first and last elements to null
    public LinkedListQueue() {
        first = null;
        last = null;
    }
    
    
    //add an element to the back of the queue
    @Override
    public void enqueue(T element) {
        //store last element temporarily so that it can be moved
        QNode<T> oldlast = last;
        
        //create a new node under last and pass in the element
        last=new QNode<T>(element);
        
        //if the queue was previously empty, first and last node are the same
        if(first==null){
            first = last;
        }
        //otherwise, link the last node to the previous last stored in the temporary variable
        else{
            oldlast.next=last;
        }
    }

    //remove an element from the front of the queue
    @Override
    public T dequeue() {
        //stop the operation if the queue is empty, as an element of type T cannot be returned in that case
        if(first==null){
            throw new EmptyQueueException();
        }
        
        //define the element to be removed. Element is removed from the front
        T elementToRemove = first.element;
        
        //link the first element to the second, leaving the previous first floating
        first=first.next;
        
        //if the queue is empty now, also set last to be null
        if(first==null){
            last=null;
        }
        //return element that was just removed from the queue
        return elementToRemove;
    }

    //return the element at the front of the queue without making any modifications
    public T peek() {
        //stop the operation if the queue is empty, as an element of type T cannot be returned in that case
        if(first==null){
            throw new EmptyQueueException();
        }
        //otherwise display the first element
        else{
            return first.element;
        }
    }

    //toString method
    public String toString() {
        String output="";
        //set the current node to the first initially
        QNode<T> current=first;
        
        //if the queue is empty, re-using EmptyQueueException
        if(first==null){
            throw new EmptyQueueException();
        }
        //otherwise, iterate through the queue and append the elements along the way
        else{
            while(current!=null){
                if(current == last){
                    output+=current.element;
                    current = current.next;
                }
                else{
                    output+=current.element+" -- ";
                    current=current.next;
                }
            }
        }

        //return result
        return output;
    }
   
}
