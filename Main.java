import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Main obj = new Main() ;

        // System.out.println("блок 1 - задание 1 - Дробная часть")
        //1-1 
        // System.out.println(obj.fraction(12.43)) ;
        //1- 2
        // int task1 = sc.nextInt();
        
        // if(task1 >= 10 ) {
        //     System.out.println(obj.sumLastNums(task1)) ;
        // }

        //1 -3 
        
        // System.out.println(obj.charToNum('8')) ;
        //1-4 
        //1-5 
        
    }
    public double fraction(double x) { 
        return  x - (int) x ;
    }
    public int sumLastNums(int x ){
        return x%10+x/10%10;
    }
    public int charToNum(char x ) {
        return x % 48   ;
    }
    public boolean isPositive (int x ) {
            if (x >= 0) {
                return true ; 
            }
            return false ;
    }
    public boolean is2Digits(int x){
            if ((x >=10) && (x <= 99) ) {
                return true ;
            }
            return false ;
        }        


}
