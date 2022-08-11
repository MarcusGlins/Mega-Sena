// Classe Concursos
public class Concursos {
  // Todos os concursos da Mega Sena
  int[][] concursos = { 
    // Concursos de 1996
    // Março: 3 concursos
    { 4, 5,30,33,41,52}, { 9,37,39,41,43,49}, {10,11,29,30,36,47},
    // Abril: 5 concursos
    { 1, 5, 6,27,42,59}, { 1, 2, 6,16,19,46}, { 7,13,19,22,40,47},
    { 3, 5,20,21,38,56}, { 4,17,37,38,47,53},
    // Maio: 4 concursos
    { 8,43,54,55,56,60}, { 4,18,21,25,38,57}, {15,25,37,38,58,59},
    { 4,16,19,20,27,43},
    // Junho: 4 concursos
    {18,32,47,50,54,56}, { 2,16,23,27,47,53}, {12,33,35,51,52,60},
    {20,32,34,49,58,60} 
  };
    
  // Método exibe concursos
  void exibeConcursos() {
    int cont=1;

    for (int linha=0; linha < this.concursos.length; linha++) {
      for (int col=0; col < this.concursos[linha].length; col ++) {
	System.out.printf("%2d ",this.concursos[linha][col]);
      }
      
      cont++;

      System.out.print(" | ");
      
      if (cont == 4) {
        System.out.println();
	cont = 1;
      }
    }
    System.out.println();
  } // fim do método exibeConcursos

  void numerosMaisFrequentes() {
    for (int linha=0; linha < this.concursos.length; linha++) {
      for (int col=0; col < this.concursos.length; col++) {
	// Inserir código aqui	
      }
    }
  } // fim do método numerosMaisFrequentes
} // fim da classe Concursos

