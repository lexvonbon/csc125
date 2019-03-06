
class TaxReturn {
  private static final int SINGLE = 0;
  private static final int MARRIED = 1;
  private static final double INCOME = 32000;

  private double income;
  private int status;
  private double taxValue;

  public TaxReturn() {
    status = 0;
    income = 0.0;
    taxValue = 0.0;
  }

  public TaxReturn(int mStatus, double inc) {
    status = mStatusl;
    income = inc;
    taxValue = 0.0;
  }

  public void computeTaxReturn() {
    if(income <= INCOME) {
      taxValue = (0.1*income) + income;
    } else {
      taxValue = (0.25*income) + income;
    }
  }

}