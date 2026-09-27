import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Main obj = new Main() ;
        
        
        System.out.println("выберите номер задачи :");
        System.out.println("1)реализовать метод таким образом, чтобы он возвращал только \r\n" + //
                        "дробную часть числа");
        System.out.println("2)реализовать метод таким образом, чтобы он возвращал результат \r\n" + //
                        "сложения двух последних знаков числах");
        System.out.println("3)Метод принимает символ х, который представляет собой один из “0 1 2 3 4 5 6 7 \r\n" + //
                        "8 9”. Необходимо реализовать метод таким образом, чтобы он преобразовывал \r\n" + //
                        "символ в соответствующее число");
        System.out.println("4)Необходимо реализовать метод таким образом, чтобы он принимал число x и \r\n" + //
                        "возвращал true, если оно положительное.");
        System.out.println("5)Необходимо реализовать метод таким образом, чтобы он принимал число x и \r\n" + //
                        "возвращал true, если оно двузначное.  ");
        System.out.println("-->");

        int numberOfTask = sc.nextInt() ;
        


        switch (numberOfTask) {
            case 1:
                System.out.println(obj.fraction(12.43)) ;
                break;
            case 2 :
                System.out.println("введите число больше 9 : ");
                int task1 = sc.nextInt();
        
                if(task1 >= 10 ) {
                    System.out.println( "сумма 2ух последних знаков = "+ obj.sumLastNums(task1)) ;
                }
                else{
                    System.err.println("введите число больше 9");
                }
                break ;
            case 3 : 
                System.out.println(obj.charToNum('8')) ;

                break ;
            default:
                break;
        }







        // System.out.println("блок 1 - задание 1 - Дробная часть")
        //1-1 
        // System.out.println(obj.fraction(12.43)) ;
        //1- 2
        // int task1 = sc.nextInt();
        
        // if(task1 >= 10 ) {
        //     System.out.println(obj.sumLastNums(task1)) ;
        // }

        //1 -3 
        
        
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
