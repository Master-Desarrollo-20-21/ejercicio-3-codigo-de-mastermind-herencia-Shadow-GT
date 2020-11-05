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
			console.out(attempts);
		} while (this.endGame());
	}

}