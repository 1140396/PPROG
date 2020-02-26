package com.mycompany.pprog_tp3.Controller;

import com.mycompany.pprog_tp3.Model.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import javafx.scene.control.Alert;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GuilhermeTavares
 */
public class LerFicheiroController {

    private static Alert alerta = new Alert(Alert.AlertType.ERROR);

    /**
     *
     * @throws FileNotFoundException
     */
    public static void abrirFicheiro() throws FileNotFoundException {

        alerta.setTitle("Erro no Carregamento de Dados");
        alerta.setHeaderText("");

        try {

            File ficheiro = new File("Dados.txt");
            Scanner lerFicheiro = new Scanner(ficheiro, "UTF-8");

            if (ficheiro.exists()) {

                if (lerFicheiro.hasNext()) {

                    lerDadosFicheiro(lerFicheiro);
                } else {

                    alerta.setContentText("O Ficheiro de Dados está vazio !\nInsira os dados no ficheiro e reinicie a aplicação.");
                    alerta.showAndWait();
                }

            } else {

                alerta.setContentText("Ficheiro de Dados não existe ou tem o nome diferente de 'Dados.txt'.\nCorrija o erro e reinicie a aplicação.");
                alerta.showAndWait();
            }

//            FileInputStream fileIn = new FileInputStream("PedidoPrestação.ser");
//            ObjectInputStream streamIn = new ObjectInputStream(fileIn);
//            PedidoPrestacaoServico m_oPedidoPrestacao = (PedidoPrestacaoServico) streamIn.readObject();
//            Empresa.addPedido(m_oPedidoPrestacao);
//            streamIn.close();
//            fileIn.close();

        } catch (FileNotFoundException ex) {

            alerta.setContentText("Ficheiro de dados não encontrado");
            alerta.showAndWait();
      } 
//catch (ClassNotFoundException ex) {
//
//            alerta.setContentText("Classe PrestadorServicos não encontrada");
//            alerta.showAndWait();
//
//        } catch (IOException ex) {
//
//            ex.printStackTrace();
//            alerta.setContentText(ex.getMessage());
//            alerta.showAndWait();
//        }
    }

    /**
     * Método idenficador do tipo de informação a ler
     *
     * @param lerFicheiro scanner que lê o ficheiro
     */
    private static void lerDadosFicheiro(Scanner lerFicheiro) {

        try {
            while (lerFicheiro.hasNext()) {

                switch (lerFicheiro.nextLine()) {

                    case "Empresa":
                        novaEmpresa(lerFicheiro.nextLine());
                        break;
                    case "Utilizador":
                        novoUtilizador(lerFicheiro.nextLine());
                        break;
                    case "Serviço":
                        novoServico(lerFicheiro.nextLine());
                        break;
                    case "Área Geográfica":
                        novaAreaGeografica(lerFicheiro.nextLine());
                        break;
                    case "Código Postal":
                        novoCodigoPostal(lerFicheiro.nextLine());
                        break;
                    case "Categoria":
                        novaCategoria(lerFicheiro.nextLine());
                        break;
                    case "Cliente":
                        novoCliente(lerFicheiro.nextLine());
                        break;
                    case "Prestador de Serviços":
                        novoPrestadorDeServicos(lerFicheiro.nextLine());
                        break;
                    case "Administrador":
                        novoAdministrativo(lerFicheiro.nextLine());
                        break;
                    default:
                        alerta.setContentText("Tipo de informação no ficheiro não identificada ou informação incompleta !\nCorrija o ficheiro e reinicie a aplicação.");
                        alerta.showAndWait();
                        break;
                }
            }
        } catch (NoSuchElementException ex) {

            alerta.setContentText("O último conjunto de linhas (2 linhas) do ficheiro de Dados pode estar incorreta ou incompleta !\nCorrija o erro e reinicie a aplicação.");
            alerta.showAndWait();
        }
    }

    /**
     * Método que carrega os dados de uma Empresa para o sistema como objeto
     *
     * @param linha
     */
    private static void novaEmpresa(String linha) {

        String[] dados = linha.split(";");

        String designacao = dados[0];

        String nif = dados[1];

        Empresa m_oEmpresa = new Empresa(designacao, nif);

    }

