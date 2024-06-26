package developmentCode.controllerAndViews.model;
//reate instances of discounts with specific names and percentage values, and provides methods to access and modify these attributes
public class Discount {
    private int id=-1;
    private String name;
    private double percentage;
    private String discountName;
    private String discountAmount;

    public Discount(){}

    public Discount(String name, double percentage) {
        this.name = name;
        this.percentage = percentage;
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

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public String getDiscountName() {
        return discountName;
    }

    public String getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
    }
}
