package entity;


import javax.persistence.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Entity
@Table(name = "automobile")
public class Automobile {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "price")
    private int price;

    @Column(name = "manufacture_date")
    private LocalDate manufacture_date;

    @Column(name = "sell_date")
    private LocalDate sell_date;

    @Column(name = "gear_type")
    @Enumerated(EnumType.STRING)
    private GearType gear_type;

    @Column(name = "fuel_volume")
    private String fuel_volume;

    public Automobile() {

    }

    public Automobile(String title, int price, String manufacture_date, String sell_date, GearType gear_type, String fuel_volume) {
        this.title = title;
        this.price = price;
        this.gear_type = gear_type;
        this.fuel_volume = fuel_volume;

        try {
            this.manufacture_date = LocalDate.parse(manufacture_date, formatter);
            this.sell_date = LocalDate.parse(sell_date, formatter);
            ;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static DateTimeFormatter getFormatter() {
        return formatter;
    }

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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getManufacture_date() {
        return manufacture_date;
    }

    public void setManufacture_date(LocalDate manufacture_date) {
        this.manufacture_date = manufacture_date;
    }

    public LocalDate getSell_date() {
        return sell_date;
    }

    public void setSell_date(LocalDate sell_date) {
        this.sell_date = sell_date;
    }

    public GearType getGear_type() {
        return gear_type;
    }

    public void setGear_type(GearType gear_type) {
        this.gear_type = gear_type;
    }

    public String getFuel_volume() {
        return fuel_volume;
    }

    public void setFuel_volume(String fuel_volume) {
        this.fuel_volume = fuel_volume;
    }

    @Override
    public String toString() {
        return "Automobile [id=" + id + ", title=" + title + ", price=" + price + ", manufacture_date=" + manufacture_date + ", sell_date" + sell_date + ", gear_type" + gear_type + ", fuel_volume" + fuel_volume + "]";
    }
}