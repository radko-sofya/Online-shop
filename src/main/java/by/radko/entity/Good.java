package by.radko.entity;

import java.math.BigDecimal;

public class Good {
    private Long id;
    private String name;
    private BigDecimal price;
    private String barcode;
    private Boolean onSale;

    public Good() {
    }

    public Good(Long id, String name, BigDecimal price, String barcode, Boolean onSale) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.barcode = barcode;
        this.onSale = onSale;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getBarcode() {
        return barcode;
    }

    public Boolean getOnSale() {
        return onSale;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public void setOnSale(Boolean onSale) {
        this.onSale = onSale;
    }

    @Override
    public int hashCode() {
        int result = 31;
        result += getId() == null ? 0 : getId().hashCode() + 31 * result;
        result += getName() == null ? 0 : getName().hashCode() + 31 * result;
        result += getPrice() == null ? 0 : getPrice().hashCode() + 31 * result;
        result += getBarcode() == null ? 0 : getBarcode().hashCode() + 31 * result;
        result += getOnSale() == null ? 0 : getOnSale().hashCode() + 31 * result;
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

        Good aThat = (Good) object;

        if (aThat.getId() == null || getId() == null) {
            return false;
        }

        if (aThat.getName() == null || getName() == null) {
            return false;
        }

        if (aThat.getPrice() == null || getPrice() == null) {
            return false;
        }

        if (aThat.getBarcode() == null || getBarcode() == null) {
            return false;
        }

        if (aThat.getOnSale() == null || getOnSale() == null) {
            return false;
        }

        return getId().equals(aThat.getId())
                && getName().equals(aThat.getName())
                && getPrice().equals(aThat.getPrice())
                && getBarcode().equals(aThat.getBarcode())
                && getOnSale().equals(aThat.getOnSale());
    }

    @Override
    public String toString() {
        return new StringBuilder(getClass().getSimpleName())
                .append("{id = ").append(getId())
                .append(", name = ").append(getName())
                .append(", price = ").append(getPrice())
                .append(", barcode = ").append(getBarcode())
                .append(", onSale = ").append(getOnSale())
                .append("}")
                .toString();
    }
}
