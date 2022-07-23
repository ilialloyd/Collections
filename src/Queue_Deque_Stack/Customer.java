package Queue_Deque_Stack;

public class Customer {
    public String name;

    public Customer(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public boolean equals(Object object) {
        Customer anotherCustomer = (Customer) object;
        if (this.name != anotherCustomer.name) {
            return false;
        }
        return true;
    }
}
