import java.time.LocalDate;

public class HotelMain {
    public static void main(String[] args) {

        // Create Rooms
        Room room1 = new Room(101, "Single", 50000);
        Room room2 = new Room(102, "Double", 80000);
        Room room3 = new Room(103, "Single", 45000);

        // Create Guests
        Guest guest1 = new Guest("Ernur Kypshakbai", "87753456789");
        Guest guest2 = new Guest("Alina Kuanyshkyzy", "87022892424");

        // Create Hotel and add rooms
        Hotel hotel = new Hotel("LuxStay", "123 Luxury St", "Almaty", "Almaty", "Kazakhstan", "+77011234567");
        hotel.addRoom(room1);
        hotel.addRoom(room2);
        hotel.addRoom(room3);

        // Create Bookings
        Booking booking1 = new Booking(room1, guest1, LocalDate.of(2024, 6, 1), LocalDate.of(2024, 6, 5));
        Booking booking2 = new Booking(room2, guest2, LocalDate.of(2024, 6, 3), LocalDate.of(2024, 6, 6));

        hotel.addBooking(booking1);
        hotel.addBooking(booking2);

        // Display Info
        hotel.displayHotelInfo();
        booking1.displayInfo();
        booking2.displayInfo();

        // Filtering: Find available "Single" rooms
        System.out.println("Filtered Rooms (Available Single): ");
        hotel.filterRooms(true, "Single").forEach(Room::displayInfo);

        // Searching: Find room by number
        Room roomSearch = hotel.searchRoomByNumber(102);
        if (roomSearch != null) {
            System.out.println("Room found by number: " + roomSearch);
        } else {
            System.out.println("Room not found.");
        }

        // Searching: Find bookings by guest name
        System.out.println("Bookings for 'Ernur Kypshakbai': ");
        hotel.searchBookingsByGuestName("Ernur Kypshakbai").forEach(Booking::displayInfo);

        // Sorting: Sort rooms by price
        System.out.println("Sorted Rooms by Price: ");
        hotel.sortRoomsByPrice().forEach(Room::displayInfo);

        // Sorting: Sort bookings by check-in date
        System.out.println("Sorted Bookings by Check-in Date: ");
        hotel.sortBookingsByCheckInDate().forEach(Booking::displayInfo);
    }
}
