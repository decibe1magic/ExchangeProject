
public class ExchangeProcess {
	final double EXCHANGE_RATE_USD = 1136.8;
	final double EXCHANGE_RATE_EUR = 1349.52;
	final double EXCHANGE_RATE_JPY = 10.26;

	int returnKORWon = 0;
	int resultMoney = 0;
	String selectedTypeText = null;
	
	ExchangePrintProcess printProcess = new ExchangePrintProcess();

	public void exchangeCurrentcy(int selectNum, int korWon) {
		switch (selectNum) {
		case 1:
			selectedTypeText = "USD";
			resultMoney = (int) (korWon / EXCHANGE_RATE_USD);
			returnKORWon = (int) (korWon % EXCHANGE_RATE_USD);
			printProcess.printUSDCurrency(selectedTypeText, resultMoney, returnKORWon);
			break;

		case 2:
			selectedTypeText = "EUR";
			resultMoney = (int) (korWon / EXCHANGE_RATE_EUR);
			returnKORWon = (int) (korWon % EXCHANGE_RATE_EUR);
			printProcess.printEURCurrency(selectedTypeText, resultMoney, returnKORWon);
			break;

		case 3:
			selectedTypeText = "JPY";
			resultMoney = (int) (korWon / EXCHANGE_RATE_JPY);
			returnKORWon = (int) (korWon % EXCHANGE_RATE_JPY);
			printProcess.printEURCurrency(selectedTypeText, resultMoney, returnKORWon);
			break;
		}
		printProcess.printKORCurrency(returnKORWon);
		
	}


}
