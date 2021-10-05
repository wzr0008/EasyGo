package Trip.POJO;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="driver")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column
    private String firstname;
    @Column
    private String lastname;
    @Column
    private String phone;
    @Column
    private String email;
    @Column
    private Boolean isAvailable;
    @Column
    private LocalDateTime creeatedAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

    public LocalDateTime getCreeatedAt() {
        return creeatedAt;
    }

    public void setCreeatedAt(LocalDateTime creeatedAt) {
        this.creeatedAt = creeatedAt;
    }

    public Driver() {
    }

    public Driver(int id, String firstname, String lastname, String phone, String email) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.email = email;
    }

    public Driver(int id, String firstname, String lastname, String phone, String email, Boolean isAvailable) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.email = email;
        this.isAvailable = isAvailable;
    }

    public Driver(int id, String firstname, String lastname, String phone, String email, Boolean isAvailable, LocalDateTime creeatedAt) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.email = email;
        this.isAvailable = isAvailable;
        this.creeatedAt = creeatedAt;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", isAvailable=" + isAvailable +
                ", creeatedAt=" + creeatedAt +
                '}';
    }
}
