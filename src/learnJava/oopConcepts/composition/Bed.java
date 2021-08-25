package learnJava.oopConcepts.composition;

public class Bed {

    private String frameType;
    private boolean hasHeadBoard;
    private boolean hasNightStand;
    private String matrressType;
    private int numOfPillow;

    public Bed(String frameType, boolean hasHeadBoard, String matrressType) {
        this.frameType = frameType;
        this.hasHeadBoard = hasHeadBoard;
        this.matrressType = matrressType;
    }

    public String getFrameType() {
        return frameType;
    }

    public void setFrameType(String frameType) {
        this.frameType = frameType;
    }

    public boolean isHasHeadBoard() {
        return hasHeadBoard;
    }

    public void setHasHeadBoard(boolean hasHeadBoard) {
        this.hasHeadBoard = hasHeadBoard;
    }

    public boolean isHasNightStand() {
        return hasNightStand;
    }

    public void setHasNightStand(boolean hasNightStand) {
        this.hasNightStand = hasNightStand;
    }

    public String getMatrressType() {
        return matrressType;
    }

    public void setMatrressType(String matrressType) {
        this.matrressType = matrressType;
    }

    public int getNumOfPillow() {
        return numOfPillow;
    }

    public void setNumOfPillow(int numOfPillow) {
        this.numOfPillow = numOfPillow;
    }

    public void buildPlatformBed() {
        System.out.println("Platform bed");
    }

    public void buildStorageBed() {
        System.out.println("Storage bed");
    }
}
