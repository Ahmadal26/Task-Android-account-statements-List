package com.example.bankaccounts.Repo

import com.example.bankaccounts.DataClass.TransactionData
import com.example.bankaccounts.DataClass.TransactionType

class AccountStatementRepo {
    companion object{

        var dummyDataTransactionDate = listOf(


            TransactionData("Ahmad",transaction =TransactionType.DEPOSIT,"1/23/2024",30.0,110.0,123445),
            TransactionData("Osama",transaction =TransactionType.WITHDRAW,"1/23/2024",320.0,120.0,123425),
            TransactionData("Osama",transaction =TransactionType.WITHDRAW,"1/23/2024",320.0,120.0,123425),
            TransactionData("Osama",transaction =TransactionType.WITHDRAW,"1/23/2024",320.0,120.0,123425),
            TransactionData("Osama",transaction =TransactionType.WITHDRAW,"1/23/2024",320.0,120.0,123425),
            TransactionData("Osama",transaction =TransactionType.WITHDRAW,"1/23/2024",320.0,120.0,123425),







        )

    }
}