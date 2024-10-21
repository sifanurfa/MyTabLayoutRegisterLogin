package com.example.mytablayout

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.mytablayout.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        val registeredUsername = arguments?.getString("username")
//        val registeredPassword = arguments?.getString("password")
        val registeredUsername = "simi"
        val registeredPassword = "123"

        val username = view.findViewById<EditText>(R.id.edit_username_login)
        val password = view.findViewById<EditText>(R.id.edit_password_login)

        val button = view.findViewById<Button>(R.id.btn_login)
        button.setOnClickListener {
            val inputUsername = username.text.toString()
            val inputPassword = password.text.toString()

            if (inputUsername == registeredUsername && inputPassword == registeredPassword) {
                val intent = Intent(activity, HomepageActivity::class.java).apply {
                    putExtra("username", inputUsername)
                }
                startActivity(intent)
            } else {
                Toast.makeText(activity, "Username atau password salah!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}