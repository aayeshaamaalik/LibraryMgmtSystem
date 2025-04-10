package org.example;

public class BookAvailableSpecification implements Specification<BookItem> {
    @Override
    public boolean isSatisfiedBy(BookItem bookItem) {
        return bookItem.isAvailable();
    }
}
