public class st_if_a
{
    public static void main(String[] args){
    //if yazarken tek satırlık bir kod varsa süslü parantezlere gerek yoktur.
    //Süslü parantez yoksa sadece en alttaki satırı okur.
    int yas=20;
    if(yas>30)
    System.out.println("Artık genç değilsin. ");
    else if (yas>15 && yas<=30)
    System.out.println("Hala gençsin. ");
    else 
    System.out.println("Daha çocuksun. ");
    
    //Bir fazla satırlı kod bloğu varsa süslü parantez gerekir.
    if(yas>30){
    System.out.println("Artık genç değilsin. ");
    System.out.println("Yaşlanıyorsun. ");    
    }
    else if(yas>15){
    System.out.println("Hala gençsin. ");
    System.out.println("Yaşamaya devam. ");
    }
    else {
    System.out.println("Daha çocuksun. ");
    System.out.println("Oyun oynama devam. ");
    }
    }
    
    
    
    
}
