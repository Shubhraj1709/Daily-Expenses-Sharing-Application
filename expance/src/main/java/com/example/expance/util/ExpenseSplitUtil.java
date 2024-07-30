package com.example.expance.util;


import com.example.expance.model.Expense;

public class ExpenseSplitUtil {

    public static void calculateSplits(Expense expense) {
        switch (expense.getSplitMethod()) {
            case "EQUAL":
                equalSplit(expense);
                break;
            case "EXACT":
                // Exact split, no calculation needed
                break;
            case "PERCENTAGE":
                percentageSplit(expense);
                break;
        }
    }

    private static void equalSplit(Expense expense) {
        double equalAmount = expense.getAmount() / expense.getSplits().size();
        for (Expense.ExpenseSplit split : expense.getSplits()) {
            split.setAmount(equalAmount);
        }
    }

    private static void percentageSplit(Expense expense) {
        for (Expense.ExpenseSplit split : expense.getSplits()) {
            split.setAmount(expense.getAmount() * (split.getPercentage() / 100));
        }
    }
}

