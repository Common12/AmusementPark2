
import java.sql.Time;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 */
@Entity
@Table
public class User {
    @Id  
     @GeneratedValue(strategy=GenerationType.AUTO)
       private int id;
     @Column
     private String parkname;
     @Column
     private String location;
     @Column
     private String city;
     @Column
     private String email;
     @Column
     private String phone;
   @Column
   Time ctime;
     @Column
          Time otime;
     @Column
    Time sctime;
     @Column
     Time sotime;
     @Column
     private String afees;
     @Column
     private String cfees;
  @Column
 private String imagename;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   

    public String getParkname() {
        return parkname;
    }

    public void setParkname(String parkname) {
        this.parkname = parkname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Time getCtime() {
        return ctime;
    }

    public void setCtime(Time ctime) {
        this.ctime = ctime;
    }

    public Time getOtime() {
        return otime;
    }

    public void setOtime(Time otime) {
        this.otime = otime;
    }

    public Time getSctime() {
        return sctime;
    }

    public void setSctime(Time sctime) {
        this.sctime = sctime;
    }

    public Time getSotime() {
        return sotime;
    }

    public void setSotime(Time sotime) {
        this.sotime = sotime;
    }

    public String getAfees() {
        return afees;
    }

    public void setAfees(String afees) {
        this.afees = afees;
    }

    public String getCfees() {
        return cfees;
    }

    public void setCfees(String cfees) {
        this.cfees = cfees;
    }

    public String getImagename() {
        return imagename;
    }

    public void setImagename(String imagename) {
        this.imagename = imagename;
    }

   
}