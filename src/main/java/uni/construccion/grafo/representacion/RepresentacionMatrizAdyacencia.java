package uni.construccion.grafo.representacion;

import uni.construccion.grafo.Arista;
import uni.construccion.grafo.Grafo;
import uni.construccion.grafo.Vertice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RepresentacionMatrizAdyacencia<T> implements GrafoVisitor<T> {

    @Override
    public void visit(Grafo<T> grafo) {

        List<Vertice<T>> vertices = new ArrayList<>(grafo.getVertices());
        int n = vertices.size();

        int[][] matriz = new int[n][n];

        for (Arista arista : grafo.getAristas()) {
            int i = vertices.indexOf(arista.vertice1());
            int j = vertices.indexOf(arista.vertice2());

            matriz[i][j] = 1;
            matriz[j][i] = 1; // si es no dirigido
        }
        // imprimimos la matriz de adyacencia
        imprimir(matriz);
    }

    private void imprimir(int[][] matriz) {
        for (int[] fila : matriz) {
            System.out.println(Arrays.toString(fila));
        }
    }
}
