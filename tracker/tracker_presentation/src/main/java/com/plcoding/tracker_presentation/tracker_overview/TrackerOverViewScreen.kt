package com.plcoding.tracker_presentation.tracker_overview

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import com.plcoding.core.util.UiEvent
import com.plcoding.core_ui.LocalSpacing
import com.plcoding.tracker_presentation.tracker_overview.components.NutrientsHeader

@Composable
fun TrackerOVerViewScreen(
    onNavigate: (UiEvent.Navigate) -> Unit,
    viewModel: TrackerOverViewModel = hiltViewModel()
) {
    val spacing = LocalSpacing.current
    val state = viewModel.state
    val context = LocalContext.current

    LazyColumn(
        modifier =
        Modifier
            .fillMaxWidth()
            .padding(
                bottom = spacing.spaceMedium
            )
    ){
        item {
            NutrientsHeader(state = state)
        }

    }
}