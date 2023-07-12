public class Sbi implements Rbiinterface {
    String passWord;
    String accountNo;
    int  balance;
    private Double rate = 7.2;
    Sbi(String passWord,String accountNo,int balance){
        this.passWord = passWord;
        this.accountNo = accountNo;
        this.balance = balance;
    }

    @Override
    public String addMoney(int money) {
        if(money>0){
            balance+=money;
            return "Money has been added in your account "+ this.balance;
        }
        return "money is negative we cannot add the balance";
    }

    @Override
    public String withdrawMoney(String passWord, int money) {
        if(this.passWord.equals(passWord)){
            if(balance>=money){
                balance-=money;
                return "money has been withdrawn ur account current balance is "+ this.balance;
            }
            else return "Insuffient funds";
        }
        return "PassWord does not matched";
    }

    @Override
    public String checkBalance(String passWord) {
        if(this.passWord.equals(passWord)){
            return "Your Balance is "+ this.balance;
        }
        return "passWord is not correct";
    }

    @Override
    public Double rateOfInterest(int time) {
       return (balance*time*rate)/100;
    }
}
