public class Main {

    public static void main(String[] args) {
        char harf = 'A';

        switch (harf) {
            case 'a', 'ı', 'o', 'u':
                System.out.println("Harf Kalındır!");
                break;
            case 'e', 'i', 'ö', 'ü':
                System.out.println("Harf İncedir!");
                break;
            default:
                System.out.println("Lütfen sesli harf girin!");


        }
    }
}