package org.example;

public class TitleSpecification implements Specification<BookItem> {
    private String title;

    public TitleSpecification(String title) {
        this.title = title;
    }

    @Override
    public boolean isSatisfiedBy(BookItem bookItem) {
        return bookItem.getTitle().equalsIgnoreCase(title);
    }
}

