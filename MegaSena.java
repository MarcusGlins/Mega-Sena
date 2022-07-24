class MegaSena {
  public static void main(String[] args) {
    int[][] jogos = {
    // Todos os jogos a partir de 1996
      {4,5,30,33,41,52}, 
      {9,37,39,41,43,49}
    };

    for (int linha=0; linha<jogos.length; linha++) {
      for (int coluna=0; coluna<jogos[linha].length; coluna++) {
        System.out.printf("%d ", jogos[linha][coluna]);
      }
      System.out.println();
    }
  }
}
