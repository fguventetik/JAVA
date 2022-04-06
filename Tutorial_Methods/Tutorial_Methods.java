//Method çağırıldığında çalışan kod bloklarıdır.
public class Tutorial_Methods
{
    //zaten main metodu ile başlıyoruz. main metodu dışında bir method yazalım.
    public static void main(String[] args){
    //Aşama 2 
    //Oluşturduğumuz metodu main metodu içinde çalıştırıyoruz. Sadece merhaba
    merhaba(); //Bize sadece merhaba diyecektir.
    //Aşama 4
    selamla("İsim");
    //Aşama 5 Aynısını değişken ile yapabilirdik.
    String adiniz="İsim Soyisim";
    selamla(adiniz);//Parametre yerine yazdığımız değere argument denir.
    //7 DÖNÜŞLÜ METODU KULLANALIM
    int m=5;
    int n=8;
    int p=toplama(m,n); //argumentleri girdik
    System.out.println(p);
    System.out.println(toplama(m,n));//Bu da çalıştırdı.
    //9 overloaded selamla yapalım.
    selamla("İsim", 30);
}
//Aşama 1 
//main metodu dışına çıkıyoruz.
//bir metot yazmak için isim vererek parantezlerle metodu oluşturuyoruz.
//Süslü parantezler içine çalışacak kod bloğumuzu yazıyoruz.
//main metodu statik olduğu için static ve bir değişken döndürmediği için void yaptık.
static void merhaba(){
    System.out.println("Merhaba");
}
//Aşama 3 
//Bu sefer parametre içeren bir metod yazalım.
//metodun parantez içine ne tür veri isteyeceğimizi(parametre) tanımlıyoruz ve bir isim veriyoruz.
static void selamla(String a){
    //a değişkeni olarak belirlediğimiz parametre kullandığımız yerdeki değişkenle aynı olsa da çalışırdı.
    //String adimiz olarak tanımlayabilirdik.
    System.out.println("Merhaba "+a);
}
//6 DÖNÜŞLÜ BİR METOD YAZALIM. void yerine ne tip değer döndürdüğünü yazacağız.
static int toplama(int x,int y){
    int z=x+y;
    return z;
    //x ve y parametrelerini toplayıp z değişkenine atıyor. bu z yi int olarak döndürüyor.
    //sadece anlatım olarak böyle uzun yazdık.  zye gerek yoktu. Sadece return x+y olabilirdi.
}
//8 aynı isimle metotlar oluşturuabiliriz sadece parametre tipi ve/veya adedi farklı olmalıdır.
//Bu overloaded method denir.
//selamla metodunu çift parametreli olarak da yazalım.
static void selamla(String a,int b){
    System.out.println("Merhaba " +a+ ", sen "+ b + " yaşındasın.");
}
}
