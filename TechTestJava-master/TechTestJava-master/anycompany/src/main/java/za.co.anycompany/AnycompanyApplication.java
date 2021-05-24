package za.co.anycompany;

import za.co.anycompany.datalayer.CustomerRepository;
import za.co.anycompany.datalayer.OrderRepository;
import za.co.anycompany.model.Customer;
import za.co.anycompany.model.Order;
import org.json.JSONObject;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;


@RestController
@RequestMapping("/order")
public class anycompany {



    @PostMapping(value = "/order",produces = "application/json",consumes = "application/json")
    public void save(@PathParam("orderId") int orderId, @PathParam("amount") double amount, @PathParam("VAT") double VAT) throws Exception {


        Order order= new TaxCalculator(orderId,amount,VAT);
        order.setOderID(orderId);
        order.setAmount(amount);
		order.setVat(VAT);
        

        order.save();

        
    }
	  @PostMapping(value = "/load",produces = "application/json",consumes = "application/json")
	   public void load(@PathParam("name") String name, @PathParam("customerID") Long customerID, @PathParam("country") String country,@PathParam("dateOfBirth") Date dateOfBirth ) throws Exception {


        Customer customer= new TaxCalculator(name, customerID, country,dateOfBirth);
        customer.setName(name);
        customer.setCustomerID(customerID);
		customer.setCountry(country);
		customer.setDateOfBirth(dateOfBirth);
        

        customer.Load();

        
    }




}