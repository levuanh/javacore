public class Product {
    private String code;
    private String name;
    private String description;
    private long price;
    private int numberInStock;
    private int numberSales;
    private String brand;
    private Category category;

    public Product(String code, String name, String description, long price, int numberInStock, int numberSales, String brand, Category category) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.price = price;
        this.numberInStock = numberInStock;
        this.numberSales = numberSales;
        this.brand = brand;
        this.category = category;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getNumberInStock() {
        return numberInStock;
    }

    public void setNumberInStock(int numberInStock) {
        this.numberInStock = numberInStock;
    }

    public int getNumberSales() {
        return numberSales;
    }

    public void setNumberSales(int numberSales) {
        this.numberSales = numberSales;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
 
    @Override
    public String toString() {
        return "San pham co" + " code: " + code + " ten san pham: " + name + " mo ta: " + description + " gia: " + price + "so luong: "+ numberInStock + " so luong ban: " +numberSales +  " nhan hieu: " + brand +" danh muc: "+ category.getValue();
    }
}
