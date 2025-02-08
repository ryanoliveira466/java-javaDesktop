
package Aula17;

import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;


public class FormatadorCampos {
    
    public void formatarCampoTelefone(JFormattedTextField field) throws ParseException{
        
        MaskFormatter mask = new MaskFormatter();
        mask.setMask("(##) # ####-####");
        mask.install(field);
        
    }
    
    public void formatarCampoPlaca(JFormattedTextField field) throws ParseException{
        MaskFormatter mask = new MaskFormatter();
        mask.setMask("UUU#U##");
        mask.install(field);
        
    }
    
    public void formatarCampoCNPJ(JFormattedTextField field) throws ParseException{
        MaskFormatter mask = new MaskFormatter();
        mask.setMask("##.###.###/####-##");
        mask.install(field);
        
    }
    
    public void formatarCampoTelefoneInternacional(JFormattedTextField field) throws ParseException{
        MaskFormatter mask = new MaskFormatter();
        mask.setMask("+## # ####-####:");
        mask.install(field);
        
    }
    
    public void formatarCampoDataNascimento(JFormattedTextField field) throws ParseException{
        MaskFormatter mask = new MaskFormatter();
        mask.setMask("##/##/####");
        mask.install(field);
        
    }
    
     public void formatarCampoTituloEleitor(JFormattedTextField field) throws ParseException{
        MaskFormatter mask = new MaskFormatter();
        mask.setMask("### ### ### ###");
        mask.install(field);
        
    }
    
}
