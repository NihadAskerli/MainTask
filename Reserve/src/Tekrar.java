import java.util.Scanner;

public class Tekrar {
    public static void main(String[] args) {
//        User u= new User();
//        u.a=1;
//        User u2=new User();
//        u2.a=2;
//        u2=u;
//        System.out.println(u2.a);
//        referance qirilmasi u2=u kod  soldan saga oxudungu ucun u nun ayi cap olunur
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int i=1;
        while(n>sum){
            sum++;
            while(i>=sum){
                System.out.print(i);

            }
        }







    }
    public static void task9(int a,char c,boolean altalta){
        if(altalta=true){
            for(int i=0;i<a;i++){
                System.out.println(c);
            }
        }else{
            for(int i=0;i<a;i++){
                System.out.print(c);
            }
        }
    }
   public static void task8(){
        Scanner sc= new Scanner(System.in);
        Integer a= sc.nextInt();
        String s=a.toString();


        boolean b= true;
        if(b=true){
            for(int i=0;i<s.length();i++){
                b=s.charAt(i)==s.charAt(s.length()-i-1);
            }
            System.out.println(b);

        }
    }
    public static void task7(){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        boolean b= true;
        if(b=true){
            for(int i=0;i<s.length();i++){
                b=s.charAt(i)==s.charAt(s.length()-i-1);
            }
            System.out.println(b);

        }
    }
    public static void task4(){
        int b=0;

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while(a>0){
            a=a/10;
            b+=1;

        }
        System.out.println(b);
    }
    public static void task2(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=2;i<=a;i++){
            if(i/a==1){
                System.out.println("eded sadedir");
            }  else if(a%i==0){
                System.out.println("eded sade deyil");
                break;
            }
        }
    }
    public static void task3(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int qaliq;
        int sum=0;
        while(a>0){
            qaliq=a%10;
            a=(a-qaliq)/10;
            sum=sum+qaliq;
            if(a<10){
                sum=sum+a;
                System.out.println(sum);
                break;
            }

        }
    }
}
