public class Exercise4_5 {

    public static void zoop(String fred, int bob) {
        System.out.println(fred);
        if (bob == 5) {
            ping("not ");
        } else {
            System.out.println("!");
        }
    }

    public static void main(String[] args) {
        int bizz = 5;
        int buzz = 2;
        zoop("just for", bizz);
        clink(2 * buzz);
    }

    public static void clink(int fork) {
        System.out.print("It's ");
        zoop("breakfast ", fork);
    }

    public static void ping(String strangStrung) {
        System.out.println("any " + strangStrung + "more ");
    }
}

/*
--------------------------------------------------------------------
SORU 1: Kodun tam çıktısı
--------------------------------------------------------------------
just for
any not more 
It's 
breakfast 
!

Açıklama:
- main(): zoop("just for",5) → bob==5 → ping("not ") → "any not more"
- main(): clink(2*buzz) → clink(4) → "It's " yazdırır
- clink(): zoop("breakfast",4) → bob!=5 → else çalışır → "!" yazdırır

--------------------------------------------------------------------
SORU 2: zoop metodu ikinci kez çağrıldığında STACK DİYAGRAMI
--------------------------------------------------------------------
main
 └── clink(4)
       └── zoop("breakfast ", 4)

bob = 4 olduğu için else kısmı çalışır → "!" yazdırılır
--------------------------------------------------------------------
*/
