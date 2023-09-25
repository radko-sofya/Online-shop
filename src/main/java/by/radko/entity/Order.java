package by.radko.entity;

import java.time.LocalDateTime;

public class Order {
    private Long id;
    private String status;
    private LocalDateTime createdDate;
    private Long userId;

    public Order() {
    }

    public Order(Long id, LocalDateTime createdDate, String status, Long userId) {
        this.id = id;
        this.createdDate = createdDate;
        this.status = status;
        this.userId = userId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public String getStatus() {
        return status;
    }

    public Long getUserId() {
        return userId;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }

        if (object == null || object.getClass() != getClass()) {
            return false;
        }

        Order aThat = (Order) object;

        if (aThat.getId() == null || getId() == null) {
            return false;
        }

        if (aThat.getCreatedDate() == null || getCreatedDate() == null) {
            return false;
        }

        if (aThat.getStatus() == null || getStatus() == null) {
            return false;
        }

        if (aThat.getUserId() == null || getUserId() == null) {
            return false;
        }

        return getId().equals(aThat.getId())
                && getCreatedDate().equals(aThat.getCreatedDate())
                && getStatus().equals(aThat.getStatus())
                && getUserId().equals(aThat.getUserId());
    }

    @Override
    public int hashCode() {
        int prime=31, result = 1;
        result = prime * result + getId().hashCode();
        result = prime * result + getCreatedDate().hashCode();
        result = prime * result + getStatus().hashCode();
        result = prime * result + getUserId().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return new StringBuilder(getClass().getSimpleName())
                .append("{id = ").append(getId())
                .append(", createdDate = ").append(getCreatedDate())
                .append(", status = ").append(getStatus())
                .append(", userId = ").append(getUserId())
                .append("}")
                .toString();
    }
}
