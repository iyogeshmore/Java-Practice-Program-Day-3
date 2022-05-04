package com.bridgelabz.day3;

public class CompanyEmpWage2 {
    public final String company;
    public final int empRatePerHour;
    public final int numOfWorkingDays;
    public final int maxHoursPerMonth;
    public int totalEmpWage;

    public CompanyEmpWage2(String var1, int var2, int var3, int var4) {
        this.company = var1;
        this.empRatePerHour = var2;
        this.numOfWorkingDays = var3;
        this.maxHoursPerMonth = var4;
        this.totalEmpWage = 0;
    }

    public void setTotalEmpWage(int var1) {
        this.totalEmpWage = var1;
    }

    public String toString() {
        return "Total Emp Wage for Company: " + this.company + " is: " + this.totalEmpWage;
    }
}
