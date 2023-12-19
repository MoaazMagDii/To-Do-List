package com.example.kotlintodopractice.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.kotlintodopractice.R
import com.example.kotlintodopractice.databinding.FragmentHomeBinding
import com.example.kotlintodopractice.databinding.FragmentMenuBinding
import com.example.kotlintodopractice.databinding.FragmentSignInBinding
import com.google.firebase.auth.FirebaseAuth

class MenuFragment : Fragment() {

    private lateinit var binding: FragmentMenuBinding
    private lateinit var navController: NavController
  

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenuBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        init(view)

        binding.idBtnBack.setOnClickListener {

            navController.navigate(R.id.action_menuFragment_to_homeFragment)

        }

        
    }
    private fun init(view: View) {
    
        navController = Navigation.findNavController(view)
    }

}