package ru.netology.services;

public class FreelanceService {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0;
        int count = 0;

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                // отдыхает
                money = money - expenses; // сначала расходы
                money = money / 3;         // потом уменьшение остатка в 3 раза
                count++;
            } else {
                // работает
                money = money + income;    // доход
                money = money - expenses;  // расходы
            }
        }
        return count;
    }
}