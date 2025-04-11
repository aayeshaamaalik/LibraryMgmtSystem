# Library Management System

This project is an implementation of a Library Management System inspired by the design principles outlined in the [Library Management System](https://github.com/ycwkatie/OOD-Object-Oriented-Design/blob/main/ood/library_management.md) . It provides core functionalities such as book search, reservations, checkouts, returns, overdue fine handling, and payment processing for a typical library environment.

---

## Key Components and Interacting Objects

The following components form the core of the system and work together to support complete library operations:

- **LibraryManagementSystem**: Central controller that manages books, members, reservations, checkouts, returns, notifications, and fine processing.
- **Book**: Represents bibliographic information including title, author, subject, and ISBN.
- **BookItem**: Represents a specific physical copy of a book with a unique barcode, status (e.g., available, loaned), and loan metadata.
- **Member**: Represents a registered user of the library. Tracks checkouts, reservations, and fines.
- **Reservation**: Manages reservation of books by members and tracks reservation status.
- **Fine**: Represents a monetary penalty for returning books past their due dates.
- **Notification**: Represents messages sent to users (e.g., reservation updates or overdue reminders).
- **Enums**: Includes standard enums such as `BookStatus`, `BookFormat`, and `ReservationStatus` for consistency across the system.

---

## User Action Flow

The Library Management System supports the complete user lifecycle—from searching for books to checking them out, returning them, and handling fines. The operations are orchestrated through the public methods of the `LibraryManagementSystem` class, as outlined below:

1. `search(Param param, Specification spec)`  
   Searches the library catalog using parameters such as title, author, or subject.  
   Returns a map of matching `Book` objects and their available copy counts.

2. `makeReservation(Book book, Member member)`  
   Creates a reservation for a book when no copies are currently available.  
   Associates the reservation with the member and updates the book's reservation status.

3. `checkout(BookItem book, Member member)`  
   Allows a member to check out a specific physical copy of a book by:  
   - Setting the `borrowed` and `dueDate` fields  
   - Updating the book item's `BookStatus` to `Loaned`  
   - Recording the member who checked out the book

4. `sendNotification(Notification notification, Member member)`  
   Sends system-generated messages to members.  
   Used to notify about reservation confirmations, book availability, due reminders, or overdue notices.

5. `returnBook(BookItem book)`  
   Handles book return by the member.  
   If the return is past the due date, calculates a `Fine` based on the number of overdue days.  
   Updates the book item's status and clears the borrower assignment.

6. `makePayment(Fine fine, Transaction transaction)`  
   Processes payment for any fines issued during the return process.  
   Records the transaction and clears the member’s outstanding balance.

---

## Getting Started

To set up and run the project locally:

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/library-management-system.git
   ```

2. Navigate to the project directory:
   ```bash
   cd library-management-system
   ```

3. Open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse).

4. Build and run the project  
   Ensure your environment supports Java 8+ and optionally a build tool like Maven or Gradle.

---

## Usage

The system can be simulated using the `LibraryManagementSystem` class. Key actions include:

- Searching and reserving books
- Checking out specific book items
- Returning books and calculating overdue fines
- Sending member notifications
- Processing fine payments

---

## Project Structure

| Component                     | Responsibility                                                  |
|------------------------------|------------------------------------------------------------------|
| `Book`, `BookItem`           | Define metadata and physical instances of books                 |
| `Member`, `Reservation`      | Track registered users and their book reservations              |
| `LibraryManagementSystem`    | Main orchestrator of all business logic                         |
| `Fine`, `Transaction`        | Handle overdue penalties and payment processing                 |
| `Notification`               | Deliver system alerts and updates to users                      |
| `Enums`                      | Define standard status values for books, formats, and reservations |

---

