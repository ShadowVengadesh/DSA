//Sieve of Eratosthenes algorithm for generate n prime numbers
//the file can't be run directly because of the inappropriate file name
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        int n=100;
       boolean[] isprime=sieve(n);
       System.out.println("all prime numbers in 100");
       for(int i=2;i<=n;i++){
           if(isprime[i]){
               System.out.println(i+"");
           }
       }
       
    }
    public static boolean[] sieve(int n){
        boolean isprime[]=new boolean[n+1];
        Arrays.fill(isprime,true);
        isprime[0]=false;
        isprime[1]=false;
        for(int i=2;i<=n;i++){
            for(int j=i*i;i<=n;j+=i){
                isprime[j]=false;
            }
        }
        return isprime;
    }
}
