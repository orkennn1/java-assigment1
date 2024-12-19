public class Guest {
    private String name;
    private String contactNumber;


    public Guest(String name, String contactNumber) {
        this.name = name;
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void displayInfo() {
        System.out.println("Guest Name: " + name);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("------------------------");
    }
}
