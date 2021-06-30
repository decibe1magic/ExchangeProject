
public class ExchangePrintProcess {
	
	public void printUSDCurrency(String selectedTypeText, int resultMoney, int returnKORWon) {
		returnKORWon = returnKORWon / 10 * 10;
		System.out.printf("%s�� �����Ͽ����ϴ�.\n", selectedTypeText);
		System.out.printf("ȯ�� : %d %s, �Ž����� : %d��\n", resultMoney, selectedTypeText, returnKORWon);
		// �޷�ȭ ���
		System.out.printf("100%s : %d ��\n", selectedTypeText, resultMoney / 100);
		System.out.printf("50%s : %d ��\n", selectedTypeText, resultMoney % 100 / 50);
		System.out.printf("10%s : %d ��\n", selectedTypeText, resultMoney % 100 % 50 / 10);
		System.out.printf("5%s : %d ��\n", selectedTypeText, resultMoney % 100 % 50 % 10 / 5);
		System.out.printf("2%s : %d ��\n", selectedTypeText, resultMoney % 100 % 50 % 10 % 5 / 2);
		System.out.printf("1%s : %d ��\n", selectedTypeText, resultMoney % 100 % 50 % 10 % 5 % 2);
	}

	public void printJPYCurrency(String selectedTypeText, int resultMoney, int returnKORWon) {
		returnKORWon = returnKORWon / 10 * 10;
		System.out.printf("%s�� �����Ͽ����ϴ�.\n", selectedTypeText);
		System.out.printf("ȯ�� : %d %s, �Ž����� : %d��\n", resultMoney, selectedTypeText, returnKORWon);
		// ��ȭ ���
		System.out.printf("10000%s : %d ��\n", selectedTypeText, resultMoney / 10000);
		System.out.printf("5000%s : %d ��\n", selectedTypeText, resultMoney % 10000 / 5000);
		System.out.printf("2000%s : %d ��\n", selectedTypeText, resultMoney % 10000 % 5000 / 2000);
		System.out.printf("1000%s : %d ��\n", selectedTypeText, resultMoney % 10000 % 5000 % 2000 / 1000);
		System.out.printf("500%s : %d ��\n", selectedTypeText, resultMoney % 10000 % 5000 % 2000 % 1000 / 500);
		System.out.printf("100%s : %d ��\n", selectedTypeText, resultMoney % 10000 % 5000 % 2000 % 1000 % 500 / 100);
		System.out.printf("50%s : %d ��\n", selectedTypeText, resultMoney % 10000 % 5000 % 2000 % 1000 % 500 % 100 / 50);
		System.out.printf("10%s : %d ��\n", selectedTypeText,
				resultMoney % 10000 % 5000 % 2000 % 1000 % 500 % 100 % 50 / 10);
		System.out.printf("5%s : %d ��\n", selectedTypeText,
				resultMoney % 10000 % 5000 % 2000 % 1000 % 500 % 100 % 50 % 10 / 5);
		System.out.printf("1%s : %d ��\n", selectedTypeText,
				resultMoney % 10000 % 5000 % 2000 % 1000 % 500 % 100 % 50 % 10 % 5);
	}

	public void printEURCurrency(String selectedTypeText, int resultMoney, int returnKORWon) {
		returnKORWon = returnKORWon / 10 * 10;
		System.out.printf("%s�� �����Ͽ����ϴ�.\n", selectedTypeText);
		System.out.printf("ȯ�� : %d %s, �Ž����� : %d��\n", resultMoney, selectedTypeText, returnKORWon);
		// ����ȭ ���
		System.out.printf("500%s : %d ��\n", selectedTypeText, resultMoney / 500);
		System.out.printf("200%s : %d ��\n", selectedTypeText, resultMoney % 500 / 200);
		System.out.printf("100%s : %d ��\n", selectedTypeText, resultMoney % 500 % 200 / 100);
		System.out.printf("50%s : %d ��\n", selectedTypeText, resultMoney % 500 % 200 % 100 / 50);
		System.out.printf("20%s : %d ��\n", selectedTypeText, resultMoney % 500 % 200 % 100 % 50 / 20);
		System.out.printf("10%s : %d ��\n", selectedTypeText, resultMoney % 500 % 200 % 100 % 50 % 20 / 10);
		System.out.printf("5%s : %d ��\n", selectedTypeText, resultMoney % 500 % 200 % 100 % 50 % 20 % 10 / 5);
		System.out.printf("2%s : %d ��\n", selectedTypeText, resultMoney % 500 % 200 % 100 % 50 % 20 % 10 % 5 / 2);
		System.out.printf("1%s : %d ��\n", selectedTypeText, resultMoney % 500 % 200 % 100 % 50 % 20 % 10 % 5 % 2);
	}

	public void printKORCurrency(int returnKORWon) {
		// ��ȭ ���
		System.out.printf("1000�� : %d ��\n", returnKORWon / 1000);
		System.out.printf("500�� : %d ��\n", returnKORWon % 1000 / 500);
		System.out.printf("100�� : %d ��\n", returnKORWon % 1000 % 500 / 100);
		System.out.printf("50�� : %d ��\n", returnKORWon % 1000 % 500 % 100 / 50);
		System.out.printf("10�� : %d ��\n", returnKORWon % 1000 % 500 % 100 % 50 / 10);
	}

}
