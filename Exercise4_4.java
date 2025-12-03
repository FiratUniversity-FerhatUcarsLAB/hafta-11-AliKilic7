public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        getNumber();

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);

        // Cevaplarinizi yorum olarak ekleyin.
    }
}

/*
--------------------------------------------------------------------
SORU 1: Return eden metodu çağırıp sonucu kullanmazsak ne olur?
--------------------------------------------------------------------
Cevap:
- Java hiçbir hata veya uyarı vermez.
- Metot normal şekilde çalışır.
- Dönen değer kullanılmadığı için atılır.

--------------------------------------------------------------------
SORU 2: Void metodu bir ifadenin içinde kullanırsak ne olur?
Örnek: System.out.println(sayHello() + 7);
--------------------------------------------------------------------
Cevap:
- Derleme hatası verir:
    "void type not allowed here"
- Çünkü void türü bir değer döndürmez.
- + operatörü bir değer bekler, void ile kullanılamaz.
--------------------------------------------------------------------
*/
