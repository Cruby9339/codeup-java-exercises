package oop.animals;

public class fish extends MarineAnimal{

    private boolean canSwim;
    private int length;
    private int finCount;
    private boolean isSaltwater;
    private String name;
    private boolean hasScales;

    public fish(boolean canSwim, int length, int finCount, boolean isSaltwater, String name, boolean hasScales) {
        super(canSwim,length,finCount,isSaltwater,name);
        this.hasScales = hasScales;
    }


    public boolean isHasScales() {
        return hasScales;
    }

    public void setHasScales(boolean hasScales) {
        this.hasScales = hasScales;
    }
}
