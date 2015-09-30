package br.pro.luciene.ProjetoAulasJava.aula05;
import javax.swing.JOptionPane;
/**
@author Luciene Cavalcanti  */
public class divisao_por_zero {
   //java.sun.com/j2se/5.0/docs/api/java/lang/Throwable.html 
    /** Creates a new instance of divisao_por_zero */
    public divisao_por_zero() {
    }
    public static int quociente(int numerador, int denominador) 
    {
        int resultado = numerador/denominador;
        return resultado;
    }
    public static void Lanca_Excecao() throws Exception
    {
       // try{
        System.out.println("Lan�ando uma exce��o !!");
        throw new NumberFormatException();
       // }
       // catch(Exception erro){
       //     JOptionPane.showMessageDialog(null, "Tratando uma exce��o no m�todo Lanca_Excecao.","Divis�o",0);
       // }
    }
    
  /*  public static void Lanca_Minha_Excecao() throws Minha_Excecao{
        System.out.println("Lan�ando uma exce��o !!");
        throw new Exception();
    }    
    */
    
    public static void main(String[] args) {
       boolean flag = true;
       int resultado=0;
        do{
           try{
               int numerador = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o numerador","Divis�o",3));
               int denominador = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o denominador","Divis�o",3));
               
               resultado = quociente(numerador, denominador);
               JOptionPane.showMessageDialog(null, "Resultado: " + resultado,"Divis�o",2);
               flag = false;
               Lanca_Excecao();
           }
           catch(NumberFormatException erro){
               JOptionPane.showMessageDialog(null, "Voc� deve digitar n�meros inteiros.","Divis�o",0);
               System.err.println("Erro...");
           }
           catch(ArithmeticException erro){
               JOptionPane.showMessageDialog(null, "Voc� deve digitar um denominador diferente de zero.","Divis�o",0);
           }
           catch (Exception ex) {
               JOptionPane.showMessageDialog(null, "Lan�ando uma exce��o atoa ... s� pra testar ...\n"
                       + ex.getMessage(),"Divis�o",0);
               ex.printStackTrace();
           }
           finally{
               System.out.println("Entrada obrigat�ria ...");
               System.out.println(resultado);
           }
            System.out.println(resultado);
       }while(flag);

    }
    
}
