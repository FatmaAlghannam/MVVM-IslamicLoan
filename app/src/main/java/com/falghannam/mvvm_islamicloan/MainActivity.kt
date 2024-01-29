package com.falghannam.mvvm_islamicloan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.falghannam.mvvm_islamicloan.ui.theme.MVVMIslamicLoanTheme



    class MainActivity : ComponentActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContent {
                MVVMIslamicLoanTheme {


                    // A surface container using the 'background' color from the theme
                    Surface(
                        modifier = Modifier.fillMaxSize(),

                        ) {
                        MVVMIslamicLoanTheme()
                    }


                }
            }
        }

        private fun MVVMIslamicLoanTheme() {
            TODO("Not yet implemented")
        }
    }




    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        MVVMIslamicLoanTheme {

        }
    }