package Bolum5.SalaryCalculator;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        double tax = 0d;
        if (this.salary > 1000){
            tax = this.salary * 0.03d;
        }
        return tax;
    }

    public double bonus() {
        double bonus = 0d;
        if ((this.workHours - 40) > 0){
            bonus = 30d * (this.workHours - 40);
        }
        return bonus;
    }

    public double raiseSalary() {
        double raise = 0d;
        if ((2021 - this.hireYear) < 10){
            raise = this.salary * 0.05d;
        }else if ((2021 - this.hireYear) < 20) {
            raise = this.salary * 0.1d;
        }else {
            raise = this.salary * 0.15d;
        }
        return raise;
    }

    public String toString() {
        String result = "";
        result += "Adý : " + this.name +"\nMaaþý : "+this.salary + "\nÇalýþma Saati : " + this.workHours + "\nBaþlangýç Yýlý : " + this.hireYear;
        result += "\nVergi : " + tax() + "\nBonus : " + bonus() + "\nMaaþ Artýþý : " + raiseSalary();
        result += "\nVergi ve Bonuslar ile birlikte maaþ : " + (this.salary + bonus() - tax());
        result += "\nToplam Maaþ : " + (this.salary + raiseSalary());
        return result;
    }
}
