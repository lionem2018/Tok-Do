package com.lionem.tok_do

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.lionem.tok_do.databinding.ActivityEditToDoBinding

class EditToDoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEditToDoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_edit_to_do)

        binding.activitiy = this@EditToDoActivity
    }

    fun clickSaveButton() {
        // save data
        val descriptionText = binding.edittextDescription.text
        Toast.makeText(this, descriptionText, Toast.LENGTH_SHORT).show()
    }
}