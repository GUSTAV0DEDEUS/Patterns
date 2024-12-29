/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package templatemain;

import comPadrao.RelatorioExcel;
import comPadrao.RelatorioPDF;
import comPadrao.RelatorioTemplate;
import semPadrao.RelatorioExcelSem;
import semPadrao.RelatorioPDFSem;

/**
 *
 * @author Gustavo
 */
public class TemplateMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Sem Padrao
         RelatorioPDFSem pdfSem = new RelatorioPDFSem();
        pdfSem.gerarRelatorio();
        
        RelatorioExcelSem excelSem = new RelatorioExcelSem();
        excelSem.gerarRelatorio();
        
        //Com padrao
        RelatorioTemplate pdf = new RelatorioPDF();
        pdf.gerarRelatorio();
        
        RelatorioTemplate excel = new RelatorioExcel();
        excel.gerarRelatorio();
    }
    
}
