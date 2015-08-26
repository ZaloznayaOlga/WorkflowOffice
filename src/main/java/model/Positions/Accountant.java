package model.Positions;

import model.Employee;

/**
 * Класс должности Бухгалтер
 */
public class Accountant extends APosition implements Employee {
    private int fixedRate; //фиксированная ставка

    public Accountant(String name) {
        super(name);
    }

    /**
     * Метод, устанавливающий фиксированную ставку
     * @param fixedRate
     */
    @Override
    public void setFixedRate(int fixedRate) {
        this.fixedRate = fixedRate;
    }

    /**
     * Метод в котором выполняется работа должности
     */
    @Override
    public void getToWork() {
        //выполняет свою работу
    }

    /**
     * Метод для получения зарплаты
     * @return сумму зарплаты
     */
    @Override
    public double paySalary() {
        //отчитывается о получении зарплаты
        return getFixedRate();
    }

    /**
     * Метод возвращает фиксированную ставку
     * @return fixedRate
     */
    @Override
    public int getFixedRate() {
        return fixedRate;
    }

    /**
     * Начисление зарплаты всем сотрудникам компании
     */
    public void payWeekSalary() {

    }
}
