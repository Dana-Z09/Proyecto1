package EDD;

/**
 *
 * @author Daniela Zambrano 30956881
 */
public abstract class Nodo {
    private Nodo pNext;
    private Object content;
   
    public Nodo getpNext() {
        return pNext;
    }
   
    public void setpNext(Nodo pNext) {
        this.pNext = pNext;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object contenido) {
        this.content = contenido;
    }
   
    public Nodo() {
        this.pNext = null;
        this.content = null;
    }
   
    public Nodo(Object contenido) {
        this.pNext = null;
        this.content = contenido;
    }
   
    public Nodo(Object contenido,Nodo pNext) {
        this.pNext = pNext;
        this.content = contenido;
    }
   
   
}
