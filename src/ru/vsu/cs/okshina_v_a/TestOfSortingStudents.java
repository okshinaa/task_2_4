package ru.vsu.cs.okshina_v_a;

import org.junit.Test;
import org.junit.Assert;

import java.util.List;

public class TestOfSortingStudents {
    @Test
    public void testOfSortingList1() {
        List<Student> listStudentsOne;

        String[][] listOne = ListsOfStudentsFotTest.readList1();
        listStudentsOne = InputArray.converterListStringToListStudent(InputArray.ArrayToList(listOne));
        listStudentsOne.sort(new sortStudentCourse().thenComparing(new sortStudentGroup().thenComparing(new sortStudentSurname().thenComparing(new sortStudentName()))));

        String[][] actualResult = InputArray.converterListStringToArrayString(InputArray.converterListStudentToListString(listStudentsOne));

        String[][] correctOutputList = ListsOfStudentsFotTest.resultList1();

        Assert.assertEquals(actualResult, correctOutputList);
    }

    @Test
    public void testOfSortingList2() {
        List<Student> listStudentsTwo;

        String[][] listTwo = ListsOfStudentsFotTest.readList2();
        listStudentsTwo = InputArray.converterListStringToListStudent(InputArray.ArrayToList(listTwo));
        listStudentsTwo.sort(new sortStudentCourse().thenComparing(new sortStudentGroup().thenComparing(new sortStudentSurname().thenComparing(new sortStudentName()))));

        String[][] actualResult = InputArray.converterListStringToArrayString(InputArray.converterListStudentToListString(listStudentsTwo));

        String[][] correctOutputList = ListsOfStudentsFotTest.resultList2();

        Assert.assertEquals(actualResult, correctOutputList);
    }

    @Test
    public void testOfSortingList3() {
        List<Student> listStudentsThree;

        String[][] listThree = ListsOfStudentsFotTest.readList3();
        listStudentsThree = InputArray.converterListStringToListStudent(InputArray.ArrayToList(listThree));
        listStudentsThree.sort(new sortStudentCourse().thenComparing(new sortStudentGroup().thenComparing(new sortStudentSurname().thenComparing(new sortStudentName()))));

        String[][] actualResult = InputArray.converterListStringToArrayString(InputArray.converterListStudentToListString(listStudentsThree));

        String[][] correctOutputList = ListsOfStudentsFotTest.resultList3();

        Assert.assertEquals(actualResult, correctOutputList);
    }
}
