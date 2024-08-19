package main.java.com.ohgiraffers.understand;

import java.util.*;

public class LottoProgram {
    private static final int LOTTO_MAX_NUMBER = 45;
    private static final int LOTTO_NUMBERS_COUNT = 6;
    private static final int MAX_PURCHASE_LIMIT = 10;
    private static final int SALES_LIMIT = 10;

    private Map<String, List<Set<Integer>>> userLottos = new LinkedHashMap<>();
    private int lottoSalesCount = 0;
    private int userCount = 1;

    public static void main(String[] args) {
        LottoProgram lottoProgram = new LottoProgram();
        Scanner sc = new Scanner(System.in);

        while (lottoProgram.lottoSalesCount < SALES_LIMIT) {
            System.out.print("몇 장의 로또를 구매하시겠습니까? (최대 " +
                    (SALES_LIMIT - lottoProgram.lottoSalesCount) + "장): ");
            int buy = sc.nextInt();

            if (buy <= 0 || buy > (SALES_LIMIT - lottoProgram.lottoSalesCount)) {
                System.out.println("구매 가능한 수량은 1장에서 " +
                        (SALES_LIMIT - lottoProgram.lottoSalesCount) + "장 사이입니다.");
            } else {
                lottoProgram.buyLotto("구매자" + lottoProgram.userCount, buy);
                lottoProgram.userCount++;
            }
        }
        lottoProgram.drawLotto();
    }

    private Set<Integer> lottoNumbers() {
        Set<Integer> lottoNumbers = new HashSet<>();
        Random random = new Random();

        while (lottoNumbers.size() < LOTTO_NUMBERS_COUNT) {
            int number = random.nextInt(LOTTO_MAX_NUMBER) + 1;
            lottoNumbers.add(number);
        }

        return lottoNumbers;
    }

    public void buyLotto(String userKey, int buy) {
        if (lottoSalesCount + buy > SALES_LIMIT) {
            System.out.println("남은 판매 가능 수량: " +
                    (SALES_LIMIT - lottoSalesCount) +
                    "장. 해당 수량 이하로만 구매할 수 있습니다.");
            return;
        }

        for (int i = 0; i < buy; i++) {
            Set<Integer> lNumbers = lottoNumbers();
            userLottos.computeIfAbsent(userKey, k -> new ArrayList<>()).add(lNumbers);
            lottoSalesCount++;
        }
    }

    public void drawLotto() {
        if (lottoSalesCount < SALES_LIMIT) {
            System.out.println("로또 판매가 아직 완료되지 않았습니다.");
            return;
        }

        System.out.println("구매한 로또 번호:");

        boolean isWinner = false;
        Set<Integer> winningNumbers = lottoNumbers();

        for (Map.Entry<String, List<Set<Integer>>> entry : userLottos.entrySet()) {
            System.out.println(entry.getKey() + "님의 로또 번호:");
            for (Set<Integer> lottoNumbers : entry.getValue()) {
                System.out.println(lottoNumbers);
                if (lottoNumbers.equals(winningNumbers)) {
                    System.out.println("당첨: " + lottoNumbers);
                    isWinner = true;
                }
            }
            System.out.println();
        }

        System.out.println("당첨 번호: " + winningNumbers);

        if (!isWinner) {
            System.out.println("이번 회차 당첨 없음");
        }
    }
}
