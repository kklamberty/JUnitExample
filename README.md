# JUnitExample
This repository contains code from a student in data structures to show how 
tests from main methods in Java can be transformed into JUnit tests. This is 
an attempt to make those connections clearer.

This example includes a bag interface with a list of what each method is supposed to do.
The example interface indicates teh return type for removeRandom to be T, but the comment
says the removeRandom method is meant to return true or false (which it does not).
Writing the test helped me notice that small error (either in the comment or in how the bag is implemented).
The tests here are written according to the specification of the interface and ignore the comment.
