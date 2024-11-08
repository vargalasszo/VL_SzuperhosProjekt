package hu.petrik.szuperhosprojekt;

import java.util.Random;

public class Vasember extends Bosszuallo implements Milliardos {

    public Vasember() {
        this.setSzuperero(150);
        this.setVanEGyengesege(true);
    }


    @Override
    public void kutyutKeszit() {
        Random r = new Random();
        float sz = this.getSzuperero();
        this.setSzuperero(sz + r.nextFloat());
    }
}
