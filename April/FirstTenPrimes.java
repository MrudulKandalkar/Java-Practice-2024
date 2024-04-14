public class FirstTenPrimes {
    public static void main(String[] args) {
        int count = 0;
        int num = 2;

        while (count < 10) {
            boolean flag = true;
            for (int i = 2; i <num; i++) 
            {
                if (num % i == 0) 
                {
                    flag = false;
                    break;
                }
            }
            if (flag) 
            {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}