package design.principles.solid.dip;


public class Student {
    private Address address;

    public Student() {
        address = new Address();
    }
}

/*
public class Student {
    private Address address;

    public Student() {}

    // setter injection
    setAddress(Address address){
        address = address;
    }
}
*/