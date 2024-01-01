package com.example.pepebeem

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.DialogFragment

class BottomSheetFrag : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.bottomsheetview, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val addToFavouritesButton: Button = view.findViewById(R.id.fav)

        addToFavouritesButton.setOnClickListener {
            val intent = Intent(requireActivity(), SocmedActivity::class.java)
            startActivity(intent)
            dismiss()
        }
    }
}


