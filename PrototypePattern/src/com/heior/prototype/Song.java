package com.heior.prototype;

/**
 * @author heior
 */
public class Song implements Cloneable{
    private String tittle;
    private String artist;



    public String getTittle() {
        return tittle;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }
    /**
     * Creates and returns a copy of this object.  The precise meaning
     * of "copy" may depend on the class of the object. The general
     * intent is that, for any object {@code x}, the expression:
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {


        return super.clone();
    }
}
