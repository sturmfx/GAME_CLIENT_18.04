
import java.awt.*;
import java.util.ArrayList;

public class DATA
{
    public static long start;
    public static long stop;
    public static int kills = 0;
    public static final int kill_limit = 10;
    public static volatile int alive_bots = 0;
    public static final int max_bots = 40;
    public static final int spawn_distance_to_player = 100;
    public static final double delta = 0.70710678118;
    public static final int width = 1000;
    public static final int height = 1000;
    public static volatile ArrayList<Triangle> objects = new ArrayList<>();
    public static volatile ArrayList<Bot> bots = new ArrayList<>();
    public static final Color player_color = Color.blue;
    public static final int player_radius = 20;
    public static volatile int player_direction = 5;
    public static final double player_speed = 0.5;
    public static final double bot_speed = 1.0;
    public static volatile double x = 500;
    public static volatile double y = 500;
    public static final Color bot_color = Color.red;
    public static final int bot_radius = 20;
    public static final Color object_points = Color.BLACK;
    public static final int object_radius = 10;
    public static final Color object_lines = Color.GREEN;
}
