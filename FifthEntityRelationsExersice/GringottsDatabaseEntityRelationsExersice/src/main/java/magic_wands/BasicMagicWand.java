package magic_wands;

import wizards.BasicWizard;

import javax.persistence.*;

@Entity
@Table(name = "magic_wands")
public class BasicMagicWand implements MagicWand {
    @Id
    @Column(name = "magic_wand_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Basic
    private String magicWandCreator;

    @Basic
    private int magicWandSize;

    @OneToOne(targetEntity = BasicWizard.class,cascade = CascadeType.ALL)
    private BasicWizard basicWizard;

    public BasicMagicWand(String magicWandCreator, int magicWandSize) {
        this.magicWandCreator = magicWandCreator;
        this.magicWandSize = magicWandSize;
    }

    public BasicMagicWand() {
    }

    @Override
    public long getId() {
        return this.id;
    }

    @Override
    public String getMagicWandCreator() {
        return this.magicWandCreator;
    }

    @Override
    public void setMagicWandCreator(String magicWandCreator) {
        this.magicWandCreator = magicWandCreator;
    }

    @Override
    public int getMagicWandSize() {
        return this.magicWandSize;
    }

    @Override
    public void setMagicWandSize(int magicWandSize) {
        if (magicWandSize > 1) {
            this.magicWandSize = magicWandSize;
        } else {
            try {
                throw new IllegalAccessException("Magic wand size is not a valid positive number");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public BasicWizard getWizard() {
        return this.basicWizard;
    }

    @Override
    public void setWizard(BasicWizard basicWizard) {
        this.basicWizard = basicWizard;
    }
}

