package uz.expenses.modul;

import java.util.Scanner;

public class Monthly extends Income {
    private double komPay;
    private double apartmentFee;

    public void getApartmentFee() {
        if (apartmentFee>(getSum()*0.1)) {
            System.out.println("Kvartira xarajati me'yoridan ortiq " + apartmentFee);
        } else {
            System.out.println("Kvartira uchun tulov Ok " + apartmentFee);
        }
    }

    public void getKomPay() {
        if (komPay>(getSum()*0.1)) {
            System.out.println("Komunal xarajat me'yoridan ortiq " + komPay);
        } else {
            System.out.println("Komunal tulov Ok" + komPay);
        }
    }

    Scanner in = new Scanner(System.in);

    public void setApartmentFee() {
        System.out.println("Kvartiraga oyiga qancha tuliysiz");
        this.apartmentFee = in.nextDouble();
    }

    public void setKomPay() {
        System.out.println("Oylik kamunal to'lovlaringiz qancha");
        this.komPay = in.nextDouble();
    }
}