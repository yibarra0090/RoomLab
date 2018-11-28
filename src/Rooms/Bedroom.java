package Rooms;

import Game.Runner;
import People.Person;

public class Bedroom extends Room {
    public Bedroom(int x, int y) {
        super(x, y);
    }

    @Override
    public void enterRoom(Person x) {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You found your Bedroom! N A P T I M E!");
        Runner.gameOff();
    }
}
