package nesnetabproglab9.yayinevi;

import enums.EditorInceleEnum;
import enums.KitapDurumEnum;
import java.util.ArrayList;

public class Kitap {
    private Yazar yazar;
    private ArrayList<KitapInceleme> incelemeler;
    private KitapDurumEnum durum;
    private String adi;

    public Kitap(Yazar yazar, String adi) {
        this.yazar = yazar;
        this.incelemeler = new ArrayList<KitapInceleme>();
        this.adi = adi;
    }

    public Yazar getYazar() {
        return yazar;
    }

    public KitapDurumEnum getDurum() {
        return durum;
    }

    public String getAdi() {
        return adi;
    }
    
    public void addInceleme(KitapInceleme inceleme){
        incelemeler.add(inceleme);
        kitapDurumuGuncelle();
    }
    
    public void removeInceleme(KitapInceleme inceleme){
        incelemeler.remove(inceleme);
        kitapDurumuGuncelle();
    }
    
    private void kitapDurumuGuncelle() {
        // inceleme sonucuna göre kitap durumunu güncelle
        KitapInceleme sonInceleme = incelemeler.get(incelemeler.size()-1);
        if(sonInceleme.getKarar() == EditorInceleEnum.REDDEDILDI){
            this.durum = KitapDurumEnum.REDDEDILDI;
        }
        else if (sonInceleme.getKarar() == EditorInceleEnum.DUZENLENECEK){
            this.durum = KitapDurumEnum.INCELEMEDE;
        }
        else if (sonInceleme.getKarar() == EditorInceleEnum.ONAYLANDI){
            this.durum = KitapDurumEnum.YAYINLANDI;
        }
    }
}

