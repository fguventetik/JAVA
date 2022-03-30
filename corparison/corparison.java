public class corparison
{
    public static void main (String[] args) {
    //EŞİTLİK KONTROLÜ ==
    int x=1;
    int y=1;
    System.out.println(x==y); // Eşit oldukları için true verir.
    
    boolean z= x==y; // Bir boolean'a atayarak da bakabilirdik.
    System.out.println(z);
    
    //EŞİT OLMAMA KONTROLÜ !=
    int a=1;
    int b=2;
    System.out.println(a!=b); // Eşit olmadıkları için true verir.
    
    //BÜYÜK YA DA KÜÇÜKSE, BÜYÜK YA DA KÜÇÜK EŞİTSE > <
    
    System.out.println(x>y); // x büyük olmadığında false verir.
    System.out.println(x<=y); // x büyük ya da eşit olduğundan true verir.
    System.out.println(x<=y); // x küçük ya da eşit olduğundan true verir.
    
    //VE && , VEYA ||
    
    int OgrenciNot=75;
    boolean olcBasari=OgrenciNot >=70 && OgrenciNot <85;
    //Java && operatörünü varsa koşulları soldan sağa okur. 
    //İlki uymuyorsa gerisine bakmaz, uyuyorsa diğerine bakar.
    System.out.println(olcBasari);
    
    boolean sozlu=false;
    boolean yazili=true;
    //Öğrenci sözlü veya yazılıdan geçiyorsa geçsin.
    //İlk hatalı olsa da devam eder, bir sonraki koşul olacak mı bakar.
    boolean gecti= sozlu || yazili; //bu şekilde yazıldığında boolean doğru mu diye sorarız.
    System.out.println(gecti);//true verir.
    
    //Birden fazla koşul varsa öncelik ve boolean DEGIL ! kontrolü
    
    boolean diploma=false; //Diploma var.
    boolean deneyim=true; //tecrübesi yok.
    boolean sucKaydi=true; //suç kaydı var.
    
    //Diploması ya da tecrübesi olması yeterli olsun. Ama suç kaydı varsa işe almayalım.
    boolean alimaUygun=(diploma || deneyim) && !sucKaydi; // sucKaydina false ise demek için ünlem koydu.
    //İlk bölümde parantez içini yaptı. Dipoloma yok ve devam etti.Deneyim var ve genelini true kabul edip devam etti.
    //sucKaydi yok mu diye sorduk var.
    System.out.println(alimaUygun); //false verir.
  
    }
}

