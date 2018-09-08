package label;

import shampoo.BasicShampoo;

import javax.persistence.*;

@Entity
@Table(name="labels")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class BasicLabel implements Label{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id")
    private long id;

    @Basic
    private String label;

    @OneToOne(mappedBy = "label" , targetEntity = BasicShampoo.class,cascade = CascadeType.ALL)
    private BasicShampoo shampoo;

    @Basic
    private String sublabel;

    public BasicLabel() {
    }

    public BasicLabel(String label, String sublabel) {
        this.setLabel(label);
        this.setSublabel(sublabel);
    }

    public BasicLabel(String label) {
        this.label = label;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public BasicShampoo getShampoo() {
        return shampoo;
    }

    @Override
    public void setShampoo(BasicShampoo shampoo) {
        this.shampoo = shampoo;
    }

    @Override
    public String getSublabel() {
        return sublabel;
    }

    @Override
    public void setSublabel(String sublabel) {
        this.sublabel = sublabel;
    }
}
