package recursion;

public class FibGenerator {
    public int nthFib(int n){
        return computeFibRecurse(n);
    }

    private int computeFibRecurse(int n){
        if(n==1 || n==2){
            return 1; 
        }
        else{
            return computeFibRecurse(n-1) + computeFibRecurse(n-2);
        }
    }

    public static void main(String[] args){
        System.out.println("STARTING");
        FibGenerator fib = new FibGenerator();
        //System.out.println(fib.nthFib(20)); 
        for(int i = 30; i <= 40; i++){
            System.out.print(fib.nthFib(i) + " ");
        }
        

    }
}
