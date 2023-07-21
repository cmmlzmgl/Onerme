import java.util.Scanner;

public class Onerme {
    public static void main(String[] args) {

        int derece;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Sıcaklık Değerini Giriniz: ");
        derece = input.nextInt();

        if (derece < 5){
            System.out.print("Kayak yapabilirsin.");
        } else if (derece <= 15){
            System.out.print("Sinemaya gidebilirsin.");
        } else if (derece <= 25) {
            System.out.print("Pikniğe gidebilirsin");
        } else {
            System.out.print("Havuza gidebilirsin.26");
        }

    }
}
