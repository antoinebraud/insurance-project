package data;

public abstract class Contract{

    private double monthlyPrice;
    private double clientIncome;
    private long contractId;

    public Contract(double income){
        this.clientIncome = income;
        this.contractId = System.currentTimeMillis();
    }

    public abstract void claimRefunds();

}