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
        System.out.println("11)Необходимо реализовать метод таким образом, чтобы он возвращал строку, которая \r\n" + //
                        "содержит все числа от 1 до x включительно");
        System.out.println("12)Необходимо реализовать метод таким образом, чтобы он возвращал строку, в\n" + //
                        "которой будут записаны все числа от x до 0 (включительно).");
        System.out.println("13)Необходимо реализовать метод таким образом, чтобы он возвращал строку, в\n" + //
                        "которой будут записаны все четные числа от 0 до x (включительно)");
        System.out.println("14)Необходимо реализовать метод таким образом, чтобы он возвращал результат\n" + //
                        "возведения x в степень y");
        System.out.println("15)Необходимо реализовать метод таким образом, чтобы он возвращал количество\n" + //
                        "знаков в числе x.");
        System.out.println("16)Необходимо реализовать метод таким образом, чтобы он возвращал индекс\n" + //
                        "первого вхождения числа x в массив arr. Если число не входит в массив –\n" + //
                        "возвращается -1");
        System.out.println("17)Необходимо реализовать метод таким образом, чтобы он возвращал индекс\n" + //
                        "последнего вхождения числа x в массив arr. Если число не входит в массив –\n" + //
                        "возвращается -1");
        System.out.println("18)Необходимо реализовать метод таким образом, чтобы он возвращал\n" + //
                        "наибольшее по модулю (то есть без учета знака) значение массива arr");
        System.out.println("19)Необходимо реализовать метод таким образом, чтобы он возвращал новый\n" + //
                        "массив, который будет содержать все элементы массива arr, однако в позицию\n" + //
                        "pos будет вставлено значение x");
        System.out.println("20)Необходимо реализовать метод таким образом, чтобы он возвращал новый\n" + //
                        "массив, который будет содержать все элементы массива arr, однако в позицию\n" + //
                        "pos будут вставлены значения массива ins");


        System.out.println("-->");

        int numberOfTask = sc.nextInt() ;
        


        switch (numberOfTask) {
            case 0 :
                System.exit(0);
                break;
            case 1:
                System.out.println("введите число(дробное вида x,x1x2x3) \n -->");
                double task1 = sc.nextDouble();
                System.out.println(obj.fraction(task1)) ;
                break;
            case 2 :
                System.out.println("введите число больше 9 : ");
                int task2 = sc.nextInt();
        
                if(task2 >= 10 ) {
                    System.out.println( "сумма 2ух последних знаков = "+ obj.sumLastNums(task2)) ;
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
            case 11:
                System.out.println("введите число \n -->");
                int task11 = sc.nextInt();
                System.out.println("список чисел от 1 до " + task11 + ": " + obj.listNums(task11));
                break ;
            case 12:
                System.out.println("введите число \n -->");
                int task12 = sc.nextInt();
                System.out.println("список чисел от " + task12 + " до 0: " + obj.reverseListNums(task12));
                break ;
            case 13:
                System.out.println("введите число \n -->");
                int task13 = sc.nextInt();
                System.out.println("список четных чисел от 0 до " + task13 + ": " + obj.chet(task13));
                break ;
            case 14:
                System.out.println("введите число \n -->");
                int task14FirstInt = sc.nextInt();
                System.out.println("введите степень \n -->");
                int task14SecondInt = sc.nextInt();
                System.out.println(task14FirstInt + " в степени " + task14SecondInt + " = " + obj.pow(task14FirstInt, task14SecondInt));
                break ;
            case 15:
                System.out.println("введите число \n -->");
                long task15 = sc.nextInt();
                System.out.println("количество знаков в числе " + task15 + " = " + obj.numLen(task15));
                break ;
            case 16:
                System.out.println("введите размер массива \n -->");
                int size = sc.nextInt();
                int[] arr = new int[size];
                System.out.println("введите элементы массива \n -->");
                for (int i = 0; i < size; i++) {
                    arr[i] = sc.nextInt();
                }
                System.out.println("введите число для поиска \n -->");
                int task16 = sc.nextInt();
                System.out.println("индекс первого вхождения числа " + task16 + " в массив = " + obj.findFirst(arr, task16));
                break ;
            case 17:
                System.out.println("введите размер массива \n -->");
                int size17 = sc.nextInt();
                int[] arr17 = new int[size17];
                System.out.println("введите элементы массива \n -->");
                for (int i = 0; i < size17; i++) {
                    arr17[i] = sc.nextInt();
                }
                System.out.println("введите число для поиска \n -->");
                int task17 = sc.nextInt();
                System.out.println("индекс последнего вхождения числа " + task17 + " в массив = " + obj.findLast(arr17, task17));
                break ;
            case 18:
                System.out.println("введите размер массива \n -->");
                int size18 = sc.nextInt();
                int[] arr18 = new int[size18];
                System.out.println("введите элементы массива \n -->");
                for (int i = 0; i < size18; i++) {
                    arr18[i] = sc.nextInt();
                }
                System.out.println("наибольшее по модулю значение массива = " + obj.maxAbs(arr18));
                break ;
            case 19:
                System.out.println("введите размер массива \n -->");
                int size19 = sc.nextInt();
                int[] arr19 = new int[size19];
                System.out.println("введите элементы массива \n -->");
                for (int i = 0; i < size19; i++) {
                    arr19[i] = sc.nextInt();
                }
                System.out.println("введите значение для вставки \n -->");
                int task19 = sc.nextInt();
                System.out.println("введите позицию для вставки \n -->");
                int pos19 = sc.nextInt();
                int[] result19 = obj.add(arr19, task19, pos19);
                System.out.print("массив после вставки: ");
                for (int i = 0; i < result19.length; i++) {
                    System.out.print(result19[i] + " ");
                }
                System.out.println();
                break ;
            case 20:
                System.out.println("введите размер массива \n -->");
                int size20 = sc.nextInt();
                int[] arr20 = new int[size20];
                System.out.println("введите элементы массива \n -->");
                for (int i = 0; i < size20; i++) {
                    arr20[i] = sc.nextInt();
                }
                System.out.println("введите размер массива для вставки \n -->");
                int sizeIns = sc.nextInt();
                int[] ins = new int[sizeIns];
                System.out.println("введите элементы массива для вставки \n -->");
                for (int i = 0; i < sizeIns; i++) {
                    ins[i] = sc.nextInt();
                }
                System.out.println("введите позицию для вставки \n -->");
                int pos20 = sc.nextInt();
                int[] result20 = obj.add(arr20, ins, pos20);
                System.out.print("массив после вставки: ");
                for (int i = 0; i < result20.length; i++) {
                    System.out.print(result20[i] + " ");
                }
                System.out.println();
                break ;
            default:
                System.out.println("выберите одно из предложенных заданий или введите 0 для выхода");
                break;

              
        }
        sc.close();   






         
        
    }
    public double fraction(double x) { 
        return  (x - (int)x) ;
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
    public String listNums (int x){
        String string = "";
        for(int i = 1; i <= x; i++){
            string += i + " ";
        }
        return string ;
    }
    public String reverseListNums (int x){
        String string = "";
        for(int i = x; i >= 0; i--){
            string += i + " ";
        }
        return string ;
    }
    public String chet (int x){
        String string = "";
        for(int i = 0; i <= x; i = i+2){
            
            string += i + " ";
            
        }
        return string ;
    }
    public int pow (int x, int y){
        for(int i = 1; i < y; i++){
            x *= x;
        }
        return x ;
    }
    public int numLen (long x){
        int count = 0;
        while (x != 0) {
            x /= 10;
            count++;
        }
        return count;
    }
    public int findFirst (int[] arr, int x){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
    public int findLast (int[] arr, int x){
        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
    public int maxAbs (int[] arr){
        int res = 0;
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            if(Math.abs(arr[i]) > max){
                max = Math.abs(arr[i]);
                res = arr[i];
            }
        }
        return res;
    }
    public int[]add (int[] arr, int x, int pos){
        int[] arrRes = new int[arr.length +1] ;
        for( int i = 0 ; i < pos ; i++) {
            arrRes[i] = arr[i];
        }
        arrRes[pos] = x ;
        for(int i = pos + 1 ; i < arrRes.length ; i ++ ){
           arrRes[i] = arr[i - 1]; 
        }
        return arrRes ;
    }
    public int[] add (int[] arr, int[] ins, int pos){
        int[] arrRes = new int[arr.length + ins.length] ;
        for( int i = 0 ; i < pos ; i++) {
            arrRes[i] = arr[i];
        }
        for(int i = 0 ; i < ins.length ; i ++) {
            arrRes[pos + i ] = ins[i] ;
        }
        for(int i = pos + ins.length ; i < arrRes.length ; i ++ ){
           arrRes[i] = arr[i - ins.length]; 
        }
        return arrRes ;
    }
}
