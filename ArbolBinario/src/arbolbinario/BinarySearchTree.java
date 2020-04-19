/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;

/**
 *
 * @author gabriel
 * 
 * TreeManager
 * @param <T>
 * 
 */
public class BinarySearchTree<T extends Comparable<T>> extends NodoArbolBinario {

    private NodoArbolBinario<T> root;

    protected BinarySearchTree(Comparable element) {
        super(element);
    }

    protected boolean isEmpty() {
        return root == null;
    }

    protected NodoArbolBinario<T> getRoot() {
        return root;
    }

    protected boolean isRoot(NodoArbolBinario<T> node) {
        return root == node;
    }

    // If the node has no sons
    protected boolean isLeaf(NodoArbolBinario<T> node) {
        return node.getLeft() == null && node.getRight() == null;
    }

    // if the node has sons
    protected boolean isInternal(NodoArbolBinario<T> node) {
        return !isLeaf(node);
    }

    protected NodoArbolBinario<T> add(NodoArbolBinario<T> origen, T element) {
        NodoArbolBinario<T> node = null;

        if (root == null) {
            root = new NodoArbolBinario<>(element);
        } else if (origen == null) {
            System.out.println("El origen es nulo");
        } else {
            if (origen.getElement().compareTo(element) > 0) {
                if (origen.getLeft() != null) {
                    node = add(origen.getLeft(), element);
                } else {
                    node = new NodoArbolBinario<>(element);
                    node.setParent(origen);
                    origen.setLeft(node);
                }
            } else {
                if (origen.getRight() != null) {
                    node = add(origen.getRight(), element);
                } else {
                    node = new NodoArbolBinario<>(element);
                    node.setParent(origen);
                    origen.setRight(node);
                }
            }
        }

        return node;
    }

    protected boolean add(T element) {
        NodoArbolBinario<T> node = null;

        if (root == null) {
            root = new NodoArbolBinario<>(element);
        } else {

            NodoArbolBinario<T> aux = root;
            boolean insertado = false;
            while (!insertado) {
                if (aux.getElement().compareTo(element) > 0) {
                    if (aux.getLeft() != null) {
                        aux = aux.getLeft();
                    } else {
                        node = new NodoArbolBinario<>(element);
                        node.setParent(aux);
                        aux.setLeft(node);
                        insertado = true;
                    }
                } else {
                    if (aux.getRight() != null) {
                        aux = aux.getRight();
                    } else {
                        node = new NodoArbolBinario<>(element);
                        node.setParent(aux);
                        aux.setRight(node);
                        insertado = true;
                    }
                }
            }
        }
        
        return true;
    }
    
    protected void preorder(NodoArbolBinario<T> nodo) {
    
        System.out.println(nodo.getElement().toString());
        
        if (nodo.getLeft() != null) {
            preorder(nodo.getLeft());
        }
        
        if (nodo.getRight() != null) {
            preorder(nodo.getRight());
        }
        
    }
    
    protected void inorder(NodoArbolBinario<T> nodo) {
        
        if (nodo.getLeft() != null) {
            preorder(nodo.getLeft());
        }
        
        System.out.println(nodo.getElement().toString());
        
        if (nodo.getRight() != null) {
            preorder(nodo.getRight());
        }
        
    }
    
    protected void postorder(NodoArbolBinario<T> nodo) {
        
        if (nodo.getLeft() != null) {
            preorder(nodo.getLeft());
        }
        
        System.out.println(nodo.getElement().toString());
        
        if (nodo.getRight() != null) {
            preorder(nodo.getRight());
        }
        
        System.out.println(nodo.getElement().toString());
        
    }

}
