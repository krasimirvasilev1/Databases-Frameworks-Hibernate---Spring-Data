package wizards;

import deposits.BasicDeposit;
import magic_wands.BasicMagicWand;

public interface Wizard {
    long getId();

    String getFirstName();

    void setFirstName(String name);

    String getLastName();

    void setLastName(String name);

    String getNotes();

    void setNotes(String notes);

    int getAge();

    void setAge(int age);

    BasicMagicWand getMagicWand();

    void setMagicWand(BasicMagicWand magicWand);

    void addDeposit(BasicDeposit deposit);
}
