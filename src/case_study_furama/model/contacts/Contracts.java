package case_study_furama.model.contacts;

public class Contracts {
private String numContracts;
private  String idBooking;
private  int deposit;
private  int sumMoney;
private  String idCustomer;

    public Contracts() {
    }

    public Contracts(String numContracts, String idBooking, int deposit, int sumMoney, String idCustomer) {
        this.numContracts = numContracts;
        this.idBooking = idBooking;
        this.deposit = deposit;
        this.sumMoney = sumMoney;
        this.idCustomer = idCustomer;

    }

    public String getNumContracts() {
        return numContracts;
    }

    public void setNumContracts(String numContracts) {
        this.numContracts = numContracts;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getSumMoney() {
        return sumMoney;
    }

    public void setSumMoney(int sumMoney) {
        this.sumMoney = sumMoney;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Override
    public String toString() {
        return
                "numContracts='" + numContracts +
                ", idBooking " + idBooking +
                ", deposit " + deposit +
                ", sumMoney " + sumMoney +
                ", idCustomer " + idCustomer;
    }
}
