package bai_tap_them.WorkManagement.repository.impl;

import bai_tap_them.WorkManagement.model.Spending;
import bai_tap_them.WorkManagement.repository.ISpendingRepository;

import java.util.ArrayList;
import java.util.List;

public class SpendingRepository implements ISpendingRepository {
    private final List<Spending> spendingList = new ArrayList<>();

    {
        spendingList.add(new Spending("A01", "Xe", "12/12/1995", 100, "Xe độ"));
        spendingList.add(new Spending("A02", "Ti vi", "12/12/1995", 200, "Tv hd"));
        spendingList.add(new Spending("A03", "Tu lanh", "12/12/1995", 300, "tu lanh LG"));

    }

    @Override
    public List<Spending> showSpending() {
        return this.spendingList;
    }

    @Override
    public void createSpending(Spending spending) {
        this.spendingList.add(spending);
    }

    @Override
    public void removeSpending(String spendingId) {
        for (Spending spending : spendingList) {
            if (spending.getSpendingId().equalsIgnoreCase(spendingId)) {
                spendingList.remove(spending);
                break;
            }
        }
    }

    @Override
    public void updateSpending(Spending spending) {
        for (Spending spending1 : spendingList) {
            if (spending1.getSpendingId().equalsIgnoreCase(spending.getSpendingId())) {
                spending1.setSpendingName(spending.getSpendingName());
                spending1.setDateOfSpending(spending.getDateOfSpending());
                spending1.setSpendingMoney(spending.getSpendingMoney());
                spending1.setNoteSpending(spending.getNoteSpending());
            }
        }

    }

    @Override
    public Spending findSpendingId(String spendingId) {
        for (Spending spending : spendingList) {
            if (spending.getSpendingId().equalsIgnoreCase(spendingId)) {
                return spending;
            }
        }
        return null;
    }

    @Override
    public List<Spending> findSpendingName(String spendingCharName) {
        List<Spending> listResult = new ArrayList<>();
        for (Spending spending : spendingList) {
            if (spending.getSpendingName().contains(spendingCharName)) {
                listResult.add(spending);
            }
        }
        return listResult;
    }
}
