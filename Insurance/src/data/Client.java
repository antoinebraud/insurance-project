package data;

import java.util.ArrayList;

public class Client{
    
    private ArrayList<Contract> contractsList;
    private String name;
    private double monthlyIncome;

    public Client(String name){
        this.name = name;
        contractsList = new ArrayList<Contract>();
    }

    public void setName(String name){
        this.name = name;
    }

    public void setContracts(ArrayList<Contract> contracts){
        this.contractsList = contracts;
    }

    public String getName(){
        return this.name;
    }

    public ArrayList<Contract> getContracts(){
        return this.contractsList;
    }

    public void createContract(String type){
        if(type.equals("HOUSING")){
            this.contractsList.add(new HousingContract(this.monthlyIncome));
        }else if(type.equals("AUTO")){
            this.contractsList.add(new AutoContract(this.monthlyIncome));
        }else if(type.equals("VIE")){
            this.contractsList.add(new LiveContract(this.monthlyIncome));
        }
    }

}