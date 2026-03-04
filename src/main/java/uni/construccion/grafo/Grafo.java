package uni.construccion.grafo;

import uni.construccion.grafo.representacion.GrafoVisitor;

import java.util.*;

public class Grafo<T> {

    private final Set<Vertice<T>> vertices;
    private final Set<Arista> aristas;

    public Grafo() {
        vertices = new HashSet<>();
        aristas = new HashSet<>();
    }

    public void addVertice(Vertice<T> t) {
        vertices.add(t);
    }

    public void addArista(Vertice<T> v1, Vertice<T> v2) {
        aristas.add(new Arista(v1, v2));
    }

    public Set<Vertice<T>> getVertices() {
        return Collections.unmodifiableSet(vertices);
    }

    public Set<Arista> getAristas() {
        return Collections.unmodifiableSet(aristas);
    }

    public void accept(GrafoVisitor<T> visitor) {
        visitor.visit(this);
    }

}
