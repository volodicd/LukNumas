import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int N;
        Scanner input = new Scanner(System.in);
        System.out.print("Введи кількість чисел: ");
        N = input.nextInt();
        LukNum[] MainArr = GenerateLucNum(N);
        FoundTriangle_Numbers(MainArr, N);
    }

    public static LukNum[] GenerateLucNum(int N) {
        LukNum[] ArrOfNum = new LukNum[N];
        ArrOfNum[0] = new LukNum(1, 0);
        ArrOfNum[1] = new LukNum(2, 1);
        int L;
        int num1 = ArrOfNum[0].GetNum();
        int num2 = ArrOfNum[1].GetNum();
        for( int i = 2; i < N; i++ ) {
            L = num1 +num2;
            ArrOfNum[i] = new LukNum(L, i);
            num2= num1;
            num1 = L;
        }
        return ArrOfNum;
    }


    public static void FoundTriangle_Numbers(LukNum[] Arr, int kst){
        int n = 0;
        System.out.println("\nThe result:\nOrd | Num");
        for(int i = 0;i < kst;i++)
        {
            for(int j = 1;n <= Arr[i].GetNum();j++)
            {
                if(n == Arr[i].GetNum())
                {
                    System.out.println(" " + (Arr[i].GetOrd() + 1) + " | " +  Arr[i].GetNum());
                }

                n = n + j;
            }
            n = 0;
        }
    }
}
