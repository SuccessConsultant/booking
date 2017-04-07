/**
 *
 * @author Emmanuel Haastrup
 */
public class Customer extends Person{
    private String type;
    Customer(String name,String age,String type){
        super(name,age);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    
}
