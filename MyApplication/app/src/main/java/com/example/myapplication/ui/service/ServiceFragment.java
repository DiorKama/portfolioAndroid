package com.example.myapplication.ui.service;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentServiceBinding;
import com.example.myapplication.ui.service.ServiceViewModel;


    public class ServiceFragment extends Fragment {

        private ServiceViewModel serviceViewModel;
        private FragmentServiceBinding binding;

        public View onCreateView(@NonNull LayoutInflater inflater,
                                 ViewGroup container, Bundle savedInstanceState) {
            serviceViewModel =
                    new ViewModelProvider(this).get(ServiceViewModel.class);

            binding = FragmentServiceBinding.inflate(inflater, container, false);
            View root = binding.getRoot();


            serviceViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
                @Override
                public void onChanged(@Nullable String s) {

                }
            });
            return root;
        }

        @Override
        public void onDestroyView() {
            super.onDestroyView();
            binding = null;
        }
    }
