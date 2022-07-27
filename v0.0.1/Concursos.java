// Classe Concursos
class Concursos {
  // Todos os concursos da Mega Sena
  int[][] concursos = { { 4, 5,30,41,52}, { 9,37,39,41,43,49}, {10,11,29,30,36,47} };
    
  // Método exibe concursos
  void exibeConcursos() {
    for (int linha=0; linha < concursos.length; linha++) {
      for (int col=0; col < concursos[linha].length; col ++) {
        System.out.printf("%d ", concursos[linha][col]);
      }
      System.out.println();
    }
  }
}
