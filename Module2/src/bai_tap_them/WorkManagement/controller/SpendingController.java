package bai_tap_them.WorkManagement.controller;

import bai_tap_them.WorkManagement.model.Spending;
import bai_tap_them.WorkManagement.service.ISpendingService;
import bai_tap_them.WorkManagement.service.impl.SpendingService;

import java.util.List;

public class SpendingController {
    private final ISpendingService spendingService = new SpendingService();

    public List<Spending> showSpending() {
        return this.spendingService.showSpending();
    }


    public void createSpending(Spending spending) {
        this.spendingService.createSpending(spending);
    }


    public void removeSpending(String spendingId) {
        this.spendingService.removeSpending(spendingId);
    }


    public void updateSpending(Spending spending) {
        this.spendingService.updateSpending(spending);
    }


    public Spending findSpendingId(String spendingId) {
        return this.spendingService.findSpendingId(spendingId);
    }


    public List<Spending> findSpendingName(String spendingCharName) {
        return this.spendingService.findSpendingName(spendingCharName);
    }
}
