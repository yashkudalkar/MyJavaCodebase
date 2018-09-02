package com.company.java.arrays;

public class ArrayProblem {

    private double salaray[] = {23500.0, 25080.0, 28760.0, 22340.0, 19890.0};
    private double averageSalaray;

    public double[] getSalaray() {
        return salaray;
    }

    public void setSalaray(double[] salaray) {
        this.salaray = salaray;
    }

    public void caltAverageSalaray() {
        double sum = 0;
        for (double s : salaray) {
            sum += s;
        }
        averageSalaray = sum / salaray.length;
    }

    public double getAverageSalaray() {
        return averageSalaray;
    }

    public void setAverageSalaray(double averageSalaray) {
        this.averageSalaray = averageSalaray;
    }

    public int underPaidEmployee() {
        int count = 0;
        for (double s :
                salaray) {
            if (s<averageSalaray){
                count++;
            }
        }
        return count;
    }

    public int overPaidEmployee() {
        int count = 0;
        for (double s :
                salaray) {
            if (s>averageSalaray){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("||Employee Array example||");
        ArrayProblem arrayProblem = new ArrayProblem();
        arrayProblem.caltAverageSalaray();
        System.out.println("The average salaray of the employee is :" + arrayProblem.getAverageSalaray());
        System.out.println("The number of employee having salaray greater than the average is :" + arrayProblem.overPaidEmployee());
        System.out.println("The number of employee having salaray less than the average is :" + arrayProblem.underPaidEmployee());
    }

}