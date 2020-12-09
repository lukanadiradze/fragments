package com.example.luka.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.NavAction
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.luka.R

class HomeFragments : Fragment(R.layout.fragment_home) {

    private lateinit var navController: NavController
    private lateinit var editText: EditText
    private lateinit var button: Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        editText = view.findViewById(R.id.editTextNumber)
        button = view.findViewById(R.id.button)

        button.setOnClickListener {

            val amount = editText.text.toString().toInt()

            val action = HomeFragmentsDirections.actionHomeFragmentsToNotificationFragment(amount)

            navController.navigate(action)

        }

    }

}