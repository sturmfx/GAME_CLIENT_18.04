public class Bot
{
    public boolean alive;
    public double x;
    public double y;
    public double speed;
    public int direction = 5;
    public Bot(double x, double y)
    {
        this.x = x;
        this.y = y;
        this.speed = 0.1;
        this.alive = true;
        DATA.alive_bots++;
    }
}
