package ch03.ex01;

/**
 * ** Chapter 03, exercise 01
 * - Provide an interface Measurable with a method double getMeasure() that measures an object in some way.
 * - Make Employee implement Measurable.
 * - Provide a method double average(Measurable[] objects) that computes the average measure.
 * - Use it to compute the average salary of an array of employees.
 * Created by yeahn on 2016/12/31.
 */
public class Employee implements Measurable {
    private final String name;
    private double score;
    private double factor;
    private double baseSalary;
    // private double salary;

    public double getMeasure() {
        return baseSalary + score * factor * 100;
    }

    // new employers use the default score, factor and base-salary.
    public Employee() {
        this.name = "";
        this.score = 60.0;
        this.factor = 0.2;
        this.baseSalary = 2000;
    }

    public Employee(String name, double score, double factor, double baseSalary) {
        this.name = name;
        this.score = score;
        this.factor = factor;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return this.name;
    }

    public double ioFactor(double factor) {
        this.factor = factor > 0 ? factor : this.factor;
        return this.factor;
    }

    public double ioScore(double score) {
        this.score = score >= 0 && score < 200 ? score : this.score;
        return this.score;
    }
}
