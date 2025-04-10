package org.example;

import java.util.Date;

public class Reservation {
    private String reservationId;
    private Member member;
    private BookItem bookItem;
    private Date reservationDate;
    private ReservationStatus status;

    // Constructor
    public Reservation(String reservationId, Member member, BookItem bookItem, Date reservationDate) {
        this.reservationId = reservationId;
        this.member = member;
        this.bookItem = bookItem;
        this.reservationDate = reservationDate;
        this.status = ReservationStatus.PENDING; // Default status
    }

    // Getters
    public String getReservationId() {
        return reservationId;
    }

    public Member getMember() {
        return member;
    }

    public BookItem getBookItem() {
        return bookItem;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public ReservationStatus getStatus() {
        return status;
    }

    // Method to update reservation status
    public void updateStatus(ReservationStatus status) {
        this.status = status;
    }
}

