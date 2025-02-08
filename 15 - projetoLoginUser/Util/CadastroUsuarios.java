 
package Aula18_Desafio.Util;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

 
 public class CadastroUsuarios {

    //ArrayList para inserÃ§Ã£o de usuÃ¡rios em memoria de programa
    public static class GlobalVars{
        public static ArrayList<Usuarios> bancoUsuarios = new ArrayList<Usuarios>();
    }
    
    PersistenciaDadosUsuario operPersistencia = new PersistenciaDadosUsuario();

    //MÃ©todo que realize a inserÃ§Ã£o dos usuÃ¡rios no bancoUsuarios
    public void insereUsuarioBanco(Usuarios novoUsuario) {
        try {
            GlobalVars.bancoUsuarios.add(novoUsuario);
            String mensagem = "Usuario inserido com sucesso no banco!";
            JOptionPane.showMessageDialog(null, mensagem);
            operPersistencia.criarArquivoDados();
            operPersistencia.gravarDadosArquivoCSV(GlobalVars.bancoUsuarios);
            String mensagem2 = "Dados CSV gravados";
            JOptionPane.showMessageDialog(null, mensagem2);
            
        } catch (Exception e) {
            String mensagem = "Erro ao inserir usuario! <CadastroUsuarios/InsereUsuarioBanco>";
            JOptionPane.showMessageDialog(null, mensagem);
            e.printStackTrace();
        }
    }

    public boolean buscaUsuario(String name, String password) {
        boolean contem;
        Integer indexNome = -2;
        Integer indexSenha = -1;
       

        for (int i = 0; i < GlobalVars.bancoUsuarios.size(); i++) {

            if (name.equals(GlobalVars.bancoUsuarios.get(i).getUsername())) {
                indexNome = i;
                System.out.println(indexNome);
            }

            if (password.equals(GlobalVars.bancoUsuarios.get(i).getPassword())) {
                indexSenha = i;
                System.out.println(indexSenha);

            }
        }

        //VerificaÃ§Ã£o do valor do index de posiÃ§Ã£o de usuario e senha
        if (indexNome.equals(indexSenha)) {
            contem = true;
            System.out.println(GlobalVars.bancoUsuarios.size());
        } else {
            contem = false;
        }
        return contem;
    }
    
    public void populaArrayBancoUsuarios() throws FileNotFoundException{
        try {
            GlobalVars.bancoUsuarios = operPersistencia.leituraDadosCSV();
            String mensagem = "Dados lidos do arquivo CSV com sucesso!";
           System.out.println(mensagem);
        } catch (Exception e) {
            String mensagem = "Erro ao ler dados do CSV! <popularArrayBancoUsuarios>";
            JOptionPane.showMessageDialog(null, mensagem);
        } finally {
        }
       
      
    }

}

