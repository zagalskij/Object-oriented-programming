package ru.gb.api.homework3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements  Iterable<Integer>{
    private String streamName;
    private List<Group> listGroup;

    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    public List<Group> getListGroup() {
        return listGroup;
    }

    public void setListGroup(List<Group> listGroup) {
        this.listGroup = listGroup;
    }

    public Stream(String streamName, List<Group> listGroup) {
        this.streamName = streamName;
        this.listGroup = listGroup;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new StreamIterator(this);
    }
}
