package edu.internship.structural.facade.billing;

class BankingFacade {
    private final AccountService accountService;
    private final TransferService transferService;
    private final BillPaymentService billPaymentService;

    public BankingFacade(AccountService accountService, TransferService transferService, BillPaymentService billPaymentService) {
        this.accountService = accountService;
        this.transferService = transferService;
        this.billPaymentService = billPaymentService;
    }

    public void getAccountDetails(String accountId) {
        accountService.getAccountDetails(accountId);
    }

    public void transferFunds(String fromAccount, String toAccount, double amount) {
        transferService.transferFunds(fromAccount, toAccount, amount);
    }

    public void payBill(String accountId, String billId, double amount) {
        billPaymentService.payBill(accountId, billId, amount);
    }
}