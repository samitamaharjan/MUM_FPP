package equalsreview;

class MyCode {
    public static void main (String[] args) {
        User user1 = new User("Samita Maharjan", "1234659", "06/25/1990");
        User user2 = new User("Samita Maharjan Singh", "1234659", "06/25/1990");
        
        System.out.println(user1.equals(user2));
    }
}

class User {
    private String name;
    private String ssn;
    private String dob;
    
    public User(String name, String ssn, String dob) {
        this.name = name;
        this.ssn = ssn;
        this.dob = dob;
    }
    
    public String getSsn() {
        return ssn;
    }
    
    public String getDob() {
        return dob;
    }
    
    @Override
    public boolean equals(Object ob) {
        if (ob == null || !(ob instanceof User)) return false;
        User user = (User) ob; // type casting
        if (user.getSsn().equals(this.ssn) && user.getDob().equals(this.dob)) {
            return true;
        }
        return false;
    }
}
 