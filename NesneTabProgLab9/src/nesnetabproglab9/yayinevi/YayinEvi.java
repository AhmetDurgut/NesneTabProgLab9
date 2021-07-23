package nesnetabproglab9.yayinevi;

import java.util.ArrayList;

public class YayinEvi {
    private final ArrayList<Kitap> kitaplar;
    private final ArrayList<Editor> editorler;
    
    public YayinEvi(){
        this.kitaplar = new ArrayList<Kitap>();
        this.editorler = new ArrayList<Editor>();
    }
    
    public void addKitap(Kitap kitap){
        kitaplar.add(kitap);
    }
    
    public void removeKitap(Kitap kitap){
        kitaplar.remove(kitap);
    }
    
    public void addEditor(Editor editor){
        editorler.add(editor);
    }
    
    public void removeEditor(Editor editor){
        editorler.remove(editor);
    }
    
    public Editor[] getEditorler(){
        Editor[] sonuc = new Editor[this.editorler.size()]; 
        for(int i =0; i< this.editorler.size();i++){
            sonuc[i] = this.editorler.get(i);
        }
        return sonuc;
    }
}
