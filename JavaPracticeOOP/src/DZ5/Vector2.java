package DZ5;

import DZ5.unit.BasicData;

public class Vector2 {
    int x,y;

    public Vector2(int x, int y){
        this.x = x;
        this.y = y;
    }
    public boolean isEquals(Vector2 opposit){
        if (opposit.y == y && opposit.x == x) return true;
        return false;
    }
    public double getDistance (BasicData unit, BasicData target){
        double dX = unit.getPosition().x-target.getPosition().x;
        double dY = unit.getPosition().y-target.getPosition().y;
        return Math.sqrt((dX*dX)+(dY*dY));
    }

}
