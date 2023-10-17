package ru.gb.api.homework4;

import java.util.ArrayList;
import java.util.List;

public class TeacherService {

    public boolean isValidTeacher(Teacher teacher) {
        String namePattern = "^[a-zA-Z-]{2,}$";
        // Проверки на правильность данных учителя
        boolean isNameValid = teacher.getName().matches(namePattern);
        boolean isSurnameValid = teacher.getSurname().matches(namePattern);
        boolean isPatronymicValid = teacher.getPatronymic().matches(namePattern);

        return isNameValid && isSurnameValid && isPatronymicValid;
    }

}
