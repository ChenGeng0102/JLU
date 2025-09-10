class Client {  
    public static void main(String args[]) {  
        Account acc = new Account("¶ÎÓþ",0.0);  
        acc.deposit(1000);  
        acc.withdraw(2000);  
        acc.deposit(3000);  
        acc.withdraw(4000);  
        acc.withdraw(1000);  
        acc.computeInterest();  
    }  
}  