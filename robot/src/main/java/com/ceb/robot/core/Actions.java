package com.ceb.robot.core;

public enum Actions {

    ASSEMBLING, BUYING, MAIN_BOARD_BUILDING, PANEL_BUILDING, SELLING;
    Actions() {

    }
    private String name;

    Actions(String name) {

    }



    public String getName() {
        return name;
    }
}
