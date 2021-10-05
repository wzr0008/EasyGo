package Trip.POJO;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="Trips")
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column
    private int driverId;
    @Column
    private int riderId;
    @Column
    private String origin;
    @Column
    private String destination;
    @Column
    private int status;
    @Column
    private LocalDateTime createdAt;
    @Column
    private LocalDateTime updatedAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public int getRiderId() {
        return riderId;
    }

    public void setRiderId(int riderId) {
        this.riderId = riderId;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "id=" + id +
                ", driverId=" + driverId +
                ", riderId=" + riderId +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", status=" + status +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }

    public Trip(int id, int driverId, int riderId, String origin, String destination, int status, LocalDateTime createdAt) {
        this.id = id;
        this.driverId = driverId;
        this.riderId = riderId;
        this.origin = origin;
        this.destination = destination;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt=LocalDateTime.now();
    }

    public Trip(int id, int driverId, int riderId, String origin, String destination, int status) {
        this.id = id;
        this.driverId = driverId;
        this.riderId = riderId;
        this.origin = origin;
        this.destination = destination;
        this.status = status;
        this.updatedAt=LocalDateTime.now();
        this.createdAt=LocalDateTime.now();
    }

}
