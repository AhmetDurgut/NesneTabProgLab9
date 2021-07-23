package nesnetabproglab9.yayinevi;

import enums.EditorInceleEnum;

public class EditorKitapGorus {
    private Editor editor;
    private String aciklama;
    private EditorInceleEnum karar;

    public EditorKitapGorus(Editor editor, String aciklama, EditorInceleEnum karar) {
        this.editor = editor;
        this.aciklama = aciklama;
        this.karar = karar;
    }

    EditorKitapGorus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Editor getEditor() {
        return editor;
    }

    public String getAciklama() {
        return aciklama;
    }

    public EditorInceleEnum getKarar() {
        return karar;
    }
    
    
}
