package label;

import shampoo.BasicShampoo;

interface Label {
     long getId();

     void setId(long id);

     String getLabel();

     void setLabel(String label);

     BasicShampoo getShampoo();

     void setShampoo(BasicShampoo shampoo);

     String getSublabel();

     void setSublabel(String sublabel);
}
