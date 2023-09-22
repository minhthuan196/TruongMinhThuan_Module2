package bai_tap_them.WorkManagement.service;

import bai_tap_them.WorkManagement.model.Spending;

import java.util.List;

public interface ISpendingService {
    List<Spending> showSpending();

    void createSpending(Spending spending);

    void removeSpending(String spendingId);

    void updateSpending(Spending spending);

    Spending findSpendingId(String spendingId);

    List<Spending> findSpendingName(String spendingCharName);

}
