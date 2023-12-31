package by.radko.entity;

public class Role {
    private Long id;
    private String name;

    public Role() {
    }

    public Role(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }

        if (object == null || object.getClass() != getClass()) {
            return false;
        }

        Role aThat = (Role) object;

        if (aThat.getId() == null || getId() == null) {
            return false;
        }

        if (aThat.getName() == null || getName() == null) {
            return false;
        }

        return getId().equals(aThat.getId()) && getName().equals(aThat.getName());
    }

    @Override
    public int hashCode() {
        int result = 31;
        result += getId() == null ? 0 : getId().hashCode() + 31 * result;
        result += getName() == null ? 0 : getName().hashCode() + 31 * result;
        return result;
    }

    @Override
    public String toString() {
        return new StringBuilder(getClass().getSimpleName())
                .append("{id = ").append(getId())
                .append(", name = ").append(getName())
                .append("}")
                .toString();
    }
}
