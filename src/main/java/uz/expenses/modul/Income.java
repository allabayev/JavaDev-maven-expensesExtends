package uz.expenses.modul;

import java.util.Scanner;

public class Income {
    private double income;
    private double depozit;
    private double sum;

    public void getIncome() {
        System.out.println("Oylik daromadingiz " + income + " sum");
    }

    public void getDepozit() {
        System.out.println("Oyiga jamg'armoqchisiz"  + depozit +  "sum");
    }
    Scanner in = new Scanner(System.in);
    public void setIncome() {
        System.out.println("Oylik daromadingizni kiriting: ");
        this.income = in.nextDouble();
    }

    public void setDepozit() {
        System.out.println("Yaxshi oyiga qancha jamg'armaga o'tkazmoqchisiz ");
        this.depozit= in.nextDouble();
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = income - depozit;
        System.out.println("Oylik xarajatlaringiz " + sum + " sumdan oshmasligi kerak");
    }
}
//}
//
//    public double summa() {
//        sum=income-depozit;
//        double sum = this.sum;
//        System.out.println("Oylik xarajatlaringiz " + sum + " sumdan oshmasligi kerak");
//        return sum;
//    }
//}
