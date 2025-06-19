public class CustomerRepositoryImpl implements CustomerRepository {
    public String findCustomerById(String id) {
        return "Customer[ID: " + id + ", Name: Rakesh Kumar]";
    }
}