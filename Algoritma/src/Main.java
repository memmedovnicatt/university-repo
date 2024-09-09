import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void findOfMinNumberInArray() {
        int[] array = {1, 2, -1, 3, 4, 0, -8};

        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            for (int j = 0; j < array.length - 1; j++) {
                if (min > array[j + 1]) {
                    min = array[j+1];
                }
            }
            System.out.println(min);
        }
    }

    public static void azalanSira() {
        int[] array1 = {2, 6, 8, 7, 5, 10, 11, 14, 15, 16, 18, 0, 1};
        int[] array2 = {};
        int minNum = array1[0];
        //{ , , , , , , , , , , , }
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (array1[i] > array1[j + 1]) {
                    minNum = array1[j + 1];
                }

            }
        }
        System.out.println(minNum);

        //18 16 15 14 11 10 8 7 6 5 2 1 0


    }


    public static void main(String[] args) {
        findOfMinNumberInArray();
//        int[] array = {2, 6, 8, 7, 5, 10, 11, 14, 15, 16, 18, 1};
//        for (int i = 0; i < array.length; i++) {
//            int count = 0;
//            for (int j = 1; j <= array[i]; j++) {
//                if (array[i] % j == 0) {
//                    count++;
//                }
//            }
//            if (count == 2) {
//                System.out.println(array[i]);
//            }
//        }
    }
}


//int total=0;/*
//      for (int i=0;i<car.size();i++){
//      total+=car.get(i).cost;
//      System.out.println(total);


        /*
        for (Car bb:car){
            total+= bb.cost;
        }
        System.out.println(total);

         */
          /*
        Bus bus=new Bus("Qirmizi","Camry");
        Bus bus2=new Bus("Qirmizi","Camry");
        bus.bus_gosterme();
        System.out.println("Qapi sayi = " + Bus.qapi_sayi);
        System.out.println("Qapi sayi = " + bus.qapi_sayi);
        */
//Bus bus=new Bus("Ag","Camry");
//bus.yagBildirisler();

//static metod olmadiqi ucun mutleq ve
// mutleq onun obyektini yaradib,daha sonra elde etmek lazmdir.

//Bus.benzinBildirisi();
//static metod olduqu ucun obyektini yaradib cagirmaqa ehtiyac yoxdur
      /*
       static ve non-static metodun arasindaki ferq,
        ondan ibaretdir ki staticin obyekti yaradilmadan caqrilir,ama static
        olmayanda ise yaradilir sonra cagrilir.

       */
  /*ArrayList<Car>car=new ArrayList<Car>();
        Car c1=new Car();
        c1.cost=100;

        Car c2=new Car();

        Car c3=new Car();
        c3.cost=300;

        car.add(c1);
        car.add(c2);
        car.add(c3);

         */

        /*
Cats cats =new Cats();
cats.cats();
Dogs dogs=new Dogs();
dogs.dog();

         */
 /* firstsubclass firstsubclass=new firstsubclass();
        firstsubclass.message();
        secondsubclass secondsubclass=new secondsubclass();
        secondsubclass.message();

        */

/*
 */

/*
       Dog dog=new Dog();
        System.out.println(dog instanceof Dog);
        dog.animalSound();
        dog.animalRun();
         */

        /*
        Sican sican=new Sican();
        sican.wildLifesF1();
        sican.wildLifesF2();
         */
