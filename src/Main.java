
import java.util.Scanner;
import java.lang.Math;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.


        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
// Bai 1 ----------------
        // int sum = 0 ;


       int n ;

        do {
            System.out.println("Nhap vao so nguyuen n >0 ");
            Scanner sc = new Scanner(System.in);
             n = sc.nextInt();
        }
        while (n <= 0);

       /* for(int i=0;i<=n ; i++)
            sum+= i ;
        System.out.println("tong"+sum);*/
        // Bai 2 ----------------
      /*  float sum2 = 0 ;
        for(int i=0;i<=n ; i++)
            sum2+= Math.pow(i,2) ;
        System.out.println("tong: "+sum2);*/

        // Bai 3 ----------------

     /*   float sum3 = 0 ;
        for(int i=1;i<=n ; i++)
            sum3+= (float) 1/i ;
        System.out.println("tong: "+sum3);*/

        // Bai 4 ----------------

     /* float sum4 = 0 ;
        for(int i=1;i<=n ; i++)
            sum4+= (float) 1/2*i;
        System.out.println("tong: "+sum4);*/

// Bai 5 ----------------

     /* float sum5 = 0 ;
        for(int i=1;i<=n ; i++)
            sum5+= (float) 1/2*i;
        System.out.println("tong: "+sum5);*/


// Bai 6 ----------------

 /*     float sum6 = 0 ;
        for(int i=1;i<=n ; i++)
            sum6+= (1.0 / i) *(i+1) ;
        System.out.println("tong: "+sum6);*/

// Bai 7 ----------------

    /*float sum7 = 0 ;
        for(int i=1;i<=n ; i++)
            sum7+= (i *1.0)/(i+1) ;
        System.out.println("tong: "+sum7);    */
// Bai 8 ----------------

    /*float sum8 = 0 ;
        for(int i=0;i<=n ; i++)
            sum8+= (2*n+1 )*1.0 /(2*n+2)  ;
        System.out.println("tong: "+sum8);    */

// Bai 9 ----------------

    /*int mul = 1 ;
        for(int i=1;i<=n ; i++)
            mul*= i  ;
        System.out.println("nhan: "+mul);    */

// Bai 10 ----------------


       /*  double x,y;

        do {
            System.out.println("Nhap vao so nguyuen x >0 ");
            Scanner sc = new Scanner(System.in);
            x = sc.nextDouble() ;

            System.out.println("Nhap vao so nguyuen y >0 ");
            Scanner sc1 = new Scanner(System.in);
            y = sc1.nextDouble();
        }
        while (x <= 0|| y<=0 );
   double pow1;
       pow1 = Math.pow(x,y) ;
        System.out.println("nhan: "+pow1);*/

// Bai 11 ----------------

    /*int sum11 =0  ;int mul = 1 ;
        for(int i=1;i<=n ; i++)
            mul*= i  ;
            sum11 += mul ;
        System.out.println("nhan: "+sum11);    */

 // Bai 12 ---------------

   /*double sum12 =0 ;
        double x,y;

        do {
            System.out.println("Nhap vao so nguyuen x >0 ");
            Scanner sc = new Scanner(System.in);
            x = sc.nextDouble() ;

            System.out.println("Nhap vao so nguyuen y >0 ");
            Scanner sc1 = new Scanner(System.in);
            y = sc1.nextDouble();
        }
        while (x <= 0|| y<=0 );
        double pow1=1;
        for(double i =1;i<=y;i++)
        {pow1 = Math.pow(x,i) ;
        sum12+= pow1 ;}
        System.out.println("nhan: "+sum12);*/

//Bai 13 --------------------
/*double sum13 =0 ;
        double x,y;

        do {
            System.out.println("Nhap vao so nguyuen x >0 ");
            Scanner sc = new Scanner(System.in);
            x = sc.nextDouble() ;

            System.out.println("Nhap vao so nguyuen y >0 ");
            Scanner sc1 = new Scanner(System.in);
            y = sc1.nextDouble();
        }
        while (x <= 0|| y<=0 );
        double pow1=1;
        for(double i =1;i<=y;i++)
        {pow1 = Math.pow(x,2*i) ;
        sum13+= pow1 ;}
        System.out.println("nhan: "+sum13);   */

//Bai 14 --------------------
/*double sum14 =0 ;
        double x,y;

        do {
            System.out.println("Nhap vao so nguyuen x >0 ");
            Scanner sc = new Scanner(System.in);
            x = sc.nextDouble() ;

            System.out.println("Nhap vao so nguyuen y >0 ");
            Scanner sc1 = new Scanner(System.in);
            y = sc1.nextDouble();
        }
        while (x <= 0|| y<=0 );
        double pow1=1;
        for(double i =1;i<=y;i++)
        {pow1 = Math.pow(x,2*i+1) ;
        sum14+= pow1 ;}
        System.out.println("nhan: "+sum14);   */

 //Bai 15 --------------------
