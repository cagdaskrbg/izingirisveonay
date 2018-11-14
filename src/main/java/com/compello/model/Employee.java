package com.compello.model;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   private String name;

   private String lastName;

   private Date startDate;
   private int availableDays;
    /*@ManyToOne
    @JoinTable(name = "EMPLOYEE", joinColumns = {@JoinColumn(name = "ID")},inverseJoinColumns = {@JoinColumn(name = "ID")})
    private Employee manager;
*/

    @OneToMany
    private List<CompelloDate> holidays;
    private boolean isManager;

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public int getAvailableDays() {
        return availableDays;
    }

    public void setAvailableDays(int availableDays) {
        this.availableDays = availableDays;
    }

    public List<CompelloDate> getHolidays() {
        return holidays;
    }

    public void setHolidays(List<CompelloDate> holidays) {
        this.holidays = holidays;
    }
    /*
    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }


    */
}
