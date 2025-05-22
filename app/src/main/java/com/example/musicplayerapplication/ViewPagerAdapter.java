package com.example.musicplayerapplication; // ← Change this to match your actual package name

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.musicplayerapplication.SongsFragment;       // ← Adjust paths if needed
import com.example.musicplayerapplication.PlaylistsFragment;   // ← Adjust paths if needed

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new SongsFragment();
            case 1:
                return new PlaylistsFragment();
            default:
                return new SongsFragment(); // fallback
        }
    }

    @Override
    public int getItemCount() {
        return 2; // Total number of tabs
    }
}