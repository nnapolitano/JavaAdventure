//Last updated by Nick Napolitano on 9/4/2019
package com.cscc.javaadventure;

public class Lantern {

    private double weight;
    private boolean isLit;
    private boolean isBroke;
    private String description;


    Lantern() {
        weight = 1.5;
        isLit = false;
        isBroke = false;
        description = "A tarnished, old lantern that has seen better days.";
    }

    public double getWeight() {
        return weight;
    }


    public boolean isLit() {
        return isLit;
    }

    public void setLit(boolean lit) {
        isLit = lit;
    }

    public boolean isBroke() {
        return isBroke;
    }

    public void setBroke(boolean broke) {
        isBroke = broke;
    }

    public String getDescription() {
        return description;
    }


    public boolean swapLit() {
        if (isLit == false) {
            return true;
        } else {
            return false;
        }

    }

    public boolean swapBroke() {
        if (isBroke == false) {
            return true;
        } else {
            return false;
        }

    }

    public String litDescription() {
        if (isLit == false) {
            return "A tarnished, old lantern that has seen better days. It is unlit.";
        } else {
            return "A tarnished, old lantern that has seen better days. It glows softly.";
        }

    }
}

