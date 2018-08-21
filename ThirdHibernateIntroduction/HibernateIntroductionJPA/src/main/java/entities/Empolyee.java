package entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="employees")
class Empolyee {
    private int workerId;
    private String name;
    private Date startDateOfWork;
    private String email;

    public Empolyee(int workerId, String name, Date startDateOfWork,String email) {
        this.workerId = workerId;
        this.name = name;
        this.startDateOfWork = startDateOfWork;
        this.email = email;
    }


    public Empolyee(String name, Date startDateOfWork,String email) {
        this.name = name;
        this.startDateOfWork = startDateOfWork;
        this.email = email;
    }

    public Empolyee() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return this.workerId;
    }

    public void setId(int id) {
        this.workerId = id;
    }

    @Column(name= "name" , length = 150, unique = true)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name= "start_date")
    public Date getstartDateOfWork() {
        return this.startDateOfWork;
    }

    public void setstartDateOfWork(Date startDateOfWork) {
        this.startDateOfWork = startDateOfWork;
    }

    @Column(name = "email_adress",unique = true)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Transient
    public String toString(){
        return String.format("Id - %d,Name - %s,startDateOfWork - %s,",this.workerId,this.name,this.startDateOfWork);
    }
}
