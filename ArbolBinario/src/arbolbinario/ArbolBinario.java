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
        Comparable T = null;
        BinarySearchTree<Integer> tree = new BinarySearchTree<>(T);
        int opcMenu = 0;
        
        if (!tree.isRoot(tree)) {
            printerMenu(tree, opcMenu, false);
        } else {
            printerMenu(tree, opcMenu, true);
        }

    }

    private static void addNodeTree(BinarySearchTree<Integer> tree, boolean mode) {
        String value = JOptionPane.showInputDialog(null,
                "Digita el número del nodo");
        if (ManagerEngine.isValidateNode(value)) {
            if (mode) {
                if (tree.add(Integer.parseInt(value))) {
                    JOptionPane.showMessageDialog(null,
                            "Nodo raíz añadido correctamente");
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Nodo no añadido correctamente");
                }
            } else {
                tree.add(tree.getRoot(), Integer.parseInt(value));
                JOptionPane.showMessageDialog(null,
                            "Nodo raíz añadido correctamente");
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "Debes digitar un número");
        }
    }

    private static void printerMenu(BinarySearchTree<Integer> tree, int opcMenu, boolean created) {
        if (!created) {
            do {
                opcMenu = Integer.parseInt(JOptionPane.showInputDialog(null, "Arból de Nodos\n\n"
                        + "1. Agregar Nodo Raiz\n"
                        + "2. Salir"));

                if (opcMenu == 1) {
                    addNodeTree(tree, true);
                    created = true;
                    opcMenu = 2;
                }

            } while (opcMenu != 2);
        } else {
            do {
                opcMenu = Integer.parseInt(JOptionPane.showInputDialog(null, "Arból de Nodos\n"
                        + "1. Agregar Nodo de Forma Iterativa\n"
                        + "2. Agregar Nodo de Forma Recursiva\n"
                        + "3. Mostrar Nodos en PreOrder\n"
                        + "4. Mostrar Nodos en InOrder\n"
                        + "5. Mostrar Nodos en PostOrder\n"
                        + "6. Salir"));

                switch (opcMenu) {
                    case 1:
                        addNodeTree(tree, true);
                        break;
                    case 2:
                        addNodeTree(tree, false);
                        break;
                    case 3:
                        tree.preorder(tree.getRoot());
                        break;
                    case 4:
                        tree.inorder(tree.getRoot());
                        break;
                    case 5:
                        tree.postorder(tree.getRoot());
                        break;
                }

            } while (opcMenu != 6);
            
            created = false;
        }
        if (created) {
            System.out.println("Entrando...");
            printerMenu(tree, 0, created);
        }
        else System.out.println("Saliendo del Sistema....");
    }

}
