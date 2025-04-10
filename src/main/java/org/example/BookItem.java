package org.example;

import java.util.Date;

public class BookItem extends Book {
    private String barcode;
    private Date publicationDate;
    private boolean isAvailable;

    // Constructor
    public BookItem(String ISBN, String title, String author, String genre,
                    String barcode, Date publicationDate) {
        super(ISBN, title, author, genre);
        this.barcode = barcode;
        this.publicationDate = publicationDate;
        this.isAvailable = true; // Default to available when added
    }

    // Getters and setters
    public String getBarcode() {
        return barcode;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // toString method for displaying book item details
    @Override
    public String toString() {
        return super.toString() + ", BookItem{" +
                "barcode='" + barcode + '\'' +
                ", publicationDate=" + publicationDate +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
