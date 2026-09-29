import java.util.Scanner;
import java.lang.Math;
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
        System.out.println("6)Необходимо реализовать метод таким образом, чтобы он возвращал модуль \r\n" + //
                        "числа х ");
        System.out.println("7)Необходимо реализовать метод таким образом, чтобы он возвращал деление x \r\n" + //
                        "на y, и при этом гарантировал, что не будет выкинута ошибка деления на 0");
        System.out.println("8)Необходимо реализовать метод таким образом, чтобы он возвращал true, если \r\n" + //
                        "число x делится нацело на 3 или 5. При этом, если оно делится и на 3, и на 5, то \r\n" + //
                        "вернуть надо false");
        System.out.println("9)Необходимо реализовать метод таким образом, чтобы он возвращал строку, \r\n" + //
                        "которая включает два принятых методом числа и корректно выставленный \r\n" + //
                        "знак операции сравнения (больше, меньше, или равно)");
        System.out.println("10)Необходимо реализовать метод таким образом, чтобы он возвращал \r\n" + //
                        "максимальное из трех полученных методом чисел");


        System.out.println("-->");

        int numberOfTask = sc.nextInt() ;
        


        switch (numberOfTask) {
            case 0 :
                System.exit(0);
                break;
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
                System.out.println("введите символ от 0 до 9");
                char task3 = sc.next().charAt(0); 
                
                System.out.println(obj.charToNum(task3)) ;
                
                break ;
            case 4 :

                System.out.println("введите число \n -->");
                int task4 = sc.nextInt();
                System.out.println("число положительное ? - " + obj.isPositive(task4) );
                    
                break ;
            case 5:
                System.out.println("введите 2х значное число \n -->");
                int task5 = sc.nextInt();
                System.out.println("число 2х значное ? - " + obj.is2Digits(task5) );
                break ;
            case 6:
                System.out.println("введите число \n -->");
                int task6 = sc.nextInt();
                System.out.println(obj.abs(task6) );
                break ;
            case 7:
                System.out.println("введите делимое \n -->");
                int task7FisrtInt = sc.nextInt();
                System.out.println("введите делитель \n -->");
                int task7SecondInt = sc.nextInt();
                System.out.println("результат деления = "+obj.safeDiv(task7FisrtInt,task7SecondInt) );
                break ;
            case 8:
                System.out.println("введите число \n -->");
                int task8 = sc.nextInt();
                System.out.println(obj.is35(task8));
                break ;
            case 9:
                System.out.println("введите первое число \n -->");
                int task9FisrtInt = sc.nextInt();
                System.out.println("введите второе число \n -->");
                int task9SecondInt = sc.nextInt();
                System.out.println(obj.makeDecision(task9FisrtInt,task9SecondInt) );
                break ;
            case 10:
                System.out.println("введите первое число \n -->");
                int task10FisrtInt = sc.nextInt();
                System.out.println("введите второе число \n -->");
                int task10SecondInt = sc.nextInt();
                System.out.println("введите третье число \n -->");
                int task10ThirdInt = sc.nextInt();
                System.out.println("максимальное : "+obj.max3(task10FisrtInt,task10SecondInt , task10ThirdInt) );
                break ;
                
            default:
                System.out.println("выберите одно из предложенных заданий или введите 0 для выхода");
                break;

              
        }
        sc.close();   






        // System.out.println("блок 1 - задание 1 - Дробная часть")
        
        
        

        
        
        
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
    public int abs (int x) {
        return Math.abs(x); 
    }
    public double safeDiv (int x, int y){
        if(x != 0 && y != 0){
            return x / y;
        }
        return 0 ;
        
    }
    public Boolean is35 (int x) {
        if(x%5== 0 && x%3==0){
            return false;
        }
        if(x%5== 0 || x%3==0){
            return true;
        }
        return null ; //здесь необходимо что-то возвращать поэтому возвращаем Boolean , а не boolean 
    }
    public String makeDecision (int x, int y){
        if(x > y){
            return "" + x +">"+y ;
        }
        if(x < y){
            return "" + x +"<"+y ;
        }
        if(x == y){
            return "" + x +"=="+y ;
        }
        return " " ;
    }
    public int max3 (int x, int y, int z) {
        int max = x;
        if (y > max) max = y;
        if (z > max) max = z;
        return max;
    }

}
