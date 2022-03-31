public class st_switch_a
{
    public static void main(String[]args){
        String gorev="Yönetici";
        if(gorev=="Yönetici")
            System.out.println("Raporlar butonu aktif");
        else if(gorev=="Kullanıcı")
            System.out.println("Form girişi aktif");
        else
        System.out.println("Sadece görüntüleme aktif");
    
    
    //Bunu if ile yapmak işlemler de artarsa çok düzensiz olur.
    //Switch ile yapılır.
    
    switch(gorev){
    case "Yönetici":
        System.out.println("Raporlar butonu aktif");
        break;
    case "Kullanıcı":
        System.out.println("Form girişi aktif");
        break;
    default:
        System.out.println("Sadece görüntüleme aktif");
    }
    
    //Yetkililere seviyede atayabilirdik. Int ile yapardık.
    int yetkiSeviyesi=2;
    switch(yetkiSeviyesi){
    //Break yapmazsak doğruyu bulduktan sonra diğerlerini de görür.
    case 3:
        System.out.println("Ziyaretçi Yetkisi");
        //break;
    case 2:
        System.out.println("Kullanıcı Yetkisi");
        //break;
    default:
        System.out.println("Yönetici Yetkisi");   
    }
    }
}
