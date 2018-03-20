package FirstOOPIntroduction.Lecture.BordingControl;

public class Citizen implements CitizenImpl {
    private String name;
    private String age;
    private String id;

    public Citizen(String name, String age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
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
}