/*  int deno = 0 ; float sum =0 ;
  for(int i =1; i<=n ;i++)
        {
            deno += i ;
             sum += 1.0/deno ;

        }
        System.out.println("Tong: "+sum);*/


 //Bai 16 --------------------
    /*    double sum =0 ;
        double x,y;
        int deno = 0 ;

        do {
            System.out.println("Nhap vao co so x >0 ");
            Scanner sc = new Scanner(System.in);
            x = sc.nextDouble() ;

            System.out.println("Nhap vao so mu~ y >0 ");
            Scanner sc1 = new Scanner(System.in);
            y = sc1.nextDouble();
        }
        while (x <= 0|| y<=0 );
        double pow1=1;
        for(double i =1;i<=y;i++)
        {pow1 = Math.pow(x,i) ;
            deno +=i ;
            sum+= pow1/deno ;}
        System.out.println("nhan: "+sum);
*/

        //Bai 17 --------------------
      /* double sum =0 ;
        double x,y;
        int deno = 1 ;

        do {
            System.out.println("Nhap vao co so x >0 ");
            Scanner sc = new Scanner(System.in);
            x = sc.nextDouble() ;

            System.out.println("Nhap vao so mu~ y >0 ");
            Scanner sc1 = new Scanner(System.in);
            y = sc1.nextDouble();
        }
        while (x <= 0|| y<=0 );
        double pow1=1;
        for(double i =1;i<=y;i++)
        {pow1 = Math.pow(x,i) ;
            deno *=i ;
            sum+= pow1/deno ;}
        System.out.println("nhan: "+sum);*/

        //Bai 18 --------------------
/*      double sum =1 ;
        double x,y;
        int deno = 1 ;

        do {
            System.out.println("Nhap vao co so x >0 ");
            Scanner sc = new Scanner(System.in);
            x = sc.nextDouble() ;

            System.out.println("Nhap vao so mu~ y >0 ");
            Scanner sc1 = new Scanner(System.in);
            y = sc1.nextDouble();
        }
        while (x <= 0|| y<=0 );
        double pow1=1;
        for(double i =1;i<=y;i++)
        {pow1 = Math.pow(x,2*i) ;
            deno *=2*i ;
            sum+= pow1/deno ;}
        System.out.println("nhan: "+sum);*/


        //Bai 19 --------------------
/*      double sum =1 ;
        double x,y;
        int deno = 1 ;

        do {
            System.out.println("Nhap vao co so x >0 ");
            Scanner sc = new Scanner(System.in);
            x = sc.nextDouble() ;

            System.out.println("Nhap vao so mu~ y >0 ");
            Scanner sc1 = new Scanner(System.in);
            y = sc1.nextDouble();
        }
        while (x <= 0|| y<=0 );
        double pow1=1;
        for(double i =0;i<=y;i++)
        {pow1 = Math.pow(x,2*i+1) ;
            deno *=(2*i+1) ;
            sum+= pow1/deno ;}
        System.out.println("nhan: "+sum);*/
// bai 20 ---------

       /*int i , j,count= 0 ;
       for(i =1; i<=n;i++)
       {
           if(n%i==0)
               System.out.printf("uoc cua " +n +"la: "+i);

       }*/

/*// bai 21 ---------
      int i ,sum= 0 ;
       for(i =1; i<=n;i++)
       {
           if(n%i==0)
               sum+= i ;
               System.out.printf("tong: "+sum);

       }*/

/*// bai 22---------
      int i ,sum= 0 ;
       for(i =1; i<=n;i++)
       {
           if(n%i==0)
               sum+= i ;
               System.out.printf("tong: "+sum);

       }*/

// bai 23---------
/*      int i ,count = 0 ;
       for(i =1; i<=n;i++)
       {
           if(n%i==0)
               ++count ;
               System.out.printf("so luong uoc : "+count);


       }*/

//bai 24---------
    /*  int i ,count = 0 ;
       for(i =1; i<=n;i++)
       {
           if(n%i==0) {
               if(i%2 !=0)

               System.out.println("uoc so le: " + i);
           }

       }*/

//bai 25---------
        int i , s= 0;
        for(i =1; i<=n;i++) {
            if (n % i == 0) {
                if (i % 2 == 0)
                    s += i;

            }
        }
        System.out.println("tong cac uoc chan: " + s);


    }
}