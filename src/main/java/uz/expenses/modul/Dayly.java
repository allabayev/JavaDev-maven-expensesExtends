package uz.expenses.modul;

import java.util.Scanner;

public class Dayly extends Income {
    public double eating;
    private double trasnport;
    private double karmRasxod;

    public void getEating() {
        if ((eating * 30) > (getSum() * 0.2)) {
            System.out.println("Ko'p eating qilarkansiz " + eating*30);
        } else {
            System.out.println("Eating Malades " + eating*30);
        }
    }

    public void getTrasnport() {
        if ((trasnport * 30) > (getSum() * 0.1)) {
            System.out.println("Transportga ko'pxarajat " + trasnport*30);
        } else {
            System.out.println("Transport Malades " + trasnport*30);
        }
    }

    public void getKarmRasxod() {
        if ((karmRasxod * 30) > (getSum() * 0.2)) {
            System.out.println("Transportga ko'pxarajat " + karmRasxod*30);
        } else {
            System.out.println("Transport Malades " + karmRasxod*30);
        }
    }

    Scanner in = new Scanner(System.in);

    public void setEating() {
        System.out.println("Ovqatlanish uchun kunlik xarajat");
        this.eating = in.nextDouble();
    }

    public void setTrasnport() {
        System.out.println("kunlik transport xarajatingiz");
        this.trasnport = in.nextDouble();
    }

    public void setKarmRasxod() {
        System.out.println("Kunlik xarajat");
        this.karmRasxod = in.nextDouble();
    }
}