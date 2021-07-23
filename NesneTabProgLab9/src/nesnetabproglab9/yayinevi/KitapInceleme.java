package nesnetabproglab9.yayinevi;

import enums.EditorInceleEnum;
import java.util.ArrayList;

public class KitapInceleme {
    private ArrayList<EditorKitapGorus> gorusler;
    private Kitap kitap;
    
    public KitapInceleme(Kitap kitap,Editor[] editorler) {
        this.gorusler = new ArrayList<EditorKitapGorus>();
        this.kitap = kitap;
    }

    public void addKitapGorus(Editor editor, String aciklama, EditorInceleEnum karar){
        this.gorusler.add(new EditorKitapGorus(editor, aciklama, karar));
    }

    public KitapInceleme(Kitap kitap) {
        this.kitap = kitap;
    }
    
    
    
    /**
     * En az bir editör reddetmiş ise REDDEDILDI
     * En az bir editör düzenleme istemiş ise DUZENLENECEK
     * Bütün editörler onaylamışsa kitap ONAYLANDI
     * @return 
     */
    public EditorInceleEnum getKarar(){
        EditorInceleEnum sonuc = null;
        int redSayisi =0; 
        int duzenlenecekSayisi =0;
        int onaySayisi =0;
        for (int i=0; i<this.gorusler.size(); i++ ){
            EditorInceleEnum karar = this.gorusler.get(i).getKarar();
            if(karar == EditorInceleEnum.REDDEDILDI){
                redSayisi++;
            }
            else if(karar == EditorInceleEnum.DUZENLENECEK){
                duzenlenecekSayisi++;
            }
            else if(karar == EditorInceleEnum.ONAYLANDI){
                onaySayisi++;
            }
        }
        
        if(redSayisi > 0){
            sonuc = EditorInceleEnum.REDDEDILDI;
        }
        
        if(duzenlenecekSayisi > 0){
            sonuc = EditorInceleEnum.DUZENLENECEK;
        }
        
        if(onaySayisi == this.gorusler.size()){
            sonuc = EditorInceleEnum.ONAYLANDI;
        }

        return sonuc;
    }
}
