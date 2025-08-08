package day_6_assignment.Enums;

//7: Difficulty Level & Game Setup
//Define enum Difficulty with EASY, MEDIUM, HARD.
//Write a Game class that takes a Difficulty and prints logic like:
//•	EASY → 3000 bullets, MEDIUM → 2000, HARD → 1000.
//Use a switch(diff) inside constructor or method.
//

public class GameSetupDemo {

    enum Difficulty {
        EASY, MEDIUM, HARD
    }

    static class Game {
        private int bullets;
        private Difficulty difficulty;

        public Game(Difficulty difficulty) {
            this.difficulty = difficulty;
            setupGame();
        }

        private void setupGame() {
            switch (difficulty) {
                case EASY:
                    bullets = 3000;
                    break;
                case MEDIUM:
                    bullets = 2000;
                    break;
                case HARD:
                    bullets = 1000;
                    break;
                default:
                    bullets = 0;
            }
        }

        public void displaySetup() {
            System.out.println("Difficulty: " + difficulty);
            System.out.println("Bullets: " + bullets);
        }
    }

    public static void main(String[] args) {
        Game easyGame = new Game(Difficulty.EASY);
        easyGame.displaySetup();

        Game mediumGame = new Game(Difficulty.MEDIUM);
        mediumGame.displaySetup();

        Game hardGame = new Game(Difficulty.HARD);
        hardGame.displaySetup();
    }
}
