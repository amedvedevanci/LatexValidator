/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.latexvalidator;

/**
 * Exception to be thrown when trying to return an element of type T from an empty queue
 */
public class EmptyQueueException extends RuntimeException {

    public EmptyQueueException() {
        super("The queue is empty. Please add some elements to the queue first.");
    }
}
