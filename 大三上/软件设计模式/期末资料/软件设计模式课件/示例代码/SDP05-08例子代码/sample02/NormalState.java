//正常状态：具体状态类  
class NormalState extends AccountState {  
    public NormalState(Account acc) {  
        this.acc = acc;  
    }  
  
public NormalState(AccountState state) {  
        this.acc = state.acc;  
    }  
          
    public void deposit(double amount) {  
        acc.setBalance(acc.getBalance() + amount);  
        stateCheck();  
    }  
      
    public void withdraw(double amount) {  
        acc.setBalance(acc.getBalance() - amount);  
        stateCheck();  
    }  
      
    public void computeInterest()  
    {  
        System.out.println("正常状态，无须支付利息！");  
    }  
      
    //状态转换  
    public void stateCheck() {  
        if (acc.getBalance() > -2000 && acc.getBalance() <= 0) {  
            acc.setState(new OverdraftState(this));  
        }  
        else if (acc.getBalance() == -2000) {  
            acc.setState(new RestrictedState(this));  
        }  
        else if (acc.getBalance() < -2000) {  
            System.out.println("操作受限！");  
        }     
    }     
}    