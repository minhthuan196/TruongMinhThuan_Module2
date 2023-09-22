package bai_tap_them.WorkManagement.service.impl;

import bai_tap_them.WorkManagement.model.Spending;
import bai_tap_them.WorkManagement.repository.ISpendingRepository;
import bai_tap_them.WorkManagement.repository.impl.SpendingRepository;
import bai_tap_them.WorkManagement.service.ISpendingService;

import java.util.List;

public class SpendingService implements ISpendingService {
    private final ISpendingRepository spendingRepository = new SpendingRepository();

    @Override
    public List<Spending> showSpending() {
        return this.spendingRepository.showSpending();
    }

    @Override
    public void createSpending(Spending spending) {
        this.spendingRepository.createSpending(spending);
    }

    @Override
    public void removeSpending(String spendingId) {
        this.spendingRepository.removeSpending(spendingId);
    }

    @Override
    public void updateSpending(Spending spending) {
        this.spendingRepository.updateSpending(spending);
    }

    @Override
    public Spending findSpendingId(String spendingId) {
        return this.spendingRepository.findSpendingId(spendingId);
    }

    @Override
    public List<Spending> findSpendingName(String spendingCharName) {
        return this.spendingRepository.findSpendingName(spendingCharName);
    }
}
