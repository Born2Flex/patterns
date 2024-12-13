package edu.internship.structural.facade.billing;

public class Main {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        BillPaymentService billPaymentService = new BillPaymentService();
        TransferService transferService = new TransferService();
        BankingFacade bankingFacade = new BankingFacade(accountService, transferService, billPaymentService);
        bankingFacade.getAccountDetails("123456");
        bankingFacade.transferFunds("123456", "654321", 100.0);
        bankingFacade.payBill("123456", "BILL001", 50.0);
    }
}