/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;

/**
 *
 * @author gabriel
 */
public class ManagerEngine {
 
    public static boolean isValidateNode(String input) {
        boolean validate = true;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) < 48 || input.charAt(i) > 57) {
                validate = false;
                break;
            }
        }
        
        return validate;
    }
    
}
