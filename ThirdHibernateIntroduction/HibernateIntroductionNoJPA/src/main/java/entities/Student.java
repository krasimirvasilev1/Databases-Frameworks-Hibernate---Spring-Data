package entities;

import java.util.Date;

public class Student {
    private int id;
    private String name;
    private Date registrationDate;

    public Student(int id, String name, Date registrationDate) {
        this.id = id;
        this.name = name;
        this.registrationDate = registrationDate;
    }


    public Student() {

    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getRegistrationDate() {
        return this.registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String toString(){
        return String.format("Id - %d,Name - %s,RegDate - %s",this.id,this.name,this.registrationDate);
    }
}
