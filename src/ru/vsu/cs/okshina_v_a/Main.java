package ru.vsu.cs.okshina_v_a;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        List<Student> listStudents;

        String [][] data = new String[][]{{"1", "4", "Суворов", "Дмитрий"},
                                          {"1", "1", "Щёголев", "Тимофей"},
                                          {"3", "2", "Шаталов", "Илья"},
                                          {"2", "3", "Круглов", "Виталий"},
                                          {"2", "4", "Смотрова", "Кристина"}};

        listStudents = InputArray.converterListStringToListStudent(InputArray.ArrayToList(data));

        listStudents.sort(new sortStudentCourse().thenComparing(new sortStudentGroup().thenComparing(new sortStudentSurname().thenComparing(new sortStudentName()))));
        String [][] result = InputArray.converterListStringToArrayString(InputArray.converterListStudentToListString(listStudents));
        System.out.println(Arrays.deepToString(result));
    }
}
