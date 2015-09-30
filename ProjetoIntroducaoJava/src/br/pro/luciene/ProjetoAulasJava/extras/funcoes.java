import java.util.Calendar;
/*
 * funcoes.java
 *
 * Created on 6 de Setembro de 2007, 11:28
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
public class funcoes {
    
    /** Creates a new instance of funcoes */
    public funcoes() {
    }
 
    public static String data_sistema(){
        String msg="";
        String meses[] = new String[12];
        meses[0]="Janeiro";
        meses[1]="Fevereiro";
        meses[2]="Março";
        meses[3]="Abril";
        meses[4]="Maio";
        meses[5]="Junho";
        meses[6]="Julho";
        meses[7]="Agosto";
        meses[8]="Setembro";
        meses[9]="Outubro";
        meses[10]="Novembro";
        meses[11]="Dezembro";
        
        String semana[]={"Domingo","Segunda-feira","Terça-feira","Quarta-feira","Quinta-feira","Sexta-feira","Sábado"};

        Calendar data2 = Calendar.getInstance();
        int hora = data2.get(Calendar.HOUR_OF_DAY);
        if (hora<12)
            msg = "Bom dia. ";
        if (hora >=13 && hora <=18)
            msg = "Boa tarde. ";
        if (hora > 18)
            msg="Boa noite. ";
        
        msg = msg + semana[data2.get(Calendar.DAY_OF_WEEK)-1] + " , " +
                data2.get(Calendar.DAY_OF_MONTH) + " de " +
                meses[data2.get(Calendar.MONTH)] + " de " +
                data2.get(Calendar.YEAR) + ".";
        return msg;
    }
}
