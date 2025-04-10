package org.example;

// LibraryTransaction.java
public class LibraryTransaction implements Transaction {
    @Override
    public void commit() {
        System.out.println("Transaction committed.");
    }

    @Override
    public void rollback() {
        System.out.println("Transaction rolled back.");
    }
}