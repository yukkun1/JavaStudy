public class example {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int seisu = 1234;
        System.out.println("int型 = 整数 =" + seisu); 
        
        String moji = "javaはプログラム";
        System.out.println(moji);

        int i =10;
        System.out.println(i >= 5 && i <= 20);


        int old =19;
        String notAllowed = "未成年";
        String willBeAllowed = "ギリ未成年";
        String allowed = "成年";
        if (old > 20) {
            System.out.println(allowed);
        } else if (old == 19) {
            System.out.println(willBeAllowed);
        } else  {
            System.out.println(notAllowed);
        }

        int age = 56;
        boolean is_student =true;
        String portable = "５０代";
        if (age >= 50 && is_student) {
            System.out.println(portable);
        }
        
        int kubun = 3;
        switch (kubun) {
            case 1:
            System.out.println("kubunが1の時");
                break;
            case 2:
            System.out.println("kubunが2の時");
                break;
            case 3:
            System.out.println("kubunが3の時");
                 break;
        }
     /*練習問題 */
        int hogeInt = 50;
        String hogeString = "テスト";
        /*hogeDoubleという変数にdoubleで小数点を挿入している */
        hogeInt = 100;
        hogeString = "合格";
        System.out.println(hogeInt);
        // System.out.printlnでhogeStringの変数の中身を出力
        System.out.println(hogeString);
        double hogeDouble = 0.2;
        System.out.println(hogeDouble);

        String[] country = {"JAPAN", "AMERICA", "KOREA"};
        System.out.println(country.length);
        String[] strArray = {"りんご", "もも", "ぶどう"};
        System.out.println(strArray[1]); 
        //  int型で変数intArrayを作り、5つの数字を格納
        int[] intArray = {10, 20, 30, 40, 50};
        //  20と50を足した70を出力している   
        System.out.println(intArray[1] + intArray[4]);
 
        int plus = 10;
        plus += 5;
        int minus = 20;
        minus -= 7;
        // int型にmultiplyの変数を作り、10×2=20を算出
        int multiply = 10 * 2;
        int remi = 20 % 6;
        // String型でtownに有楽町、lineの変数に線を格納
        String town = "有楽町";
        String line = "線";
        String train = town + line; 
        System.out.println(plus);
        System.out.println(minus);
        System.out.println(multiply);
        System.out.println(remi); 
        System.out.println(train);
       

    }   
}   