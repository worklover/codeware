public class Sum
{
    public int GetSum(int a, int b)
    {
        int sum =0;
        int tr=1;
        if (a == b ) return  a;
        if (a>b) {
            for (int i = b; i <= a; i++) {
                sum = sum + i;
            }
        }
        else
            for (int i = a; i <= b; i = i + 1) {
                sum = sum + i;
            }
        return sum;
    }
}