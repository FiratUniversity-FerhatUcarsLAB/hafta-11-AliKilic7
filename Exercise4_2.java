public class Exercise4_2 {

    public static void main(String[] args) {
        zippo("rattle", 13); // 1
    }

    public static void baffle(String blimp) {
        System.out.println(blimp); // 4
        zippo("ping", -5); // 5
    }

    public static void zippo(String quince, int flag) {
        if (flag < 0) {
            System.out.println(quince + " zoop"); // 6
        } else {
            System.out.println("ik"); // 2
            baffle(quince); // 3
            System.out.println("boo -wa-ha-ha"); // 7
        }
    }
}


/*
--------------------------------------------------------------------
SORU 2: baffle ilk çağrıldığında blimp parametresi nedir?
--------------------------------------------------------------------
Cevap: "rattle"
(main → zippo("rattle",13) → baffle("rattle"))

--------------------------------------------------------------------
SORU 3: Programın ürettiği çıktı
--------------------------------------------------------------------
ik
rattle
ping zoop
boo -wa-ha-ha

--------------------------------------------------------------------
SORU 4: Hangi satırlar birden fazla kez çalıştı?
--------------------------------------------------------------------
Metot çağrıları:
- zippo metodu 2 kere çalıştı:
  1) zippo("rattle",13)
  2) zippo("ping",-5)

Çoklu tekrar eden satır yoktur.
Her print satırı sadece 1 kez tetiklenir.

Çalışma sırası: 1 → 2 → 3 → 4 → 5 → 6 → 7
--------------------------------------------------------------------
*/
