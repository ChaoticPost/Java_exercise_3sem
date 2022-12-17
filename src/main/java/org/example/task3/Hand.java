package org.example.task3;

public class Hand {
    private int length;

    public Hand(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length < 0) throw new IllegalArgumentException("Length is positive value");
        this.length = length;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "length=" + length +
                '}';
    }
}
