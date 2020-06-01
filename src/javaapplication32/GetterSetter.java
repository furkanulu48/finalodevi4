package javaapplication32;
public class GetterSetter  //gettersetter sınıfı oluşturuldu
{
private int deger;  //private int değişken tanımlandı (gettervesetter metodu kullanımı için private)
private String ad;  //private string değişken tanımlandı
public int getDeger() {  //getter metodu tanımlandı
return deger;  //return metodu ile deger değişkenine geri dönüldü
}
public void setDeger(int deger) { //setter metodu tanımlandı
this.deger= deger; //yeni tanımlanan deger değişkenini kullanması için this metodu tanımlandı.
}
public String getAd() {   //getter metodu tanımlandı
return ad;   //return metodu ile ad değişkenine geri dönüldü

}
public void setAd(String ad) {  //setter metodu tanımlandı
this.ad=ad;   // yeni tanımlanan ad değişkenini kullanması için this metodu tanımlandı.
}
public static void main(String [] args)
{GetterSetter a=new GetterSetter(); // Yeni bir gettersetter girişi için tanımlama yapıldı.
a.setAd("GetterSetterFinalÖdeviEncapsulation");  // Setter metodu sayesinde giriş gerçekleştirildi.
System.out.println(a.getAd());  // Tanımlanan girişin ekran çıktısı alındı.
a.setDeger(2020);  // Setter metodu sayesinde giriş gerçekleştirildi
System.out.println(a.getDeger()); /* Tanımlanan girişin ekran çıktısı alındı. */}}
