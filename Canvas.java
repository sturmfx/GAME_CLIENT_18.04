
import javax.swing.*;
import java.awt.*;

public class Canvas extends JPanel
{
    private void doDraw(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;

        for(Triangle b : DATA.objects)
        {
            g2d.setColor(DATA.object_points);
            g2d.fillOval((int) b.x1 - DATA.object_radius, (int) b.y1 - DATA.object_radius, 2 * DATA.object_radius, 2 * DATA.object_radius);
            g2d.fillOval((int) b.x2 - DATA.object_radius, (int) b.y2 - DATA.object_radius, 2 * DATA.object_radius, 2 * DATA.object_radius);
            g2d.fillOval((int) b.x3 - DATA.object_radius, (int) b.y3 - DATA.object_radius, 2 * DATA.object_radius, 2 * DATA.object_radius);

            g2d.setColor(DATA.object_lines);
            g2d.drawLine((int) b.x1, (int) b.y1, (int) b.x2, (int) b.y2);
            g2d.drawLine((int) b.x2, (int) b.y2, (int) b.x3, (int) b.y3);
            g2d.drawLine((int) b.x1, (int) b.y1, (int) b.x3, (int) b.y3);
        }

        for(Bot b : DATA.bots)
        {
            if(b.alive)
            {
                g2d.setColor(DATA.bot_color);
                g2d.fillOval((int) b.x - DATA.bot_radius, (int) b.y - DATA.bot_radius, 2 * DATA.bot_radius, 2 * DATA.bot_radius);
            }
        }

        g2d.setColor(DATA.player_color);
        g2d.fillOval((int) DATA.x - DATA.player_radius, (int) DATA.y - DATA.player_radius, 2 * DATA.player_radius, 2 * DATA.player_radius);

        if(DATA.kills == DATA.kill_limit)
        {
            g2d.setColor(Color.MAGENTA);
            g2d.drawString("PLAYER KILLED " + DATA.kills + " BOTS IN " + ((DATA.stop - DATA.start) / 1000) + " SECONDS!", DATA.width/2, DATA.height/2);
        }
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        doDraw(g);
    }
}
