/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.latexvalidator;

/**
 *A node class that can be used as the basis of your data structure
 */
public class QNode<T> {
    T element;
    QNode<T> next;

    //constructors
    public QNode() {
    }

    public QNode(T element) {
        this.element = element;
        next = null;
    }

    public QNode(T element, QNode<T> next) {
        this.element = element;
        this.next = next;
    }

    //toString method
    @Override
    public String toString() {
        return "QNode{" + "element=" + element + ", next=" + next + '}';
    }
    
    
    
}
