package collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MyCode {
    
    public static void main (String[] args) {
        List<BankDetails> list = new ArrayList<>();
        list.add(new BankDetails("Alex", "11111111"));
        list.add(new BankDetails("Elaine", "22222222"));
        list.add(new BankDetails("Chad", "44444444"));
        list.add(new BankDetails("Adel", "55555555"));
        list.add(new BankDetails("Edward", "33333333"));
        
        // Command to sort the entries.
        Collections.sort(list, new MyComparator());
        
        for (BankDetails element : list) {
            System.out.println(String.format("%-10s %s",
                                             element.getName(), element.getAcctNumber()));
        }
    }
}

class BankDetails {
    
    BankDetails (String name, String acctNumber) {
        this.name = name;
        this.acctNumber = acctNumber;
    }
    
    public String getName() {
        return name;
    }
    
    public String getAcctNumber() {
        return acctNumber;
    }
    
    
    // Override equals method
    // Implement the code here   
    public boolean equals (Object ob) {
        if (ob == null || ob.getClass() != this.getClass()) {
            return false;
        }
        BankDetails bankOb = (BankDetails) ob;
        return bankOb.getName().equals(this.getName()) 
            && bankOb.getAcctNumber().equals(this.getAcctNumber());
    }
    
    // Override Hash Code
    // Implement the code here 
    public int hashCode() {
        int result = 17;
        result = result * 31 + getName().hashCode();
        result = result * 31 + getAcctNumber().hashCode();
        return result;
    }
    
    // Instance variables declared here
    String name;
    String acctNumber;
}

class MyComparator implements Comparator<BankDetails> {
    
    @Override
    public int compare(BankDetails ob1, BankDetails ob2) {
        int result = ob1.getName().compareTo(ob2.getName());
        if (result == 0) {
            return ob1.getAcctNumber().compareTo(ob2.getAcctNumber());
        } else {
            return result;
        }
    }
}