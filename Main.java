class Main {
    public static void main(String[] args) {
  
      int[] actual = {1, 2};
      int[] guessed = {1, 3};
  
      int score = computeScore(actual, guessed);
      System.out.println("Your score: " + score);
  }
    
    public static int computeScore(int[] actual, int[] guessed) {
        int score = 0;
  
        boolean winner0 = false;
        if(actual[0] > actual[1]) {
            winner0 = true;
        }
  
        if((winner0 && guessed[0] > guessed[1]) || (actual[0] == actual[1] && guessed[0] == guessed[1]) || (!winner0 && guessed[0] < guessed[1])) {
            score += 2;
        }
  
        if(actual[0] == guessed[0]){
            score += 1;
        }
  
        if(actual[1] == guessed[1]) {
            score += 1;
        }
  
        if(score == 4) {
            score += 1;
        }
      
        return score;
    }
}