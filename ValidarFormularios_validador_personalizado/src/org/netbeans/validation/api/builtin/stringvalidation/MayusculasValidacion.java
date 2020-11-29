/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.validation.api.builtin.stringvalidation;

import org.netbeans.validation.api.Problems;
import org.openide.util.NbBundle;


/**
 *
 * @author Tony
 */
public class MayusculasValidacion extends StringValidator {

    @Override
    public void validate(Problems problems, String compName, String texto) {
        
        if((!"".equals(texto)) &&!Character.isUpperCase(texto.charAt(0))){
            String msg=NbBundle.getMessage(this.getClass(),"MSG_MAYUSCULAS",compName);
            problems.add(msg);
        }
        
        
    }
    
}
