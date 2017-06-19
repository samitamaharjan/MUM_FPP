package collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class MultiComparable {
    
    public static void main (String[] args) {
        List<BankDetails> list = new ArrayList<>();
        list.add(new BankDetails("Alex", "11111111"));
        list.add(new BankDetails("Elaine", "22222222"));
        list.add(new BankDetails("Chad", "44444444"));
        list.add(new BankDetails("Adel", "55555555"));
        list.add(new BankDetails("Edward", "33333333"));
        
        // Command to sort the entries.
        Collections.sort(list);
        
        for (BankDetails element : list) {
            System.out.println(String.format("%-10s %s",
                                             element.getName(), element.getAcctNumber()));
        }
    }
}

class BankDetails implements Comparable<BankDetails> {
    
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
    
    @Override
    public int compareTo(BankDetails ob) {
        int compareName = this.name.compareTo(ob.name);
        if (compareName == 0) {
            return this.acctNumber.compareTo(ob.acctNumber);
        } else {
            return compareName;
        }
    }
}