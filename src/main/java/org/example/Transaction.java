package org.example;

public interface Transaction {
    void commit();
    void rollback();
}
