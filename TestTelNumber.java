import java.util.*;
public class TestTelNumber{
    public static void main(String[] args){
        Person person1 = new Person("Tyler", "Johnson", "12 South Street", "New York", "1", "154 887 8952");
        Person person2 = new Person("John", "Smith", "123 Main Street", "London", "44", "123 456 789");
        Person person3 = new Person("Kyle", "Brooks", "Kolorowa 21", "Warszawa", "48", "124 856 477");
        Company company1 = new Company("Google", "1600 Amphitheatre Parkway", "Mountain View", "1", "555 555 1234");
        Company company2 = new Company("Apple", "1 Apple Park Way", "Cupertino", "1", "408 996 1010");
        Company company3 = new Company("Microsoft", "Marszałkowska 26", "Warszawa", "48", "730114819");
       
        TreeMap<TelephoneNumber, TelephoneEntry> telephoneEntries = new TreeMap<TelephoneNumber, TelephoneEntry>();
        telephoneEntries.put(person1.getTelephoneNumber(), person1);
        telephoneEntries.put(person2.getTelephoneNumber(), person2);
        telephoneEntries.put(person3.getTelephoneNumber(), person3);
        telephoneEntries.put(company1.getTelephoneNumber(), company1);
        telephoneEntries.put(company2.getTelephoneNumber(), company2);
        telephoneEntries.put(company3.getTelephoneNumber(), company3);
        
        Iterator<Map.Entry<TelephoneNumber, TelephoneEntry>> iterator = telephoneEntries.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<TelephoneNumber, TelephoneEntry> pair = iterator.next();
            pair.getValue().discription();
        }
    }
}