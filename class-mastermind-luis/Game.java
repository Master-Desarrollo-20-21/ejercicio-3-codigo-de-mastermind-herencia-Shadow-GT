public class Game{
	
	
	private SecretCombination secretCombination

	public Game()
	{
		this.secretCombination = new SecretCombination();
	}

	public void play()
	{
		Console console = new Console();
		do {
			console.out(attemptsNumber + " attempt(s)\n");
			console.out(this.secretCombination.obfuscated() + "\n");
			if (attemptsNumber > 0) {
				for (int i = 0; i < attemptsNumber; i++) {
					attempts[i].showResult();
				}
			}
			this.nextAttempt(); 
		} while (!this.isEndGame());
	}

}