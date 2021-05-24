package za.co.anycompany.model;

@Entity
@Table 
public class Order {
	@orderId
	@SequenceGenerator(
		name = "order_sequence",
		sequenceName = "order_sequence",
		allocationSize = 1
	)
	
	@GeneratedValue(
		strategy = GenerationType.SEQUENCE,
		Generator = "order_sequence";
	)
    private int orderId;
    private double amount;
    private double VAT;
	
	Order(int orderid, double amount, double vat)
	{
		this.orderId = orderId;
		this.amount=amount;
		this.VAT = vat;
	}
	Order(double amount, double vat)
	{
		
		this.amount=amount;
		this.VAT = vat;
	}
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getVAT() {
        return VAT;
    }

    public void setVAT(double VAT) {
        this.VAT = VAT;
    }
	

}
