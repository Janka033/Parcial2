package ejemplo2.dto;

import java.io.Serializable;

public class JugueteDTO implements Serializable {
    public Integer Id;
    private String nameProduct;
    private String category;
    private String cost;
    private String amount;

    public JugueteDTO(Integer id, String nameProduct, String category, String cost, String amount) {
        Id = id;
        this.nameProduct = nameProduct;
        this.category = category;
        this.cost = cost;
        this.amount = amount;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "JugueteDTO{" +
                "Id=" + Id +
                ", nameProduct='" + nameProduct + '\'' +
                ", category='" + category + '\'' +
                ", cost='" + cost + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}
