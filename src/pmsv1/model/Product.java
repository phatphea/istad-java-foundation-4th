package pmsv1.model;

public class Product {

    private static Long nextId = 1L;

    private Long id;
    private String name;
    private Double price;
    private Integer qty;

    public Product() {
        this("N/A", null, null);
    }

    public Product(String name, Double price, Integer qty){
        this.id = nextId++;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return STR."Product{id=\{id}, name='\{name}', price=\{price}, qty=\{qty}}";
    }
}
