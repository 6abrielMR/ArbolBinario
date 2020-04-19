/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;

/**
 *
 * @author gabriel
 * @param <T>
 */
public class NodoArbolBinario<T extends Comparable<T>> extends ManagerEngine {
    
    private T element;
    private NodoArbolBinario<T> parent;
    private NodoArbolBinario<T> left;
    private NodoArbolBinario<T> right;

    protected NodoArbolBinario(T element) {
        this.element = element;
    }

    protected NodoArbolBinario(T element, NodoArbolBinario<T> parent, NodoArbolBinario<T> left, NodoArbolBinario<T> right) {
        this.element = element;
        this.parent = parent;
        this.left = left;
        this.right = right;
    }

    protected NodoArbolBinario(T element, NodoArbolBinario<T> parent) {
        this.element = element;
        this.parent = parent;
    }

    protected NodoArbolBinario(T element, NodoArbolBinario<T> left, NodoArbolBinario<T> right) {
        this.element = element;
        this.left = left;
        this.right = right;
    }

    protected T getElement() {
        return element;
    }

    protected void setElement(T element) {
        this.element = element;
    }

    protected NodoArbolBinario<T> getParent() {
        return parent;
    }

    protected void setParent(NodoArbolBinario<T> parent) {
        this.parent = parent;
    }

    protected NodoArbolBinario<T> getLeft() {
        return left;
    }

    protected void setLeft(NodoArbolBinario<T> left) {
        this.left = left;
    }

    protected NodoArbolBinario<T> getRight() {
        return right;
    }

    protected void setRight(NodoArbolBinario<T> right) {
        this.right = right;
    }
    
    
    
}
