import java.time.LocalDate;

public class Booking {
    private Room room;
    private Guest guest;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;


    public Booking(Room room, Guest guest, LocalDate checkInDate, LocalDate checkOutDate) {
        this.room = room;
        this.guest = guest;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        room.setAvailable(false); // Комната становится недоступной после бронирования
    }

    public void displayInfo() {
        System.out.println("Booking Details:");
        guest.displayInfo();
        room.displayInfo();
        System.out.println("Check-in Date: " + checkInDate);
        System.out.println("Check-out Date: " + checkOutDate);
        System.out.println("========================");
    }
}
