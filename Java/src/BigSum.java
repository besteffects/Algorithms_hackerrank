public class BigSum {
    public static void main(String[] args) {
        long[] arr = new long []{1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
        System.out.println(aVeryBigSum(arr));
    }

    static long aVeryBigSum(long[] ar) {

        long sum=0;
        for(int i=0; i<ar.length;i++){
            sum +=ar[i];
        }
        return sum;
    }
}
