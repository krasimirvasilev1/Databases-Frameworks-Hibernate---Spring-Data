package FirstOOPIntroduction.Lecture.BirthdayCelebrations;

public class Citizen implements CitizenImpl {
    private String name;
    private String age;
    private String id;
    private String birthdate;


    public Citizen(String name, String age, String id, String birthdate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthdate = birthdate;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getAge() {
        return this.age;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getBirthdate() {
        return this.birthdate;
    }
}
