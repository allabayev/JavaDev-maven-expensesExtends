package uz.expenses.modul;

import java.util.Scanner;

public class Weekly extends Income{
    private double product;
    private double choyxona;

    public double getProduct() {
        if ((product/7)*30>(getSum()*0.2)) {
            System.out.println("Pradukta kup xarajat qilarkansiz " + product);
        } else {
            System.out.println("Pradukta Ok " + product);
        }
        return product;
    }

    public double getChoyxona() {
        if ((choyxona/7)*30>(getSum()*0.1)) {
            System.out.println("Choyxonachi Xa Xa " + choyxona);
        } else {
            System.out.println("Malades " + choyxona);
        }
        return choyxona;
    }
    Scanner in = new Scanner(System.in);
    public void setProduct() {
        System.out.println("Xaftasifa produktaga qancha sarflaysiz");
        this.product = in.nextDouble();
    }

    public void setChoyxona() {
        System.out.println("Xaftasiga choyxonaga qancha sarflaysiz");
        this.choyxona = in.nextDouble();
    }
}