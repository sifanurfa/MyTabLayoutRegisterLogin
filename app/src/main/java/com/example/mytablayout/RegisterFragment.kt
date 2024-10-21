package com.example.mytablayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RegisterFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_register, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Misalnya saat tombol diklik untuk berpindah ke Fragment B
        val button: Button = view.findViewById(R.id.btn_register)
        button.setOnClickListener {
            // Membuat instance Fragment B
            val fragmentB = LoginFragment()

            // Membuat bundle untuk mengirim data
            val bundle = Bundle()
            bundle.putString("username", "JohnDoe")  // Mengirim data 'username'
            fragmentB.arguments = bundle  // Set bundle ke fragment tujuan

            // Gunakan FragmentManager untuk mengganti fragment
            parentFragmentManager.beginTransaction().apply {
                replace(R.id.fragment_container, fragmentB)  // R.id.fragment_container adalah ID container di layout Activity
                addToBackStack(null)  // Tambahkan ke backstack jika diperlukan
                commit()
            }


        }
    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        val button = view.findViewById<Button>(R.id.btn_register)
//        button.setOnClickListener {
//            // Berpindah ke SecondFragment
//            requireActivity().supportFragmentManager.beginTransaction()
//                .replace(R.id.fragment_container, LoginFragment())
//                .addToBackStack(null) // Tambahkan ke back stack
//                .commit()
//        }
//    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        val username = view.findViewById<EditText>(R.id.edit_username_register)
//        val password = view.findViewById<EditText>(R.id.edit_password_register)
//
//        val button = view.findViewById<Button>(R.id.btn_login)
//        button.setOnClickListener {
//            // Ambil teks dari EditText
//            val usernameText = username.text.toString()
//            val passwordText = password.text.toString()
//
//            val bundle = Bundle()
//            bundle.putString("username", usernameText) // Kirim username
//            bundle.putString("password", passwordText) // Kirim password
//
//            // Buat instance dari fragment tujuan
//            val loginFragment = LoginFragment()
//            loginFragment.arguments = bundle  // Kirim data lewat arguments
//
//            // Berpindah ke fragment kedua
//            requireActivity().supportFragmentManager.beginTransaction()
//                .replace(R.id.fragment_container, loginFragment)
//                .addToBackStack(null)
//                .commit()
//        }
//    }
}
