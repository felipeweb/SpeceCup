/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fiap.starcrap.forms;

import br.com.fiap.starcrap.daos.AlunoDAO;
import br.com.fiap.starcrap.daos.EquipeDAO;
import br.com.fiap.starcrap.models.Aluno;
import br.com.fiap.starcrap.models.Equipe;
import br.com.fiap.starcrap.models.Lancamento;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import javax.validation.ConstraintViolationException;

/**
 *
 * @author go
 */
public class PrincipalForm extends javax.swing.JFrame {

    private EntityManager manager;
    private EquipeDAO equipeDAO;
    private AlunoDAO alunoDAO;
    private Equipe equipeSelecionada;

    public PrincipalForm() {
        this.manager = Persistence.createEntityManagerFactory("default").createEntityManager();
        this.alunoDAO = new AlunoDAO(manager);
        this.equipeDAO = new EquipeDAO(manager);
        initComponents();
        populaGrupoList();
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        grupoScroll = new javax.swing.JScrollPane();
        grupoList = new javax.swing.JList();
        lancamentoButton = new javax.swing.JButton();
        consultarButton = new javax.swing.JButton();
        grupoButton = new javax.swing.JButton();
        removerButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        componentesScroll = new javax.swing.JScrollPane();
        componentesList = new javax.swing.JList();
        numComponentes = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        buttonPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("StarCrap");
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Grupo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        grupoList.setToolTipText("");
        grupoList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                grupoListValueChanged(evt);
            }
        });
        grupoScroll.setViewportView(grupoList);

        lancamentoButton.setText("Inserir lançamento");
        lancamentoButton.setEnabled(false);
        lancamentoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lancamentoButtonActionPerformed(evt);
            }
        });

        consultarButton.setText("Consultar lançamento");
        consultarButton.setEnabled(false);
        consultarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarButtonActionPerformed(evt);
            }
        });

        grupoButton.setText("Adicionar");
        grupoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grupoButtonActionPerformed(evt);
            }
        });

        removerButton.setText("Remover");
        removerButton.setEnabled(false);
        removerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(grupoScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lancamentoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(consultarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(grupoButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removerButton)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grupoButton)
                    .addComponent(removerButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(grupoScroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lancamentoButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(consultarButton)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Componentes"));

        componentesScroll.setViewportView(componentesList);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(numComponentes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(componentesScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(componentesScroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(numComponentes))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        buttonPesquisar.setText("Pesquisa avançada");
        buttonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonPesquisar)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonPesquisar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void grupoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grupoButtonActionPerformed
        try {
            manager.getTransaction().begin();

            String grupo = JOptionPane.showInputDialog(this, "Digite o nome do grupo:", "Cadastro de grupo",JOptionPane.PLAIN_MESSAGE);
            if (grupo != null) {
                Equipe equipe = new Equipe();
                equipe.setNome(grupo);

                String turma = JOptionPane.showInputDialog(this, "Digite o nome da turma:", "Cadastro de grupo",JOptionPane.PLAIN_MESSAGE);

                if (turma != null) {
                    equipe.setTurma(turma);
                    int nAlunos = 0;
                    try {
                        nAlunos = Integer.parseInt(JOptionPane.showInputDialog(this,"Digite o número de alunos do grupo:", "Cadastro de grupo",JOptionPane.PLAIN_MESSAGE));
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(this, "Digite somente números inteiros", "Atenção!",JOptionPane.WARNING_MESSAGE);
                    }
                    if (nAlunos > 0) {
                        List<Aluno> alunos = new ArrayList<>();

                        for (int k = 0; k < nAlunos; k++) {
                            Aluno aluno = new Aluno();
                            String alunome = JOptionPane.showInputDialog(this, "Digite o nome do " + (k + 1) + "º aluno:", "Cadastro de grupo",JOptionPane.PLAIN_MESSAGE);
                            if (alunome == null) {
                                break;
                            } else {

                                String rm = JOptionPane.showInputDialog(this, "Digite o rm do aluno:", "Cadastro de grupo",JOptionPane.PLAIN_MESSAGE);
                                if (rm == null) {
                                    break;
                                } else {
                                    aluno.setNome(alunome);
                                    aluno.setRm(rm);

                                    alunoDAO.insert(aluno);

                                    alunos.add(aluno);
                                }
                            }
                        }

                        equipe.setAlunos(alunos);
                        equipeDAO.insert(equipe);
                        manager.getTransaction().commit();
                        populaGrupoList();
                    }
                }
            }
            fechaTransacao();
        } catch (ConstraintViolationException e) {
            JOptionPane.showMessageDialog(this, "Não foi possível inserir os dados no banco, verifique os valores inseridos (violação de constraint).", "Violação!",JOptionPane.ERROR_MESSAGE);
            fechaTransacao();
        }
    }//GEN-LAST:event_grupoButtonActionPerformed

    private void grupoListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_grupoListValueChanged
        if (!grupoList.isSelectionEmpty()) {
            equipeSelecionada = (Equipe) grupoList.getSelectedValue();
            populaComponentesList(equipeSelecionada.getNome());
            numComponentes.setText("(" + String.valueOf(equipeSelecionada.getAlunos().size()) + ")");
            if (!lancamentoButton.isEnabled()) {
                lancamentoButton.setEnabled(true);
                consultarButton.setEnabled(true);
                removerButton.setEnabled(true);
            }
        } else {
            numComponentes.setText("");
        }
    }//GEN-LAST:event_grupoListValueChanged

    private void removerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerButtonActionPerformed
        if(JOptionPane.showConfirmDialog(this, "Tem certeza de que deseja remover o grupo "+equipeSelecionada.getNome()+"?","Remoção de Grupo",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
        try {
            manager.getTransaction().begin();
            equipeDAO.delete(equipeSelecionada);
            manager.getTransaction().commit();
            populaGrupoList();
            limpaComponentesList();
            fechaTransacao();
        } catch (ConstraintViolationException e) {
            JOptionPane.showMessageDialog(this, "Não foi possível inserir os dados no banco de dados, verifique os valores inseridos (violação de constraint).","Violação!",JOptionPane.ERROR_MESSAGE);
        }
      }
    }//GEN-LAST:event_removerButtonActionPerformed

    private void lancamentoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lancamentoButtonActionPerformed
        LancamentoForm lancamento = new LancamentoForm(equipeSelecionada);
        lancamento.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lancamentoButtonActionPerformed

    private void buttonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPesquisarActionPerformed
        PesquisarForm pesquisar = new PesquisarForm();
        pesquisar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonPesquisarActionPerformed

    private void consultarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarButtonActionPerformed
        if (equipeSelecionada.getLancamentos() == null || equipeSelecionada.getLancamentos().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Não há lançamentos para a equipe " + equipeSelecionada.getNome(),"Ops!",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Lancamento lanca = equipeSelecionada.getLancamentos().get(0);
        int dia = lanca.getDataDoLancamento().getDayOfMonth();
        int mes = lanca.getDataDoLancamento().getMonthValue();
        int ano = lanca.getDataDoLancamento().getYear();

        String str = "ID:" + lanca.getId() + "  -  Data: " + dia + "/" + mes + "/" + ano
                + "\nVelocidade do Vento: " + lanca.getVelocidadeDoVento()
                + "\nAltitude Máxima: " + lanca.getAltitudeMaxima()
                + "\nVelocidade máxima: " + lanca.getVelocidadeMaxima()
                + "\nTempo de Propulsão: " + lanca.getTempoDePropulsao().getSeconds()
                + "\nPico de Aceleração: " + lanca.getPicoDeAceleracao()
                + "\nAceleração Média: " + lanca.getAceleracaoMedia()
                + "\nTempo entre Apogeu e Descida: " + lanca.getTempoEntreApogeuEDescida().getSeconds()
                + "\nTempo de Ejeção: " + lanca.getTempoDeEjecao().getSeconds()
                + "\nAltitude de Ejeção: " + lanca.getAltitudeDeEjecao()
                + "\nTaxa de Descida: " + lanca.getTaxaDeDescida()
                + "\nDuração do Vôo: " + lanca.getDuracaoDoVoo().getSeconds()
                + "\n\nEspecificações do Foguete: "
                + "\nID: " + lanca.getFoguete().getId()
                + "\nDistância do Alvo: " + lanca.getFoguete().getDistanciaDoAlvo()
                + "\nÂngulo de Lançamento: " + lanca.getFoguete().getAnguloDeLancamento()
                + "\nPeso do Foguete: " + lanca.getFoguete().getPesoDoFoguete();

        JOptionPane.showMessageDialog(this, str,"Dados de lançamento da equipe"+equipeSelecionada.getNome(),JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_consultarButtonActionPerformed

    private void populaGrupoList() {
        DefaultListModel<Equipe> listModel = new DefaultListModel<>();
        List<Equipe> equipes = equipeDAO.findAll();
        if (equipes != null || !equipes.isEmpty()) {
            for (Equipe equipe : equipes) {
                listModel.addElement(equipe);
            }
        }
        grupoList.setModel(listModel);
    }

    private void populaComponentesList(String nomeEquipe) {
        DefaultListModel<Aluno> listModel = new DefaultListModel<>();
        Equipe equipe = equipeDAO.findByTeamName(nomeEquipe);
        if (equipe != null) {
            for (Aluno aluno : equipe.getAlunos()) {
                listModel.addElement(aluno);
            }
        }
        componentesList.setModel(listModel);
    }

    private void limpaComponentesList() {
        DefaultListModel<Aluno> listModel = new DefaultListModel<>();
        listModel.clear();
        componentesList.setModel(listModel);
    }

    private void fechaTransacao() {
        if (manager.getTransaction().isActive()) {
            manager.getTransaction().commit();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonPesquisar;
    private javax.swing.JList componentesList;
    private javax.swing.JScrollPane componentesScroll;
    private javax.swing.JButton consultarButton;
    private javax.swing.JButton grupoButton;
    private javax.swing.JList grupoList;
    private javax.swing.JScrollPane grupoScroll;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton lancamentoButton;
    private javax.swing.JLabel numComponentes;
    private javax.swing.JButton removerButton;
    // End of variables declaration//GEN-END:variables
}