/*class vurmaException extends Exception{
    @Override
    public void printStackTrace() {
        System.out.println("iki reqemde cox boyukdur,lutfen daha kicik sayilar daxxil edin ");
    }
}
/*
        Scanner scanner=new Scanner(System.in);
        String hesablamalar="1.Toplama " +
                "\t 2.Cixma" +
                "\t 3.Bolme" +
                "\t 4.Vurma";
        System.out.println(hesablamalar);
        System.out.println("Birini secin :  ");
        String reqemler= scanner.nextLine();
        int a;
        int b;
        try {
            switch (reqemler) {
                case "1":
                    System.out.println("1ci reqem = ");
                    a = scanner.nextInt();
                    System.out.println("2ci reqem = ");
                    b = scanner.nextInt();
                    System.out.println("Netice = " + (a + b));
                    break;

                case "2":
                    System.out.println("1ci reqem = ");
                    a = scanner.nextInt();
                    System.out.println("2ci reqem = ");
                    b = scanner.nextInt();
                    System.out.println("Netice = " + (a - b));
                    break;
                case "3":
                    System.out.println("1ci reqem = ");
                    a = scanner.nextInt();
                    System.out.println("2ci reqem = ");
                    b = scanner.nextInt();
                    System.out.println("Netice = " + (a / b));
                    break;
                case "4":
                    System.out.println("1ci reqem = ");
                    a = scanner.nextInt();
                    System.out.println("2ci reqem = ");
                    b = scanner.nextInt();
                    if (a>1000 && b>1000){
                        throw new vurmaException();
                    }
                    System.out.println("Netice = " + (a * b));
                    break;
                default:
                    System.out.println("Sef operator ,again gir ! ");

            }
        }
            catch (ArithmeticException e){
                System.out.println("0 a bolmek olmaz ");
            } catch (vurmaException e) {
            e.printStackTrace();
        }


    }

         */
// try{
//     int [] a={1,2,3,4};
//     System.out.println(a[1]);
//   double b=2/0;
//}
//        catch (ArrayIndexOutOfBoundsException e ){
//          System.out.println("5CI indeks movcud deil");
//    }
//  catch (ArithmeticException e ){
//    System.out.println("0 a bolmek olmaz ");
//}
//        System.out.println("Isdiyir");

// catch (ArithmeticException e){
//     System.out.println("0 a bolmek olmaz");
// }
// finally {
//     System.out.println("bu kod isleyir");
// }
     /* for (int i=0;i<car.size();i++){
            System.out.println("ELEMENT : " +car.get(i));
        }
    }

        */
       /* ArrayList<String> car=new ArrayList<String>();
        car.add("Mercedes");
        car.add("BMW");
        car.add("Toyota");

        capet(car);

       /* System.out.println(car.indexOf("Mercedes"));
        car.set(2,"Yeni toyota");
        System.out.println(car.get(2));
        */


//System.out.println(Car.get(2));
// car.remove(1);
        /*System.out.println(car.get(0));
        for (int i=0;i<car.size();i++){
            System.out.println(car.get(i));
        }
        */

     /* public static double average(int[]array){
        int toplam=0;
        for (int i=0;i< array.length;i++){
            toplam+=array[i];
        }
        return(toplam/ array.length) ;
    }

    */
   /* public static void main (String[]args){
       /* int [] a={1,2,3,4};
        for (int i=0;i<4;i++){
            a[i]=i*2;
            System.out.println(a[i]);}*/

       /* Scanner scanner=new Scanner(System.in);
        System.out.println("Arrayin olcusunu teyin edin : ");
        int n=scanner.nextInt();
        int[]array=new int[n];
        System.out.println("Arraylerin deyerleri :  ");
        for (int i=0;i<n;i++){
            array[i]= scanner.nextInt();
        }
        for (int i=0;i<n;i++){

            System.out.println("Arrayin "+""+i+ " ci elementi : "+array[i] );
        }
        System.out.println("sizin araryin avaragesi : "+average(array));
        }

        */
// new Account().melumatlariGosterme();
// Mudur mudur=new Mudur("100","nicat","it",5);
// mudur.method();
//  mudur.afternoon_yemek();
    /*Account account1=new Account();
    Account account2=new Account("Nicat","0516125092",99);
        account1.melumatlariGosterme();
                account2.melumatlariGosterme();
                */
    /*Car car1=new Car();
        car1.setModel("Mercedes");
                System.out.println("Msinin modeli : "+ car1.getModel());
     */
        /* int a=5;
        int b=6;
        String cavab="salam";
        if (cavab=="salaam"){
            System.out.println(a);
        }
        else {
            System.out.println("hecne");
        }

        */
