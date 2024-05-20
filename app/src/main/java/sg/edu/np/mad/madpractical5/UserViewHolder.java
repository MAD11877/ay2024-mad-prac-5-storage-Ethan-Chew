package sg.edu.np.mad.madpractical5;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {
    ImageView smallImage;
    ImageView bigImage;
    TextView name;
    TextView description;

    public UserViewHolder(View itemView) {
        super(itemView);

        smallImage = itemView.findViewById(R.id.imageView);
        bigImage = itemView.findViewById(R.id.largeImageView);
        name = itemView.findViewById(R.id.nameLabel);
        description = itemView.findViewById(R.id.descriptionLabel);
    }
}