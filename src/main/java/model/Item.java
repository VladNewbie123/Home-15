package model;

public class Item implements InterfaceItem {
    private Long id;
    private String name;
    private Double price;
    private String description;
    private static Long index = 0L;

    public Item() {
        this.id = incrementId();
    }

    public Item(String name, Double price, String description) {
        this.id = incrementId();
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public static long incrementId() {
        return ++index;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId() {

    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName() {

    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public void setPrice() {

    }

    @Override
    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription() {

    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }
}
