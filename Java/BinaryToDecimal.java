public class BinaryToDecimal {
    public static void main(String[] args) {
        int binaryNumber = 10; // Example binary number
        int decimal = 0;
        int power = 0;

        while (binaryNumber > 0) {
            int lastDigit = binaryNumber % 10;
            decimal += lastDigit * Math.pow(2, power);
            power++;
            binaryNumber /= 10;
        }
        
        System.out.println("Decimal equivalent: " + decimal);
    }
}
