package oops.Task8;

public class Prime {
    public static void main(String[] args) {
        int num =29;
        boolean flag= false;
        for (int i=2; i<=num/2;++i){
            //condition for nonprime number
            if (num% i ==0){
                flag =true;
                break;
            }
        }
        if (!flag)
          System.out.print(num+"is a prime number.");
        else
        System.out.print(num+"is not a prime number.");

    }
    
}
