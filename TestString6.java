package test;

public class TestString6 {

    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";
        int count = 0;
        int helloIndex = str.indexOf(key);
        while (helloIndex >= 0) {
            helloIndex = str.indexOf(key, helloIndex + 1);
            count++;
        }
        System.out.println("count = " + count);
    }
}
