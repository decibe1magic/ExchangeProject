import java.util.Scanner;

public class ExchangeInputData {
	ExchangeProcess process = new ExchangeProcess();

	public void inputCurrency() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("ȯ���� ���� ����(1:USD, 2:EUR, 3:JPY, 0:����) : ");
			int selectNum = sc.nextInt();
			if (selectNum == 0) {
				break;
			}
			System.out.println("ȯ���� ��ȭ : ");
			int korWon = sc.nextInt();
			process.exchangeCurrentcy(selectNum, korWon);
		}
		sc.close();
	}
}
