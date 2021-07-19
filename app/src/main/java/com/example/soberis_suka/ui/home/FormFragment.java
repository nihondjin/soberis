package com.example.soberis_suka.ui.home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.soberis_suka.R;
import com.example.soberis_suka.databinding.FragmentFormBinding;
import com.google.android.material.navigation.NavigationView;


public class FormFragment extends Fragment {
    FragmentFormBinding binding;
TaskModel model;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFormBinding.inflate(inflater, container, false);
        NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_content_main);
        return binding.getRoot();
    }

    private void initClickListener(NavController navController) {
        binding.btnSave.setOnClickListener(v -> {
            String titleSuka = binding.etTxt.getText().toString();

            model = new TaskModel(titleSuka);
            Bundle bundleFuck = new Bundle();
            bundleFuck.putSerializable("codeshit", model);
            getParentFragmentManager().setFragmentResult("codefuck", bundleFuck);
            navController.navigateUp();
        });
    }
}