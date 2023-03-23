package com.estfigbui.instaphoto.ui

import android.app.Activity
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext

@Composable
fun MyLoginScreen() {
    Box(Modifier.fillMaxSize()) {
        MyHeader(Modifier.align(Alignment.TopEnd))
    }
}

@Composable
fun MyHeader(modifier: Modifier) {
    val activity = LocalContext.current as Activity
    Icon(
        imageVector = Icons.Default.Close,
        contentDescription = "Close application",
        modifier = modifier.clickable { activity.finish() }
    )
}
