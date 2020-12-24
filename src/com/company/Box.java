package com.company;

public class Box implements Comparable<Box> {
    int x,y,z;
    public Box(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getVolume() {
        return x * y * z;
    }

    public int getMaxSide() {
        return Math.max(x, Math.max(y,z));
    }

    public int getMinSide() {
        return Math.min(x, Math.min(y,z));
    }

    @Override
    public int compareTo(Box o) {
        if (getVolume() < o.getVolume()){
            return -1;
        }else if (getVolume() > o.getVolume()){
            return 1;
        }else if (getMaxSide() > o.getMaxSide()){
            return -1;
        }else if (getMaxSide() < o.getMaxSide()){
            return 1;
        }else return getMinSide() - o.getMinSide();
    }

    @Override
    public String toString() {
        return x + " " + y + " " + z;
    }
}