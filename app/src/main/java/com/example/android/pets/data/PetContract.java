package com.example.android.pets.data;

import android.net.Uri;
import android.provider.BaseColumns;

public final class PetContract {
    // constants that defines URI for the content provider
    public static final String CONTENT_AUTHORITY = "com.example.android.Pets";
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);
    // path_tablename - this constants stores the path for each table that use with base Uri
    public static final String PATH_PETS = "pets";

    public PetContract() {
        // constructor logic goes here
    }

    // define inner class contains petEntry for pet table
    public static class PetEntry implements BaseColumns{
        // constant for the table name
        public static final String TABLE_NAME = "pet";

        // constant for the table columns
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_PET_NAME = "name";
        public static final String COLUMN_PET_BREED = "breed";
        public static final String COLUMN_PET_GENDER = "gender";
        public static final String COLUMN_PET_WEIGHT = "weight";

        // other string constants correspond to the table 'pet'
        public static final int GENDER_MALE = 1 ;
        public static final int GENDER_FEMALE = 2 ;
        public static final int GENDER_UNKNOWN = 0 ;

        // append base content uri to the path segment
        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_PETS);

        /**
         * Returns whether or not the given gender is {@link #GENDER_UNKNOWN}, {@link #GENDER_MALE},
         * or {@link #GENDER_FEMALE}.
         */
        public static boolean isValidGender(int gender) {
            if (gender == GENDER_UNKNOWN || gender == GENDER_MALE || gender == GENDER_FEMALE) {
                return true;
            }
            return false;
        }
    }
}
