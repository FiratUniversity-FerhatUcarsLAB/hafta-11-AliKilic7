public class Exercise4_3 {

    public static void zoop() {
        baffle();
        System.out.print("You wugga ");
        baffle();
    }

    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
    }

    public static void baffle() {
        System.out.print("wug");
        ping();
    }

    public static void ping() {
        System.out.println(".");
    }
}

/*
--------------------------------------------------------------------
SORU 1: ping ilk kez çağrıldığında STACK DİYAGRAMI
--------------------------------------------------------------------
main
 └── zoop
       └── baffle
             └── ping

Aktif çağrılar sırası:
1. main()
2. zoop()
3. baffle()
4. ping()

--------------------------------------------------------------------
SORU 2: Programın tam çıktısı
--------------------------------------------------------------------
No, I wug.
You wugga wug.
I wug.

Açıklama:
- main → "No, I "
- zoop → baffle() → "wug."
- zoop → "You wugga "
- zoop → baffle() → "wug."
- main → "I "
- main → baffle() → "wug."

--------------------------------------------------------------------
*/
