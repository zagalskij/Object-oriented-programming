package ru.gb.api.homework3;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class StreamIterator implements Iterator<Integer> {
    private int currentIndex = 0;
    private Stream stream;

    public StreamIterator(Stream stream) {
        this.stream = stream;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < stream.getListGroup().size();
    }

    @Override
    public Integer next() {
        if (hasNext()) {
            int groupNumber = stream.getListGroup().get(currentIndex).getGroupNumber();
            currentIndex++;
            return groupNumber;
        }
        throw new NoSuchElementException("No more elements in the stream");
    }

}
