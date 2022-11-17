
class Company extends TelephoneEntry{

    public Company(String name, String street, String city, String countryCode, String localNumber) {
        super(name, street, city, countryCode, localNumber);
    }

    void discription() {
        System.out.println(name);
        address.printAddress();
        
    }
    
    String getName() {
        return name;
    }

    TelephoneNumber getTelephoneNumber() {
        return address.getTelephoneNumber();
    }

    String getAddress() {
        return address.getAddress();
    }

}
