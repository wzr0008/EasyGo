package OrderPackage.POJO;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    public int getId() {
        return id;
    }

    public int getTripId() {
        return tripId;
    }

    public int getStatus() {
        return status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    @Column
    private int tripId;
    @Column
    private int status;
    @Column
    private LocalDateTime createdAt;
    @Column
    private LocalDateTime updatedAt;

    public Order() {
    }

    public Order(int id, int tripId, int status, LocalDateTime createdAt) {
        this.id = id;
        this.tripId = tripId;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = LocalDateTime.now();
    }

    public Order(int tripId, int status) {
        this.tripId = tripId;
        this.status = status;
        this.updatedAt=LocalDateTime.now();
        this.createdAt=LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "ORDER{" +
                "id=" + id +
                ", tripId=" + tripId +
                ", status=" + status +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
