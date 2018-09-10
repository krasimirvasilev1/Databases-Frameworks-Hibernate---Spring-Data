package magic_wands;

import wizards.BasicWizard;

public interface MagicWand {

    long getId();

    String getMagicWandCreator();

    void setMagicWandCreator(String magicWandCreator);

    int getMagicWandSize();

    void setMagicWandSize(int magicWandSize);

    BasicWizard getWizard();

    void setWizard(BasicWizard basicWizard);
}
