package lessons_16.practice;

public class Customer {
    Customer(String name) {
        this.name = name;
    }

    String name;
    int ticketNumber;

    public void setName(String name) {
        this.name = name;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getName() {
        return name;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }
}
