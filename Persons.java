
class Person extends TelephoneEntry{
    private String lastName;

    Person(String name, String lastname, String street, String city, String countryCode, String localNumber) {
        super(name, street, city, countryCode, localNumber);
        lastName = lastname;
    }

    void discription() {
        System.out.println(name + " " + lastName);
        address.printAddress();
    }

    String getName() {
        return name + " " + lastName;
    }

    TelephoneNumber getTelephoneNumber() {
        return address.getTelephoneNumber();
    }

    String getAddress() {
        return address.getAddress();
    }
}