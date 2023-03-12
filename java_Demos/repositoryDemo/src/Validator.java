public class Validator {
    public <T extends IEntity> void validator(T entity){
        Validator validator = new Validator();
        Customer customer = new Customer();
        validator.validator(customer);
        
    }
}
