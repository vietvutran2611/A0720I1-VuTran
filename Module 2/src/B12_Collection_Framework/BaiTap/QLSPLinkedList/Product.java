package B12_Collection_Framework.BaiTap.QLSPLinkedList;

public class Product {
    private int id;
    private String name;
    private long price;


    public Product() {
    }

    public Product(int id, String name, long price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ID Product: " + id +
                ", Name Product: '" + name + '\'' +
                ", Price Product: " + price;
    }
}
