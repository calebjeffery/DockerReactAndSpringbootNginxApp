package com.example.springtest.flows;

import org.springframework.stereotype.Component;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.StreamingOutput;
import org.springframework.http.MediaType;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;

@Component
@Path("/barcode")
public class ImageWebRestService {

    @GET
    @Produces("image/png")
    public Response getBarcodeImage() {
        BufferedImage image = generateBarcodeImage();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            ImageIO.write(image, "png", baos);
        } catch (IOException e) {
            e.printStackTrace();
            // return an error response if image generation fails
            return Response.serverError().build();
        }

        StreamingOutput stream = outputStream -> {
            baos.writeTo(outputStream);
            outputStream.flush();
        };

        return Response.ok(stream).type("image/png").build();
    }

    private BufferedImage generateBarcodeImage() {
        // Generate a random image using your preferred method
        // For demonstration purposes, let's create a 100x100 image with random pixels

        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        Random random = new Random();

        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                int rgb = random.nextInt(0xFFFFFF);
                image.setRGB(x, y, rgb);
            }
        }

        return image;
    }
}
