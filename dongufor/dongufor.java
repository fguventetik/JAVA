public class dongufor
{
    public static void main(String[]args){
    for(int i=0;i<5;i++){
    //for döngüsü içinde bir değer tanımlıyoruz. Ne durumda tekrar etmesi gerektiğini yazıyoruz.
    //0 değere ulaştıracak işlemi yapıyor.
    //Kodu bir kere çalıştırır daha sonra sonradaki işlemi yapar ve kontrol eder.
        System.out.println("Merhaba " + i);
    //Çıktı: Merhaba 0 Merhaba 1 Merhaba 2 Merhaba 3 Merhaba 4
    //i++ ya da ++i olması birşey değiştirmiyor.
    }
    System.out.println("Aşağıda 5'ten 1'e azaltma yapalım");
    for (int i=5;i>0;i--){
    //for döngüsü içinde bir değer tanımlıyoruz. Ne durumda tekrar etmesi gerektiğini yazıyoruz.
    //0 değere ulaştıracak işlemi yapıyor.
    //Kodu bir kere çalıştırır daha sonra sonradaki işlemi yapar ve kontrol eder.
        System.out.println("Merhaba "+i);
    //Çıktı: Merhaba 0 Merhaba 1 Merhaba 2 Merhaba 3 Merhaba 4
    //i++ ya da ++i olması birşey değiştirmiyor.
    }
    //FOR İLE İLGİLİ HERŞEY BU KADAR, BUNUN DIŞINDA İÇİÇE FOR LOOP OLABİLİR.)FOR EACH)
    String[] bilgisayarcilar={"Ali", "Veli", "Osman"};
    //önce bunu for ile yapalım.
    for(int i=0;i<bilgisayarcilar.length;i++)
    {
        System.out.println(bilgisayarcilar[i]);
    }
    //FOR EACH İLE YAPALIM
    for(String bilgisayarci:bilgisayarcilar)
    {
        System.out.println(bilgisayarci);
    }
    //FOR EACH sadece sıralı olarak verebilir. Tersten sıralayamaz. Daha sınırlı kullanımdır.
    }
}
