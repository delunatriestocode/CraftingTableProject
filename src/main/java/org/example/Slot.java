package org.example;

public class Slot {
    private String item;

    public Slot(String item) {
        this.item = item;
    }

    public String getItem() {
        return item;
    }

    public void setItem (String item) {
        this.item = item;
    }

    public boolean estaOcupado() {
        if (item.equals(null)) {
            return false;
        }
        return true;
    }
}
