
import static java.lang.Math.random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Juancho
 */
public class Tetris {

    private GenerarFormas g;
    private String tablero[][];
    private int x1, x2, x3, x4, y1, y2, y3, y4;

    public Tetris() {

        tablero = new String[6][10];
        g = new GenerarFormas();

    }

    public void generarTablero() {

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {

                tablero[i][j] = "";
            }
        }
    }

    public void ingresarPieza() {
        int random = 1;
        //(int )(Math.random()=6);
        if (random == g.piezaL.getId()) {
            x1 = g.piezaL.getX1();
            y1 = g.piezaL.getY1();
            x2 = g.piezaL.getX2();
            y2 = g.piezaL.getY2();
            x3 = g.piezaL.getX3();
            y3 = g.piezaL.getY3();
            x4 = g.piezaL.getX4();
            y4 = g.piezaL.getY4();
        }
        if (random == g.piezaO.getId()) {
            x1 = g.piezaO.getX1();
            y1 = g.piezaO.getY1();
            x2 = g.piezaO.getX2();
            y2 = g.piezaO.getY2();
            x3 = g.piezaO.getX3();
            y3 = g.piezaO.getY3();
            x4 = g.piezaO.getX4();
            y4 = g.piezaO.getY4();

        }
        System.out.println(random);

    }

     public String imprimir() {

        String salida = "";

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                salida += "(" + tablero[i][j] + ")";
            }
            salida += "\n";
        }

        return salida;
    }

    public void bajar() {
        x1 = x1 + 1;
        x2 = x2 + 1;
        x3 = x3 + 1;
        x4 = x4 + 1;
        if (x4 < tablero.length && x3 < tablero.length) {
            tablero[x1][y1] = "[]";
            tablero[x2][y2] = "[]";
            tablero[x3][y3] = "[]";
            tablero[x4][y4] = "[]";
            tablero[x1 - 1][y1] = "";
            tablero[x2 - 1][y2] = "";

        }

    }

    public void moverIzquierda() {

        y1 = y1 - 1;
        y2 = y2 - 1;
        y3 = y3 - 1;
        y4 = y4 - 1;
        if (y4 >= 0 && y3 >= 0) {
            tablero[x1][y1] = "[]";
            tablero[x2][y2] = "[]";
            tablero[x3][y3] = "[]";
            tablero[x4][y4] = "[]";
            tablero[x2][y2 + 1] = "";
            tablero[x4][y4 + 1] = "";

        }

    }
    
    public static void main(String[] args) {
        Tetris t=new Tetris();
        
        t.generarTablero();
        t.ingresarPieza();
        
        t.bajar();
        t.moverIzquierda();
        
        System.out.println(t.imprimir());
    }
    
}
