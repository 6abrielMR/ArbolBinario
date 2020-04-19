/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;

import javax.swing.JOptionPane;

/**
 *
 * @author gabriel
 */
public class ArbolBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        int opcMenu = 0;

        System.out.println(ManagerEngine.isValidateNode("aaaaa"));
        
        /*do {
            opcMenu = Integer.parseInt(JOptionPane.showInputDialog(null, "Arból de Nodos\n\n"
                    + "1. Agregar Nodo Raiz\n"
                    + "2. Agregar Nodo de Forma Iterativa\n"
                    + "2. Agregar Nodo de Forma Recursiva\n"
                    + "3. Mostrar Nodos en PreOrder\n"
                    + "4. Mostrar Nodos en InOrder\n"
                    + "5. Mostrar Nodos en PostOrder\n"
                    + "6. Salir"));
            
            switch (opcMenu) {
                case 1:
                    
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
            }
        } while (opcMenu != 6);*/

    }

}
