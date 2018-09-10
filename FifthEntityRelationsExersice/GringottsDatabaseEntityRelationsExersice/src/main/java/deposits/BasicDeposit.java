package deposits;

import wizards.BasicWizard;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "deposits")
public class BasicDeposit implements Deposit {
    @Id
    @Column(name = "deposit_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Basic
    private String depositGroup;
    @Basic
    private String depositStartDate;
    @Basic
    private String depositExpirationDate;
    @Basic
    private double depositAmount;
    @Basic
    private double depositInterest;
    @Basic
    private double depositCharge;

    @ManyToOne()
    @JoinColumn(name = "wizards",referencedColumnName = "wizard_id")
    private BasicWizard basicWizard;

    public BasicDeposit(String depositGroup, String depositStartDate, String depositExpirationDate, double depositAmount, double depositInterest, double depositCharge) {
        this.depositGroup = depositGroup;
        setDepositStartDate(depositStartDate);
        setDepositExpirationDate(depositExpirationDate);
        this.depositAmount = depositAmount;
        this.depositInterest = depositInterest;
        this.depositCharge = depositCharge;
    }

    public BasicDeposit() {
    }

    @Override
    public String getDepositGroup() {
        return depositGroup;
    }

    @Override
    public void setDepositGroup(String depositGroup) {
        this.depositGroup = depositGroup;
    }

    @Override
    public String getDepositStartDate() {
        return depositStartDate;
    }

    @Override
    public void setDepositStartDate(String depositStartDate) {
        String[] startDate = depositStartDate.split("-");

        if (startDate.length != 3){
            throw new IllegalArgumentException("The deposit start date should be in the format yyyy-mm-dd");
        }else{
            if (startDate[0].length() != 4 && startDate[1].length() != 2 && startDate[2].length() != 2){
                throw new IllegalArgumentException("The deposit start date should be in the format yyyy-mm-dd");
            }

            this.depositStartDate = depositStartDate;
        }
    }

    @Override
    public String getDepositExpirationDate() {
        return depositExpirationDate;
    }

    @Override
    public boolean isDepositExpired() {
        if (this.depositExpirationDate != null && this.depositStartDate != null) {
            throw new IllegalArgumentException("Deposit don't have start or end date, please set them !!!");
        }
        String[] endDate = this.depositExpirationDate.split("-");
        int endYear = Integer.parseInt(endDate[0]);
        int endMonth = Integer.parseInt(endDate[1]);
        int endDay = Integer.parseInt(endDate[2]);
        Calendar firstDate = Calendar.getInstance();
        Calendar secondDate = Calendar.getInstance();
        secondDate.set(endYear, endMonth - 1, endDay, 0, 0);

        int comparison = firstDate.compareTo(secondDate);

        if (comparison >= 0) {
            return false;
        } else {
            return true;
        }

    }

    @Override
    public void setDepositExpirationDate(String depositExpirationDate) {
        String[] endDate = depositExpirationDate.split("-");

        if (endDate.length != 3){
            throw new IllegalArgumentException("The deposit end date should be in the format yyyy-mm-dd");
        }else{
            if (endDate[0].length() != 4 && endDate[1].length() != 2 && endDate[2].length() != 2){
                throw new IllegalArgumentException("The deposit end date should be in the format yyyy-mm-dd");
            }

            this.depositExpirationDate = depositExpirationDate;
        }
    }

    @Override
    public double getDepositAmount() {
        return depositAmount;
    }

    @Override
    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    @Override
    public double getDepositInterest() {
        return depositInterest;
    }

    @Override
    public void setDepositInterest(double depositInterest) {
        this.depositInterest = depositInterest;
    }

    @Override
    public double getDepositCharge() {
        return depositCharge;
    }

    @Override
    public void setDepositCharge(double depositCharge) {
        this.depositCharge = depositCharge;
    }
}
