package Bolum1;
import java.util.Scanner;

// Scanner sınıfını kodumuza dahil ediyoruz.


public class ScannerKullanimi {

    public static void main(String[] args) {
        // Scanner sınıfından nesne türettik ve System.in'den değer almasını sağladık.
        Scanner input = new Scanner(System.in);

        boolean vBool;
        byte vByte;
        double vDouble;
        float vFloat;
        int vInt;
        String vString;
        long vLong;
        short vShort;

        System.out.print("boolean tipinde değer giriniz : ");
        // vBool için kullanıcıdan direkt olarak boolean değer almasını söyledik
        vBool = input.nextBoolean();

        System.out.print("byte tipinde değer giriniz : ");
        // vByte için kullanıcıdan direkt olarak byte değer almasını söyledik
        vByte = input.nextByte();

        System.out.print("double tipinde değer giriniz : ");
        // vDouble için kullanıcıdan direkt olarak double değer almasını söyledik
        vDouble = input.nextDouble();

        System.out.print("float tipinde değer giriniz : ");
        // vFloat için kullanıcıdan direkt olarak float değer almasını söyledik
        vFloat = input.nextFloat();

        System.out.print("int tipinde değer giriniz : ");
        // vInt için kullanıcıdan direkt olarak int değer almasını söyledik
        vInt = input.nextInt();

        System.out.print("String tipinde değer giriniz : ");
        input.nextLine(); /* Biraz önce int değer aldık ve enterladık fakat tamponda \n kaldı.
        biz int değer alırken örneğin 5 girdik ve ardından enter tuşuna bastık. tamponda 5\n olarak kaldı.
        nextInt() sadece 5 i aldı ve nextLine() zaten /n 'e kadar okuyodu. Buna önlem olarak burda nextLine() kullandık.
        */
        // vString için kullanıcıdan direkt olarak string değer almasını söyledik
        // Aslında burada tek satır almasını söyledik fakat String bir satırdan daha fazlasını tutabilir.
        // Onun için en uygun veri tipi String olurdu.
        vString = input.nextLine();

        System.out.print("long tipinde değer giriniz : ");
        // vLong için kullanıcıdan direkt olarak long değer almasını söyledik
        vLong = input.nextLong();

        System.out.print("short tipinde değer giriniz : ");
        // vShort için kullanıcıdan direkt olarak short değer almasını söyledik
        vShort = input.nextShort();


    }



}
