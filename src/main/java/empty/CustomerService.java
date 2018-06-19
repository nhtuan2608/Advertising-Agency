package empty;

import java.io.IOException;
import java.util.List;

import com.aptech.advertising.entity.Customer;

public interface CustomerService {

    
    /**
     * This method to get ALLcusomer.
     * 
     * @author NguyenHoangTuan
     * @date 2018/05/25
     * @return
     * @throws IOException
     */
    List<Customer> allCutomer() throws IOException;
    
    /**
     * This method to check status insert.
     * 
     * @author NguyenHoangTuan
     * @date 2018/05/25
     * @param customerName
     * @param customerAddress
     * @param customerEmail
     * @param customerPhone
     * @param customerStatus
     * @return
     */

    boolean add(String customerName, String customerAddress, String customerEmail, String customerPhone, String customerStatus) throws IOException;
    
    /**
     * This method to delete customer
     * 
     * @author NguyenHoangTuan
     * @date 2018/05/25
     * @param customerId
     * @return
     */
    Integer deleteCustomer(String customerId) throws IOException;
    
    /**
     * This method to find customer by id.
     * 
     * @author NguyenHoangTuan
     * @date 2018/05/25
     * @param customerId
     * @return
     */
    Customer findCustomerById(int customerId) throws IOException;
    
    /**
     * This method to update customer.
     * 
     * @author NguyenHoangTuan
     * @date 2018/23/05
     * @param customerName
     * @param customerAddress
     * @param customerEmail
     * @param customerPhone
     * @param customerStatus
     * @return
     */
    boolean updateCustomer(Customer customer) throws IOException;
    
}
