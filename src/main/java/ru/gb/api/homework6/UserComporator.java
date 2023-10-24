package ru.gb.api.homework6;

import java.util.Comparator;

// Обобщенный сравниватель для пользователей
class UserComparator<T extends User> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.getName().compareTo(o2.getName());
    }
}