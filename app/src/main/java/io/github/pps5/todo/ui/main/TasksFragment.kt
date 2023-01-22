package io.github.pps5.todo.ui.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import io.github.pps5.todo.R

class TasksFragment : Fragment(R.layout.fragment_tasks) {

    private val viewModel: TasksViewModel by viewModels()

}