package controller;

import model.Person;
import model.Position;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

/**
 * Тестирует работу контроллера директоров
 */
public class DirectorsControllerTest {

    /**
     * Тест проверяет корректность работы метода selectionOfDirectors()
     */
    @Test
    public void testSelectionOfDirectors() {
        Map<Person, Set<Position>> testList = new HashMap<>();
        testList.put(PersonController.INSTANCE.createPerson("TestPerson"),
                new HashSet<>(Arrays.asList(Position.Accountant, Position.Designer)));
        testList.put(PersonController.INSTANCE.createPerson("TestPerson"),
                new HashSet<>(Arrays.asList(Position.Manager, Position.Tester)));
        testList.put(PersonController.INSTANCE.createPerson("Director"),
                new HashSet<>(Arrays.asList(Position.Director)));
        testList.put(PersonController.INSTANCE.createPerson("Director"),
                new HashSet<>(Arrays.asList(Position.Director)));
        List<Person> resultList = DirectorsController.INSTANCE.selectionOfDirectors(testList);

        for (Person person : resultList) assertEquals("Director", person.getPersonName());
    }

    /**
     * Тест проверяет корректную установки времени выполнения одного задания для
     * сотрудников с должностью директора
     */
    @Test
    public void testSelectionOfDirectorsAndSetAmountHoursOneInstructions() {
        Map<Person, Set<Position>> testList = new HashMap<>();
        testList.put(PersonController.INSTANCE.createPerson("TestPerson"),
                new HashSet<>(Arrays.asList(Position.Accountant, Position.Designer)));
        testList.put(PersonController.INSTANCE.createPerson("Director"),
                new HashSet<>(Arrays.asList(Position.Director)));
        List<Person> resultList = DirectorsController.INSTANCE.selectionOfDirectors(testList);

        for (Person person : resultList) assertEquals(1, person.getAmountHoursOneInstructions(), 0.0f);
    }
}