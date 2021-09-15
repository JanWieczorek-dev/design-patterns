package com.wieczorek.jan.factory.pattern;

import java.util.Scanner;

public class FactoryTest {
    public static void main(String[] args) {

        EnemyShipFactory shipFactory = new EnemyShipFactory();
        EnemyShip enemyShip = null;

        Scanner userInput = new Scanner(System.in);
        System.out.println("What type of ship? D or C \n ");

        if (userInput.hasNextLine()){
            String typeOfShip =userInput.nextLine();
            enemyShip = shipFactory.makeEnemyShip(typeOfShip);
        }


        enemyShip.displayEnemyShip();
        enemyShip.attack();

    }

}
