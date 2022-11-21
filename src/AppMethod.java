public class AppMethod {
    public static void main(String[] args) {
        System.out.println(getArea(10, 5));
        System.out.println(getArea(1, 1));
        System.out.println(getArea(3, 100));
    }

    private static double getArea(double width, double height) {

        return width * height;
    }
}
