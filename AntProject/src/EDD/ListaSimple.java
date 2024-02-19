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
    /**
     * Consulta si la lista esta vacia.
     * @return true si el primer nodo (inicio), no apunta a otro nodo.
     */
    public boolean isEmpty(){
        return (head == null);
    }
/**
     * Consulta si el elemento existe dentro de la lista.
     * @param obj 
     * @return true si el objeto existe dentro de la lista
     */  
    public boolean isInList(Object obj){
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
     
/**
     * Agrega un elemento antes del elemento en el indice dado de la lista.
     * @param obj a agregar.
     * @param index el indice a verificar
     */     
    public void addBeforeElem(Object obj, int index){
        Nodo aux=head;
       
        for (int i = 0; i < index-1; i++) {
            aux=aux.getpNext();
        }
        Nodo nuevo = new NodoSimpleP(obj,aux.getpNext());
       
        aux.setpNext(nuevo);
   
    }
   
/**
     * Agrega un elemento despues del elemento en el indice dado de la lista.
     * @param obj a agregar.
     * @param index el indice a verificar
     */      
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
/**
     * Borra la cabeza de la lista.
     */     
    public void deleteHead(){
        head=head.getpNext();
        size--;
    }
   
/**
     * Borra el ultimo elemento de la lista.
     */     
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
   
/**
     * Borra un elemento de la lista a traves de un indice
     * @param index indice del elemento a borrar.
     */ 
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
   
/**
     * Borra un elemento de la lista a traves de una referencia
     * @param content contenido del elemento a borrar
     */     
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
    /** 
     * Imprime la lista.
     */   
    public void printList(){
        Nodo aux=head;
        for (int i = 0; i < this.size; i++) {
            System.out.println("Elemento N."+(i+1)+": "+aux.getContent());
            aux=aux.getpNext();
           
        }
   
    }
   
   
    /*Buscadores*/
/**
     * Retorna el contenido de un elemento a traves de un indice
     * @return retorna el contenido del elemento
     * @param index indice del elemento a buscar
     */     
    public Object getContent(int index){
        int contador=0;
        Nodo temporal = head;
        while(contador<index){
            temporal=temporal.getpNext();
            contador++;
        }
        return temporal.getpNext().getContent();
       
    }
   
   
/**
     * Retorna el indice de un elemento a traves de una referencia
     * @return retorna el indice del elemento
     * @param obj indice del elemento a buscar
     */     
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
    //Por contenido
/**
     * Cambio el elemento por otro a traves de una referencia, lo cambia en todos los elementos iguales que encuentre
     * @param objRef elemento a cambiar
     * @param objNew contenido que reemplaza al contenido anterior
     */    
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
/**
     * Cambio el elemento por otro a traves de una referencia, solo toma el primer elemento que encuentre
     * @param objRef contenido del elemento a cambiar
     * @param objNew contenido que reemplaza al contenido anterior
     */    
    public void changeFirstContent(Object objRef, Object objNew){
        Nodo aux= head;
        if (this.isInList(objRef)){
            while (aux.getContent()!=objRef){
                aux=aux.getpNext();
            }
            aux.setContent(objNew);
        }
    }

    //por indice
    /**
     * Cambio el elemento por otro a traves de un indice, solo toma el primer elemento que encuentre
     * @param indexRef indice del elemento a cambiar
     * @param objNew contenido que reemplaza al contenido anterior
     */    
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