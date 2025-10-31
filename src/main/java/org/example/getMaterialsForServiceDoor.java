package org.example;

import java.util.ArrayList;
import java.util.List;

public class getMaterialsForServiceDoor {

    public static List<Material> getMaterialsForServiceDoor(boolean DOOR_TYPE,
                                                            float DOOR_THICKNESS,
                                                            float DOOR_LENGTH,
                                                            float DOOR_WIDTH,
                                                            boolean DOOR_DIRECTION,
                                                            String FRAME_TYPE,
                                                            float DOOR_FRAME_THICKNESS,
                                                            String INTERNAL_SHEET_TYPE,
                                                            String INTERNAL_SHEET_COLOR_CODE,
                                                            String INTERNAL_SHEET_THICKNESS,
                                                            String EXTERNAL_SHEET_TYPE,
                                                            String EXTERNAL_SHEET_COLOR_CODE,
                                                            float EXTERNAL_SHEET_THICKNESS,
                                                            doorPorthole doorPorthole,
                                                            int DOOR_HUGE,
                                                            String DOOR_COLSER) {

        final String DOOR_NAME = "Service Door";

        List<Material> materialArrayList = new ArrayList<>();
        List<Material> fixedMaterialArrayList = new ArrayList<>();


        // get material which depend on DOOR_TYPE & DOOR_TYPE can be single or double
        if (DOOR_TYPE == false) {
            materialArrayList.add(new Material("00000000 00000", 1));   // single
        } else {
            materialArrayList.add(new Material("00000000 00000", 1));
        }

        // get material which on 


        fixedMaterialArrayList = materialConversionIdifServiceDoorFixedMaterialList.materialConversionIdifServiceDoorFixedMaterialList(DOOR_NAME, DOOR_LENGTH, DOOR_WIDTH);

        // added fixed material to list
        materialArrayList.addAll(fixedMaterialArrayList);

        System.out.println(materialArrayList);


        return materialArrayList;

    }


}
