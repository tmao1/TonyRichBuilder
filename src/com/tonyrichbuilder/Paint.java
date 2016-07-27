package com.tonyrichbuilder;

/**
 * Created by localadmin on 7/27/16.
 */
public enum Paint {
    MATTE ( 10 ),
    GLOSSY ( 15),
    FLAT ( 35),
    SEMI_GLOSS ( 45);


    Paint(float price) {
        this.price = price;
    }

    private final float price;

    public float getPrice() {
        return price;
    }

}
