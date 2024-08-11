public class ReverseBits190 {
    static int reverseBits(int n) {
        int reversedN = 0;
        for (int i = 0; i < 32; i++) {
            reversedN <<= 1;
            reversedN |= (n&1);
            n >>= 1;
        }
        return reversedN;
    }

    public static void main(String[] args) {
        System.out.println(reverseBits(010110));
    }
}
