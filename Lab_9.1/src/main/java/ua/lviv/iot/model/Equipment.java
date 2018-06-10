package ua.lviv.iot.model;


import javax.persistence.*;
import javax.ws.rs.Consumes;

@Entity
public class Equipment {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "type")
    private String type;
    @Column(name = "produce_name")
    private String produce_name;
    @Column(name = "weight")
    private double weight;

    public Equipment() {

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduce_name() {
        return produce_name;
    }

    public void setProduce_name(String produce_name) {
        this.produce_name = produce_name;
    }
}