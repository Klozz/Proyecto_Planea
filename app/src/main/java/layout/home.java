package layout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.digital.carlos.digitalplanea.MainActivity;
import com.digital.carlos.digitalplanea.R;

public class home extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.onResume();

        // Colocando titulo en barra
        ((MainActivity) getActivity())
                .setActionBarTitle("Inicio");

    }

}