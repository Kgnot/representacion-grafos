package uni.construccion;


import uni.construccion.grafo.Grafo;
import uni.construccion.grafo.Vertice;
import uni.construccion.grafo.representacion.GrafoVisitor;
import uni.construccion.grafo.representacion.RepresentacionMatrizAdyacencia;

public class Main {
    public static void main(String[] args) {

        Grafo<String> grafo = new Grafo<>();

        Vertice<String> a = new Vertice<>("A");
        Vertice<String> b = new Vertice<>("B");
        Vertice<String> c = new Vertice<>("C");

        grafo.addVertice(a);
        grafo.addVertice(b);
        grafo.addVertice(c);

        grafo.addArista(a, b);
        grafo.addArista(b, c);
        grafo.addArista(a, c);

        // Visitor
        GrafoVisitor<String> matriz = new RepresentacionMatrizAdyacencia<>();

        grafo.accept(matriz);
    }
}