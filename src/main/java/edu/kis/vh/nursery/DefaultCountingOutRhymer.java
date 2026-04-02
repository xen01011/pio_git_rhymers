package edu.kis.vh.nursery;

/**
 * Podstawowa implementacja Rhymer działająca jak stos (LIFO) o stałej pojemności.
 * Przechowuje liczby całkowite w tablicy i pozwala:
 * dodawać elementy na szczyt - countIn(int),
 * odczytywać szczyt bez usuwania - peekaboo(),
 * zdejmować element ze szczytu - countOut(),
 * oraz sprawdzać stany pusty/pełny.
 * Wartość stała EMPTY jest używana jako znacznik pustej struktury.
 */

public class DefaultCountingOutRhymer {

    private static final int CAPACITY = 12;
    private static final int EMPTY = -1;
    private static final int FULL = 11;

    private final int[] numbers = new int[CAPACITY];

    public int getTotal() {
        return total;
    }

    private int total = EMPTY;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == FULL;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY;
        return numbers[total--];
    }

}