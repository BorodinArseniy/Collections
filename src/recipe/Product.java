package recipe;

import java.util.Objects;

public class Product{
    private String name;
    private Double price;
    private Double count;

    public Product(String name, Double price, Double count) {
        setName(name);
        setPrice(price);
        setCount(count);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null || name.isEmpty()){
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public Double getCount() {
        return count;
    }

    public void setPrice(Double price) {
        if(price==null){
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
        this.price = price;
    }

    public void setCount(Double count) {
        if(count==null){
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
