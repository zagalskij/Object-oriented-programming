package ru.gb.api.homework4;

public class Teacher {
    private String name;
    private String surname;
    private String patronymic;
    private int age;
    private String object;

    public Teacher(String name, String surname, String patronymic, int age, String object) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.age = age;
        this.object = object;
    }

    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }


    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getAge() {
        return age;
    }


    public String getObject() {
        return object;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", age=" + age +
                ", object='" + object + '\'' +
                '}';
    }
}
