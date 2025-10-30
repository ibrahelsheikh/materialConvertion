package org.example;

import java.util.ArrayList;
import java.util.List;

import org.example.materialConversionCalculateMaterialHisCode_11PLT003_00000;

public class materialConversionIdifServiceDoorFixedMaterialList {

    public materialConversionIdifServiceDoorFixedMaterialList(String serviceDoor) {
    }

    public static List<Material> materialConversionIdifServiceDoorFixedMaterialList(String DOOR_NAME, float DOOR_LENGTH, float DOOR_WIDTH) {


        List<Material> materialArrayList = new ArrayList<>();

        float materialConversionCalculateMaterialHisCode_11PLT003_00000 = org.example.materialConversionCalculateMaterialHisCode_11PLT003_00000.materialConversionCalculateMaterialHisCode_11PLT003_00000("Service Door", DOOR_LENGTH, DOOR_WIDTH);

        switch (DOOR_NAME) {
            case "Service Door":
                materialArrayList.add(new Material("13TUF001 00000", 1));
                materialArrayList.add(new Material("13TUC402 13012", 1));
                materialArrayList.add(new Material("13TUC116 00000", 1));
                materialArrayList.add(new Material("12VAR301 00000", 1));
                materialArrayList.add(new Material("12VAR300 15067", 1));
                materialArrayList.add(new Material("17OLR001 17013", 0));   // fix this
                materialArrayList.add(new Material("11PLT003 00000", materialConversionCalculateMaterialHisCode_11PLT003_00000));

                break;


            case "Swing Door":
//                materialArrayList.add(new Material("", ));

                break;


            case "Sliding Door":
//                materialArrayList.add(new Material("", ));


                break;


            case "Hinged Door":
                break;


        }


        return materialArrayList;

    }


}

class Material {
    String code;
    float quantity;

    Material(String code, float quantity) {
        this.code = code;
        this.quantity = quantity;
    }


    Material(String code, int quantity) {
        this.code = code;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Code: " + code + ", Quantity: " + quantity;
    }
}
