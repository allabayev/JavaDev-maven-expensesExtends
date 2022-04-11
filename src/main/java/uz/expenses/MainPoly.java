package uz.expenses;

import uz.expenses.modul.Dayly;
import uz.expenses.modul.Income;
import uz.expenses.modul.Monthly;
import uz.expenses.modul.Weekly;

import java.util.Scanner;

public class MainPoly {
    public String family;
    public String name;
    public int age;

    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        MainPoly mainPoly= new MainPoly();

        System.out.println("Familiyangiz ");
        mainPoly.family= mainPoly.in.nextLine();
        System.out.println("Ismingiz ");
        mainPoly.name = mainPoly.in.nextLine();
        System.out.println("Yoshingiz ");
        mainPoly.age = mainPoly.in.nextInt();

        Income income = new Income();
        income.setIncome();
        income.setDepozit();
        income.getSum();

        Dayly dayly=new Dayly();
        dayly.setEating();
        dayly.setTrasnport();
        dayly.setKarmRasxod();

        Weekly weekly = new Weekly();
        weekly.setProduct();
        weekly.setChoyxona();

        Monthly monthly=new Monthly();
        monthly.setKomPay();
        monthly.setApartmentFee();

        System.out.println("Familiya: " + mainPoly.family + " Ismi: " + mainPoly.name + " Yoshi " + mainPoly.age);
        income.getIncome();
        income.getDepozit();
        income.getSum();
        dayly.getEating();
        dayly.getTrasnport();
        dayly.getKarmRasxod();
        weekly.getProduct();
        weekly.getChoyxona();
        monthly.getKomPay();
        monthly.getApartmentFee();
    }
}
