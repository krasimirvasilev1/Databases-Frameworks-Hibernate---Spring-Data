package deposits;

public interface Deposit {
    String getDepositGroup();

    void setDepositGroup(String depositGroup);

    String getDepositStartDate();

    void setDepositStartDate(String depositStartDate);

    double getDepositAmount();

    void setDepositAmount(double depositAmount);

    double getDepositInterest();

    void setDepositInterest(double depositInterest);

    double getDepositCharge();

    void setDepositCharge(double depositCharge);

    String getDepositExpirationDate();

    void setDepositExpirationDate(String depositExpirationDate);

    boolean isDepositExpired();
}
