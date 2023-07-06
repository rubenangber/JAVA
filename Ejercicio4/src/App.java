public class App {
    public static void main(String[] args) throws Exception {
        SmartDevice phone = new SmartPhone("Apple", "iPhone 13", "Negro", 8, "IOS");
        System.out.println(phone);

        SmartDevice watch = new SmartWatch("Huawei", "4 Series", "Gris", 4, "Bluetooth");
        System.out.println(watch);
    }
}
