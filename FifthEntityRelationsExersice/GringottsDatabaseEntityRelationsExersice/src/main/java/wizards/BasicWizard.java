package wizards;

import deposits.BasicDeposit;
import magic_wands.BasicMagicWand;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "wizards")
public class BasicWizard implements Wizard {
    @Id
    @Column(name = "wizard_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "note",length = 150)
    private String notes;

    @Column(name = "wizard_age")
    private int age;

    @OneToOne(optional = false, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "wizard_wand",referencedColumnName = "magic_wand_id")
    private BasicMagicWand magicWand;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<BasicDeposit> basicDeposits;

    public BasicWizard() {
        this.basicDeposits = new HashSet<>();
    }

    public BasicWizard(long id, String firstName, String lastName, String notes, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.notes = notes;
        this.age = age;
        this.basicDeposits = new HashSet<>();
    }

    public BasicWizard(String firstName, String lastName, String notes, int age, BasicMagicWand magicWand) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.notes = notes;
        this.age = age;
        this.magicWand = magicWand;
        this.basicDeposits = new HashSet<>();
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getNotes() {
        return notes;
    }

    @Override
    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public BasicMagicWand getMagicWand() {
        return this.magicWand;
    }

    @Override
    public void setMagicWand(BasicMagicWand magicWand) {
        this.magicWand = magicWand;
    }

    @Override
    public void addDeposit(BasicDeposit deposit) {
        this.basicDeposits.add(deposit);
    }
}
