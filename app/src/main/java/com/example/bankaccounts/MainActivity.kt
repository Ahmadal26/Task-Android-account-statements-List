package com.example.bankaccounts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.bankaccounts.DataClass.TransactionData
import com.example.bankaccounts.Repo.AccountStatementRepo
import com.example.bankaccounts.composable.AccountStatement
import com.example.bankaccounts.ui.theme.BankAccountsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val transactionDate = AccountStatementRepo.dummyDataTransactionDate
        setContent {
            BankAccountsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {


                    AccountList(transactionDate)


                }


            }
        }
    }
}

@Composable
fun AccountList(transactionData: List<TransactionData>, modifier: Modifier = Modifier) {
   LazyColumn(modifier = Modifier){

       items(transactionData){
           AccountStatement(
               name = it.name,
               transaction = it.transaction,
               date = it.date,
               amount = it.amount,
               balance = it.balance,
               accountNumber = it.accountNumber
           )
            Divider(color = Color.DarkGray)
       }
   }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BankAccountsTheme {

    }
}