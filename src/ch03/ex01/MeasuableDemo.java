package ch03.ex01;

/**
 * ** Chapter 03, exercise 01
 * - Provide an interface Measurable with a method double getMeasure() that measures an object in some way.
 * - Make Employee implement Measurable.
 * - Provide a method double average(Measurable[] objects) that computes the average measure.
 * - Use it to compute the average salary of an array of employees.
 * Created by yeahn on 2016/12/31.
 */
public class MeasuableDemo {
    public static double average(Measurable[] objects) {
        double sum = 0;
        int count = 0;
        for (Measurable obj :
                objects) {
            sum += obj.getMeasure();
            count++;
        }
        return sum / count;
    }

    public static void main(String[] args) {
        final int COUNT = 3;
        Employee[] mans = new Employee[COUNT];
        for (int i = 0; i < mans.length; i++) mans[i] = new Employee();
        // mans[0].ioName("Tom Hacks");
        // mans[1].ioName("John Sons");
        // mans[2].ioName("Take Yang");
        System.out.println("Average salary of the new employees: " + average(mans));
    }
}
