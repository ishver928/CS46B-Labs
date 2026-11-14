package recursion; 

public class FactorialGenerator{
    private double computeFactorialRecurse(int n){
        //trying to make the user not put a negative value 
        assert n>=0 : "Input must be a non-negative integer.";
        if(n==1 || n==0){
            return 1; 
        }
        else{
            return (n*computeFactorialRecurse(n-1)); 
        }
    }
    public double nthFactorial(int n){
        return computeFactorialRecurse(n); 
    }
    public static void main(String[] args){
        FactorialGenerator f = new FactorialGenerator();
        System.out.println(f.nthFactorial(32));
        String s = "";
        int product = 1; 
        for(int i = 32; i>0; i--){
            System.out.print(f.nthFactorial(i) + " ");
        }
        //System.out.println(s + " all multiplied equals: " + product);
        //System.out.println(f.nthFactorial(-1));
    }

    
}