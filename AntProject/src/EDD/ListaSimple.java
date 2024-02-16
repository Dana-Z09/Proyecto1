package EDD;

/**
 *
 * @author Daniela Zambrano 30956881
 */
public class ListaSimple {
    private  Nodo head;
    private Nodo tail;
    private  int size;
   
    /*Constructor*/
    public ListaSimple() {
        head = null;
        tail=null;
        size = 0;
    }

    public ListaSimple(Nodo head) {
        this.head = head;
        this.tail = this.head;
    }
   
    public void resetList(){
        head=null;
        tail=null;
        size=0;
    }
   
    /*Booleans*/
    public boolean isEmpty(){
        return (head == null);
    }
   
    public boolean isInList(Object obj){//este espara ver si un elemento es igual al que se guardo
        Nodo aux=head;
        for (int i = 0; i < this.size; i++) {
            if (aux.getContent()==obj){
                return true;
            }else{aux=aux.getpNext();}
        }
        return false;
    }

    /*Add*/
    public void addFirst(Object obj){
        if (this.isEmpty()){
            head= new NodoSimpleP(obj);
        }else{
            Nodo aux= head;
            head= new NodoSimpleP(obj,aux);
        }
        size++;
    }
   
    public void addEnd(Object obj){
        if (this.isEmpty()){
            head= new NodoSimpleP(obj);
            tail= head;
        }else{
            Nodo aux= new NodoSimpleP(obj);
            tail.setpNext(aux);
            tail=aux;
        }
        size++;
           
        }
     
    public void addBeforeElem(Object obj, int index){
        Nodo aux=head;
       
        for (int i = 0; i < index-1; i++) {
            aux=aux.getpNext();
        }
        Nodo nuevo = new NodoSimpleP(obj,aux.getpNext());
       
        aux.setpNext(nuevo);
   
    }
   
    public void addAfterElem(Object obj, int index){
       
        Nodo aux=head;
       
        for (int i = 0; i < index; i++) {
            aux=aux.getpNext();
        }
        Nodo nuevo = new NodoSimpleP(obj,aux.getpNext());
       
        aux.setpNext(nuevo);
   
    }      
   
    /*Getters*/
    public int getSize(){
        return size;
    }

    public Nodo getHead() {
        return head;
    }

    public Nodo getTail() {
        return tail;
    }
   
   
    /*Delete*/
    public void deleteHead(){
        head=head.getpNext();
        size--;
    }
   
    public void deleteTail(){
        if(this.size==1){
            deleteHead();
           
        }else{
        Nodo aux=head;  
        int counter=0;
        while(counter<this.size-1){
            aux=aux.getpNext();
            counter++;}
        tail=aux;
        size--;
        }
    }
   
//deletes an element by its index
    public void deleteElemI(int index){
        if (index==0){
        head=head.getpNext();
        size--;
        }else{
        int contador=0;
        Nodo anterior=head;
        while(contador <index-1){
            anterior=anterior.getpNext();
            contador++;
        }
        anterior.setpNext(anterior.getpNext().getpNext());
        size--;
        }
    }
   
//deletes an element by its content
    public void deleteElemC(Object content){//elimina todos los objetos con  ese valor       <------ probar
        if (this.isInList(content)){
            Nodo anterior=head;
            Nodo nodito =head.getpNext();
            if (anterior==content){
                this.deleteHead();}
            else{
                for (int i = 0; i < this.size; i++) {
                    if (nodito.getContent()==content){
                        anterior.setpNext(nodito.getpNext());}
                    else{
                    anterior=nodito;
                    nodito=nodito.getpNext();}
                }
            size--;
            }
        }
    }
   
   
    /*Print*/
    public void printList(){
        Nodo aux=head;
        for (int i = 0; i < this.size; i++) {
            System.out.println("Elemento N."+(i+1)+": "+aux.getContent());
            aux=aux.getpNext();
           
        }
   
    }
   
   
    /*Buscadores*/
    public Object getContent(int index){
        int contador=0;
        Nodo temporal = head;
        while(contador<index){
            temporal=temporal.getpNext();
            contador++;
        }
        return temporal.getpNext();
       
    }
   
//buscar por el objeto por refrencia  retorna el indice
    public Integer getIndex(Object obj){ //devuelve el indice  del primero que encuentra
        Nodo aux= head;
        if (this.isInList(obj)){
            for (int i = 0; i < this.size; i++){
                if(aux.getContent()==obj){return i;}
                else{aux=aux.getpNext();}
            }
        }
        return null;
    }
   
   
    /*Changers*/
    //by content
    public void changeAllContent(Object objRef, Object objNew){  //editar referencia solo el primero que tenga el valor igual lo cambia
        Nodo aux= head;
        if (this.isInList(objRef)){
            for (int i = 0; i < this.size; i++){
                if(aux.getContent()==objRef){
                    aux.setContent(objNew);
                    aux=aux.getpNext();}
                else{aux=aux.getpNext();}
            }
        }
    }
    //cambia el primer valor que encuentre igual al de  la referencia
    public void changeFirstContent(Object objRef, Object objNew){
        Nodo aux= head;
        if (this.isInList(objRef)){
            while (aux.getContent()!=objRef){
                aux=aux.getpNext();
            }
            aux.setContent(objNew);
        }
    }
    //by index
    public void changeContent(int indexRef, Object objNew){//editar por posicion, cambiar el valor del nodo que esta en una posicion
        Nodo aux= head;
           
            if ((this.size<indexRef) && (indexRef>=0)){
                for (int i = 0; i < this.size; i++){
                    if(i==indexRef){
                        aux.setContent(objNew);}
                    else{aux=aux.getpNext();}
                }
            }
         
    }    
     
   
}