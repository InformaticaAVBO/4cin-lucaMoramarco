public class ListaOrdinata <T extends Comparable <T>> {
    Nodo<T> head;

    public ListaOrdinata(){
        head = null;
    }

    public void add( T v){
        Nodo<T> n = new Nodo<>(v);
        if(head==null) { 
            head = n; return
        }
        if(head.getValue().comparableTo(v)>0) {
            n.setNext(head);
            head = n;
            return;
        }
        Nodo<T> temp = head;
        while(true){
            if(temp.getNext()==null){
                temp.setNext(n)
                return;
            }
            if(temp.getNext().getValue().comparableTo(v)>0){
                n.setNext(temp.getNext());
                temp.setNext(n);
                break;
            }
            temp = temp.getNext    
        }
        
    }
}