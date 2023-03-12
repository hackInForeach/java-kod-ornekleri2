public class Main {
    public static void main(String[] args) {
        // DEĞİŞİME DİREMEYEN PROGRAMLAR TASARLA!!!!!!!!!!!!!!

    KrediUI krediUI=new KrediUI();
    krediUI.KrediHesapla(new OgretmenKrediManager());
    krediUI.KrediHesapla(new TarimKrediManager());
    krediUI.KrediHesapla(new AskerKrediManager());

    }
}