package collectionframeworks.pms;

public class Product {

    private static Long nextId = 1L; //declare auto generate id

    private Long id;
    private String name;
    private Double price;
    private Integer qty;

    public Product(){
        this("N/A", 0.0, 0);
        this.id = nextId++;
    }

    public Product(String name, Double price, Integer qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
