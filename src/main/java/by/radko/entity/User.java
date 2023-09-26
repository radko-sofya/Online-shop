package by.radko.entity;

import java.time.LocalDate;

public class User {
    private Long id;
    private String username;
    private String password;
    private LocalDate createdDate;
    private Boolean active;

    public User() {
    }

    public User(Long id, String username, String password, LocalDate createdDate, Boolean active) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.createdDate = createdDate;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Boolean getActive() {
        return active;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public int hashCode() {
        int result = 31;
        result += getId() == null ? 0 : getId().hashCode() + 31 * result;
        result += getUsername() == null ? 0 : getUsername().hashCode() + 31 * result;
        result += getPassword() == null ? 0 : getPassword().hashCode() + 31 * result;
        result += getActive() == null ? 0 : getActive().hashCode() + 31 * result;
        result += getCreatedDate() == null ? 0 : getCreatedDate().hashCode() + 31 * result;
        return result;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }

        if (object == null || object.getClass() != getClass()) {
            return false;
        }

        User aThat = (User) object;

        if (aThat.getId() == null || getId() == null) {
            return false;
        }

        if (aThat.getUsername() == null || getUsername() == null) {
            return false;
        }

        if (aThat.getPassword() == null || getPassword() == null) {
            return false;
        }

        if (aThat.getCreatedDate() == null || getCreatedDate() == null) {
            return false;
        }

        if (aThat.getActive() == null || getActive() == null) {
            return false;
        }

        return getId().equals(aThat.getId())
                && getUsername().equals(aThat.getUsername())
                && getPassword().equals(aThat.getPassword())
                && getCreatedDate().equals(aThat.getCreatedDate())
                && getActive().equals(aThat.getActive());
    }

    @Override
    public String toString() {
        return new StringBuilder(getClass().getSimpleName())
                .append("{id = ").append(getId())
                .append(", username = ").append(getUsername())
                .append(", password = ").append(getPassword())
                .append(", createdDate = ").append(getCreatedDate())
                .append(", active = ").append(getActive())
                .append("}")
                .toString();
    }
}
