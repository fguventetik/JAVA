import java.util.Scanner;
public class donguWhile
{
    public static void main(String[]args){
    //önce bir değişken oluştur. Bu değişkenin ne şartlarda çalışacağını while içinde tanımla.
    //Değişkenin değişmesini kod bloğu içinde gerçekleştir.
    int a=5;
    while(a>0){
        System.out.println("Merhaba " + a);
        a--;
    }
    Scanner veriAl=new Scanner(System.in); // While içinde tanımlanabiliyor ama tanımlanması doğru değil.
    String girilenVeri="";
    while(!girilenVeri.equals("çıkış")){
        System.out.print("Birşey yaz:");
        girilenVeri=veriAl.nextLine().toLowerCase(); //Ne girilirse girilsin küçük harfe çevirerek al.
        System.out.println(girilenVeri);
    }
    
    //Do en az işlemi bir kere yaptıktan sonra koşulu kontrol eder.
    //String girilenVeri="çıkış" olarak en baştan tanımlanmış olsa da bir kere soracaktı.
    //yukarıdakinin aynısını do ile yapalım.
    do {
        System.out.print("Birşey yaz :");
        girilenVeri=veriAl.nextLine().toLowerCase(); //Ne girilirse girilsin küçük harfe çevirerek al.
        System.out.print(girilenVeri);   
    } while(!girilenVeri.equals("çıkış"));
    
    //Döngüde çıkış yazınca da bir kere olsun çalıştırıp çıkış yazıyordu.
    //Bunu engelleyelim. Çıkış yazınca hemen dursun.
    
    do{
        System.out.print("Birşey yaz :");
        girilenVeri=veriAl.nextLine().toLowerCase(); //Ne girilirse girilsin küçük harfe çevirerek al.
        System.out.println(girilenVeri);
    } while(!girilenVeri.equals("çıkış"));
    
    //aynısını BREAK ile yapalım
    do{
        System.out.print("Birşey yaz :");
        girilenVeri=veriAl.nextLine().toLowerCase(); //Ne girilirse girilsin küçük harfe çevirerek al.
        if(!girilenVeri.equals("çıkış"))
            break;
        System.out.println(girilenVeri);    
    } while(!girilenVeri.equals("çıkış"));
    
    //Bir kere de mola verdirelim.Program çıkış yapmasın CONTINUE ile başa dönsün.
    do{
        System.out.print("Birşey yaz :");
        girilenVeri=veriAl.nextLine().toLowerCase();
        if(girilenVeri.equals("atla"))
        continue;
        if(girilenVeri.equals("çıkış"))
        break;
    System.out.println(girilenVeri);
    } while(!girilenVeri.equals("çıkış"));
    //While içinde artık koşula gerek yok.true yazılsa yeter çünkü break ve continue var.
    do {
        System.out.print("Birşey yaz :");
        girilenVeri=veriAl.nextLine().toLowerCase();
        if(girilenVeri.equals("atla"))
            continue;
        if(girilenVeri.equals("çıkış"))
            break;
        System.out.println(girilenVeri);
    } while(true);
}
}
