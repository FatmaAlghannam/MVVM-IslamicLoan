package com.falghannam.mvvm_islamicloan.composable

//import androidx.compose.foundation.text.KeyboardOptions
//import androidx.compose.material3.Button
//import androidx.compose.material3.TextField
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.text.input.KeyboardType
//import com.falghannam.mvvm_islamicloan.viewmodel.LoanViewModel
//import androidx.compose.ui.Modifier
//import androidx.compose.material3.Text
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.modifier.modifierLocalMapOf
//import androidx.compose.ui.unit.dp
//import androidx.lifecycle.viewmodel.compose.viewModel
//import androidx.compose.runtime.remember
//import android.icu.util.CurrencyAmount
import androidx.compose.runtime.MutableState
//import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel


class LoanViewModel : ViewModel() {
    val monthlyInstallment: MutableState<Double> = mutableStateOf(0.0)


    fun calculateInstallment(loanAmount: Double?, loanPeriod: Int?, salary: Double?) {


        val maxInstallment = 0.4 * salary!!

        fun calculateInstallment(loanAmount: Double?, loanPeriod: Int?, salary: Double?) {

            if ((loanAmount == null) || (loanPeriod == null) || (salary == null) || (loanPeriod == 0)) {
                monthlyInstallment.value = 0.0
                return
            }

            val calculatededInstallment = loanAmount / loanPeriod

            val maxInstallment = 0.4 * salary
            if (calculatededInstallment <= maxInstallment) {
                monthlyInstallment.value =
                    calculatededInstallment
                val newLoanPeriod = loanAmount / maxInstallment
            }
        }
    }
}



