package com.example.soberis_suka.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.soberis_suka.R;
import com.example.soberis_suka.databinding.FragmentFormBinding;
import com.example.soberis_suka.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {
    TaskAdapter adapter;

    private HomeViewModel homeViewModel;
    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        SetUpRecycler();
        getData();

        return binding.getRoot();

    }

    private void getData() {getParentFragmentManager().setFragmentResultListener("codefuck", getViewLifecycleOwner(), ((requestKey, result) -> {
        TaskModel model = (TaskModel) result.getSerializable("codeshit");
        adapter.addText(model);
    }));

    }

    private void SetUpRecycler() {binding.rv.setAdapter(adapter);}

    @Override
    public void onCreate(@NonNull  Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       adapter = new TaskAdapter();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }
}