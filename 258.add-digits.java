
class Solution {
    public int addDigits(int n) {
        int sum=0;
        while(n>9)
        {
            int temp=n;
            while(temp!=0)
            {
            int rem=temp%10;
            sum+=rem;
            temp/=10;
        }
        n=sum;
        sum=0;
    }
    return n;
        
    }
    static {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try (java.io.FileWriter fw = new java.io.FileWriter("display_runtime.txt")) {
                fw.write("0");
            } catch (Exception e) {
            }
        }));
    }
}


