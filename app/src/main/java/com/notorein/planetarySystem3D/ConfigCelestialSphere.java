package com.notorein.planetarySystem3D;

import android.graphics.Color;

public class ConfigCelestialSphere {
    public static final class Sun {
        public static final float X = 0;
        public static final float Y = 0;
        public static final float Z = 0;
        public static final double VX = 0;
        public static final double VY = 0;
        public static final double VZ = 0;
        public static final double MASS = 17000000;
        public static final int COLOR = Color.YELLOW;
        public static final int TRAIL_COLOR = Color.YELLOW;
        public static final float SIZE = 100;
        public static final double TRAIL_LENGTH = 0;
        public static final float TRAIL_THICKNESS = 0;
        public static final String NAME = "Sun";
    }

    public static final class Mercury {
        public static final float X = 200;
        public static final float Y = 0;
        public static final float Z = 0;
        public static final double VX = 0;
        public static final double VY = 0.8;
        public static final double VZ = 0;
        public static final double MASS = 0.055;
        public static final int COLOR = Color.GRAY;
        public static final int TRAIL_COLOR = Color.GRAY;
        public static final float SIZE = 10;
        public static final double TRAIL_LENGTH = 10000;
        public static final float TRAIL_THICKNESS = 0.5f;
        public static final String NAME = "Mercury";
    }

    public static final class Venus {
        public static final float X = 350;
        public static final float Y = 0;
        public static final float Z = 0;
        public static final double VX = 0;
        public static final double VY = 0.5;
        public static final double VZ = 0;
        public static final double MASS = 0.815;
        public static final int COLOR = Color.rgb(255, 165, 0);
        public static final int TRAIL_COLOR = COLOR;
        public static final float SIZE = 15;
        public static final double TRAIL_LENGTH = 10000;
        public static final float TRAIL_THICKNESS = 0.5f;
        public static final String NAME = "Venus";
    }

    public static final class Earth {
        public static final float X = 500;
        public static final float Y = 0;
        public static final float Z = 0;
        public static final double VX = 0;
        public static final double VY = 0.98;
        public static final double VZ = 0;
        public static final double MASS = 8010.0;
        public static final int COLOR = Color.BLUE;
        public static final int TRAIL_COLOR = Color.BLUE;
        public static final float SIZE = 20;
        public static final double TRAIL_LENGTH = 10000;
        public static final float TRAIL_THICKNESS = 0.5f;
        public static final String NAME = "Earth";
    }

    public static final class Moon {
        public static final float X = 520;
        public static final float Y = 0;
        public static final float Z = 0;
        public static final double VX = 0;
        public static final double VY = 0.1;
        public static final double VZ = 0;
        public static final double MASS = 3.00;
        public static final int COLOR = Color.GRAY;
        public static final int TRAIL_COLOR = Color.GRAY;
        public static final float SIZE = 5;
        public static final double TRAIL_LENGTH = 10000;
        public static final float TRAIL_THICKNESS = 0.5f;
        public static final String NAME = "Moon";
    }

    public static final class Mars {
        public static final float X = 700;
        public static final float Y = 0;
        public static final float Z = 0;
        public static final double VX = 0;
        public static final double VY = 0.41;
        public static final double VZ = 0;
        public static final double MASS = 81 / 9.31;
        public static final int COLOR = Color.RED;
        public static final int TRAIL_COLOR = Color.RED;
        public static final float SIZE = 12;
        public static final double TRAIL_LENGTH = 10000;
        public static final float TRAIL_THICKNESS = 0.5f;
        public static final String NAME = "Mars";
    }

    public static final class Jupiter {
        public static final float X = 1200;
        public static final float Y = 0;
        public static final float Z = 0;
        public static final double VX = 0;
        public static final double VY = 1.31;
        public static final double VZ = 0;
        public static final double MASS = 317.8;
        public static final int COLOR = Color.rgb(255, 140, 0);
        public static final int TRAIL_COLOR = COLOR;
        public static final float SIZE = 40;
        public static final double TRAIL_LENGTH = 10000;
        public static final float TRAIL_THICKNESS = 0.5f;
        public static final String NAME = "Jupiter";
    }

    public static final class Saturn {
        public static final float X = 1800;
        public static final float Y = 0;
        public static final float Z = 0;
        public static final double VX = 0;
        public static final double VY = 1.97;
        public static final double VZ = 0;
        public static final double MASS = 95.2;
        public static final int COLOR = Color.YELLOW;
        public static final int TRAIL_COLOR = Color.YELLOW;
        public static final float SIZE = 35;
        public static final double TRAIL_LENGTH = 10000;
        public static final float TRAIL_THICKNESS = 0.5f;
        public static final String NAME = "Saturn";
    }
}
