package me.angeschossen.betterfarming.api.interfaces.protection;

public class FarmCoord {

    public final int x, z;

    public FarmCoord(int x, int z) {
        this.x = x;
        this.z = z;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof FarmCoord)) return false;

        FarmCoord farmCoord = (FarmCoord) object;
        return farmCoord.x == x && farmCoord.z == z;
    }
}
