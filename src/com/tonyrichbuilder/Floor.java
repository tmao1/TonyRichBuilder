package com.tonyrichbuilder;

/**
 * Created by localadmin on 7/27/16.
 */
public enum Floor {
    CERAMIC_TILE ( 100),
    VINYL_TILE ( 25),
    WOOD ( 50 ),
    CARPET ( 85 );


    Floor(float price) {
        this.price = price;
    }

    private final float price;

    public float getPrice() {
        return price;
    }
}
