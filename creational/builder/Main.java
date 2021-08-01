package creational.builder;

public class Main {
    public static void main(String[] args) {
        PhoneBuilder builder = new PhoneBuilder();

        Phone p1 = builder
            .company("Redmi")
            .os("Android 11")
            .processor("SD 730G")
            .ram(4)
            .getPhone();
        System.out.println(p1);

        Phone p2 = builder
            .company("Google")
            .os("Android 12")
            .processor("SD 845")
            .ram(6)
            .getPhone();
        System.out.println(p2);
    }
}
