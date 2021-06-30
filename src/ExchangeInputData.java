import java.util.Scanner;

public class ExchangeInputData {
	ExchangeProcess process = new ExchangeProcess();

	public void inputCurrency() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("환전할 종류 선택(1:USD, 2:EUR, 3:JPY, 0:종료) : ");
			int selectNum = sc.nextInt();
			if (selectNum == 0) {
				break;
			}
			System.out.println("환전할 원화 : ");
			int korWon = sc.nextInt();
			process.exchangeCurrentcy(selectNum, korWon);
		}
		sc.close();
	}
}
