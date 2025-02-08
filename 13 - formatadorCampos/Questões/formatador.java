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
    
}