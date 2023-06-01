package test.automation.data;

public class PaymentData {
    private static String grandTotal;

    public static void setGrandTotal(String grandTotal) {
        PaymentData.grandTotal = grandTotal;
    }

    public static String getGrandTotal() {
        return grandTotal;
    }
}