//System.out.println(bircik(ucilecarp(ikiilecarp(8)))); //returnden sonra hecne yazilmaz
        /*
        String ad;
        Scanner sc = new Scanner(System.in);
        System.out.print("zehmet olmasa advizi daxil edin:");
        ad = sc.nextLine();
        System.out.println("xos geldin " + ad);

        System.out.println("salam");
        System.out.println("saqol");
*/
/*
        System.out.println("salam");
        System.out.println("saqol");
*/

//  System.out.println("*\n**\n***\n****");

/*
int a=2;
int b=4;
int c=5;
int z=a+b+c;
        System.out.println(z);
*/
/*
int a=45;
int b=32;
int z=a-b;
int k=a*b;
        System.out.println(z);
        System.out.println(k);
*/
// byte a=12;
//  System.out.println(a);

//double a= 50d/8d;
// System.out.println(a);

//  char c= '\u1F5A';
// System.out.println(c);
//System.out.println((char)104);

//int a=5;
//System.out.println(++a);
//


        /* Scanner scanner=new Scanner(System.in);
        System.out.print("Yasini daxil et : ");
        int yas=scanner.nextInt();
        System.out.println("Yasin : "+ yas);
       */



     /*   Scanner scanner=new Scanner(System.in);
        System.out.print("Her hansisa bir sey yaz : ");
        if(scanner.hasNextInt()){
            int reqem= scanner.nextInt();
            System.out.println("Reqem : " + reqem);
        }
        else {
            System.out.println("Duzgun daxil et");
        }
 */
      /*  Scanner scanner=new Scanner(System.in);
        System.out.println("Yas 1 i daxil edin : ");
        int yas1=scanner.nextInt();
        yas1+=2;
        System.out.println("yas 1: " + yas1);
 */

       /* Scanner scanner=new Scanner(System.in);
        System.out.println("Zehmet olmaasa kilonuzu daxil edin : ");
        int kilo=scanner.nextInt();
       // System.out.println("Kilonuz : " + kilo);
        System.out.println("Zehmet olmasa boyunuzu daxil edin (with sm) : ");
        double boy=scanner.nextDouble();
       // System.out.println("Boyunuz : " + (double)boy);
        double index=kilo/(boy*boy);
        System.out.println("Beden kitle indeksi : " + (double)index);
*/
      /*  Scanner scanner=new Scanner(System.in);
        System.out.println("1km ya ne qeder yandirir");
        double go=scanner.nextDouble();
        System.out.println("Zehmet olmasa nece km gedmisiz daxil edin : ");
        double km=scanner.nextDouble();
        double total=go*km;
        System.out.println("Umumi total : " + total);
*/
        /*
        Scanner sc=new Scanner(System.in);
        System.out.print("Birinci reqemi daxil et : ");
        int n1=sc.nextInt();
        System.out.print("Ikinci reqemi daxil et : ");
        int n2=sc.nextInt();
        System.out.println("Birinci sayi : " + n1 + "Ikinci sayi : " + n2);//before

        int k=n2;
        n2=n1;
        n1=k;
        System.out.println("Birinci sayi : " + n1 + "Ikinci sayi : " + n2); //after
*/

     /*
        Scanner sc=new Scanner(System.in);
        System.out.print("Ucbucaqin 1ci terefini daxil edin : ");
        int a=sc.nextInt();
        System.out.print("Ucbucaqin ikinci terefini daxil edin : ");
        int b=sc.nextInt();

        if (a<=0){
            System.out.print("Teref 0 ve ya menfi ola bilmez !");
        }
        else if (b<=0){
            System.out.print("Teref 0 ve ya menfi ola bilmez !");
        }
        else {
            double h=Math.sqrt(a*a + b*b);
            System.out.print("Hipetonuz : " + h);
*/
/*
        System.out.println(2>3);
        System.out.println(3==3);
        System.out.println(3==3 && 2>3 && "Mamedd"=="Mamedd");//en az bidene false var deye cavab false olacaqdir
        //meselen 10 dene sert var ve 9u true 1i false sa yenedde false qaytaracaq

        System.out.println(2>3 || 3==4 || "Mamedd"=="Mamedd"); // en azi bidene true varsa cavab true olacaq
        //meselen 10 dene sert var ve 9u false 1i truedise yenedde true qaytaracaq

*/
       /*
        Scanner scanner=new Scanner(System.in);
        System.out.println("Zehmet olmasa bir reqem daxil edin : ");
        int reqem= scanner.nextInt();
        if (reqem>=18){
            System.out.println("DOGRUDUR");
        }
        else{
            System.out.println("Yaanlisdir");

        */
        /*
        int etap1=2345+8;
        int etap2=etap1/3;
        int etap3=etap2%5;
        int etapSon=etap3*5;

        System.out.println(etap1);
        System.out.println(etap2);
        System.out.println(etap3);
        System.out.println(etapSon);

        System.out.println(Math.pow(2,5));
         */

       /* int a=55;
        int b=70;

        System.out.println(a<50 && a<b);// and---> false ustunluk verir kimi pristav ele.
        System.out.println(a<50 || a<b); //or---->true ustunluk verir kimi pristav ele.
        System.out.println(!(a<50 && a<b));
        System.out.println(!(a<50 || a<b));


        */
