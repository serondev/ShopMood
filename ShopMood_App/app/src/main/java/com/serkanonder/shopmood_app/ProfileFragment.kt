package com.serkanonder.shopmood_app

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.firebase.auth.FirebaseAuth
import com.serkanonder.shopmood_app.databinding.FragmentProfileBinding
import kotlinx.android.synthetic.main.fragment_profile.*

class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val bind = FragmentProfileBinding.inflate(layoutInflater)
       bind.tvEmailId.text = FirebaseAuth.getInstance().currentUser?.email
        bind.tvUserId.text = FirebaseAuth.getInstance().currentUser?.uid

        bind.btnLogout.setOnClickListener{
            FirebaseAuth.getInstance().signOut()
            val intent = startActivity(Intent(this@ProfileFragment.requireContext(), SignInActivity::class.java))
        }

        return bind.root
    }


}