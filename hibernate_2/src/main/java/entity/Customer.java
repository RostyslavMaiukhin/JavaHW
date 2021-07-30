package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "full_name")
    private String fullName;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Ordered> orders = new ArrayList<>();

    public Customer() {
    }

    public Customer(String fullName) {
        this.fullName = fullName;
    }

    public Customer(String fullName, List<Ordered> orders) {
        this.fullName = fullName;
        this.orders = orders;
    }
    //////

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<Ordered> getOrders() {
        return orders;
    }

    public void setOrders(List<Ordered> orders) {
        this.orders = orders;
    }
}