package ch03.ex01;

/**
 * ** Chapter 03, exercise 01
 * - Provide an interface Measurable with a method double getMeasure() that measures an object in some way.
 * - Make Employee implement Measurable.
 * - Provide a method double average(Measurable[] objects) that computes the average measure.
 * - Use it to compute the average salary of an array of employees.
 * Created by yeahn on 2016/12/31.
 */
public interface Measurable {
    double getMeasure();
}


