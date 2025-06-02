class ticketbookingg {
    int bookticket(String des, int day, int month, int year, int pass_count) {
        System.out.println("The destination: " + des);
        System.out.println("DATE: " + day + "-" + month + "-" + year);
        System.out.println("Passenger count: " + pass_count);
        System.out.println("The ticket price is: " + (15000 * pass_count));
        return 0;
    }
}

public class ticketbooking {
    public static void main(String[] args) {
        ticketbookingg tb = new ticketbookingg();
        tb.bookticket("Bali", 2, 7, 2025, 5);
    }
}