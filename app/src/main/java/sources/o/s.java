package O;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;

public interface s {
    ColorStateList getSupportButtonTintList();

    void setSupportButtonTintList(ColorStateList colorStateList);

    void setSupportButtonTintMode(PorterDuff.Mode mode);
}
