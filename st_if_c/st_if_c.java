public class st_if_c
{
    public static void main(String[] args){
    // ? Kulllanarak : sembolü ile ayırarak önce doğru sonra yanlış cevabı yazarak String'e atama yapabilirsin.
    int maas=15_000;
    String durum=maas >10_000 ? "yuksek maasli" : "dusuk maasli";
    System.out.println(durum);
    // int ile de yapalım. 10000 üzerine 8 puan altına 5 puan finansal puan verelim.
    int finansalpuan=maas>10_000 ? 8:5;
    System.out.println(finansalpuan);    
    }
}
