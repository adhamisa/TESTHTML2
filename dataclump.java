public class Order {
    private String street;
    private String city;
    private String state;
    private String zipCode;

    public Order(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public void printOrderDetails() {
        System.out.println("Street: " + street);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Zip Code: " + zipCode);
    }
    
}
