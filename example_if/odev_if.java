import java.util.Scanner;
public class odev_if
{
    public static void main(String[] args){
        //Girdiğimiz sayı 5'e bölünüyorsa beşe bölünür desin.
        //Girdiğimiz sayı 3'e bölünüyorsa üçe bölünür desin.
        //Girdiğimiz sayı her ikisine de bölünüyorsa hem beşe hem üçe bölünür desin.
        Scanner veriAl=new Scanner(System.in);
        System.out.println("Sayıyı giriniz: ");
        int sayi=veriAl.nextInt();
        if(sayi%5==0)
            System.out.println("Beş'e bölünür. ");
        else if(sayi%3==0)
            System.out.println("Üç'e bölünür. ");
        else if(sayi%5==0 && sayi%3==0)
            System.out.println("Hem beşe hem üçe bölünür. ");
        else {
        System.out.println(sayi);}
        //Bu kod çalışacaktır ancak istediğimiz sayıyı vermez.
        //İşlem sırası hatalıdır. Bu yüzden BUG'ı var. IF ilk bulduğu doğruda durur.
        //En özel durumu en üste yazmak gerekir.
        //AŞAĞIDA DOĞRU YAZIMI
        int deger=veriAl.nextInt();
        if(deger%5==0 && deger%3==0)
            System.out.println("Hem beşe hem üçe bölünür. ");
        else if (deger%5==0)
            System.out.println("Beş'e bölünür. ");
        else if (deger%3==0)
            System.out.println("Üç'e bölünür. ");
        else{
            System.out.println(deger);}
            
        //Başka bir çözüm. Basamakı ama duruma göre tercih edilebilir.
        int tamsayi=veriAl.nextInt();
        if(tamsayi%5==0){
            if(tamsayi%3==0)
                System.out.println("Hem beşe hem üçe bölünür. ");
            else
                System.out.println("Beşe bölünür. ");
            }
        else if(tamsayi%3==0){
                System.out.println("Üçe bölünür. ");
            }
        else{
                System.out.println(tamsayi);
            }
    }
}
