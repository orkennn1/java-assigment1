public class Room {
    private int roomNumber;
    private String type;
    private double pricePerNight;
    private boolean isAvailable;

    public Room(int roomNumber, String type, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.pricePerNight = pricePerNight;
        this.isAvailable = true;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getType() {
        return type;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void displayInfo() {
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Type: " + type);
        System.out.println("Price per Night: tg" + pricePerNight);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
        System.out.println("------------------------");
    }
}
