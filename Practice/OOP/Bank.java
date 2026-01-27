//package Bank;

class Account{
    public String name;
    protected String email;
    private String password;

    //Concept of getters and setters
    public String getpassword(){
        return this.password; // getter
    }
    public void setPassword(String pass){
        this.password = pass;
    }

}
public class Bank {
    public static void main(String args[]){
        Account ac = new Account();
        ac.name = "Parikshit";
        ac.email = "parikshit@gmail.com";
        //ac.password = "hewol";    //Cannot access
        ac.setPassword("abcd"); //Assign the value into passowrd
        System.out.println(ac.getpassword());
    }
    
}