    /**
     * Método que carrega os dados de um Utilizador para o sistema como objeto
     *
     * @param linha
     */
    private static void novoUtilizador(String linha) {

        String[] dados = linha.split(";");

        String email = dados[0];
        String password = dados[1];
        String tipoUtilizador = dados[2];

        Utilizador m_outilizador = new Utilizador(email, password, tipoUtilizador);

        Utilizador.addUtilizador(m_outilizador);
    }

    /**
     * Método que carrega os dados de um Serviço para o sistema como objeto
     *
     * @param linha
     */
    private static void novoServico(String linha) {

        String[] dados = linha.split(";");

        String id = dados[0];
        String descBreve = dados[1];
        String descCompleta = dados[2];
        String custoHora = dados[3];
        String duracao = dados[4];

        Servico m_oservico = new Servico(id, descBreve, descCompleta, Float.parseFloat(custoHora), Float.parseFloat(duracao));

        Empresa.addServico(m_oservico);

    }

    /**
     * Método que carrega os dados de um Código Postal para o sistema como objeto
     *
     * @param linha
     */
    private static void novoCodigoPostal(String linha) {

        String[] dados = linha.split(";");

        String codigoPostal = dados[0];

        CodigoPostal m_ocodPostal = new CodigoPostal(codigoPostal);

        CodigoPostal.addCodPostal(m_ocodPostal);

    }

    /**
     * Método que carrega os dados de uma Categoria para o sistema como objeto
     *
     * @param linha
     */
    private static void novaCategoria(String linha) {

        String[] dados = linha.split(";");

        String codigo = dados[0];

        String descricao = dados[1];

        CategoriaServico m_ocategoriaServico = new CategoriaServico(codigo, descricao);

        CategoriaServico.addCategoriaServico(m_ocategoriaServico);

    }

    /**
     * Método que carrega os dados de uma Área Geográfica para o sistema como objeto
     *
     * @param linha
     */
    private static void novaAreaGeografica(String linha) {

        String[] dados = linha.split(";");

        String designacao = dados[0];

        String custoDeslocacao = dados[1];

        String raioAtuacao = dados[2];

        AreaGeografica m_oareaGeografica = new AreaGeografica(designacao, Float.parseFloat(custoDeslocacao), Float.parseFloat(raioAtuacao));

        AreaGeografica.addAreaGeografica(m_oareaGeografica);

    }

    /**
     * Método que carrega os dados de um Cliente para o sistema como objeto
     *
     * @param linha
     */
    private static void novoCliente(String linha) {

        String[] dados = linha.split(";");

        String nome = dados[0];

        String nif = dados[1];

        String email = dados[2];

        String telefone = dados[2];

        Cliente m_ocliente = new Cliente(nome, nif, email, telefone);

        Empresa.addCliente(m_ocliente);

    }

    /**
     * Método que carrega os dados de um Prestador de Serviços para o sistema como objeto
     *
     * @param linha
     */
    private static void novoPrestadorDeServicos(String linha) {

        String[] dados = linha.trim().split(";");

        String nrMecanografico = dados[0];

        String nomeCompleto = dados[1];

        String nomeAbreviado = dados[2];

        String emailIntitucional = dados[3];

        PrestadorServicos m_oprestadorservicos = new PrestadorServicos(nrMecanografico, nomeCompleto, nomeAbreviado, emailIntitucional);

        try {

            FileOutputStream fileOut = new FileOutputStream("Prestadores.ser");
            ObjectOutputStream outStream = new ObjectOutputStream(fileOut);
            outStream.writeObject(m_oprestadorservicos);
            outStream.close();
            fileOut.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(LerFicheiroController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LerFicheiroController.class.getName()).log(Level.SEVERE, null, ex);
        }

        Empresa.addPrestadorServico(m_oprestadorservicos);
    }

    /**
     * Método que carrega os dados de um Administrativo para o sistema como objeto
     *
     * @param linha
     */
    private static void novoAdministrativo(String linha) {

        String[] dados = linha.trim().split(";");

        String nome = dados[0];

        String mail = dados[1];

        Administrativo m_oadministrativo = new Administrativo(nome, mail);

        Empresa.addAdministrativo(m_oadministrativo);
    }
}