/*
        int fenn1=78;
        int fenn2=45;
        int fenn3=62;
        int subjectSayi=3;
        int maxBal=100;

        int total=fenn1+fenn2+fenn3;
        double averageMark=(double)total / (subjectSayi*maxBal)*100;
        System.out.println(total);
        System.out.println(averageMark);

 */
        /*
        int a=5;
        int b=6;
        int c=7;

        c=a;
        a=b;
        b=c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

         */

/*
        int n=5;
        int s=6;

        n=5+6;
        s=n-s;
        n=n-s;
        System.out.println(n);
        System.out.println(s);
*/
/*
        Scanner scanner=new Scanner(System.in);
        System.out.println("F = ");
        double f= scanner.nextDouble();
        double c =(f-32)*5/9;
        System.out.println("C = "+c);
 */
        /*
        Scanner scanner=new Scanner(System.in);
        System.out.println("Umumi sayi daxil edin : ");
        int totalStudent= scanner.nextInt();
        System.out.println("Oglanlarin sayini daxil edin : ");
        int boys=scanner.nextInt();
        int elaci=totalStudent/2;
        System.out.println("A alanlarin sayi : " + elaci);
        int Agirls=elaci-20;
        System.out.println("A alan qizlarin sayi : " + Agirls);

         */
        /*

        Scanner scanner=new Scanner(System.in);
        System.out.println("daxil et ");
        int hesab=scanner.nextInt();
        switch(hesab){
            case 1:
                System.out.println(1);
                break;

            case 2:
                System.out.println(2);

            case 3:
                System.out.println(3);
            default:
                System.out.println("hecne");
                break;

         */
        /*
        Scanner scanner=new Scanner(System.in);
        System.out.println("Birinci reqemi daxil edin : ");
        double n1=scanner.nextDouble();
        System.out.println("Ikinci reqemi daxil edin : ");
        double n2=scanner.nextDouble();
        System.out.println("Uccuncu reqemi daxil edin : ");
        double n3=scanner.nextDouble();

        if (n1>n2 && n1>n3){
            System.out.println("n1 digerlerinden boyukdur !");
        }
        else if (n2>n1 && n2>n3) {
            System.out.println("n2 digerlerinden boyukdur !");
        }
        else if (n1==n2 && n1==n3 && n2==n3) {
            System.out.println("butun reqemler bir birne beraberdir !");
        }
        else {
            System.out.println("n3 diger reqemlerdeb boyukdur !");
        }
         */
