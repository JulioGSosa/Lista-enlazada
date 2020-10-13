/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listaenlazada;

import javax.swing.JOptionPane;

/**
 *
 * @author EQUIPO ESTRUCTURAS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int wd=0,wd2=0;
        int res = 1;
        int con = 0;
        persona inicio = new persona();
        inicio = null;
        while (res != 5) {

            lista crear = new lista();
            do{
                wd2=1;
                try{
                      String x = JOptionPane.showInputDialog("SELECCIONE UN VALOR  \n 1: AGREGAR NODO \n 2: ELIMINAR ULTIMO \n 3: IMPRIMIR \n 4: Eliminar X \n 5: SALIR");
                      res = Integer.parseInt(x.trim());
                


            if (res == 1) {
                do{
                    wd=1;
                    try{
                    String valor = JOptionPane.showInputDialog("INTRODUCE NUMERO");
                    int v = Integer.parseInt(valor.trim());                       
                    inicio = crear.creanodo(v, inicio);
                    } catch (Exception e){
                        JOptionPane.showMessageDialog(null,"No es un valor valido, vuelve a intentarlo.....");
                        wd=wd+1;
                    }
                 }
                
            while(wd==0);
            }
            if (res == 2) {
                inicio = crear.eliminarnodo(inicio);
            }
            if (res == 3) {
                crear.imprimirnodo(inicio);
            }
            if (res == 4) {
                String valor = JOptionPane.showInputDialog("INTRODUCE VALOR A ELIMINAR");
                int v = Integer.parseInt(valor.trim());

                inicio = crear.eliminarx(v, inicio);
            }
            
            }
                catch(Exception e){
                     JOptionPane.showMessageDialog(null,"Seleccion Invalida, vuelve a intentarlo........");
                        wd2=wd2+1;
                }
            }
            while(wd2==0);
        }
            
            
            
        }
            
            
    }

