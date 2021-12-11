package com.vihan.realestate.dto;

import javax.persistence.*;

@Entity
@Table(name = "plat_commission_details")
public class PlatCommissionDetails {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;

    @Column(name = "plot_number")
    private String location;

    @Column(name = "plot_location")
    private String number;

    @Column(name = "plot_id")
    private long plotId;

    @Column(name = "user_id")
    private long userId;

    @Column(name="level")
    private int level;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public long getPlotId() {
        return plotId;
    }

    public void setPlotId(long plotId) {
        this.plotId = plotId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
