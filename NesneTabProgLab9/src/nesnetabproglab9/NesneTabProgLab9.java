package nesnetabproglab9; // 1.08.10 video https://drive.google.com/file/d/1BU5NB8LwCXcAscP7xqaJf84DcMfT55Rv/view
// jenerik yapılar temeli gibi düşünülebilir 
import enums.EditorInceleEnum;
import nesnetabproglab9.yayinevi.Editor;
import nesnetabproglab9.yayinevi.Kitap;
import nesnetabproglab9.yayinevi.KitapInceleme;
import nesnetabproglab9.yayinevi.YayinEvi;
import nesnetabproglab9.yayinevi.Yazar;



public class NesneTabProgLab9 {

    public static void main(String[] args) {
        
        YayinEvi yayinevi = new YayinEvi();
        Editor editor1 = new Editor("Ayşe","Bilgili");
        Editor editor2 = new Editor("Ali","Görüş");
        yayinevi.addEditor(editor1);
        yayinevi.addEditor(editor2);
        
        Yazar yazar = new Yazar("Veli","Can");
        Kitap kitap = new Kitap (yazar, "Güneşli Bir Gün");
        KitapInceleme kitapInceleme = new KitapInceleme(kitap);
        kitapInceleme.addKitapGorus(editor1,"", EditorInceleEnum.ONAYLANDI);
        kitapInceleme.addKitapGorus(editor2,"", EditorInceleEnum.REDDEDILDI);
        kitap.addInceleme(kitapInceleme);
        System.out.println(kitap.getDurum());
        
        
        
        /* ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Text");  */
/*
        NtpArrayList<String> ntpList = new NtpArrayList<String>();
        ntpList.add("aa");
        ntpList.add("bb");
        print(ntpList.getAll());
        
        NtpArrayList<Integer> ntpList1 = new NtpArrayList<Integer>(); // Integer yerine başka örneklerde boolean getirilebilir
        ntpList1.add(10);
        ntpList1.add(15);
        print(ntpList1.getAll());*/
    }  

    public static void print(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
   
    public< T extends Object > void printT (T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

