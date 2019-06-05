package me.angeschossen.betterfarming.api.interfaces;

public class BlockCoord {

    public final int x, y, z;

    public BlockCoord(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof BlockCoord)) return false;

        BlockCoord blockCoord = (BlockCoord) object;
        return blockCoord.x == x && blockCoord.z == z && blockCoord.y == y;
    }
}
