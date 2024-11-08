package hu.petrik.szuperhosprojekt;

public class Bosszuallo implements Szuperhos {
    private float szuperero;
    private boolean vanEGyengesege;

    public Bosszuallo(float szuperero, boolean vanEGyengesege) {
        this.szuperero = szuperero;
        this.vanEGyengesege = vanEGyengesege;
    }

    public Bosszuallo ()
    {

    }

    public boolean megmentiAVilagot() {
        return false;
    }

    @Override
    public boolean legyoziE(Szuperhos sz) {
        boolean gyoz = false;
        if (sz instanceof Bosszuallo) {
            if (((Bosszuallo) sz).vanEGyengesege)
                gyoz =  ((Bosszuallo) sz).szuperero < this.szuperero;
        }
        //if (sz instanceof Batman) {
        //    gyoz =  ((Bosszuallo) sz).szuperero*2 < this.szuperero;
        //}
        return gyoz;
    }

    @Override
    public float mekkoraAzEreje() {
        return this.szuperero;
    }

    public float getSzuperero() {
        return szuperero;
    }

    public boolean isVanEGyengesege() {
        return vanEGyengesege;
    }

    public void setSzuperero(float szuperero) {
        this.szuperero = szuperero;
    }

    public void setVanEGyengesege(boolean vanEGyengesege) {
        this.vanEGyengesege = vanEGyengesege;
    }

    @Override
    public String toString() {
        return "Szupererő: " + szuperero + ";" +
                 (vanEGyengesege ? "van" : "nincs") + " gyengesége";
    }
}
