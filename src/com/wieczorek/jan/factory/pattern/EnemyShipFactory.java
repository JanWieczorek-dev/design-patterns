package com.wieczorek.jan.factory.pattern;

public class EnemyShipFactory {

    public EnemyShip makeEnemyShip (String newShipType) {
        EnemyShip newShip = null;

        if (newShipType.equals("C")) {
            return new CorvetteShip();

        } else if (newShipType.equals("D")) {
            return new Destroyer();
        }
        else return null;
    }
}
