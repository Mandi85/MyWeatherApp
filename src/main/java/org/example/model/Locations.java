package org.example.model;

import javax.persistence.*;
import java.util.UUID;
@Entity
@Table
public class Locations {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private double lattitude;
    private double longitude;
    private String region;
    private String country;

    public Locations(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;

    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Locations(double lattitude) {
        this.lattitude = lattitude;
    }

    public double getLattitude() {
        return lattitude;

    }

    public void setLattitude(double lattitude) {
        this.lattitude = lattitude;
    }

    public double getLongitude() {
        return longitude;

    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public Locations(String region) {
        this.region = region;
    }

    public String getRegion() {
        return region;

    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;

    }

    public void setCountry(String country) {
        this.country = country;
    }
}
