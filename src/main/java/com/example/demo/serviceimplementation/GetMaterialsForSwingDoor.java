package com.example.demo.serviceimplementation;

import java.util.ArrayList;
import java.util.List;

public class GetMaterialsForSwingDoor {
    public static List<Material> getMaterialsForSwingDoor(String DOOR_TYPE,
                                                          float DOOR_THICKNESS,
                                                          float DOOR_LENGTH,
                                                          float DOOR_WIDTH,
                                                          boolean DOOR_DIRECTION,
                                                          String FRAME_TYPE,
                                                          String FRAME_MOUNTING_TYPE,
                                                          int FRAME_THICKNESS,
                                                          String INTERNAL_SHEET_TYPE,
                                                          String INTERNAL_SHEET_COLOR_CODE,
                                                          int INTERNAL_SHEET_THICKNESS,
                                                          String EXTERNAL_SHEET_TYPE,
                                                          String EXTERNAL_SHEET_COLOR_CODE,
                                                          int EXTERNAL_SHEET_THICKNESS,
                                                          DoorPorthole doorPorthole,
                                                          int DOOR_HUGE,
                                                          String DOOR_CLOSER) {

        final String DOOR_NAME = "Swing Door";


        List<Material> materialArrayList = new ArrayList<>();




        // get material which depend on internal sheet info
        materialArrayList.addAll(GetInternalSheetMaterials.getInternalSheetMaterials(DOOR_LENGTH, DOOR_WIDTH, INTERNAL_SHEET_THICKNESS, INTERNAL_SHEET_TYPE, INTERNAL_SHEET_COLOR_CODE));

        // get material which depend on EXTERNAL sheet info
        materialArrayList.addAll(GetExternalSheetMaterials.getExternalSheetMaterials(DOOR_LENGTH, DOOR_WIDTH, EXTERNAL_SHEET_THICKNESS, EXTERNAL_SHEET_TYPE, EXTERNAL_SHEET_COLOR_CODE));

        //  get frame data
        materialArrayList.addAll(GetFrameMaterials.getFrameMaterials(DOOR_LENGTH, DOOR_WIDTH, FRAME_TYPE, FRAME_MOUNTING_TYPE, FRAME_THICKNESS));

        return materialArrayList;
    }

}
