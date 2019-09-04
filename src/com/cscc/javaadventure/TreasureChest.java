//Last updated by Nick Napolitano on 9/4/2019
package com.cscc.javaadventure;

public class TreasureChest {
    private double weight;
    private boolean isOpen;
    private boolean isLocked;
    private String description;

    TreasureChest() {
        weight = 10.00;
        isOpen = false;
        isLocked = true;
        description = "A sturdy iron chest.";

    }

    public double getWeight() {
        return weight;
    }


    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public String getDescription() {
        return description;
    }


    public boolean swapLocked() {
        if (isLocked == false) {
            return true;
        } else {
            return false;
        }

    }

    public boolean swapOpen() {
        if (isOpen == false & isLocked == false) {
            return true;
        } else if (isOpen == true & isLocked == true) {
            return false;
        } else {
            return false;
        }

    }

    public String lockedDescription() {
        if (isLocked == true) {
            return "A sturdy iron chest. It is locked.";
        } else {
            return "A sturdy iron chest. It is unlocked.";
        }

    }

}
