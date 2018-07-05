package com.example.android.pets.data;

import android.provider.BaseColumns;

public final class PetContract {
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

    }
}
