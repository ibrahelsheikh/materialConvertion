package com.example.demo.serviceimplementation;

import java.util.ArrayList;
import java.util.List;

public class GetMaterialsForSlidingDoor {
    public static List<Material> getMaterialsForSlidingDoor(Parameters parameters,
                                                            String DOOR_TYPE,
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

        final String DOOR_NAME = "Sliding Door";


        List<Material> materialArrayList = new ArrayList<>();




        // get material which depend on internal sheet info and external sheet info and frame info
        materialArrayList.addAll(GetSheetsFrameMaterials.getSheetsFrameMaterials(parameters));


        return materialArrayList;

    }


    }
