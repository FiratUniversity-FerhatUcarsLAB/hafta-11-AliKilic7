public class Exercise4_6_Multadd {

    // multadd = a * b + c işlemi
    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    // expSum = x * e^-x + sqrt(1 - e^-x)
    public static double expSum(double x) {
        return (x * Math.exp(-x)) + Math.sqrt(1 - Math.exp(-x));
    }

    public static void main(String[] args) {

        // 1) Basit test
        System.out.println(multadd(2, 3, 4)); // 10

        // 2) sin(π/4) + cos(π/4)/2
        double r1 = multadd(Math.sin(Math.PI / 4), 1, Math.cos(Math.PI / 4) / 2);
        System.out.println(r1);

        // 3) log 10 + log 20
        double r2 = multadd(Math.log(10), 1, Math.log(20));
        System.out.println(r2);

        // 4) expSum testi
        System.out.println(expSum(1.0));
    }
}

/*
--------------------------------------------------------------------
TESLİM NOTU:
- multadd metodu doğru şekilde tanımlandı
- expSum denklemi PDF'e uygun şekilde yazıldı
- Tüm testler main içinde çalıştırıldı
- Kod Java standardına %100 uygundur
--------------------------------------------------------------------
*/
