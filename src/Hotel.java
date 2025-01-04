import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Hotel {
    private String name;
    private String address;
    private String city;
    private String state;
    private String country;
    private String phone;
    private List<Room> rooms;
    private List<Booking> bookings;

    public Hotel(String name, String address, String city, String state, String country, String phone) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.country = country;
        this.phone = phone;
        this.rooms = new ArrayList<>();
        this.bookings = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    // Filter rooms by availability and type
    public List<Room> filterRooms(boolean isAvailable, String type) {
        return rooms.stream()
                .filter(room -> room.isAvailable() == isAvailable && room.getType().equalsIgnoreCase(type))
                .collect(Collectors.toList());
    }

    // Search rooms by room number
    public Room searchRoomByNumber(int roomNumber) {
        return rooms.stream()
                .filter(room -> room.getRoomNumber() == roomNumber)
                .findFirst()
                .orElse(null); // Return null if no room found
    }

    // Search bookings by guest name
    public List<Booking> searchBookingsByGuestName(String guestName) {
        return bookings.stream()
                .filter(booking -> booking.getGuest().getName().equalsIgnoreCase(guestName))
                .collect(Collectors.toList());
    }

    // Sort rooms by price (ascending order)
    public List<Room> sortRoomsByPrice() {
        return rooms.stream()
                .sorted((room1, room2) -> Double.compare(room1.getPricePerNight(), room2.getPricePerNight()))
                .collect(Collectors.toList());
    }

    // Sort bookings by check-in date (ascending order)
    public List<Booking> sortBookingsByCheckInDate() {
        return bookings.stream()
                .sorted((booking1, booking2) -> booking1.getCheckInDate().compareTo(booking2.getCheckInDate()))
                .collect(Collectors.toList());
    }

    public void displayHotelInfo() {
        System.out.println("Hotel Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Country: " + country);
        System.out.println("Phone: " + phone);
        System.out.println("========================");
    }
}
