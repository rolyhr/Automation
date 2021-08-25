package learnJava.oopConcepts.composition;

import java.awt.*;

public class MasterBedroom {

    private Wall nWall, sWall, eWall, wWall;
    private Window window;
    private Bed bed;

    public MasterBedroom(Wall nWall, Wall sWall, Wall eWall, Wall wWall, Window window, Bed bed) {
        this.nWall = nWall;
        this.sWall = sWall;
        this.eWall = eWall;
        this.wWall = wWall;
        this.window = window;
        this.bed = bed;
    }
}
