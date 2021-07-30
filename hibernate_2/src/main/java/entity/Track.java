package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Track")
public class Track {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;

    @ManyToMany(mappedBy = "tracks")
    private List<Ordered> orders = new ArrayList<>();

    public Track() {
    }

    public Track(String title) {
        this.title = title;
    }
    /////////

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Ordered> getOrders() {
        return orders;
    }

    public void setOrders(List<Ordered> orders) {
        this.orders = orders;
    }
}