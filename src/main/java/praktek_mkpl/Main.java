package praktek_mkpl;

public class Main {
    public static void main(String[] args) {
        // Membuat objek kalkulator
        Calculator calculator = new Calculator();
        
        // Melakukan beberapa operasi menggunakan kalkulator
        int a = 10;
        int b = 5;
        
        System.out.println("Hasil penjumlahan " + a + " dan " + b + " adalah: " + calculator.add(a, b));
        System.out.println("Hasil pengurangan " + a + " dan " + b + " adalah: " + calculator.subtract(a, b));
        System.out.println("Hasil perkalian " + a + " dan " + b + " adalah: " + calculator.multiply(a, b));
        
        try {
            System.out.println("Hasil pembagian " + a + " dan " + b + " adalah: " + calculator.divide(a, b));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
