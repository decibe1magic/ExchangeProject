
public class ExchangePrintProcess {
	
	public void printUSDCurrency(String selectedTypeText, int resultMoney, int returnKORWon) {
		returnKORWon = returnKORWon / 10 * 10;
		System.out.printf("%s를 선택하였습니다.\n", selectedTypeText);
		System.out.printf("환전 : %d %s, 거스름돈 : %d원\n", resultMoney, selectedTypeText, returnKORWon);
		// 달러화 계산
		System.out.printf("100%s : %d 장\n", selectedTypeText, resultMoney / 100);
		System.out.printf("50%s : %d 장\n", selectedTypeText, resultMoney % 100 / 50);
		System.out.printf("10%s : %d 장\n", selectedTypeText, resultMoney % 100 % 50 / 10);
		System.out.printf("5%s : %d 장\n", selectedTypeText, resultMoney % 100 % 50 % 10 / 5);
		System.out.printf("2%s : %d 장\n", selectedTypeText, resultMoney % 100 % 50 % 10 % 5 / 2);
		System.out.printf("1%s : %d 장\n", selectedTypeText, resultMoney % 100 % 50 % 10 % 5 % 2);
	}

	public void printJPYCurrency(String selectedTypeText, int resultMoney, int returnKORWon) {
		returnKORWon = returnKORWon / 10 * 10;
		System.out.printf("%s를 선택하였습니다.\n", selectedTypeText);
		System.out.printf("환전 : %d %s, 거스름돈 : %d원\n", resultMoney, selectedTypeText, returnKORWon);
		// 엔화 계산
		System.out.printf("10000%s : %d 장\n", selectedTypeText, resultMoney / 10000);
		System.out.printf("5000%s : %d 장\n", selectedTypeText, resultMoney % 10000 / 5000);
		System.out.printf("2000%s : %d 장\n", selectedTypeText, resultMoney % 10000 % 5000 / 2000);
		System.out.printf("1000%s : %d 장\n", selectedTypeText, resultMoney % 10000 % 5000 % 2000 / 1000);
		System.out.printf("500%s : %d 개\n", selectedTypeText, resultMoney % 10000 % 5000 % 2000 % 1000 / 500);
		System.out.printf("100%s : %d 개\n", selectedTypeText, resultMoney % 10000 % 5000 % 2000 % 1000 % 500 / 100);
		System.out.printf("50%s : %d 개\n", selectedTypeText, resultMoney % 10000 % 5000 % 2000 % 1000 % 500 % 100 / 50);
		System.out.printf("10%s : %d 개\n", selectedTypeText,
				resultMoney % 10000 % 5000 % 2000 % 1000 % 500 % 100 % 50 / 10);
		System.out.printf("5%s : %d 개\n", selectedTypeText,
				resultMoney % 10000 % 5000 % 2000 % 1000 % 500 % 100 % 50 % 10 / 5);
		System.out.printf("1%s : %d 개\n", selectedTypeText,
				resultMoney % 10000 % 5000 % 2000 % 1000 % 500 % 100 % 50 % 10 % 5);
	}

	public void printEURCurrency(String selectedTypeText, int resultMoney, int returnKORWon) {
		returnKORWon = returnKORWon / 10 * 10;
		System.out.printf("%s를 선택하였습니다.\n", selectedTypeText);
		System.out.printf("환전 : %d %s, 거스름돈 : %d원\n", resultMoney, selectedTypeText, returnKORWon);
		// 유로화 계산
		System.out.printf("500%s : %d 장\n", selectedTypeText, resultMoney / 500);
		System.out.printf("200%s : %d 장\n", selectedTypeText, resultMoney % 500 / 200);
		System.out.printf("100%s : %d 장\n", selectedTypeText, resultMoney % 500 % 200 / 100);
		System.out.printf("50%s : %d 장\n", selectedTypeText, resultMoney % 500 % 200 % 100 / 50);
		System.out.printf("20%s : %d 장\n", selectedTypeText, resultMoney % 500 % 200 % 100 % 50 / 20);
		System.out.printf("10%s : %d 장\n", selectedTypeText, resultMoney % 500 % 200 % 100 % 50 % 20 / 10);
		System.out.printf("5%s : %d 장\n", selectedTypeText, resultMoney % 500 % 200 % 100 % 50 % 20 % 10 / 5);
		System.out.printf("2%s : %d 개\n", selectedTypeText, resultMoney % 500 % 200 % 100 % 50 % 20 % 10 % 5 / 2);
		System.out.printf("1%s : %d 개\n", selectedTypeText, resultMoney % 500 % 200 % 100 % 50 % 20 % 10 % 5 % 2);
	}

	public void printKORCurrency(int returnKORWon) {
		// 원화 계산
		System.out.printf("1000원 : %d 장\n", returnKORWon / 1000);
		System.out.printf("500원 : %d 개\n", returnKORWon % 1000 / 500);
		System.out.printf("100원 : %d 개\n", returnKORWon % 1000 % 500 / 100);
		System.out.printf("50원 : %d 개\n", returnKORWon % 1000 % 500 % 100 / 50);
		System.out.printf("10원 : %d 개\n", returnKORWon % 1000 % 500 % 100 % 50 / 10);
	}

}
