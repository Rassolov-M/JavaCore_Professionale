package lesson7.homework;

public class Main {

    public static void main(String[] args) {
        try {
            TestDrive.start(SomethingTest.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
