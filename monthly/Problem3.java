package monthly;

import java.text.DecimalFormat;

public class Problem3 {
    public static void main(String[] args) {
        // 환율 정보
        double krwToUsdExchangeRate = 1338.00;
        double krwToJpyExchangeRate = 903.54;

        // 입력값
        double krwAmount = 3000000;

        // 환전 계산
        double usdAmount = krwAmount / krwToUsdExchangeRate;
        double jpyAmount = krwAmount / krwToJpyExchangeRate;

        // 결과 출력
        DecimalFormat decimalFormat = new DecimalFormat("#,###.00");
        System.out.println("달러($) = " + decimalFormat.format(usdAmount) + " / JPY = " + decimalFormat.format(jpyAmount));
    }
}