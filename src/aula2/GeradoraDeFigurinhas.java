package aula2;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class GeradoraDeFigurinhas {

    public void cria() throws Exception {

        // Leitura da img
        // InputStream inputStream = new FileInputStream(new File(""));
        InputStream inputStream = new URL
                ("https://m.media-amazon.com/images/M/MV5BMDFkYTc0MGEtZmNhMC00ZDIzLWFmNTEtODM1ZmRlYWMwMWFmXkEyXkFqcGdeQXVyMTMxODk2OTU@.jpg")
                .openStream();
        BufferedImage read = ImageIO.read(new File(String.valueOf(inputStream)));

        //cria nova img em memoria
        int largura = read.getWidth();
        int altura = read.getHeight();
        int novaAltura = altura + 200;

        BufferedImage novaImg = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);

        //copiar a img original pra nova img (em memoria)
        Graphics2D graphics = (Graphics2D) novaImg.getGraphics();
        graphics.drawImage(read, 0, 0, null);

        //config fonte
        var font = new Font(Font.SANS_SERIF, Font.BOLD, 64);
        graphics.setColor(Color.yellow);
        graphics.setFont(font);

        //escrever uma frase
        graphics.drawString("**TOPZERA**", 100, novaAltura - 100);

        // escrever a nova img em um arquivo
        ImageIO.write(novaImg,"png", new File(""));

    }

    public static void main(String[] args) throws Exception {
        var geradora = new GeradoraDeFigurinhas();
        geradora.cria();

    }
}
