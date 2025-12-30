package com.example.simple_warikan_app.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.simple_warikan_app.ui.components.LabeledInputField

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WarikanContent(
    modifier: Modifier = Modifier,
) {
    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(
                title = { Text("シンプルな割り勘アプリ") }
            )
        }
    ) { innerPadding ->
        MainContent(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxWidth()
                .padding(8.dp),
        )
    }
}

@Preview(showBackground = true)
@Composable
fun WarikanContentPreview() {
    WarikanContent()
}

@Composable
fun MainContent(
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier,
    ) {
        LabeledInputField(
            label = "金額",
            unit = "円",
            value = "",
            onValueChange = {},
        )
        Spacer(Modifier.padding(8.dp))

        LabeledInputField(
            label = "人数",
            unit = "人",
            value = "",
            onValueChange = {},
        )
        Spacer(Modifier.padding(8.dp))

        CalculationResult()
    }
}

@Composable
private fun CalculationResult(
    modifier: Modifier = Modifier,
) {
    Text(
        modifier = modifier,
        text = "ここに結果が表示されます。",
    )
}

@Preview(showBackground = true)
@Composable
fun MainContentPreview() {
    MainContent()
}