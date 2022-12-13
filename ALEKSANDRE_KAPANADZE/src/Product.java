public class Product {

    private Long id;
    private String Name;
    private String Type;
    private Integer Amount;

    public Product() {
    }

    public Product(Long id, String Name, String Type, Integer Amount) {
        this.id = id;
        this.Name = Name;
        this.Type = Type;
        this.Amount = Amount;
    }

    public Product(String Name, String Type, Integer Amount) {
        this.Name = Name;
        this.Type = Type;
        this.Amount = Amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        this.Type = type;
    }

    public Integer getAmount() {
        return Amount;
    }

    public void setAmount(Integer amount) {
        this.Amount = amount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Type='" + Type + '\'' +
                ", Amount=" + Amount +
                '}';
    }

}
