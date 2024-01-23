package com.example.bankaccounts.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bankaccounts.DataClass.TransactionType
import com.example.bankaccounts.ui.theme.BankAccountsTheme
import java.util.Date

@Composable
fun AccountStatement(name: String,
                     transaction: TransactionType,
                     date:String,
                     amount: Double,
                     balance: Double,
                     accountNumber: Int,
                     modifier: Modifier = Modifier) {
    Card(colors = CardDefaults.cardColors(containerColor = Color.DarkGray, contentColor = Color.White),
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Column {
            Row (modifier = Modifier
                .fillMaxWidth().padding(8.dp)
                , horizontalArrangement = Arrangement.SpaceBetween){
                Text(text = "Name: $name ")
                Text(text = "Account Number: $accountNumber")
            }
            Row (modifier = Modifier
                .fillMaxWidth().padding(8.dp), horizontalArrangement = Arrangement.SpaceBetween){
                Text(text = "Transaction Type:\n   $transaction ")
                Text(text = "Date: $date ")
            }
            Row (modifier = Modifier
                .fillMaxWidth().padding(8.dp), horizontalArrangement = Arrangement.SpaceBetween){
                Text(text = "Balance: $ $balance")
                Text(text = "Amount: $ $amount ")
            }





        }






        }
    }


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BankAccountsTheme {
//        AccountStatement()
    }
}