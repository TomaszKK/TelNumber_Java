public class TelephoneNumber implements Comparable<TelephoneNumber>{
    private String countryCode, localNumber;

    public TelephoneNumber(String countryCode, String localNumber) {
        this.countryCode = countryCode;
        this.localNumber = localNumber;
    }

    public void printTelephoneNumber() {
        System.out.println("+" + countryCode + " " + localNumber + "\n");
    }
    
    @Override
    public int compareTo(TelephoneNumber otherNumber) {
        if (this.countryCode.compareTo(otherNumber.countryCode) != 0) {
            return this.countryCode.compareTo(otherNumber.countryCode);
        }
        else {
            return this.localNumber.compareTo(otherNumber.localNumber);
        } 
    }

}