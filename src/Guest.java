import java.util.Objects;

class Guest extends Person {

    public Guest(String name, String contactNumber) {
        super(name, contactNumber);
    }

    @Override
    public void displayInfo() {
        System.out.println("Guest Name: " + getName());
        System.out.println("Contact Number: " + getContactNumber());
        System.out.println("------------------------");
    }

    @Override
    public String toString() {
        return "Guest{" +
                "name='" + getName() + '\'' +
                ", contactNumber='" + getContactNumber() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guest guest = (Guest) o;
        return Objects.equals(getName(), guest.getName()) &&
                Objects.equals(getContactNumber(), guest.getContactNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getContactNumber());
    }
}
