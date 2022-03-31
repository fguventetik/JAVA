public class st_if_b
{
    public static void main(String[] args){
    //Hatırlatma kodu. if statement içinde değişken tanımlanamaz.
    int maas=15_000;
    if(maas>10_000){
        //boolean yuksekMaas=true; 
    }
    else{
        //boolean yuksekMaas=true;
    }
    /* ***Çalışması için booelan değişkeni dışarı tanımlanır. *** */
    boolean yuksekMaas;
    if(maas>10_000){
        yuksekMaas=true;
    }
    else{
        yuksekMaas=false;
    }
    /* Ancak verimli programcı yukarıdaki gibi de yapmaz. Aşağıdaki gibi yapar. */
    boolean yMaas=false;
    if(maas>10_000)
        yMaas=true; // maas zaten 10000 ve altıysa false olarak kalır.
    }
    
}

