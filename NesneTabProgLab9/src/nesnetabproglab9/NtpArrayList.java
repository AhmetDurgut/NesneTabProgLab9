package nesnetabproglab9;

public class NtpArrayList<T> {

    Object[] list;
    int index = 0;
    public NtpArrayList() {
        this.list = new Object[10];
    }
    
    public void add(T t){
        this.list[index++] = t;
    }
    
    public void remove(T t){
        for (int i=0; i<this.list.length; i++){
            if(this.list[i].equals(t)){
                this.list[i]= null;
            } 
        }
    }
    
    public Object[] getAll(){
        return list;
    }
}
