package innerclass;

class AnonymousClassExample {
    public static void main (String[] args) {
        new A().hello();
    }
}

class A {
    
    public void hello() {
        x(new B() {
            
            @Override
            public void doIt() {
                System.out.println("Doing it!");
            }
        });
    }
    
    public void x(B b) {
        b.doIt();
    }
}

interface B {
    public void doIt();
}