/*
        Scanner scanner=new Scanner(System.in);
        System.out.println("zehmet olmasa kilonuzu daxil edin : ");
        double kilo= scanner.nextInt();
        System.out.println("zehmet olmasa boyunuzu daxil edin : ");
        double boy= scanner.nextDouble();

        double bkt=kilo/(boy*boy);
        if (bkt<18.5){
            System.out.println("zayif");
        }
        else if ( bkt>=18.5 && bkt<25){
            System.out.println("normal");

        }
        else if (bkt>=25 && bkt<30){
            System.out.println("fazla kilolu");

        }
        else{
            System.out.println("obez");
        }

 */
/*
        Scanner scanner= new Scanner(System.in);
        int a;
        int b;
        System.out.println("Secin ");
        String calc= scanner.nextLine();
        switch (calc){
            case"+":
                System.out.println("birinci reqem : ");
                a= scanner.nextInt();
                System.out.println("ikinci reqem :");
                b= scanner.nextInt();
                System.out.println("cem : " + (a+b));
                break;

            case"/":
                System.out.println("birinci reqem : ");
                a= scanner.nextInt();
                System.out.println("ikinci reqem :");
                b= scanner.nextInt();
                System.out.println("cem : " + (a/b));
                break;

            case"-":
                System.out.println("birinci reqem : ");
                a= scanner.nextInt();
                System.out.println("ikinci reqem :");
                b= scanner.nextInt();
                System.out.println("cem : " + (a-b));
                break;

            case"*":
                System.out.println("birinci reqem : ");
                a= scanner.nextInt();
                System.out.println("ikinci reqem :");
                b= scanner.nextInt();
                System.out.println("cem : " + (a*b));
                break;

            default:
                System.out.println("Dogru addimi atin!");
                break;
                */

/*
        Scanner sc=new Scanner(System.in);
        System.out.println("Mid bali : ");
        int midExam= sc.nextInt();
        System.out.println("Aktivlik + davamyet bali : ");
        int adExam=sc.nextInt();
        System.out.println("Final bali : ");
        int finalExam=sc.nextInt();

        double average=(midExam* 3/10)+(adExam * 3/10)+(finalExam * 4/10);

        if (average>=91){
            System.out.println("Ortalama : A");
        }
        else if (average>=81){
            System.out.println("Ortalama : B");

        }
        else if(average>=71) {
            System.out.println("Ortalama : C");

        }
        else {
            System.out.println("Ortalama : D");
        }
 */

      /*  int i;
        for (i=3 ;i>0; i--){
            System.out.println(i);
        }

       */
      /*  int i=0;
        int j=10;
        for ( ;i<10 && j>0 ;i++,j--){
            System.out.println(i);
            System.out.println(j);

        }

       */
        /*
        for (int i=2;i<9;i*=2){
            System.out.println(i);
        }

         */
        /*
     Scanner scanner=new Scanner(System.in);
        System.out.println("daxil edin : ");
        int n= scanner.nextInt();
        int result=1;

        for (int i=1;i<=n;i++){
            result*=i;
        }
        System.out.println(result);

         */
        /*
        Scanner scanner=new Scanner(System.in);
        System.out.println("zehmet olmasa reqem daxil edin : ");
        int n= scanner.nextInt();
        int result=1;
        int i=1;
        while(i<=n){
            result*=i;
            i++;
        }
        System.out.println(result);
        */
        /*
        Scanner scanner=new Scanner(System.in);
        System.out.println("zehmet olmasa reqem daxil edin : ");
        int n= scanner.nextInt();
        int result=1;
        while(n>0){
            result*=n;
            n--;
        }
        System.out.println(result);
         */
        /*
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir reqem daxil edin : ");
        int n= scanner.nextInt();
        int cem=0;
        do {
            cem+=n%10;
            n/=10;
        }while(n>3);
        System.out.println(cem);
         */
// System.out.println(1/0);
        /*
        Scanner scanner=new Scanner(System.in);
        while (true){
            int n= scanner.nextInt();
            if (n==1){
                System.out.println("saxla");
                break;
            }
            System.out.println(n);
            }
         */
        /*
        int i=0;
        while(i<10){
            if (i==3 || i==4){
              i++;
                continue;
            }
            System.out.println(i);
        i++;
        }
         */