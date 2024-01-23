package com.example.bankaccounts.DataClass

import java.lang.reflect.Type


data class TransactionData(
    val name: String,
    val transaction :TransactionType,
    val date :String,
    val amount: Double,
    val balance: Double,
    val accountNumber: Int,



)
enum class TransactionType{
    DEPOSIT,
    WITHDRAW
}