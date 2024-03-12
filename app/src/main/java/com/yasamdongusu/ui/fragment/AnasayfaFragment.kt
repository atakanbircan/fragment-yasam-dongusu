package com.yasamdongusu.ui.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.yasamdongusu.R
import com.yasamdongusu.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Yaşam Döngüsü", "onCreate() Fragment oluşturuldu.")
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("Yaşam Döngüsü", "onCreateView() Fragment kullanıcı arayüzü oluşturuldu.")
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.btnAnasayfa.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.transitionDetailPage)
        }
        return binding.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("Yaşam Döngüsü", "onAttach() Fragment aktivitye bağlandı.")
    }


    override fun onStart() {
        super.onStart()
        Log.d("Yaşam Döngüsü", "onStart() Fragment görüntülenmeye hazır.")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Yaşam Döngüsü", "onResume() Fragementı görüntülendi ve kullanıcı etkileşimine açık.")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Yaşam Döngüsü", "onPause() Fragment görüntülenmesi durdu.")
    }

    override fun onStop() {
        super.onStop()
        Log.d(
            "Yaşam Döngüsü",
            "onStop() Fragment görüntülenmiyor ama hala bellektedir(onDestroyView() çalışana kadar)."
        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("Yaşam Döngüsü", "onDestroyView() Fragment kullanıcı arayüzü yok edildi.")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Yaşam Döngüsü", "onDestroy() Fragment yok edildi.")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("Yaşam Döngüsü", "onDetach() Fragment aktiviteden ayrıldı.")
    }


}