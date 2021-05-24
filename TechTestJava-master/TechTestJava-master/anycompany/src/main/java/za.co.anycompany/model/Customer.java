package za.co.anycompany.model;

import java.util.Date;
@Entity
@Table 
public class Customer {
	
	@customerID
	@SequenceGenerator(
		name = "customer_sequence",
		sequenceName = "customer_sequence",
		allocationSize = 1
	)
	
	@GeneratedValue(
		strategy = GenerationType.SEQUENCE,
		Generator = "customer_sequence";
	)
    private String name;
	private Long customerID;
    private String country;
    private Date dateOfBirth;
	
	
	Customer(String name, Long ID, String country, Date DoB){
		
		this.name = name;
		this.customerID = ID;
		this.country = country;
		this.dateOfBirth = DoB;
		
	}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
	public void setCustomerID(Long ID){
		this.customerID =ID;
	}
	
	public Long getCustomerID()
	{
		return customerID;
	}
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
