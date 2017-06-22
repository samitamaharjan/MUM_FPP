package assertion;

class AssertionDemo3 {
    
    public static void main (String[] args) {
        BankDetails bankDetails = new BankDetails("Samita", "12345678");
        printBankDetails(bankDetails);
        
        printBankDetails(null);
    }
    
    public static void printBankDetails(BankDetails bankDetails) {
        assert bankDetails != null : "bankDetails object cannot be null";
        
        System.out.printf("Name: %s, Account#: %s%n", 
                          bankDetails.getName(), bankDetails.getAcctNumber());
    }
}

class BankDetails {
    
    // Instance variables declared here
    String name;
    String acctNumber;
    
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
}
