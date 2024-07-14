package com.example.subpackage;

import com.example.Superclass;

public class Subclass extends Superclass {
    public void displaySub() {
        System.out.println("This is the subclass");
    }

    public static void main(String[] args) {
        Subclass subclass = new Subclass();
        subclass.display(); // Calling superclass method
        subclass.displaySub(); // Calling subclass method
    }
}

