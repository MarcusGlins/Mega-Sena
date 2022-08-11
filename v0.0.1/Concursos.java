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
    {20,32,34,49,58,60},
    // Julho: 5 concursos
    { 6,10,13,19,20,51}, {23,27,36,37,42,56}, { 5,10,12,24,25,60},
    {11,25,28,30,33,51}, { 6,33,36,46,49,53},
    // Agosto: 4 concursos
    { 1, 9,31,38,46,56}, {17,37,39,51,52,59}, { 1, 8,14,28,33,43},
    {24,43,50,54,55,56},
    // Setembro: 5 concursos
    {10,22,50,53,57,58}, {13,17,20,33,44,51}, { 3, 6,22,24,54,50},
    { 3, 8,14,43,56,58},
    // Outubro: 4 concursos
    {17,19,28,45,48,56}, { 5,14,33,36,43,44}, { 5,17,33,39,42,49},
    {13,15,17,40,53,57},
    // Novembro: 4 concursos
    { 4,16,21,23,54,57}, { 3,13,17,25,29,51}, { 6, 7,22,38,52,60},
    {10,42,43,45,54,55},
    // Dezembro: 5 concursos
    {12,16,37,45,52,56}, { 3, 5, 8,12,46,47}, {12,26,35,38,39,47},
    { 7,11,19,24,33,36}, { 2, 6,17,25,26,58}
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

