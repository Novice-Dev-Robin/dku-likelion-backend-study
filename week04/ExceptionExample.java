package week04;

import java.util.ArrayList;

public class ExceptionExample {

    public static void main(String[] args) {

        //ArrayList<Integer> arrayList = new ArrayList<>(3);

        try {
            //arrayList.get(10);
            int a = 10;
            int b = 0;
            int c = a / b;

        } catch (IndexOutOfBoundsException ioe) {
            System.out.println("IndexOutOfBoundsException 발생");
        } catch (IllegalArgumentException iae) {
            System.out.println("IllegalArgumentException 발생");
        } catch (ArithmeticException ae) {
            System.out.println("ArithmeticException 발생");
        } finally {
            System.out.println("finally");
        }
    }
}

