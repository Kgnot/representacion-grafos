package uni.construccion.grafo.representacion;

import uni.construccion.grafo.Grafo;

public interface GrafoVisitor<T> {
    void visit(Grafo<T> tGrafo);
}
