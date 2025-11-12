package model;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.net.URL; 
import java.io.IOException;

public class ImagePanel extends JPanel {

    private BufferedImage backgroundImage;

    public ImagePanel(String imagePath) {
        try {
            URL imageUrl = getClass().getResource(imagePath);
            if (imageUrl != null) {
                backgroundImage = ImageIO.read(imageUrl);
            }
        } catch (IOException e) {
            System.err.println("Erro ao carregar a imagem: " + e.getMessage());
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 

        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }
}