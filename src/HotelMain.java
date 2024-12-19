import java.time.LocalDate;

public class HotelMain {
    public static void main(String[] args) {

        Room room1 = new Room(101, "Single", 50000);
        Room room2 = new Room(102, "Double", 80000);

        Guest guest1 = new Guest("Ernur Kypshakbai", "87753456789");
        Guest guest2 = new Guest("Alina Kuanyshkyzy", "87022892424");


        Booking booking1 = new Booking(room1, guest1, LocalDate.of(2024, 6, 1), LocalDate.of(2024, 6, 5));
        Booking booking2 = new Booking(room2, guest2, LocalDate.of(2024, 6, 3), LocalDate.of(2024, 6, 6));


        booking1.displayInfo();
        booking2.displayInfo();

        System.out.println("Room 1 Availability: " + room1.isAvailable());
    }
}

