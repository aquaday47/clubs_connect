package CoreClubsConnect;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by aaron on 3/3/2018.
 */

public class Club implements Parcelable {
    private int mData;

    public static final Parcelable.Creator<Club> CREATOR
            = new Parcelable.Creator<Club>(){
        public Club createFromParcel(Parcel in){
            return new Club(in);
        }

        @Override
        public Club[] newArray(int size) {
            return new Club[size];
        }

        @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }


    };

    private Club(Parcel in){
        mData = in.readInt();
    }
}
