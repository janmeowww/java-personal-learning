import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("請輸入您的姓名:");
        Scanner scn= new Scanner(System.in);
        String name= scn.next();
        System.out.println("Hi, "+name+".請輸入您的銅板個數: ");
        System.out.println("請輸入1元的個數:");
        int a= scn.nextInt();
        System.out.println("請輸入5元的個數:");
        int b=scn.nextInt();
        System.out.println("請輸入10元的個數:");
        int c=scn.nextInt();
        System.out.println("請輸入50元的個數:");
        int d=scn.nextInt();
        int total=a+5*b+10*c+50*d;
        System.out.println("您的錢總共有:"+total/1000+"千"+total%1000/100+"百"+total%100/10+"十"+total%10+"元");
        scn.close();
    }
}
