package week02;

public class TypeCasting {
    public static void main(String[] args) {
        // 형변환
        // byte < short < int < long <<< float < double
        // char < int

        short x = 10;
        int y = x; // 자동 형변환 (업캐스팅)

        System.out.println("x: " + x);
        System.out.println("y: " + y);

        // -------------------------------

        int a = 128;
        short b = (short) a; // 강제 형변환 (다운캐스팅)
        byte c = (byte) a; // 강제 형변환 (다운캐스팅)

        System.out.println("a: " + a);
        System.out.println("b: " + b); 
        System.out.println("c: " + c); // 128이 byte 범위를 초과하여 -128로 변환됨 (오버플로우 발생)

        // 더 큰 범위의 변수를 작은 범위의 변수로 변환할 때는 데이터 손실이 발생할 수 있으므로 주의
        // ex) int -> byte로 변환할 때, int 값이 byte 범위를 초과하면 오버플로우가 발생
        // ex) double -> float로 변환할 때, double 값이 float 범위를 초과하면 소수점 손실 가능
    }
}
