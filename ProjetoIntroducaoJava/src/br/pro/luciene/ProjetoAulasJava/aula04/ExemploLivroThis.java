package br.pro.luciene.ProjetoAulasJava.aula04;

/**
 * @author Luciene Cavalcanti Rodrigues
 */
public class ExemploLivroThis {
    
        String titulo, autor;
        int id, paginas;
        
        public ExemploLivroThis(){
            
            titulo = "";
            autor = "";
            id = 0;
            paginas = 0;
        
        }
        
        public ExemploLivroThis(String titulo, String autor, int id, int paginas) {

            this.titulo = titulo;
            this.autor = autor;
            this.id = id;
            this.paginas = paginas;
        }
    
}
