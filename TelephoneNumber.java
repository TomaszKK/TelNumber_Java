import TelephoneNumber.TelephoneEntry;

public class TelephoneNumber implements Comparable<TelephoneNumber>{
    field countryCode, localNumber;
    public TelephoneNumber(field code, field Number){
        countryCode = code;
        localNumber = Number;
    }

    public int compareTo(TelephoneNumber telephone){
        if(this.countryCode == telephone.countryCode){
            return 0;
        }
        else if(this.countryCode > telephone.countryCode){
            return 1;
        }
        else{
            return -1;
        }
    }

    abstract class TelephoneEntry{

        public TelephoneEntry() {
        }
        
        abstract void desription();

    }
}

public class Persons extends TelephoneEntry{
    String Name, LastName, Address;
}

public class Company extends TelephoneEntry{
    String Name, Adress;
  
}